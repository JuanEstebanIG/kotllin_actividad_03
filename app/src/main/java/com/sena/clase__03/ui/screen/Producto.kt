package com.sena.clase__03.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun Producto(
    onirDetalleProducto: (Int) -> Unit,
    onVolver: () -> Unit
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
            },
            label = { Text("ID del producto") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Text(
            text = "El id del producto es $id"
        )
        Button(
            onClick = {
                val idInt = id.toIntOrNull() ?: 0
                onirDetalleProducto(idInt)
            }
        ) {
            Text(
                text = "Ir a detalle de producto"
            )
        }
        Button(onClick = onVolver) {
            Text(
                text = "Volver"
            )
        }
    }
}