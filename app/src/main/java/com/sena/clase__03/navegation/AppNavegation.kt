package com.sena.clase__03.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.clase__03.ui.screen.DetalleProducto as DetalleProductoScreen
import com.sena.clase__03.ui.screen.Home
import com.sena.clase__03.ui.screen.Producto as ProductoScreen

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
                    navController.navigate(route = Producto)
                }
            )
        }

        composable<Producto> {
            ProductoScreen(
                onirDetalleProducto = { idProducto ->
                    navController.navigate(route = DetalleProducto(id = idProducto))
                },
                onVolver = {
                    navController.popBackStack()
                }
            )
        }

        composable<DetalleProducto> { backStackEntry ->
            val detalle = backStackEntry.toRoute<DetalleProducto>()
            DetalleProductoScreen(
                id = detalle.id
            )
        }
    }
}
