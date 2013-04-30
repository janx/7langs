result := URL with("http://www.apartmentguide.com/") @fetch
"Immediately returned" println
("Fetched " .. result size .. " bytes") println
