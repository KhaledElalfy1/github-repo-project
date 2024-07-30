package com.example.githubreposapp.presentation.screens.details_screeen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R

@Composable
fun DetailsScreenBody() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,

        modifier = Modifier
            .background(color = Color(0xffEBEBEB))
            .padding(horizontal = 32.dp, vertical = 16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Google repo",
            modifier = Modifier.size(160.dp)
        )

        Text(
            text = "language",
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
            TextWithIconSection("1252", R.drawable.ic_star)
            TextWithCircle("python")
            TextWithIconSection(text = "347", id = R.drawable.fork)

        }

        Text(
            text = "Shared repository for open-sourced projects from the Google Al Language team.",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 18.dp)
                .weight(1f)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(bottom = 24.dp)
                .fillMaxWidth()
                .height(50.dp),

            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff202E86))
        ) {
            Text(
                text = "Show Issue",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview
@Composable
private fun PreviewDetailsScreenBody() {
    DetailsScreenBody()
}