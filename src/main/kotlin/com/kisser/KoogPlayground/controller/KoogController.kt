package com.kisser.KoogPlayground.controller

import com.kisser.KoogPlayground.service.KoogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KoogController(
    private val koogService: KoogService
) {
    @GetMapping("/koog")
    fun koog(): String = koogService.hello()
}
