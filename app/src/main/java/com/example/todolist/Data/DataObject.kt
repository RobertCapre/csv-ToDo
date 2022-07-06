package com.example.todolist.Data

import com.example.todolist.model.DataToDoListNew

object DataObject {

    var listData = mutableListOf<DataToDoListNew>()

    fun setData(title: String, details: String) {
        listData.add(DataToDoListNew(title, details))
    }

    fun getAllData(): List<DataToDoListNew> {
        return listData
    }
}