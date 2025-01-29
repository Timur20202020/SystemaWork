package com.teimuraz.debt

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun  screen2(){

//    Комментарии к коду
//    Второй комментарий
    Scaffold(
            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ },
                    backgroundColor = Color(47, 49, 109),
                    contentColor = Color.White
                ) {

                    Icon(Icons.Default.Add, contentDescription = "")
                }
            },
        floatingActionButtonPosition = FabPosition.End,

        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(101, 105, 212))
            ) {
                Column() {

                    Row(modifier = Modifier.fillMaxWidth().
                    background(Color(47, 49, 109))
                    .padding(top = 28.dp),
                        horizontalArrangement = Arrangement.Center,
                         verticalAlignment = Alignment.CenterVertically
                        ) {
                        Text(text = "3400",fontWeight = FontWeight(700),
                            color = Color.White,
                            fontSize = 26.sp)
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(47, 49, 109))
                            .padding(top = 28.dp, end = 28.dp, start = 28.dp, bottom = 8.dp)
                    ) {
                        Text(text = "Я должен",
                            fontWeight = FontWeight(500),
                            color = Color.LightGray,
                            fontSize = 16.sp)
                        Spacer(modifier = Modifier.width(28.dp))
                        Text(text = "Мне должны", fontWeight = FontWeight(500),
                            color = Color.LightGray,
                            fontSize = 16.sp)
                    }

                    screen3()
                }
            }
        }
        )

}