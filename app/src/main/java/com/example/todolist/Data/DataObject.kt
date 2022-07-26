package com.example.todolist.Data

import com.example.todolist.model.DataToDoList

object DataObject {

    var listData = mutableListOf<DataToDoList>()

    fun setData(title: String, details: String) {
        listData.add(DataToDoList(title, details))
    }

    fun removeData(title: String, details: String) {
        listData.remove(DataToDoList(title, details))
    }

    fun getAllData(): List<DataToDoList> {
        return listData
    }
}