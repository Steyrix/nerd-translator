package com.example.createtagsheet.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

private val layoutMargins = PaddingValues(bottom = 18.dp)
private val textMargins = PaddingValues(20.dp, 10.dp, 20.dp, 10.dp)
private val textColor = Color(0xFF001F35)
private val roundingSize = 35.dp

@Composable
private fun textStyle(defaultTextColor: Color = textColor) =
    MaterialTheme.typography.bodyMedium.copy(
        color = defaultTextColor
    )

@Composable
fun CreatedTagLabel() {
    val tagName = "#AliceInWonderland"

    ConstraintLayout(
        modifier = Modifier
            .padding(layoutMargins)
    )
    {

        Box(
            modifier = Modifier
                .width(191.dp)
                .height(40.dp)
                .fillMaxSize()
                .background(
                    MaterialTheme.colorScheme.background,
                    shape = RoundedCornerShape(roundingSize)
                ),
//            contentAlignment = Alignment.Center
        ) {
            Text(
                tagName,
                style = textStyle(),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(textMargins)
            )
        }

//        Box(
//            modifier = Modifier
//                .width(286.dp)
//                .height(48.dp)
//                .border(0.dp, , RoundedCornerShape(roundingSize))
//                .background(MaterialTheme.colorScheme.background)
//        ) {
//
//            BasicTextField(
//                value = tagName,
//                onValueChange = { tagName = it },
//                textStyle = textStyle(),
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(textMargins),
//            )
//        }
    }
}
