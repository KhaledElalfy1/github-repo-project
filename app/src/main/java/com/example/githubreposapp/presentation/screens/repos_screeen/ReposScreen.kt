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
import com.example.githubreposapp.R
import com.example.githubreposapp.data.local.sampleRepos
import com.example.githubreposapp.data.models.RepoItemUiModel
import com.example.githubreposapp.presentation.component.CustomAppBar
import com.example.githubreposapp.presentation.screens.repos_screeen.component.RepoItem

@Composable
fun ReposScreen(
    repoSamples:List<RepoItemUiModel>,
    modifier: Modifier = Modifier
) {


    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CustomAppBar(title =R.string.github_repository)
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
            items(repoSamples){ repoSample-> RepoItem(repoItemModel =repoSample
            )
            }
        }

    }
}


@Preview
@Composable
private fun PreviewReposScreen() {
    ReposScreen(sampleRepos)
}