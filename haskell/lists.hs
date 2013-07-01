module Main where
  size [] = 0
  size (h:t) = 1 + size t

  prod [] = 1
  prod (h:t) = h * prod t

  reverseList ([], acc) = ([], acc)
  reverseList ((h:t), acc) = reverseList (t, h:acc)
  reverse l = snd (reverseList (l, []))

  quicksortSplit f n l = (a, b)
    where a = filter (\x -> (f x n) <= 0) l
          b = filter (\x -> (f x n) >  0) l
  quicksortWith :: Num a => Ord a => (a -> a -> a) -> [a] -> [a]
  quicksortWith f [] = []
  quicksortWith f (h:t) = (quicksortWith f a) ++ [h] ++ (quicksortWith f b)
    where (a, b) = quicksortSplit f h t
  quicksort = quicksortWith compare
    where compare x y
            | x == y = 0
            | x <  y = -1
            | x >  y = 1
