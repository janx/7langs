Matrix := List clone

Matrix dim := method(x, y,
  m := Matrix clone
  y repeat(m push(list() setSize(x)))
  m
)

Matrix set := method(x, y, value,
  at(y) atPut(x, value)
)

Matrix get := method(x, y,
  at(y) at(x)
)

Matrix transpose := method(
  x := at(0) size
  y := size
  m = dim(y, x)

  foreach(i, row,
    row foreach(j, v, m set(i, j, v))
  )

  m
)

Matrix toFile := method(path,
  f := File with(path)
  f remove
  f openForUpdating
  f write(serialized)
  f close
)

Matrix fromListOfLists := method(data,
  x := data at(0) size
  y := data size

  m = dim(x, y)
  data foreach(j, row,
    row foreach(i, v, m set(i, j, v))
  )

  m
)

Matrix fromFile := method(path,
  f := File with(path)
  f openForReading
  data := doString(f readLine)
  f close

  fromListOfLists(data)
)

m := Matrix dim(5, 3)

m println
m set(0, 0, 0)
m set(1, 0, 1)
m set(2, 0, 2)
m set(3, 0, 3)
m set(4, 0, 4)
m set(2, 1, 100)
m set(4, 2, "shit")
m println

m get(0, 0) println
m get(2, 1) println
m get(4, 2) println
m get(2, 2) println

n := m transpose
n println

m toFile("m.data")
n toFile("n.data")

newMatrix := Matrix fromFile("m.data")
newMatrix type println
newMatrix println

newMatrix := Matrix fromFile("n.data")
newMatrix type println
newMatrix println
