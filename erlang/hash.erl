-module(hash).
-export([get/2]).

get([], Key) -> nil;
get([{K, V}|Rest], Key) ->
  if
    K == Key -> V;
    true -> get(Rest, Key)
  end.
