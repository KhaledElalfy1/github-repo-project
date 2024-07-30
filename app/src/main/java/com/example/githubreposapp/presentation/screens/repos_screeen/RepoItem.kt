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

@Composable
fun RepoItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(12.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription ="Avatar Image",
            contentScale = ContentScale.Crop,
            modifier= Modifier
                .size(50.dp)
                .padding(start = 8.dp, top = 20.dp)
                .clip(RoundedCornerShape(50.dp))

        )

        Column(modifier = Modifier.padding(10.dp)) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Repo  Name",
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    color = Color.Black,
                    modifier = Modifier
                        .weight(1f)
                    )
                Text(
                    text = "50",
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
                text = "Repo Owner",
                color = Color.Black
                )
            Text(
                text = "Description of the repo that come from github Description of the repo that come from githubDescription of the repo that come from githubDescription of the repo that come from githubDescription of the repo that come from github",
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
    RepoItem()
}