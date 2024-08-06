package com.example.githubreposapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubreposapp.data.models.DetailsScreenUiModel
import com.example.githubreposapp.presentation.screens.details_screeen.DetailsScreen
import com.example.githubreposapp.presentation.theme.GitHubReposAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitHubReposAppTheme {
                DetailsScreen(
                    modifier = Modifier,
                    detailsScreenModel = DetailsScreenUiModel(
                        repoImageUrl = "https://example.com/repo_image.png",
                        programingLanguage = "Kotlin",
                        color = Color.Blue,
                        repoDetails = "This is a sample repository for demonstrating Jetpack Compose.",
                        starsNumber = 1234,
                        forksNumber = 567
                    )
                )
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitHubReposAppTheme {
        Greeting("Android")
    }
}