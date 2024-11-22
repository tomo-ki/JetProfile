package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetProfileTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(20.dp)
                    ) {
//                        プロフィール画像
                        Image(
                            painter = painterResource(id = R.drawable.img_profile),
                            contentDescription = "プロフィール",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Spacer(modifier = Modifier.height(20.dp))
//                        名前
                        Text(
                            text = "はら",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.height(20.dp))
//                        職業
                        Text(text = "職業：Androidエンジニア", color = Color.Gray, fontSize = 16.sp)
                        Spacer(modifier = Modifier.height(20.dp))
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
//                            会社名
                            Text(
                                text = "株式会社Goooogle",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))
//                            部署・グループ名
                            Text(
                                text = "DXカンパニー　テクノロジーグループ",
                                color = Color.Gray,
                                fontSize = 16.sp,
                            )
                            Spacer(modifier = Modifier.height(20.dp))
//                            Email
                            Label(icon = Icons.Default.Email, text = "Email")
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "example@mail.com", fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(5.dp))

                            Divider(
                                modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                                thickness = 2.dp
                            )
                            Spacer(modifier = Modifier.height(20.dp))
//                            詳細表示ボタン
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFFF85F6A
                                    )
                                ),
                                onClick = {}) {
                                Text(text = "詳細を表示", color = Color.White)
                            }
                            Spacer(modifier = Modifier.height(20.dp))
//                            趣味&居住地
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.LightGray.copy(alpha = 0.3f))
                                    .padding(horizontal = 10.dp, vertical = 20.dp)
                            ) {
                                Label(
                                    icon = Icons.Default.Favorite,
                                    text = "趣味：ゴルフ",
                                    color = Color.Gray
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Label(
                                    icon = Icons.Default.LocationOn,
                                    text = "居住地：東京都千代田区",
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Label(icon: ImageVector, text: String, color: Color = MaterialTheme.colorScheme.primary) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = text,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text, color = color, fontSize = 14.sp, fontWeight = FontWeight.Bold)
    }
}
