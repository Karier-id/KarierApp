package com.example.karier.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EventAvailable
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.decode.ImageSource
import com.example.karier.R
import com.example.karier.presentation.component.KarierButton
import com.example.karier.presentation.component.KarierInputText
import com.example.karier.ui.theme.KarierTheme
import com.example.karier.ui.theme.PrimaryBackground
import com.example.karier.ui.theme.PrimaryBlue400
import com.example.karier.ui.theme.TextPrimary
import com.example.karier.ui.theme.TextTertiary

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        color = Color.White,
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Spacer(modifier = modifier.height(8.dp))
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_karier),
                contentDescription = "Karier",
            )
            Spacer(modifier = Modifier.height(80.dp))
            KarierInputText(
                value = email,
                onValueChange = { email = it },
                label = "Email",
                enable = true,
                isObsecure = false,
                maxLines = 1,
                required = true
            )
            KarierInputText(
                value = password,
                onValueChange = { password = it },
                label = "Password",
                enable = true,
                isObsecure = true,
                maxLines = 1,
                required = true
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Ingat saya", style = MaterialTheme.typography.bodyMedium)
            KarierButton(
                text = {
                    Text(
                        modifier = Modifier.padding(vertical = 8.dp),
                        text = "Masuk",
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.SemiBold)
                    )
                },
                onClick = { /*TODO*/ },
                varOutline = "",
                isWide = true
            )
            Text(text = "Atau lanjutkan dengan", style = MaterialTheme.typography.bodyMedium)
            Button(
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Login With Google",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Google",
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.SemiBold)
                    )
                }
            }
            Row {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Belum punya akun?")
                    Spacer(modifier = modifier.width(8.dp))
                    Text(text = "Daftar", color = PrimaryBlue400)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    KarierTheme {
        LoginScreen()
    }
}