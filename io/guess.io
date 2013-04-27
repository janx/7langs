prize := Random value(100) floor

"You have 10 chances to get the prize! (a number between 0 and 100)" println

loseTest := method(i, guess
  chances := 10 - i
  if(chances == 0,
    ("You lose! The prize is " .. prize .. "! Wahahahaha!") println
    return)

  hint := if(guess > prize, "Too high", "Too low")
  (hint .. ", you have " .. chances .. " chances left.") println
)

for(i, 1, 10,
  write("Guess: ")
  guess := File standardInput readLine asNumber
  if(guess == prize,
    "Bingo! .\\/." println; break,
    loseTest(i, guess))
)
