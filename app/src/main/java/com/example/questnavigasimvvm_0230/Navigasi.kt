package com.example.questnavigasimvvm_0230.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
    }
}