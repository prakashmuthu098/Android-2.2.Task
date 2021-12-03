package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var clickCount = mutableMapOf<String,Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickCountDisplayView=findViewById<TextView>(R.id.clickColor)
        val clickMeButton=findViewById<TextView>(R.id.clickButton)
        val nameTextInputView=findViewById<TextInputEditText>(R.id.name)
        clickMeButton.setOnClickListener{
            val name=nameTextInputView.editableText?.toString()
            val userName =
                if(name.isNullOrEmpty())"Somebody"
                else name
            val oldCount=clickCount[userName]?:0
            val newCount=oldCount+1
            clickCount[userName]=newCount
            clickCountDisplayView.text="$userName clicked $newCount times"

        }






    }
}