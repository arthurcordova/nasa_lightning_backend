package com.arcanesecurity.nasa.repository

import com.arcanesecurity.nasa.model.LightningOrg
import com.arcanesecurity.nasa.model.StrokeOrg
import com.google.gson.Gson
import com.neovisionaries.ws.client.*

class LightningRepository {

    fun handshakeLightningWs(onMessage: (String?) -> Unit) {
        val factory = WebSocketFactory()
        factory.createSocket("wss://live.lightningmaps.org/", 5000).let { ws: WebSocket? ->

            ws?.addListener(object : WebSocketAdapter() {

                override fun onConnected(websocket: WebSocket?, headers: MutableMap<String, MutableList<String>>?) {
                    super.onConnected(websocket, headers)
                    websocket?.sendText("{\"v\":24,\"i\":{},\"s\":false,\"x\":0,\"w\":0,\"tx\":0,\"tw\":1,\"a\":4,\"z\":2,\"b\":true,\"h\":\"#m=oss;t=3;s=0;o=0;b=0.00;ts=0;tsc=1;y=41.2448;x=44.4727;z=2;d=2;dl=2;dc=0;\",\"l\":1,\"t\":1,\"from_lightningmaps_org\":true,\"p\":[86.7,227.5,-74.1,-138.5],\"r\":\"A\"}")
                }

                override fun onDisconnected(
                    websocket: WebSocket?,
                    serverCloseFrame: WebSocketFrame?,
                    clientCloseFrame: WebSocketFrame?,
                    closedByServer: Boolean
                ) {
                    super.onDisconnected(websocket, serverCloseFrame, clientCloseFrame, closedByServer)
                }

                override fun onConnectError(websocket: WebSocket?, exception: WebSocketException?) {
                    super.onConnectError(websocket, exception)
                }


                override fun onTextMessage(websocket: WebSocket?, text: String?) {
                    super.onTextMessage(websocket, text)
                    println(text)

                    Gson().apply {
                        val jsonModel = fromJson(text, LightningOrg::class.java)
                        jsonModel.strokes.forEach {
                            it.power = StrokeOrg.generatePower()
                        }
                        val strJson = toJson(jsonModel)
                        onMessage(strJson)
                    }
                }

                override fun onError(websocket: WebSocket?, cause: WebSocketException?) {
                    super.onError(websocket, cause)
                }

                override fun onTextMessageError(websocket: WebSocket?, cause: WebSocketException?, data: ByteArray?) {
                    super.onTextMessageError(websocket, cause, data)
                }

            })

            ws?.connect()
        }
    }
}