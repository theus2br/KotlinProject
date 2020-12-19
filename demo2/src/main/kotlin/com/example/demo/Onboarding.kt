package com.example.demo

import com.fasterxml.jackson.annotation.JsonProperty

data class Onboarding (
        @JsonProperty("id")
        val id: String
        )