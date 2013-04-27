number := 0 proto

number divideOrig := number getSlot("/") 
number / = method(n,
  if(n == 0, 0, divideOrig(n)))

(10/5) println
(10/2) println
(10/0) println
(1/2) println
(1/3) println
(1/0) println
(0/1) println
(0/0) println
