package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.Data.DataObject
import com.example.todolist.databinding.ActivityTitleAndDetailBinding

class TitleAndDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTitleAndDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTitleAndDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding) {
            btAddInList.setOnClickListener {
//                sendInput()
                val title = inputTitle.text.toString()
                val detail = inputDetails.text.toString()
                DataObject.setData(title, detail)
                val intent = Intent(this@TitleAndDetailActivity, MainActivity::class.java)
                startActivity(intent)

            }

        }

    }
}


