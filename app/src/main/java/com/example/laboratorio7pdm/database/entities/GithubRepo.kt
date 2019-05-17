package com.example.laboratorio7pdm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repos")
data class GithubRepo (
    @ColumnInfo(name="s_name") //nombva la columna dentro de la tabla como s_name pero yo lo trato como name (en las querys buscaremos la columna por s_name)
    val name:String
){
    @PrimaryKey(autoGenerate = true) //id sera nuestra llave primaria (se define afuera del constructor)
    var id:Long=0
}