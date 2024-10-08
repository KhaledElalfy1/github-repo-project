package com.example.githubreposapp.presentation.screens.details_screeen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R
import com.example.githubreposapp.data.local.repoItemList
import com.example.githubreposapp.data.models.RepoItemUiModel
import com.example.githubreposapp.presentation.component.CustomAppBar
import com.example.githubreposapp.presentation.component.CustomAsyncImage
import com.example.githubreposapp.presentation.screens.details_screeen.component.TextWithCircle
import com.example.githubreposapp.presentation.screens.details_screeen.component.TextWithIconSection


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen(
    detailsScreenModel:RepoItemUiModel,
    modifier: Modifier=Modifier,
) {
    Scaffold (
        modifier = modifier.fillMaxSize(),
        topBar = {
            CustomAppBar(title = R.string.details, onBackArrowClicked = {})
        }
    ){ innerPadding->

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
            .background(color = MaterialTheme.colorScheme.background),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomAsyncImage(imageUrl = detailsScreenModel.repoImageUrl, placeholder = R.drawable.google)
        Text(
            text = detailsScreenModel.programingLanguage,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            modifier = Modifier
                .padding(vertical = 20.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextWithIconSection(detailsScreenModel.starsNumber, R.drawable.ic_star)
            TextWithCircle(detailsScreenModel.programingLanguage, color =detailsScreenModel.color)
            TextWithIconSection(text = detailsScreenModel.forksNumber, id = R.drawable.fork)

        }

        Text(
            text = detailsScreenModel.repoDetails,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 18.dp)
                .weight(1f)
        )
        Button(
            onClick = {  },
            modifier = Modifier
                .padding(bottom = 24.dp)
                .fillMaxWidth()
                .height(50.dp),

            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
        ) {
            Text(
                text = stringResource(R.string.show_issue),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
        }
    }
}





@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_7)
@Composable
private fun PreviewDetailsScreen() {
   DetailsScreen(detailsScreenModel = repoItemList.first())
}