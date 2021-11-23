package com.arcanesecurity.nasa

import com.arcanesecurity.nasa.controller.LightningWebSocketController
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.*

@Configuration
@EnableWebSocket
class LightningWebSocket : WebSocketConfigurer {

    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(LightningWebSocketController(), "/ws-lightning")
    }
}