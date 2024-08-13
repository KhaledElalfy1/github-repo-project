package com.example.githubreposapp.presentation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.githubreposapp.data.local.repoItemList
import com.example.githubreposapp.presentation.screens.repos_screeen.ReposScreen


const val name_key = "name"
const val REPO_DETAILS = "repo_details_screen"
sealed class Screens(val route:String){
    data object ReposScreen:Screens("repos_screen/{name_key}")

    data object DetailsScreen:Screens("$ReposScreen/$name_key"){
        fun passRepoName(name:String):String {
            return "$REPO_DETAILS/$name"
        }
    }
}


@Composable
fun AppNavHost() {
    val navController= rememberNavController()
    NavHost(
        navController =navController,
        startDestination = Screens.ReposScreen.route
    ){
        composable(route =Screens.ReposScreen.route){
            ReposScreen(repoSamples = repoItemList){
               navController.navigate(Screens.DetailsScreen.passRepoName(name=it.repoName))
            }
        }

        composable(
            route = Screens.DetailsScreen.route,
            arguments = listOf(navArgument("name_key"){
                type=NavType.StringType
            })
            )
        {


            val passName=it.arguments?.getString("name_key")
            passName?.let {name->
                Log.d("RepoDetails","passed name = $name ")
            }
        }

    }
}