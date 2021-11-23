package com.arcanesecurity.nasa.controller

import com.arcanesecurity.nasa.model.Lightning
import com.arcanesecurity.nasa.repository.LightningRepository
import com.neovisionaries.ws.client.*
import org.springframework.messaging.Message
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat


@RestController
@RequestMapping("lightning")
class LightningController {

    private val lightningRepository = LightningRepository()
//
//    @MessageMapping("/chat")
//    @SendTo("/topic/messages")
//    @Throws(Exception::class)
//    fun send(): String? {
//
//        }
//        return "AAA"
//    }

    @GetMapping()
    fun fetch(): List<Lightning>  {
        lightningRepository.handshakeLightningWs {
            print(it)
        }
        return listOf(Lightning.mock(), Lightning.mock(), Lightning.mock())
    }

//    @GetMapping("{id}")
//    fun fetch(@PathVariable("id") id: String): Lightning =
//

}