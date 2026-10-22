package com.sena.clase__03.navegation

import kotlinx.serialization.Serializable

@Serializable
data object  Inicio

@Serializable
data object  Producto

@Serializable
data class  DetalleProducto(
    val id: Int,
)
