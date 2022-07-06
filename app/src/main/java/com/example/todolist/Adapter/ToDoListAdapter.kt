package com.example.todolist.Adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.Data.Datasource
import com.example.todolist.R
import com.example.todolist.TitleAndDetailActivity
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.databinding.ItemTodolistBinding
import com.example.todolist.model.DataToDoList
import com.example.todolist.model.DataToDoListNew

class ToDoListAdapter(
    private val dataset: List<DataToDoListNew>
): RecyclerView.Adapter<ToDoListAdapter.ToDoListViewHolder>() {


    class ToDoListViewHolder(val binding: ItemTodolistBinding): RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoListViewHolder {
        val binding = ItemTodolistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ToDoListViewHolder, position: Int) {
        val item = dataset[position]
        holder.itemView.apply {
            with(holder.binding) {
                tvTitle.text = item.title
                tvDetails.text = item.details
//                setOnClickListener {
//                    val intent = Intent(context,TitleAndDetailActivity::class.java)
//                    intent.putExtra(EXTRA_MESSAGE1, position)
//                    context.startActivities(arrayOf(intent))
//                }
            }

        }





//        val item = dataset[position]
//        holder.itemView.apply {
//            with(holder.binding) {
//                tvTitle.text = context.resources.getString(item.resourceTitle)
//                tvDetails.text = context.resources.getString(item.resourceDetail)
//
//
//            }
//
//        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }



    companion object {
        const val EXTRA_MESSAGE1 = "MESSAGE1"
        const val EXTRA_MESSAGE2 = "MESSAGE2"
    }


}