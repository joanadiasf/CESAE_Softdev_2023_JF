package org.kotlinlang.play


    // fun main(args: Array<String>) {
    //   println("Hello, World!")
    //}

fun printMessage(message: String): Unit {  // fun nomeFunção (nomeParametro Parametro): tipoRetorno{...}
    println(message)                        //Unit = void -> em kotlin é só print/println e nnão usa ;
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")  //dentro de "" no print, usa se o $ para imprimir um parametro
}

fun sum(x: Int, y: Int): Int {          //com return
    return x + y
}

fun multiply(x: Int, y: Int) = x * y   //sem usar return

fun main() {                                                    //main
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log") //pode se redefinir os parametros
    printMessageWithPrefix("Hello")  //se o parametro "prefix" nao for alterado ele imprime o que foi "pre definido"
    printMessageWithPrefix(prefix = "Log", message = "Hello") //outra forma de definir parametros
    println(sum(1, 2))
    println(multiply(2, 4))
}
