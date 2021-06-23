package com.example.biometricauthenticatoin.Utils
import androidx.appcompat.app.AppCompatActivity
import com.example.biometricauthenticatoin.Biometrics.BiometricAuthenticator
import com.example.biometricauthenticatoin.Biometrics.BiometricCallback
import com.example.biometricauthenticatoin.LockScreen.LockScreenAuthenticator
import com.example.biometricauthenticatoin.LockScreen.LockScreenCallback

class AuthenticationWrapper(activity: AppCompatActivity, biometricCallback: BiometricCallback, lockScreenCallback: LockScreenCallback) {

    val lockScreenAuthenticator by lazy {
        LockScreenAuthenticator(activity, lockScreenCallback).apply {
            createKey()
        }

    }

    val biometricAuthenticator by lazy {
        BiometricAuthenticator(activity , biometricCallback, lockScreenAuthenticator)
    }


}