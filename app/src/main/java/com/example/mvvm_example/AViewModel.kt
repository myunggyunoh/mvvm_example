package com.example.mvvm_example

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class AViewModel (open val app: Application) : AndroidViewModel(app) {

    fun aText() :String {
        return "a viewmodel text"
    }


}