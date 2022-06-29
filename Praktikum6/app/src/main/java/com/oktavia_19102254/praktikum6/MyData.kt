package com.oktavia_19102254.praktikum6

import android.os.Parcelable
class MyData {
        @Parcelize
        data class MyData(
                var name: String,
                var description: String,
                var photo: String
        ) : Parcelable
}