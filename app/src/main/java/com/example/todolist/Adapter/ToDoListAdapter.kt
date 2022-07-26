package com.example.todolist.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.ItemTodolistBinding
import com.example.todolist.model.DataToDoList

class ToDoListAdapter(
    private val dataset: List<DataToDoList>
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

            }
            setOnClickListener {
                Log.d("Text", item.title.toString())
                onItemClickListener?.let {
                    it(item)
                }
            }
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    private var onItemClickListener: ((DataToDoList) -> Unit)? = null

    fun  setOnItemClickListener(listener: (DataToDoList) -> Unit) {
        onItemClickListener = listener
    }

}