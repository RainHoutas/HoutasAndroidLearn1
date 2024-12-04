package com.rainhoutas.coffeemasters

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rainhoutas.coffeemasters.ui.theme.Alternative1
import com.rainhoutas.coffeemasters.ui.theme.Alternative2

@Preview(showBackground = true, widthDp = 400)
@Composable
fun Offer(modifier: Modifier = Modifier) {

    Column (modifier = modifier
        .padding(16.dp)
        .background(Alternative1),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "我的标题",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(19.dp)
                .background(Alternative2)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "描述",
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier
                .padding(16.dp)
                .background(Alternative2)
        )
    }
}