count(0, []).
count(Count, [_|Tail]) :- count(TailCount, Tail), Count is TailCount + 1.

sum(0, []).
sum(Total, [Head|Tail]) :- sum(TailSum, Tail), Total is TailSum + Head.

average(Average, List) :- sum(Sum, List), count(Count, List), Average is Sum/Count.

reverse2(List, ToReverse) :- reverse_acc(List, [], ToReverse).
reverse_acc(List, List, []).
reverse_acc(List, Acc, [Head|Tail]) :- reverse_acc(List, [Head|Acc], Tail).

min(Head, [Head|[]]).
min(V, [Head|Tail]) :- min(MinTail, Tail), MinTail >= Head, V is Head.
min(V, [Head|Tail]) :- min(MinTail, Tail), MinTail < Head, V is MinTail.

concat([], List, List).
concat([Head|Tail1], List, [Head|Tail2]) :- concat(Tail1, List, Tail2).

sort2([], []).
sort2([V], [V]).
sort2(List, [Head|Tail]) :- min(MinTail, Tail), MinTail >= Head, sort2(SortedTail, Tail), concat([Head], SortedTail, List).
sort2(List, [Head|Tail]) :- min(MinTail, Tail), MinTail < Head, concat(Tail, [Head], NewList), sort2(List, NewList).
