package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            MyApplicationTheme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Biodata(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun Biodata(modifier: Modifier = Modifier) {

    val nama = stringResource(R.string.student_name)
    val nim = stringResource(R.string.nim)
    val fakultas = stringResource(R.string.fakultas)
    val prodi = stringResource(R.string.program_studi)
    val konsentrasi = stringResource(R.string.konsentrasi)

    Column(
        modifier = modifier.padding(20.dp)
    ) {

        Text(
            text = "Nama: $nama",
            fontSize = 24.sp
        )

        Text(
            text = "NIM: $nim",
            fontSize = 20.sp
        )

        Text(
            text = "Fakultas: $fakultas",
            fontSize = 20.sp
        )

        Text(
            text = "Program Studi: $prodi",
            fontSize = 20.sp
        )

        Text(
            text = "Konsentrasi: $konsentrasi",
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BiodataPreview() {

    MyApplicationTheme {

        Biodata()

    }
}