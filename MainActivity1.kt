package com.example.app1

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val packagename = "com.example.app2"
        val classname = "com.example.app2.MainActivity"

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            var i = Intent(Intent.ACTION_MAIN)
            i.addCategory(Intent.CATEGORY_LAUNCHER)
            i.component = ComponentName(packagename,classname)
            startActivity(i)
        }
    }
}
