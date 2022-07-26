package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.Adapter.ToDoListAdapter
import com.example.todolist.Data.DataObject
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding) {
            val recyclerView = findViewById<RecyclerView>(R.id.toDoList)
            val todoAdapter = ToDoListAdapter(DataObject.getAllData())
            todoAdapter.setOnItemClickListener {
                Log.d("From Main", it.title)
                val intent = Intent(this@MainActivity, ViewDetailActivity::class.java).apply {
                    putExtra(ViewDetailActivity.EXTRA_MESSAGE, it)
                }
                startActivity(intent)

            }

            recyclerView.apply {
                adapter = todoAdapter
                layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
                setHasFixedSize(true)
            }

            btAdd.setOnClickListener {
                gotoNextPage()
            }
        }



    }

    private fun gotoNextPage() {
        val intent = Intent(this@MainActivity, TitleAndDetailActivity::class.java)
        startActivity(intent)
    }

}




