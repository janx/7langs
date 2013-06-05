-module(translate).
-export([translate/2, loop/0, loop_sync/0]).

translate(To, Word) ->
  To ! {self(), Word},
  receive
    Translation -> Translation
end.

loop() ->
  receive
    "casa" ->
      io:format("house~n"),
      loop();

    "blanca" ->
      io:format("white~n"),
      loop();

    _ ->
      io:format("I don't understand.~n"),
      loop()
end.

loop_sync() ->
  receive
    {Pid, "casa"} ->
      Pid ! "house",
      loop_sync();

    {Pid, "blanca"} ->
      Pid ! "white",
      loop_sync();

    {Pid, _} ->
      Pid ! "I don't understand.",
      loop_sync()
end.
