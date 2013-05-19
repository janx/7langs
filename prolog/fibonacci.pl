fib(1, N) :- N<3, !.
fib(Value, N) :- fib(X, N-1), fib(Y, N-2), Value is X+Y.

fib2(V, N) :- N>0, fibacc(N, 0, 1, V).

fibacc(1, _, V, V) :- !.
fibacc(N, A, B, V) :- N1 is N-1, Acc is A+B, fibacc(N1, B, Acc, V).
