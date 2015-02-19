object Example2 extends App {
  class weirdNum(n: Int){
    var x = n  // Type of x is inferred
    def +(that: weirdNum): weirdNum = 
        (new weirdNum(this.x - that.x))
    override def  toString() = x.toString()
  }
  
  // Create 2 weirdNum objects
  var wn1 = new weirdNum(1)
  var wn2 = new weirdNum(3)
  
  // Use the overloaded '+' operator
  println(wn1 + wn2)
}