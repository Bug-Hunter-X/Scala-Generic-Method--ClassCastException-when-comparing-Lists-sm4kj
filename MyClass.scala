```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      value 
    } else {
      throw new Exception("Values do not match") 
    }
  }
}

object Main extends App {
  val myInt = new MyClass(5)
  println(myInt.myMethod(5)) // Works fine
  
  val myString = new MyClass("hello")
  println(myString.myMethod("hello")) //Works fine
  
  val myList = new MyClass(List(1, 2, 3))
  println(myList.myMethod(List(1, 2, 3))) // Throws a java.lang.ClassCastException
}
```