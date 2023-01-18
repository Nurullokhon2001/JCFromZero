package com.example.jcfromzero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcfromzero.ui.theme.JCFromZeroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCFromZeroTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    TimesTable()
                }
            }
        }
    }
}

@Composable
fun TimesTable() {
    JCFromZeroTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            for (x in 1 until 10) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    for (y in 1 until 10) {
                        val colors = if (x % 2 == 1 && y % 2 == 0) {
                            Color.White
                        } else if (x % 2 == 0 && y % 2 == 1) {
                            Color.White
                        } else {
                            Color.Yellow
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(weight = 1f)
                                .background(color = colors)
                                .border(width = 1.dp, color = Color.DarkGray),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = (x * y).toString(),
                            )
                        }

                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TimesTable()
}