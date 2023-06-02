package com.example.appbusinesscard2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appbusinesscard2.ui.theme.AppBusinessCard2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBusinessCard2Theme {
                AppBusinessApp()
            }
        }
    }
}

@Preview
@Composable
fun AppBusinessAppPreview(){
    AppBusinessApp()
}

@Composable
fun AppBusinessApp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(7, 48, 66))
            .fillMaxSize()
            .padding(top = 150.dp)
    ) {
            Icon(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.size(120.dp)
            )
            Text(
                text = "Adriano Angeli",
                color = Color.White,
                fontSize = 42.sp
            )
            Text(
                text = "Android Developer",
                color = Color(color = 0xFF3ddc84),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
    }

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            //.padding(start = 66.dp, bottom = 22.dp)
    ) {


        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .size(2.dp)
                .background(Color(82, 110, 123))

        ) {}

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                //.border(1.dp, Color.Gray)
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_local_phone_24),
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = "+55 (19) 99999-9999",
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .size(2.dp)
                .background(Color(82, 110, 123))

        ) {}

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                //.border(1.dp, Color.Gray)
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_share_24),
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = "@dri.angeli",
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .size(2.dp)
                .background(Color(82, 110, 123))

        ) {}

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                //.border(1.dp, Color.Gray)
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 46.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_email_24),
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = "adriano@android.com",
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }

}