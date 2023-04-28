package com.example.medicalapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hello")

        Spacer(modifier = Modifier.width(16.dp))

        Button(onClick = { /*TODO*/ }) {

        }

    }
}

@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreenContent()
}

