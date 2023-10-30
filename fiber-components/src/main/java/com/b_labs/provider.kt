package com.b_labs

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.b_labs.fiber_components.R
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.FiberTheme.designSystem


val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

@Composable
fun monoFont(): FontFamily {
    return FontFamily(
        Font(
            googleFont = GoogleFont("mono"),
            fontProvider = provider,
        ),

        )
}

@Composable
fun sansFont(): FontFamily {
    return FontFamily(
        Font(
            googleFont = GoogleFont(designSystem.typography.code.typographyCodeSmall.fontFamily),
            fontProvider = provider,
        ),

        )
}

@Composable
fun serifFont(): FontFamily {
    return FontFamily(
        Font(
            googleFont = GoogleFont(designSystem.typography.code.typographyCodeMedium.fontFamily),
            fontProvider = provider,

        ),

        )
}

@Composable
fun bodyMedium() =
    TextStyle(
        fontSize = designSystem.typography.code.typographyCodeSmall.fontSize.sp,
        fontFamily = sansFont(),
        fontWeight = FontWeight(800),
    )

@Composable
fun codeMed() =
    TextStyle(
        fontSize = designSystem.typography.code.typographyCodeSmall.fontSize.sp,
        fontFamily = serifFont(),
        fontWeight = FontWeight(800),
    )