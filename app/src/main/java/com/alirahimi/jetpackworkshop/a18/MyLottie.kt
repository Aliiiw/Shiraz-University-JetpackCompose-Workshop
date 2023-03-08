package com.alirahimi.jetpackworkshop.a18

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.alirahimi.jetpackworkshop.R


@Composable
fun MyLottie() {
    Loader()
}


@Composable
fun Loader() {

    Column(modifier = Modifier.fillMaxSize()) {

        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading))
        LottieAnimation(
            composition,
            iterations = LottieConstants.IterateForever
        )

        Spacer(modifier = Modifier.height(120.dp))

        val composition2 by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading2))
        LottieAnimation(
            composition2,
            iterations = LottieConstants.IterateForever
        )
    }



}