
object App :
  def main(args: Array[String]): Unit =
    val example = new Example(8) // Calling Java from Scala
    println(example.getA)


