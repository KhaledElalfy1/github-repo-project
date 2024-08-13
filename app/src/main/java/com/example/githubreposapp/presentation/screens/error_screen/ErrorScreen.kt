package com.example.githubreposapp.presentation.screens.error_screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.component.CustomAppBar

@Composable
fun ErrorScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            CustomAppBar(title = R.string.github_repository)
        }
    ) { innerPadding ->
        Column(
            modifier
                .padding(innerPadding)
                .padding(horizontal = 32.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.error_image),
                contentDescription = "Error Image",
                modifier
                    .height(300.dp)
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(R.string.something_went_wrong),
                modifier.padding(vertical = 15.dp),
                style = MaterialTheme.typography.titleLarge,
            )

            Text(
                text = stringResource(R.string.network_error),
                style = MaterialTheme.typography.bodyLarge.copy(color = Color(0xFF929292)),

                )

            Box(
                modifier
                    .padding(top = 80.dp)
                    .border(
                        width = 2.dp,
                        shape = MaterialTheme.shapes.small,
                        color = Color(0xff3CA45B),
                    )
                    .fillMaxWidth()
                    .height(50.dp)
                    .clickable { }
            ) {
                Text(
                    text = stringResource(R.string.retry),
                    modifier.align(Alignment.Center),
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color(0xff3CA45B)
                    )

                )
            }

        }

    }
}


@Preview
@Composable
private fun PreviewErrorScreen() {
    ErrorScreen()
}