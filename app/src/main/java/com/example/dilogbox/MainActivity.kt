package com.example.dilogbox

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent0 = intent.extras?.getString("name")
            val backing = findViewById<ImageView>(R.id.arrow)

            backing.setOnClickListener {
                onBackPressed()
            }


            var fname = findViewById<EditText>(R.id.firste)
            var sname = findViewById<EditText>(R.id.seconde)
            var tname = findViewById<EditText>(R.id.thirde)
            var pname = findViewById<EditText>(R.id.password)


            val name = findViewById<Button>(R.id.useButton)
            name.setOnClickListener {
                if (fname.text.isEmpty()) {
                    showDialodBox()
                } else if (sname.text.isEmpty()) {
                    showDialodBox()
                } else if (tname.text.isEmpty()) {
                    showDialodBox()
                }
                else if (pname.text.isEmpty()){
                    showDialodBox()
                }
                    else {
                    var intent = Intent(this, Data_transfer_activity::class.java)
                    intent.putExtra("name", "${fname.text}")
                    intent.putExtra("sname", "${sname.text}")
                    intent.putExtra("tname", "${tname.text}")
                    intent.putExtra("pname", "${pname.text}")
                    startActivity(intent)
                }
            }
        }

        fun showDialodBox() {
            var alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setPositiveButton(
                "this",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    onBackPressed()
                })

            alertDialogBuilder.setNegativeButton(
                "No",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "cancelled", Toast.LENGTH_SHORT).show()
                })


            var dialog = alertDialogBuilder.create()
            dialog.setTitle("Greeting")
            dialog.setMessage("Enter your fill the Box")
            dialog.setIcon(R.drawable.baseline_menu_24)

            dialog.setCanceledOnTouchOutside(false)
            dialog.show()
        }
    }
