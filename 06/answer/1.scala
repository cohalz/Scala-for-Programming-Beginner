val n = readInt
val students = List.fill(n)(readInt) 
for(i <- 0 until students.length) {
  if(students(i) >= 60) {
    println(i+1 + " is pass")
  } else {
    println(i+1 + " is fail")
  }
}
