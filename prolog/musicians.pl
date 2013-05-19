instrument(piano, bethoven).
instrument(piano, chopin).
instrument(violin, pagenini).
instrument(trump, guy).
instrument(guitar, aaa).
instrument(guitar, bbb).

genre(bethoven, life).
genre(chopin, romantic).
genre(someone, pop).
genre(guy, pop).
genre(aaa, pop).
genre(bbb, classic).

instrument_genre(I, G) :- instrument(I, X), genre(X, G).
similar_instrument(X, Y) :- \+(X = Y), instrument_genre(X, G), instrument_genre(Y, G).
