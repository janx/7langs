List anyNonNumbers := method(
  select(x, x type != "Number") size > 0
)

List myAverage := method(
  if(anyNonNumbers, Exception raise("All elements in list must be Number."))
  sum / size
)


list(1,2,3,4,5,6,7,8,9) myAverage println

e := try(
  list("one", 2) myAverage println
)

e catch(Exception,
  writeln(e coroutine backTraceString)
  writeln("1111111111111111111111!")
)

e := try(
  list(1, two) myAverage println
)

e catch(Exception,
  writeln(e coroutine backTraceString)
  writeln("222222222222222222222!")
)

writeln("done.")
