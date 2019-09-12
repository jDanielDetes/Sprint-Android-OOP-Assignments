package com.example.guided09_12.viewmodel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.Bindable
import com.example.guided09_12.model.User

class LoginViewModel {

    private  val user: User = User( "","")
    private  val successMessage = "Login succeeded"
    private val failureMessage = "Login failed"


@Bindable
  var toastMessage: String? = null

    @Bindable
    fun getUserEmail(): String? {
        return user.email
    }
    fun getUserPassword(): String? {
        return user.password
    }
    fun setUserEmail(email: String) {
        user?.email = email

    }

    fun setUserPassword(password: String) {
        user?.password = password

    }

    fun onLoginClicked(): String {
        return  if(isValid()) {
            successMessage

        } else {
            failureMessage
        }

    }

    fun isValid(): Boolean {
        return !TextUtils.isEmpty(getUserEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
        (getUserPassword()?.length ?:0) >7
    }
}