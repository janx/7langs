-module(success_error).
-export([print/1]).

print({error, Message}) -> io:put_chars(Message ++ "\n");
print(success) -> io:put_chars("success\n");
print(_) -> io:put_chars("You gave incorrect arguments.\n").
