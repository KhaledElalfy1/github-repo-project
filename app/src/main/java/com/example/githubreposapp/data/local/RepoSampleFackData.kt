package com.example.githubreposapp.data.local

import androidx.compose.ui.graphics.Color
import com.example.githubreposapp.data.models.RepoItemUiModel

val repoItemList = listOf(
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/583231?v=4",
        repoName = "Awesome Project",
        repoOwner = "JohnDoe",
        programingLanguage = "Kotlin",
        color = Color.Blue,
        repoDescription = "An awesome project to demonstrate something cool.",
        repoDetails = "This repository contains all the awesome features...",
        starsNumber = "1.2k",
        forksNumber = "300"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/763033?v=4",
        repoName = "Another Great Repo",
        repoOwner = "JaneDoe",
        programingLanguage = "Java",
        color = Color.Green,
        repoDescription = "This project showcases some great Java concepts.",
        repoDetails = "In this repository, you will find advanced Java techniques...",
        starsNumber = "900",
        forksNumber = "150"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/14101776?v=4",
        repoName = "Flutter Fun",
        repoOwner = "FlutterDev",
        programingLanguage = "Dart",
        color = Color.Cyan,
        repoDescription = "A fun project built with Flutter.",
        repoDetails = "Explore the power of Flutter in building cross-platform apps...",
        starsNumber = "2.5k",
        forksNumber = "500"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/9919?v=4",
        repoName = "Linux Kernel",
        repoOwner = "LinusTorvalds",
        programingLanguage = "C",
        color = Color.Gray,
        repoDescription = "The Linux operating system kernel.",
        repoDetails = "This repository contains the source code of the Linux kernel...",
        starsNumber = "120k",
        forksNumber = "40k"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/69631?v=4",
        repoName = "React",
        repoOwner = "Facebook",
        programingLanguage = "JavaScript",
        color = Color.Blue,
        repoDescription = "A JavaScript library for building user interfaces.",
        repoDetails = "React makes it painless to create interactive UIs...",
        starsNumber = "180k",
        forksNumber = "36k"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/14985020?v=4",
        repoName = "TensorFlow",
        repoOwner = "Google",
        programingLanguage = "Python",
        color = Color.Blue,
        repoDescription = "An end-to-end open-source machine learning platform.",
        repoDetails = "TensorFlow is an open-source software library for machine learning...",
        starsNumber = "170k",
        forksNumber = "88k"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/439034?v=4",
        repoName = "Vue.js",
        repoOwner = "EvanYou",
        programingLanguage = "JavaScript",
        color = Color.Green,
        repoDescription = "The Progressive JavaScript Framework.",
        repoDetails = "Vue.js is a progressive framework for building user interfaces...",
        starsNumber = "200k",
        forksNumber = "32k"
    ),
    RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/2952946?v=4",
        repoName = "Django",
        repoOwner = "Django",
        programingLanguage = "Python",
        color = Color.Blue,
        repoDescription = "The Web framework for perfectionists with deadlines.",
        repoDetails = "Django is a high-level Python Web framework that encourages rapid development...",
        starsNumber = "70k",
        forksNumber = "29k"
    )
)
