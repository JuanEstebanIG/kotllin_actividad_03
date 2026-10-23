package com.sena.clase__03.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Carrito(
    onVolver: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Esta es la vista de Carrito\n\n Productos en el carrito:"
        )
        Button(onClick = onVolver) {
            Text(text = "Volver")
        }
    }
}
