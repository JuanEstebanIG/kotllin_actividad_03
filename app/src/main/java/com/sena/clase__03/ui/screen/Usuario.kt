package com.sena.clase__03.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Usuario(
    nombre: String,
    onVolver: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hola $nombre, esta es la vista de Usuario"
        )
        Button(onClick = onVolver) {
            Text(text = "Volver")
        }
    }
}
