package com.codersee.controlleradvicevsrestcontrolleradvice.handler

import com.codersee.controlleradvicevsrestcontrolleradvice.model.CustomExceptionOne
import com.codersee.controlleradvicevsrestcontrolleradvice.model.CustomExceptionThree
import com.codersee.controlleradvicevsrestcontrolleradvice.model.CustomExceptionTwo
import com.codersee.controlleradvicevsrestcontrolleradvice.model.ErrorResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class ExampleControllerAdvice {

    @ExceptionHandler(CustomExceptionOne::class)
    fun handleExceptionOne(): ErrorResponse =
        ErrorResponse("Handled exception one!")

    @ExceptionHandler(CustomExceptionTwo::class)
    fun handleExceptionTwo(): ResponseEntity<ErrorResponse> =
        ResponseEntity.ok(
            ErrorResponse("Handled exception two!")
        )

    @ExceptionHandler(CustomExceptionThree::class)
    @ResponseBody
    fun handleExceptionThree(): ErrorResponse =
        ErrorResponse("Handled exception three!")
}