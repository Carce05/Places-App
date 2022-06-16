package com.crypto.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName="crypto")
data class Crypto(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    @ColumnInfo(name = "nombre")
    val nombre: String,
    @ColumnInfo(name = "red")
    val correo: String?,
    @ColumnInfo(name = "cantidad")
    val telefono: String?,
    @ColumnInfo(name = "web")
    val web: String?,


) : Parcelable
