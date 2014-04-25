val m = readInt
val n = readInt
for(i <- m to n) {
  if(i % 3 == 0 && i % 5 == 0) {
    println("FizzBuzz")
  } else if(i % 3 == 0) {
    println("Fizz")
  } else if(i % 5 == 0) {
    println("Buzz")
  } else {
    println(i)
  }
}
