package com.android.sample.slambook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn2.setOnClickListener { startActivity(Intent(this,MainActivity3::class.java)) }

//        val button2 = findViewById<Button>(R.id.ins_btn)
//        button2.setOnClickListener {
//            val intent1 = Intent (this, MainActivity3::class.java)
//            startActivity(intent1)
//        }
    }
}