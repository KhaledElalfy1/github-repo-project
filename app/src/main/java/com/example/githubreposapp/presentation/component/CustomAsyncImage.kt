package com.example.githubreposapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun CustomAsyncImage(modifier: Modifier = Modifier,imageUrl:String,placeholder:Int) {
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(data =imageUrl)
                .apply (block = fun ImageRequest.Builder.(){
                    crossfade(1000)
                    placeholder(placeholder)
                }).build()
        ),
        contentDescription ="",
        modifier = modifier

    )
}

//@Preview
//@Composable
//private fun PreviewCustomAsyncImage() {
//    CustomAsyncImage(modifier = Modifier,R.drawable.google)
//}