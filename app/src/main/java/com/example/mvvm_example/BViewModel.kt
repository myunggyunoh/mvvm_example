package com.example.mvvm_example

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class BViewModel (open val app: Application) : AndroidViewModel(app) {

    fun bText() :String {
        return "b viewmodel text"
    }

}