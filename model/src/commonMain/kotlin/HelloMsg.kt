@file:OptIn(ExperimentalJsExport::class)

package model

import kotlinx.serialization.Serializable
import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@JsExport
@Serializable
enum class MsgStatus {
    OK,
    ERROR,
}

@JsExport
@Serializable
data class HelloMsg(
    val status: MsgStatus,
    val message: String
)
