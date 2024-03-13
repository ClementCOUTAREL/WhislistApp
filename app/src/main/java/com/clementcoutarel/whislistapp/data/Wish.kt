package com.clementcoutarel.whislistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo("wish-title")
    val title: String = "",
    @ColumnInfo("wish-desc")
    val description:String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2",description = "An android Watch"),
        Wish(title = "Oculus rift 2",description = "A virtual reality device"),
        Wish(title = "Bean bag",description = "A comfy bean bag")
    )
}