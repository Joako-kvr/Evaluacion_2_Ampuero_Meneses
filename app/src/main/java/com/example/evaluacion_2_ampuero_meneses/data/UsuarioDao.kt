package com.example.evaluacion_2_ampuero_meneses.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.evaluacion_2_ampuero_meneses.model.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun insertar(usuario: Usuario)


    @Query("SELECT * FROM usuario")
    suspend fun obtenerUsuarios():List<Usuario>
}