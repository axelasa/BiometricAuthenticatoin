package com.example.biometricauthenticatoin.Biometrics


interface BiometricCallback {

    fun onAuthenticationError(errorCode: Int, errString: CharSequence)

    fun onAuthenticationSucceeded(result: androidx.biometric.BiometricPrompt.AuthenticationResult)

    fun onAuthenticationFailed()
}
