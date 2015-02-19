object Example1 extends App {
  def bToThePowerOfN(n: Int): Int => Int = n match {
    case 0 => 
      _ => 1
    case 1 =>
      b => b
    case _ =>
      b => b * bToThePowerOfN(n - 1)(b)
  }
  
  // Prints 2^10
  println(bToThePowerOfN(10)(2))
  
  // Returns a function which raises its input to the power of 2
  val square = bToThePowerOfN(2)
  
  // Use square function to calculate 3 squared and 4 squared
  println(square(3))
  println(square(4))
}