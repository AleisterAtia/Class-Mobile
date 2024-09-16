package com.fadhiil2010.detailtester

import android.os.Parcelable

data class Item(
    val id: Int,
    val name: String,
    val description: String
) : Parcelable