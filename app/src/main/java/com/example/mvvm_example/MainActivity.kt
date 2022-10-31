package com.example.mvvm_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvm_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val hVM: HeaderViewModel by viewModels()
    private val aVM: AViewModel by viewModels()
    private val bVM: BViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityMainBinding?>(this, R.layout.activity_main).apply {
            headerVM = hVM
            avm = aVM
            bvm = bVM
            lifecycleOwner = this@MainActivity
        }
    }
}