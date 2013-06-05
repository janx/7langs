-module(roulette).
  -export([loop/0, coroner/0, doctor/0]).

% send a number, 1-6
loop() ->
  receive
    3 -> io:format("bang.~n"), exit({roulette, die, at, erlang:time()});
    _ -> io:format("click~n"), loop()
  end.

coroner() ->
  process_flag(trap_exit, true),
  receive
    {monitor, Process} ->
      link(Process),
      io:format("Monitoring process.~n"),
      coroner();
    {'EXIT', From, Reason} ->
      io:format("the shooter ~p died with reason ~p.", [From, Reason]),
      io:format("start another one.~n"),
      coroner()
  end.

doctor() ->
  process_flag(trap_exit, true),
  receive
    new ->
      io:format("Creating and monitoring process.~n"),
      register(revolver, spawn_link(fun loop/0)),
      doctor();
    {'EXIT', From, Reason} ->
      io:format("the shooter ~p died with reason ~p.", [From, Reason]),
      io:format(" Restarting. ~n"),
      self() ! new,
      doctor()
  end.
