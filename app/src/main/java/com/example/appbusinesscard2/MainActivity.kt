package com.example.appbusinesscard2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(7, 48, 66))
    ) {
        InfoImageNameAndTitle(
            icon = painterResource(id = R.drawable.android_logo),
            name = stringResource(R.string.text_name),
            title = stringResource(R.string.text_title),
            modifier = Modifier
        )
    }

    Column(modifier = Modifier.fillMaxSize()) {
        InfoPhoneSocialAndEmail(
            phoneIcon = painterResource(id = R.drawable.baseline_local_phone_24),
            phone = stringResource(R.string.text_phone),
            socialIcon = painterResource(id = R.drawable.baseline_share_24),
            social = stringResource(R.string.text_social_media),
            emailIcon = painterResource(id = R.drawable.baseline_email_24),
            email = stringResource(R.string.text_email)
        )
    }

}

@Composable
fun InfoImageNameAndTitle(
    icon: Painter,
    name: String,
    title: String,
    modifier: Modifier
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 150.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = modifier.size(120.dp)
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 42.sp
        )
        Text(
            text = title,
            color = Color(color = 0xFF3ddc84),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InfoPhoneSocialAndEmail(
    phoneIcon: Painter,
    phone: String,
    socialIcon: Painter,
    social: String,
    emailIcon: Painter,
    email: String
){
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
                painter = phoneIcon,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = phone,
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
                painter = socialIcon,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = social,
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
                painter = emailIcon,
                contentDescription = null,
                tint = Color(color = 0xFF3ddc84),
                modifier = Modifier.padding(start = 60.dp)
            )
            Text(
                text = email,
                color = Color.White,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
    }
}