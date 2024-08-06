package com.example.githubreposapp.presentation.screens.repos_screeen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubreposapp.R
import com.example.githubreposapp.data.models.RepoItemUiModel
import com.example.githubreposapp.presentation.component.CustomAsyncImage

@Composable
fun RepoItem(repoItemModel:RepoItemUiModel) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.surface, shape = RoundedCornerShape(12.dp))
    ) {
        CustomAsyncImage(imageUrl = repoItemModel.repoImageUrl, placeholder = R.drawable.ic_launcher_foreground)

        Column(modifier = Modifier.padding(10.dp)) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = repoItemModel.repoName,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = Color.Black,
                    modifier = Modifier
                        .weight(1f)
                    )
                Text(
                    text = repoItemModel.starsNumber.toString(),
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 6.dp)
                )
                Image(painter = painterResource(
                    id = R.drawable.ic_star),
                    contentDescription = "stars",
                    colorFilter = ColorFilter.tint(color = Color.Yellow),
                    modifier = Modifier
                        .size(30.dp)
                        .padding(end = 6.dp)
                )
            } // row

            Text(
                text = repoItemModel.repoOwner,
                color = Color.Black
                )
            Text(
                text = repoItemModel.repoDescription,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                color = Color.Black,
                modifier = Modifier.padding(vertical = 6.dp)

            )
        }
    }
}

@Preview
@Composable
private fun PreviewRepoItem() {
    RepoItem( RepoItemUiModel(
        repoImageUrl = "https://avatars.githubusercontent.com/u/1?v=4",
        repoName = "Hello-World",
        repoOwner = "octocat",
        starsNumber = 1234,
        repoDescription = "This your first repo!"
    ))
}