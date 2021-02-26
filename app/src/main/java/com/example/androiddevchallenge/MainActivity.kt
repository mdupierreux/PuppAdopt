/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.puppies
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.detail.PuppyDetailContent
import com.example.androiddevchallenge.ui.detail.PuppyItem
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "puppiesList") {
                    composable("puppiesList") {
                        Home(puppies, navController)
                    }
                    composable("puppyDetails/{puppyId}") {
                        PuppyDetailContent(navController, it.arguments?.getString("puppyId"))
                    }
                }
            }
        }
    }
}

// Start building your app here!
@Composable
fun Home(puppies: List<Puppy>, navController: NavHostController) {
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = {
                val title = stringResource(id = R.string.app_name)
                TopAppBar(
                    title = { Text(text = title) }
                )
            },
            content = {
                PuppyList(puppies, navController)
            }
        )
    }
}

@Composable
fun PuppyList(puppies: List<Puppy>, navController: NavHostController) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        LazyColumn() {
            itemsIndexed(items = puppies) { index, puppy ->
                PuppyItem(puppy = puppy, index, navController)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    val navController = rememberNavController()
    val puppies = puppies
    MyTheme {
        Home(puppies, navController)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    val navController = rememberNavController()
    val puppies = puppies
    MyTheme(darkTheme = true) {
        Home(puppies, navController)
    }
}
