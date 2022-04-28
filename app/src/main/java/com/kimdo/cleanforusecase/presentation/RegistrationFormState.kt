package com.kimdo.cleanforusecase.presentation

import com.kimdo.cleanforusecase.domain.use_case.ValidateRepeatedPassword

data class RegistrationFormState (
    val email: String = "",
    val emailError: String? = null,
    val password:String = "",
    val passwordError: String? = null,
    val repeatedPassword: String = "",
    val repeatedPasswordError: String? = null,
    val acceptedTerms: Boolean = false,
    val termsError:String? = null
)