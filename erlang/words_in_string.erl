-module(words_in_string).
-export([count/1]).

count("") -> 0;
count([32]) -> 0;
count([_]) -> 1;
count([32|T]) -> count(T);
count([_, 32|T]) -> 1 + count(T);
count([_|T]) -> count(T).
