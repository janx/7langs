#!/usr/bin/env ruby

puts File.readlines(ARGV[1]).grep(/#{ARGV[0]}/)
