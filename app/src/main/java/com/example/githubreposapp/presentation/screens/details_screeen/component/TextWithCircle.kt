package com.example.githubreposapp.presentation.screens.details_screeen.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextWithCircle(text: String,color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 12.dp)
    ) {
        Text(
            text = text,
            fontSize = 25.sp,
        )

        Canvas(
            modifier = Modifier
                .padding(start = 8.dp)
                .size(16.dp)
        ) {
            drawCircle(
                color = color,
                radius = 12.dp.toPx(),
            )
        }
    }
}