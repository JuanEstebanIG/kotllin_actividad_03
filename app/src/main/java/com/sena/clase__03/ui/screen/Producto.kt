package com.sena.clase__03.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Producto(
    onirDetalleProducto: (Int) -> Unit,
    onVolverHome: () -> Unit
) {
    var id by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hola desde el Producto"
        )
        OutlinedTextField(
            value = id,
            onValueChange = { number ->
                id = number
            }
        )
        Text(
            text = "El id del producto es $id"
        )
        Button(
            onClick = {
                onirDetalleProducto(id.toInt())
            }
        ) {
            Text(
                text = "Ir a detalle de producto"
            )
        }
        Button(onClick = onVolverHome) {
            Text(
                text = "Volver"
            )
        }
    }
}