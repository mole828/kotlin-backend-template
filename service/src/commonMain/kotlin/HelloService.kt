package service

import model.HelloMsg
import model.MsgStatus

class HelloService(
    val incrementer: Incrementer
) {
    fun hello(name: String): HelloMsg {
        val times = incrementer.inc(name, 1)
        return HelloMsg(
            status = MsgStatus.OK,
            message = "Hello, this is $times time, we meet $name",
        )
    }
}