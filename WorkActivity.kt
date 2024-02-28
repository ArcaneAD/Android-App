package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityWorkBinding

class WorkActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityWorkBinding
    private val adapter = Adapter()
    private val brandList = listOf<String>(
        "Berghaus",
        "Carhartt",
        "DC Shoes",
        "Fred Perry",
        "Lyle & Scott",
        "Nike",
        "The North Face")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityWorkBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        init()

        }

    private fun init() = with(bindingClass) {
        rcView.layoutManager = LinearLayoutManager(this@WorkActivity)
        rcView.adapter = adapter
        brandList.forEach{
            val brand = Brand(it)
            adapter.addBrand(brand)
        }
    }

    fun onClickAddPhotosActivity(view: View){

        val intent = Intent(this, AddPhotosActivity::class.java)
        startActivity(intent)
    }
}
