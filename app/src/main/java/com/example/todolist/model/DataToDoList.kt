package com.example.todolist.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataToDoList(
    var title: String,
    var details: String
): Parcelable
