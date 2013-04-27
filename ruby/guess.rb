#!/usr/bin/env ruby

target = rand(100)

loop do
  print "Tell me your guess: "
  guess = gets.to_i <=> target
  break if guess == 0
  puts(guess > 0 ? "Too high." : "Too low.")
end

puts "You got it!"
