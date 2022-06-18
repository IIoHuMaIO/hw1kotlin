package com.example.hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw1.databinding.ActivityMain2Binding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    companion object {
        const val EXTRA_DATA_NAME = "extra_data_name"
        const val SEND_DATA = "key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val desc = intent.getStringExtra(SEND_DATA)
        binding.etText.setText(desc)


        binding.btnGo.setOnClickListener {

            val data = binding.etText.text.toString()
            val intent = Intent()
            intent.putExtra(EXTRA_DATA_NAME , data)
            setResult(
                RESULT_OK ,
                intent
            )

            finish()
        }
    }
}