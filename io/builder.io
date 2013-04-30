OperatorTable addAssignOperator(":" , "atPutNumber")

curlyBrackets := method(
  r := Map clone
  call message arguments foreach(arg,
    r doMessage(arg)
  )
  r
)

Map atPutNumber := method(
  self atPut(
    call evalArgAt(0) asMutable removePrefix("\"") removeSuffix("\""),
    call evalArgAt(1))
)

Map toAttrs := method(
  map(k, v, k .. "=\"" .. v .. "\"") join(" ")
)

Builder := Object clone

Builder indent := 0

Builder incrIndent := method(
  indent = indent + 1
)

Builder decrIndent := method(
  indent = indent - 1
)

Builder writelnWithIndent := method(
  indent repeat("  " print)
  performWithArgList("writeln", call evalArgs)
)

Builder forward := method(
  tag := call message name
  args := call message arguments
  attrs := ""
  if(args at(0) name == "curlyBrackets", attrs = " " .. doMessage(args removeFirst) toAttrs)

  writelnWithIndent("<", tag, attrs, ">")
  incrIndent
  call message arguments foreach(
    arg,
    content := self doMessage(arg);
    if(content type == "Sequence" , writelnWithIndent(content)))
  decrIndent
  writelnWithIndent("</", tag, ">"))

Builder bar := 1

doFile("ul.builder")

Builder foo(bar)

Builder bar(foo)

Builder slotNames(
          proto("haha"))
