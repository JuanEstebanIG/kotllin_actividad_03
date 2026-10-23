package com.sena.clase__03.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(
    onirProducto: () -> Unit,
    onirCarrito: () -> Unit,
    onirUsuario: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hola desde el home"
        )
        Button(onClick = onirProducto) {
            Text(
                text = "Ir al producto"
            )
        }
        Button(onClick = onirCarrito) {
            Text(
                text = "Ir al carrito"
            )
        }
        Button(onClick = onirUsuario) {
            Text(
                text = "Ir a usuario"
            )
        }
    }
}
