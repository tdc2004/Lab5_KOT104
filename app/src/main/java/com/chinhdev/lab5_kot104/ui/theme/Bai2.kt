package com.chinhdev.lab5_kot104.ui.theme

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chinhdev.lab5_kot104.R

class Bai2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

@Composable
fun LightSwitch() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val isChecked = remember { mutableStateOf(false) }
        if (isChecked.value) {
            Image(
                painter = painterResource(id = R.drawable.pngegg),
                contentDescription = "Light is On",
                modifier = Modifier.height(500.dp).width(285.dp),
                contentScale = ContentScale.Crop
            )
        } else {
            Image(
                painter = painterResource(id =
                R.drawable.bulb_off),
                contentDescription = "Light is Off",
                modifier = Modifier.height(500.dp).width(285.dp),
                contentScale = ContentScale.FillWidth
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Switch(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green,
                uncheckedThumbColor = Color.Gray,
                checkedTrackColor = Color.Green.copy(alpha = 0.5f),
                uncheckedTrackColor = Color.Gray.copy(alpha =
                0.5f),
                checkedBorderColor = Color.Green.copy(alpha =
                0.75f),
            )
        )
    }
}
@Preview
@Composable
fun previewBai2(){
    LightSwitch()
}