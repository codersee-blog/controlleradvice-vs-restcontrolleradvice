package com.codersee.controlleradvicevsrestcontrolleradvice.controller

import com.codersee.controlleradvicevsrestcontrolleradvice.model.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController {

    @GetMapping("/one")
    fun endpointOne(): ExampleResponse {
        throw CustomExceptionOne()
        return ExampleResponse("Message")
    }

    @GetMapping("/two")
    fun endpointTwo(): ExampleResponse {
        throw CustomExceptionTwo()
        return ExampleResponse("Message")
    }

    @GetMapping("/three")
    fun endpointThree(): ExampleResponse {
        throw CustomExceptionThree()
        return ExampleResponse("Message")
    }

    @GetMapping("/four")
    fun endpointFour(): ExampleResponse {
        throw CustomExceptionFour()
        return ExampleResponse("Message")
    }

    @GetMapping("/five")
    fun endpointFive(): ExampleResponse {
        throw CustomExceptionFive()
        return ExampleResponse("Message")
    }
}