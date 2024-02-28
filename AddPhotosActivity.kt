package com.example.myapplication

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityAddPhotosBinding
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date


class AddPhotosActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityAddPhotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityAddPhotosBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        var btn_photo = bindingClass.btnTakephoto
        var im = bindingClass.myImageView

    }
    fun onClickAdding(view: View){
        val intent = Intent(this, AddingActivity::class.java)
        startActivity(intent)
    }


}
