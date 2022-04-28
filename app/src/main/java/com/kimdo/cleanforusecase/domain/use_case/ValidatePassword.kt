package com.kimdo.cleanforusecase.domain.use_case

class ValidatePassword {

    fun execute(password: String): ValidationResult {
        if(password.length < 8) {
            return ValidationResult( successful = false, errorMessage = "패드워드는 8자리 이상입니다.")
        }
        val containsLettersAndDigits = password.any { it.isDigit() } && password.any { it.isLetter() }
        if(!containsLettersAndDigits) {
            return ValidationResult(successful = false, errorMessage = "패드워드는 적어도 1개이상의 문자 숫자를 가져야 해요.")
        }
        return ValidationResult(successful = true)
    }

}