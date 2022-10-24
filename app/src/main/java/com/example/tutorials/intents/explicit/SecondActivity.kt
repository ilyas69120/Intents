package com.example.tutorials.intents.explicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorials.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person


        binding.tvPerson.text = person.toString()
    }
}