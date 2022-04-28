package com.kimdo.cleanforusecase.domain.use_case

class ValidateRepeatedPassword {

    fun execute(password:String, repeatedPassword: String): ValidationResult {
        if(password!= repeatedPassword) {
            return ValidationResult(successful = false, errorMessage = "패드워드가 서로 같지 않아요.")
        }
        return ValidationResult(successful = true)
    }
}