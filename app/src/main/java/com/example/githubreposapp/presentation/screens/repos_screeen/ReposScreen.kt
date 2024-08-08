package com.example.githubreposapp.presentation.screens.repos_screeen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.data.models.RepoItemUiModel
import com.example.githubreposapp.presentation.component.CustomAppBar
import com.example.githubreposapp.presentation.screens.repos_screeen.component.RepoItem

@Composable
fun ReposScreen(modifier: Modifier = Modifier) {
    val sampleRepos = listOf(
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/1?v=4",
            repoName = "Hello-World",
            repoOwner = "octocat",
            starsNumber = 1234,
            repoDescription = "This your first repo!"
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/2?v=4",
            repoName = "Spoon-Knife",
            repoOwner = "octocat",
            starsNumber = 5678,
            repoDescription = "This repo is for demonstration purposes only."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/3?v=4",
            repoName = "Octocat-Git",
            repoOwner = "octocat",
            starsNumber = 91011,
            repoDescription = "A collection of Octocat GitHub mascots."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/4?v=4",
            repoName = "Hello-World-Again",
            repoOwner = "octocat",
            starsNumber = 1213,
            repoDescription = "Another sample repository."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/5?v=4",
            repoName = "Awesome-Project",
            repoOwner = "user1",
            starsNumber = 4321,
            repoDescription = "An awesome project with many features."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/6?v=4",
            repoName = "CoolLib",
            repoOwner = "user2",
            starsNumber = 8765,
            repoDescription = "A cool library for developers."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/7?v=4",
            repoName = "AmazingRepo",
            repoOwner = "user3",
            starsNumber = 6543,
            repoDescription = "An amazing repository with fantastic code."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/8?v=4",
            repoName = "NewFeature",
            repoOwner = "user4",
            starsNumber = 3210,
            repoDescription = "Repository showcasing a new feature."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/9?v=4",
            repoName = "BetaRelease",
            repoOwner = "user5",
            starsNumber = 5678,
            repoDescription = "Beta release for testing new features."
        ),
        RepoItemUiModel(
            repoImageUrl = "https://avatars.githubusercontent.com/u/10?v=4",
            repoName = "FinalVersion",
            repoOwner = "user6",
            starsNumber = 9876,
            repoDescription = "The final version of the software."
        )
    )

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CustomAppBar(title = "GitHub Repository")
        }
    ) { innerPadding->
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .background(color = MaterialTheme.colorScheme.background),

            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(sampleRepos){ sampleRepo-> RepoItem(repoItemModel =sampleRepo
            )
            }
        }

    }
}


@Preview
@Composable
private fun PreviewReposScreen() {
    ReposScreen()
}