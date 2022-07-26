package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.Data.DataObject
import com.example.todolist.databinding.ActivityViewDetailBinding
import com.example.todolist.model.DataToDoList

class ViewDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val todo = intent.getParcelableExtra<DataToDoList>(EXTRA_MESSAGE)
        todo?.let {
            with(binding) {
                val storeTitle = it.title
                val storeDetails = it.details
                viewTitle.text = storeTitle
                viewDetails.text = storeDetails
                btDelete.setOnClickListener {
                    DataObject.removeData(storeTitle, storeDetails)
                    val intent = Intent(this@ViewDetailActivity, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
    companion object {
        const val EXTRA_MESSAGE = "MESSAGE"
    }
}