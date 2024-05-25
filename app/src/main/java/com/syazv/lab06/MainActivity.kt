package com.syazv.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syazv.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // ActivityMain (MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener {
            binding.infoTextView.text = "Android Application Development, Android Security, " +
                    "Android UI UX and Monetize Android Application"
        }

        binding.exams.setOnClickListener {
            binding.infoTextView.text = "The exam is 50 questions multichoice in 1 hour 30 minutes with passing mark 75"
        }

        binding.freelance.setOnClickListener {
            binding.infoTextView.text = "Please apply at helpdesk."


        }
    }
}