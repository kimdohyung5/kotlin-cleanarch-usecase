package com.kimdo.cleanforusecase.domain.use_case

class ValidateTerms {

    fun execute(acceptedTerm: Boolean) : ValidationResult {
        if(!acceptedTerm) {
            return ValidationResult( successful = false, errorMessage = "조건을 승인하세요.")
        }
        return ValidationResult(successful = true)
    }
}