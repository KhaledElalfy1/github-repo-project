package com.example.githubreposapp.presentation.component

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(
    modifier: Modifier = Modifier,
    title:String,
    backgroundColor:Color=MaterialTheme.colorScheme.primary,
    titleStyle:TextStyle= MaterialTheme.typography.displayLarge,
    onBackArrowClicked:(()->Unit)?=null
) {
    CenterAlignedTopAppBar(
        modifier=modifier.background(backgroundColor),
        title = { Text(text = title, /*style = titleStyle*/ style = TextStyle(fontSize = 30.sp))},
        navigationIcon = {
            if (onBackArrowClicked!=null) {
                IconButton(onClick = onBackArrowClicked) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription ="back Icon" )
                }
            }
        }
    )
}


@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_7)
@Composable
private fun PreviewCustomAppBar() {
    CustomAppBar(Modifier,"Details", onBackArrowClicked = {} )
}