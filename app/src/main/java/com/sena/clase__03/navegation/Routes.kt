package com.sena.clase__03.navegation

import kotlinx.serialization.Serializable

@Serializable
data object Inicio

@Serializable
data object Producto

@Serializable
data class DetalleProducto(
    val id: Int,
)

@Serializable
data object Carrito

@Serializable
data class Usuario(
    val nombre: String,
)
