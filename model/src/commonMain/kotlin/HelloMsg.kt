package model

import kotlinx.serialization.Serializable

@Serializable
enum class MsgStatus {
    OK,
    ERROR,
}

@Serializable
data class HelloMsg(
    val status: MsgStatus,
    val message: String
)
