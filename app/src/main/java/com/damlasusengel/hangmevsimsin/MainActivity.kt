package com.damlasusengel.hangmevsimsin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textView)
        var ımageView = findViewById<ImageView>(R.id.mevsimImage)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            var randomSayi = (1..4).random()
            when(randomSayi){
                1-> {
                    ımageView.setImageResource(R.drawable.kis)
                    textView.text = "kış"
                }
                2-> {
                    ımageView.setImageResource(R.drawable.yaz)
                    textView.text = "yaz"
                }
                3-> {
                    ımageView.setImageResource(R.drawable.ilkbhr)
                    textView.text = "ilkbahar"
                }
                4-> {
                    ımageView.setImageResource(R.drawable.snbhr)
                    textView.text = "sonbahar"
                    }
            }

        }
    }
}