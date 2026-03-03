package com.kisser.KoogPlayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KoogPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<KoogPlaygroundApplication>(*args)
}
