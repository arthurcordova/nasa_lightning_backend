package com.arcanesecurity.nasa.controller

import com.arcanesecurity.nasa.repository.LightningRepository
import com.google.gson.Gson
import org.springframework.boot.json.GsonJsonParser
import org.springframework.stereotype.Component
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler
import java.io.IOException


@Component
class LightningWebSocketController : TextWebSocketHandler() {

    private val lightningRepository = LightningRepository()

    @Throws(InterruptedException::class, IOException::class)
    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        val payload = message.payload
        if (payload == "give me the lightnings") {
            lightningRepository.handshakeLightningWs { message ->
                message?.let {
                    val m : CharSequence = it
                    session.sendMessage(TextMessage(m))
                }
            }
        } else  if (payload == "stop now") {
            lightningRepository.stop()
        }

    }

}