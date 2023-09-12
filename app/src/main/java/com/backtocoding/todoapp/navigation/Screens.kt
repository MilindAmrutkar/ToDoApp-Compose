package com.backtocoding.todoapp.navigation

import androidx.navigation.NavController
import com.backtocoding.todoapp.util.Action
import com.backtocoding.todoapp.util.Constants.LIST_SCREEN

class Screens(navController: NavController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}