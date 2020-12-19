package com.example.demo

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
class GetKotlin {
    @PostMapping("/kotlin")
    fun list():String ""

    @GetMapping("/funciona")
    fun list2(): String "Funciona"
}