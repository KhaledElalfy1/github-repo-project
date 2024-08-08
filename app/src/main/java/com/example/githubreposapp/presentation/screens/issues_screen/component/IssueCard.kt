package com.example.githubreposapp.presentation.screens.issues_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubreposapp.R
import com.example.githubreposapp.data.models.IssueCardUiModel
import com.example.githubreposapp.presentation.component.CustomAsyncImage

@Composable
fun IssueCard(modifier: Modifier = Modifier, issueModel: IssueCardUiModel) {

        Row(
            modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = RoundedCornerShape(12.dp))
                .padding(vertical = 8.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top
        ) {
            CustomAsyncImage(
                imageUrl = issueModel.issueImageUrl,
                placeholder = R.drawable.google,
                modifier = Modifier.size(50.dp)
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = issueModel.issueName,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = issueModel.issueState,
                        color = Color.Black,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 6.dp)
                    )
                }

                Text(
                    text = issueModel.issueDueTo,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 6.dp)
                )

                Row {
                    Text(
                        text = "Created At: ",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = issueModel.createdAt,
                        fontSize = 18.sp,
                    )
                }
            }
        }

}

@Preview
@Composable
private fun PreviewIssueCard() {
    IssueCard(
        issueModel = IssueCardUiModel(
            issueImageUrl = "https://example.com/image1.jpg",
            issueName = "Bug in Login Screen",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-01"
        )
    )
}
