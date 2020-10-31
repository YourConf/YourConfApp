package com.yourconf.rest

import io.micrometer.core.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Timed(histogram = true)
class ConfController {
    @GetMapping("/conference")
    fun getConference():String {
        return "Success"
    }
}
