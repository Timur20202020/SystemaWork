package com.teimuraz.debt

import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Debt(
    val name:String,
    val debt:Double,
    val date:String
)

@Composable
fun screen(){
""
    val debts by remember {
        mutableStateOf(listOf(Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),Debt("Стажер",1293.0000,"12.09.2024")))
    }



    
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan)) {

        Row(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {


                Row(modifier = Modifier.padding(8.dp)) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = ""
                    )
                    Text(text = "Общий долг")

                }
                Row(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        text = "20000", fontWeight = FontWeight(700),
                        color = Color.White,
                        fontSize = 22.sp,
                        fontStyle = FontStyle.Italic
                    )
                }
                Spacer(modifier = Modifier.width(46.dp))
                Row(modifier = Modifier.padding(8.dp)) {
                    Text(
                        text = "Я Должен", fontWeight = FontWeight(500),
                        fontSize = 18.sp, modifier = Modifier.weight(0.8f)
                    )
                    Text(
                        text = "Мне Должны", fontWeight = FontWeight(500),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
        
        Row(modifier = Modifier.fillMaxWidth()) {

        }
        Spacer(modifier = Modifier.height(16.dp))
        DebtList(debts)

    }

@Composable
fun screen3(){
    val debts by remember {
        mutableStateOf(listOf(Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),
            Debt("Стажер",1293.0000,"12.09.2024"),Debt("Стажер",1293.0000,"12.09.2024")))
    }

    DebtList(debts)

}



@Composable
fun DebtList(debts:List<Debt>) {

    if (debts.isEmpty()){
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue),
            contentAlignment = Alignment.Center){
            Text(text = "Долгов нету")
        }
    }
    else{
        LazyColumn(modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)){
            items(debts.size){
                    debt -> DebtItem(debt = debts[debt])
            }
        }
    }
}

@Composable
fun DebtItem(debt: Debt) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .background(Color.Transparent, shape = RoundedCornerShape(28.dp)),
        elevation = 18.dp
        ) {

        Column(modifier = Modifier
            .background(Color(160, 163, 236))
            .padding(6.dp)) {
            Row() {
                Text(text = debt.name, modifier = Modifier.weight(0.9f),
                    fontWeight = FontWeight(500),
                    color = Color.White,
                    fontSize = 18.sp)

                Text(text = debt.debt.toString(), fontWeight = FontWeight(700),
                    color = Color.White,
                    fontSize = 22.sp
                    )

            }
            Row() {
                Spacer(modifier = Modifier.weight(0.9f))
                Column() {
                  
                    Text(text = "Планируемая дата возврата", fontWeight = FontWeight(400),
                        color = Color.LightGray,
                        fontSize = 12.sp)
                }
            }
            Row() {
                Spacer(modifier = Modifier.weight(0.9f))
                Column() {
                    Text(text = debt.date, fontWeight = FontWeight(500),
                        color = Color.LightGray,
                        fontSize = 12.sp)
                }
            }
        }

    }

}