package com.codersee.controlleradvicevsrestcontrolleradvice.handler

import com.codersee.controlleradvicevsrestcontrolleradvice.model.CustomExceptionFive
import com.codersee.controlleradvicevsrestcontrolleradvice.model.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExampleRestControllerAdvice {

    @ExceptionHandler(CustomExceptionFive::class)
    fun handleExceptionFive(): ErrorResponse =
        ErrorResponse("Handled exception five!")
}