package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityAddingBinding

class AddingActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityAddingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityAddingBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}
