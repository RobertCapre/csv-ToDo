package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist.Adapter.ToDoListAdapter
import com.example.todolist.Data.DataObject
import com.example.todolist.Data.Datasource
import com.example.todolist.databinding.ActivityMainBinding
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

    private fun sendInput() {




//        val intent = Intent(this@TitleAndDetailActivity, ToDoListAdapter::class.java).apply {
//            putExtra(ToDoListAdapter.EXTRA_MESSAGE1, binding.inputTitle.text.toString())
//            putExtra(ToDoListAdapter.EXTRA_MESSAGE2, binding.inputDetails.text.toString())
//        }
//        startActivity(intent)
    }



    companion object {
        const val EXTRA_MESSAGE1 = "MESSAGE1"
        const val EXTRA_MESSAGE2 = "MESSAGE2"
    }
}


