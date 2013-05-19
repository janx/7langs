different(red, green). different(red, blue).
different(green, red). different(green, blue).
different(blue, red). different(blue, green).

coloring(Alabama, Mississippi, Georgia, Tenessee, Florida) :-
  different(Mississippi, Tenessee),
  different(Mississippi, Alabama),
  different(Alabama, Tenessee),
  different(Alabama, Mississippi),
  different(Alabama, Georgia),
  different(Alabama, Florida),
  different(Georgia, Florida),
  different(Georgia, Tenessee).
