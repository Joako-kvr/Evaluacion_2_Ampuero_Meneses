package com.example.evaluacion_2_ampuero_meneses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.evaluacion_2_ampuero_meneses.model.RegistroScreen
import com.example.evaluacion_2_ampuero_meneses.ui.theme.Evaluacion_2_Ampuero_MenesesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    RegistroScreen()
}