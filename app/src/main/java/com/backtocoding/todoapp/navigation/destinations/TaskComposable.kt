package com.backtocoding.todoapp.navigation.destinations

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.backtocoding.todoapp.ui.screens.task.TaskScreen
import com.backtocoding.todoapp.ui.viewmodels.SharedViewModel
import com.backtocoding.todoapp.util.Action
import com.backtocoding.todoapp.util.Constants.TASK_ARGUMENT_KEY
import com.backtocoding.todoapp.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        sharedViewModel.getSelectedTask(taskId)
        val selectedTask by sharedViewModel.selectedTask.collectAsState()
        TaskScreen(
            selectedTask = selectedTask,
            navigateToListScreen = navigateToListScreen
        )

    }
}