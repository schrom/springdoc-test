package com.example.springdoctest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TheController {

    @GetMapping("/test")
    fun test() : ResponseEntity<Unit> {
        return ResponseEntity.noContent().build()
    }
}
