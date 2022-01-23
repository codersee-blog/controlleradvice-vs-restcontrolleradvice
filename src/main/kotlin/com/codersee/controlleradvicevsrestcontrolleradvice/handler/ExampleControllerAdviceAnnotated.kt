package com.codersee.controlleradvicevsrestcontrolleradvice.handler

import com.codersee.controlleradvicevsrestcontrolleradvice.model.CustomExceptionFour
import com.codersee.controlleradvicevsrestcontrolleradvice.model.ErrorResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
@ResponseBody
class ExampleControllerAdviceAnnotated {

    @ExceptionHandler(CustomExceptionFour::class)
    fun handleExceptionFour(): ErrorResponse =
        ErrorResponse("Handled exception four!")
}