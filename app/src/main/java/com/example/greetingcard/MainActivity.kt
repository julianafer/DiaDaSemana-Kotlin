package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    DiaDaSemana()
                }
            }
        }
    }
}

@Composable
fun DiaDaSemana(modifier: Modifier = Modifier) {
    val calendario = Calendario()
    val hoje = calendario.diaDaSemana()
    val meuNiver = calendario.diaDaSemana(5, 10, 2024) // Aqui você pode definir a data do seu aniversário

    Column(modifier = modifier) {
        Text(
            text = "Hoje: $hoje",
            color = Color.Blue
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Aniversário: $meuNiver",
            color = Color.Blue
        )
        Text(
            text = "Juliana Ferreira Cavalcante"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DiaDaSemanaPreview() {
    GreetingCardTheme {
        DiaDaSemana()
    }
}
