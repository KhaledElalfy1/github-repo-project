package com.example.githubreposapp.data.models

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

data class DetailsScreenUiModel(
    val repoImageUrl:String,
    val programingLanguage:String,
    val color: Color,
    val repoDetails:String,
    val numberOfStars:Int,
    val numberOfForks:Int,
)
