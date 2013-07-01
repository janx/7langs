module Main where
  double x = x + x

  factorial :: Integer -> Integer
  factorial 0 = 1
  factorial x = x * factorial(x-1)

  fib :: Integer -> Integer
  fib 0 = 1
  fib 1 = 1
  fib n = fib(n-1) + fib(n-2)

  fibTuple :: (Integer, Integer, Integer) -> (Integer, Integer, Integer)
  fibTuple (x, y, 0) = (x, y, 0)
  fibTuple (x, y, index) = fibTuple(y, x+y, index-1)

  fibResult :: (Integer, Integer, Integer) -> Integer
  fibResult (x, y, z) = x

  fib2 :: Integer -> Integer
  fib2 n = fibResult (fibTuple (0, 1, n))

  fibNextPair :: (Integer, Integer) -> (Integer, Integer)
  fibNextPair (x, y) = (y, x+y)

  fibNthPair :: Integer -> (Integer, Integer)
  fibNthPair 1 = (1, 1)
  fibNthPair n = fibNextPair (fibNthPair (n-1))

  fib3 :: Integer -> Integer
  fib3 = fst . fibNthPair
