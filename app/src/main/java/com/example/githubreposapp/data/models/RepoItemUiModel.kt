package com.example.githubreposapp.data.models

data class RepoItemUiModel(
    val repoImageUrl: String,
    val repoName: String,
    val repoOwner: String,
    val programingLanguage: String,
    val color: androidx.compose.ui.graphics.Color,
    val repoDescription: String,
    val repoDetails: String,
    val starsNumber: String,
    val forksNumber: String
)
