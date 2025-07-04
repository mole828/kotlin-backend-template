package service

class HelloService(
    val incrementer: Incrementer
) {
    fun hello(name: String): String = "Hello, this is ${incrementer.inc(name, 1)} time, we meet $name"
}