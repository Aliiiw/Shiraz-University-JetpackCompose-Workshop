package com.alirahimi.jetpackworkshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.a11.MyAlertDialog
import com.alirahimi.jetpackworkshop.a12.MySurface
import com.alirahimi.jetpackworkshop.a13.MaterialDesignPart1
import com.alirahimi.jetpackworkshop.a14.MyScaffold
import com.alirahimi.jetpackworkshop.a15.MySnackBar
import com.alirahimi.jetpackworkshop.a16.SeeWhatHappen
import com.alirahimi.jetpackworkshop.a17.MyBottomSheetLayout
import com.alirahimi.jetpackworkshop.a18.MyLottie
import com.alirahimi.jetpackworkshop.a19.MyAnimations
import com.alirahimi.jetpackworkshop.a19.MyAnimationsInfinite
import com.alirahimi.jetpackworkshop.a19.MyAnimationsRotate
import com.alirahimi.jetpackworkshop.a20.MyExpandableCard
import com.alirahimi.jetpackworkshop.a21.MySystemTheming
import com.alirahimi.jetpackworkshop.a22.SetupNavigationGraph
import com.alirahimi.jetpackworkshop.a6.CardView
import com.alirahimi.jetpackworkshop.a7.MyBox
import com.alirahimi.jetpackworkshop.a8.MyTextField
import com.alirahimi.jetpackworkshop.a9.MyCallingView
import com.alirahimi.jetpackworkshop.ui.theme.JetpackWorkshopTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            JetpackWorkshopTheme {
//                navController = rememberNavController()
//
////                SetupNavigationGraph(navHostController = navController)
//
//            }
            navController = rememberNavController()
//            SetupNavigationGraph(navHostController = navController)

            MyExpandableCard()
        }
    }
}

