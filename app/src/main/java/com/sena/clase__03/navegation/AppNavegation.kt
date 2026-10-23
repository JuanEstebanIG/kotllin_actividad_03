package com.sena.clase__03.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.clase__03.ui.screen.Carrito as CarritoScreen
import com.sena.clase__03.ui.screen.DetalleProducto as DetalleProductoScreen
import com.sena.clase__03.ui.screen.Home
import com.sena.clase__03.ui.screen.Producto
import com.sena.clase__03.ui.screen.Usuario as UsuarioScreen

@Composable
fun AppNavegation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ) {
        composable<Inicio> {
            Home(
                onirProducto = {
                    navController.navigate(Producto)
                },
                onirCarrito = {
                    navController.navigate(Carrito)
                },
                onirUsuario = {
                    navController.navigate(Usuario(nombre = "Carlos"))
                }
            )
        }

        composable<Producto> {
            Producto(
                onirDetalleProducto = { id ->
                    navController.navigate(DetalleProducto(id))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }

        composable<DetalleProducto> { dato ->
            DetalleProductoScreen(
                id = dato.arguments?.getInt("id") ?: 0,
                onVolver = {
                    navController.popBackStack()
                }
            )
        }

        composable<Carrito> {
            CarritoScreen(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }

        composable<Usuario> { dato ->
            UsuarioScreen(
                nombre = dato.arguments?.getString("nombre") ?: "",
                onVolver = {
                    navController.popBackStack()
                }
            )
        }
    }
}
