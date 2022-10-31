package com.example.mvvm_example

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class HeaderViewModel (open val app: Application) : AndroidViewModel(app) {

    fun headerText() :String {
        return "헤더..."
    }

}