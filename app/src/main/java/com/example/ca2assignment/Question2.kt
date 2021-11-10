package com.example.ca2assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        val check = findViewById<CheckBox>(R.id.checkBox)
        val genMale = findViewById<RadioButton>(R.id.maleGen)
        val genFemale = findViewById<RadioButton>(R.id.femaGen)

        check.setOnClickListener{
            if(check.isChecked){
                Toast.makeText(applicationContext,"Checkbox Selected",Toast.LENGTH_SHORT).show()
            }

            else{
                Toast.makeText(applicationContext,"Checkbox Deselected",Toast.LENGTH_SHORT).show()
            }
        }

        genMale.setOnClickListener{
            Toast.makeText(applicationContext,"Gender ${genMale.getText()} is Selected",Toast.LENGTH_SHORT).show()
        }

        genFemale.setOnClickListener{
            Toast.makeText(applicationContext,"Gender ${genFemale.getText()} is Selected",Toast.LENGTH_SHORT).show()
        }


    }
}