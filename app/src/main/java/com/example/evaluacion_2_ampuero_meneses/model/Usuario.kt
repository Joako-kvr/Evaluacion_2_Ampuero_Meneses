package com.example.evaluacion_2_ampuero_meneses.model

import androidx.room.Entity

@Entity

data class Usuario(
    val id : Int,
    val nombre:String,
    val contrasena: String
)
