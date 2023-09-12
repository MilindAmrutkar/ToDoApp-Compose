package com.backtocoding.todoapp.data.models

import androidx.compose.ui.graphics.Color
import com.backtocoding.todoapp.ui.theme.HighPriorityColor
import com.backtocoding.todoapp.ui.theme.LowPriorityColor
import com.backtocoding.todoapp.ui.theme.MediumPriorityColor
import com.backtocoding.todoapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
