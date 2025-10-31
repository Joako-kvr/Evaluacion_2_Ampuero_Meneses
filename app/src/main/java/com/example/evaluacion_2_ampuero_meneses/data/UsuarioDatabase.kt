package com.example.evaluacion_2_ampuero_meneses.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.evaluacion_2_ampuero_meneses.model.Usuario

@Database(entities = [Usuario::class], version = 1)
abstract class UsuarioDatabase: RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDao

}