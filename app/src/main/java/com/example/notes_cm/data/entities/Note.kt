package com.example.notes_cm.data.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Notas")
class Note(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "descricao") val descricao: String,
    @ColumnInfo(name = "data") val data: String
) : Parcelable {
    init {
        require(descricao.length >= 5) { "Deve conter pelo menos 5 caracteres"}
    }
}