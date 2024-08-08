package com.example.githubreposapp.presentation.screens.issues_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import com.example.githubreposapp.data.models.IssueCardUiModel
import com.example.githubreposapp.presentation.component.CustomAppBar
import com.example.githubreposapp.presentation.screens.issues_screen.component.IssueCard

@Composable
fun IssueScreen(modifier: Modifier = Modifier) {
    val issueList = listOf(
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image1.jpg",
            issueName = "Bug in Login Screen",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-01"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image2.jpg",
            issueName = "Crash on Profile Page",
            issueState = "Closed",
            issueDueTo = "None",
            createdAt = "2024-08-03"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image3.jpg",
            issueName = "UI Glitch in Settings",
            issueState = "In Progress",
            issueDueTo = "None",
            createdAt = "2024-08-05"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image4.jpg",
            issueName = "Slow Loading Dashboard",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-07"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image5.jpg",
            issueName = "Error on Signup",
            issueState = "Closed",
            issueDueTo = "None",
            createdAt = "2024-08-09"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image6.jpg",
            issueName = "Logout Button Not Working",
            issueState = "In Progress",
            issueDueTo = "None",
            createdAt = "2024-08-10"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image7.jpg",
            issueName = "Data Sync Issue",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-12"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image8.jpg",
            issueName = "Notification Delay",
            issueState = "Closed",
            issueDueTo = "None",
            createdAt = "2024-08-14"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image9.jpg",
            issueName = "UI Overlap on Small Screens",
            issueState = "In Progress",
            issueDueTo = "None",
            createdAt = "2024-08-16"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image10.jpg",
            issueName = "Missing API Response Data",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-18"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image11.jpg",
            issueName = "Incorrect Error Messages",
            issueState = "Closed",
            issueDueTo = "None",
            createdAt = "2024-08-20"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image12.jpg",
            issueName = "App Crashes on Startup",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-22"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image13.jpg",
            issueName = "Broken Links in Help Section",
            issueState = "In Progress",
            issueDueTo = "None",
            createdAt = "2024-08-24"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image14.jpg",
            issueName = "Misaligned Text in Settings",
            issueState = "Closed",
            issueDueTo = "None",
            createdAt = "2024-08-26"
        ),
        IssueCardUiModel(
            issueImageUrl = "https://example.com/image15.jpg",
            issueName = "Feature Request: Dark Mode",
            issueState = "Open",
            issueDueTo = "None",
            createdAt = "2024-08-28"
        )
    )

    Scaffold (
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.primary),
        topBar = {
            CustomAppBar(title = "Issue", onBackArrowClicked = {})
        }
    ){
        innerPadding->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .background(color = MaterialTheme.colorScheme.background),

            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LazyColumn {
                items(issueList){ issue-> IssueCard(issueModel = issue) }
            }
        }
    }
}


@Preview
@Composable
private fun PreviewIssueScreen() {
    IssueScreen()
}