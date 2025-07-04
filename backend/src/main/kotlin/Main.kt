package backend

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.util.getOrFail
import kotlinx.serialization.json.Json
import service.HelloService
import service.Incrementer

fun main() {
    val helloService = HelloService(object: Incrementer{
        val map = mutableMapOf<String, Int>()
        override fun inc(key: String, value: Int): Int {
            val oldValue = map.getOrDefault(key = key, defaultValue = 0)
            val newValue = oldValue + value
            map.put(key, newValue)
            return newValue
        }
        override fun get(key: String): Int? = map[key]
    })
    val json = Json {}
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        routing {
            get("/hello/{key}") {
                val name = call.pathParameters.getOrFail("key")
                val msg = helloService.hello(name)
                call.respondText { json.encodeToString(msg) }
            }
        }
    }.start(wait = true)
}