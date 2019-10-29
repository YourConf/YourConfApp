package com.yourconf.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.yourconf"])
class YcAppApplication

fun main(args: Array<String>) {
    runApplication<YcAppApplication>(*args)
}