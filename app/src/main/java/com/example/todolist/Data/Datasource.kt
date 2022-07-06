package com.example.todolist.Data

import com.example.todolist.R
import com.example.todolist.model.DataToDoList

class Datasource {
    fun loadToDoList(): List<DataToDoList>{
        return listOf<DataToDoList> (
            DataToDoList(R.string.title1, R.string.detail1),
            DataToDoList(R.string.title2, R.string.detail1),
            DataToDoList(R.string.title3, R.string.detail1)
        )
    }

//    var new = Datasource().loadToDoList().toMutableSet().add(DataToDoList(11,22))




    companion object {
        const val EXTRA_MESSAGE1 = "MESSAGE1"
        const val EXTRA_MESSAGE2 = "MESSAGE2"
    }
}