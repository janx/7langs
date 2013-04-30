vizzini := Object clone
vizzini talk := method(
  "Fezzik, are there rocks ahead?" println
  yield
  "No more rhymes now, I mean it." println
  yield)

fezzik := Object clone
fezzik rhyme := method(
  yield
  "If there are, we'll all be dead." println
  yield
  "Anybody want a peanut?" println)

1 println
vizzini @@talk
2 println
fezzik @@rhyme
3 println

// Pause current coroutine, yield execution to vizzini
// Pause means the coroutine will not be given execute right
// in future, so when vizzini yield, fezzik will get
// execute right
Coroutine currentCoroutine pause
