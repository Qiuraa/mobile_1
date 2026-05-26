package edu.uph.m24si1.matematika

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KalkulatorApp()
        }
    }
}

@Composable
fun KalkulatorApp() {

    var angka1 by remember { mutableStateOf("") }
    var angka2 by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("0") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        OutlinedTextField(
            value = angka1,
            onValueChange = { angka1 = it },
            label = { Text("Angka pertama") }
        )

        OutlinedTextField(
            value = angka2,
            onValueChange = { angka2 = it },
            label = { Text("Angka kedua") }
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Button(onClick = {
                hasil = (
                        angka1.toDouble() +
                                angka2.toDouble()
                        ).toString()
            }) {
                Text("+")
            }

            Button(onClick = {
                hasil = (
                        angka1.toDouble() -
                                angka2.toDouble()
                        ).toString()
            }) {
                Text("-")
            }

            Button(onClick = {
                hasil = (
                        angka1.toDouble() *
                                angka2.toDouble()
                        ).toString()
            }) {
                Text("×")
            }

            Button(onClick = {
                hasil = (
                        angka1.toDouble() /
                                angka2.toDouble()
                        ).toString()
            }) {
                Text("÷")
            }
        }

        Text(
            text = "Hasil = $hasil",
            style = MaterialTheme.typography.headlineMedium
        )
    }
}