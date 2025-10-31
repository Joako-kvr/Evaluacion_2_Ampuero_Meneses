package com.example.evaluacion_2_ampuero_meneses.model

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evaluacion_2_ampuero_meneses.ui.theme.viewmodel.FormularioViewModel

@Composable
fun RegistroScreen(ViewModel: FormularioViewModel){
    var nombre by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }

    //val usuarios by viewModel.cargarUsuarios()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = { Text(text = "Ingrese nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = contrasena,
            onValueChange = {contrasena = it},
            label = { Text(text = "Ingrese su contraseña") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                if(nombre.isNotBlank() && contrasena.isNotBlank()){
                  view
                nombre = ""
                contrasena=""
                }
            }, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Agregar usuario")
        }

        Spacer(modifier = Modifier.height(8.dp))


    }


}