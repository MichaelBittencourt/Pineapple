package com.redflag.pineapple

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.gms.common.SignInButton
import com.redflag.pineapple.ui.theme.PineappleTheme
import com.redflag.pineapple.util.centerContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            PineappleTheme {
                LoginUi()
            }
        }
    }
}

@Composable
fun LoginUi() {
    PineappleTheme() {
        Surface(modifier = Modifier.centerContent(), color = MaterialTheme.colorScheme.surface) {
            Column(modifier = Modifier.centerContent()) {
                Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier
                    .centerContent()
                    .weight(2f)) {
                    Image(painter = painterResource(id = R.drawable.ic_pineapple),
                        contentDescription = stringResource(id = R.string.ic_pineapple_description),
                        modifier = Modifier
                            .centerContent()
                            .width(256.dp), colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onSurfaceVariant))
//                    Text(text = "Bem-vindo ao Pineapple", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 24.sp, fontWeight = FontWeight.Bold, modifier = Modifier.centerContent())
                }
                Column(
                    modifier = Modifier
                        .centerContent()
                        .weight(2f),
                    verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    AndroidView(factory = {
                        SignInButton(it).apply {
                            this.setSize(SignInButton.SIZE_WIDE)
                            this.setOnClickListener{
                                //Logar com o Google
                            }
                        }
                    })
//                    Button(onClick = { /*TODO*/ }) {
//                        Icon(painter = painterResource(id = R.drawable.ic_pineapple), contentDescription = "",
//                            Modifier.size(24.dp))
//                        Text(text = "Continue with Google")
//                    }
                }
//                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.centerContent()) {
//                    Text(text = "Ainda não tem uma conta?", color = MaterialTheme.colorScheme.onSurfaceVariant)
//                    TextButton(onClick = { /*TODO*/ }) {
//                        Text(text = "Cadastre-se!")
//                    }
//                }
            }

        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun DefaultPreview() {
    PineappleTheme {
        LoginUi()
    }
}