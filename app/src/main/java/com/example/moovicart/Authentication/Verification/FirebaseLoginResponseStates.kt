package com.example.moovicart.Authentication.Verification

sealed class FirebaseLoginResponseStates(
    val errorMessage: String? = null
) {
    class ErrorLoginState(errorMessage: String): FirebaseLoginResponseStates(errorMessage)
    class CodeSentLoginState(): FirebaseLoginResponseStates()
    class ProcessingState(): FirebaseLoginResponseStates()
    class LoginSuccessState(): FirebaseLoginResponseStates()
}