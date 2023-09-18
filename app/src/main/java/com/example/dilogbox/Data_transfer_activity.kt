package com.example.dilogbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Data_transfer_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_transfer)


        var ram=intent.extras?.getString("name" )
        var shayam=intent.extras?.getString("sname" )
        var lak=intent.extras?.getString("tname")
        var loan=intent.extras?.getString("pname")

        val back=findViewById<ImageView>(R.id.back)
        var name=findViewById<TextView>(R.id.name)
        var ramu=findViewById<TextView>(R.id.name1)
        var sname=findViewById<TextView>(R.id.hai)
        var tname=findViewById<TextView>(R.id.hello)
         back.setOnClickListener {
             onBackPressed()
         }
        name.text=ram
        ramu.text=shayam
        sname.text=lak
        tname.text=loan

        name.setOnClickListener {
            onBackPressed()
        }
        ramu.setOnClickListener {
            onBackPressed()
        }
        sname.setOnClickListener {
            onBackPressed()
        }
        tname.setOnClickListener {
            onBackPressed()
        }
    }
}