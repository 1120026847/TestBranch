package com.example.testbranch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "test2", Toast.LENGTH_SHORT).show()
    }
}