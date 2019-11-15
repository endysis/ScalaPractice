package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  val aString: String = "heythere"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 76475854749373L
  val aFloat: Float = 2.0f
  val aDouble: Double = 4.23

  // variables
  var aVariable : Int = 4

  aVariable = 5 // Side effects here

//  prefer vals over vars
//  all vals and vars have types
//  compiler automatically infers types when omitted

}


// https://booking.udemy.com/course/rock-the-jvm-scala-for-beginners/learn/lecture/7660550#overview
