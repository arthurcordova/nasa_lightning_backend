package com.arcanesecurity.nasa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
class LightningApplication

fun main(args: Array<String>) {
	runApplication<LightningApplication>(*args)

//	 testing build
}
