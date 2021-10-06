package com.arcanesecurity.nasa.controller

import com.arcanesecurity.nasa.model.Lightning
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("lightning")
class LightningController {

    @GetMapping()
    fun fetch(): List<Lightning> = listOf(
        Lightning.mock(),
        Lightning.mock(),
        Lightning.mock(),
        Lightning.mock(),
        Lightning.mock(),
        Lightning.mock()
    )

    @GetMapping("{id}")
    fun fetch(@PathVariable("id") id: String): Lightning =
        Lightning.mock()

}