package com.b_labs.fiber_tokens
import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

data class DesignSystem (
    var isDark: Boolean = false,
    private val colorDark: DSColor,
    private val colorLight: DSColor,
    val borderRadius: DSBorderRadius,
    val borderWidth: DSBorderWidth,
    val size: DSSize,
    val space: DSSpace,
    val opacity: DSOpacity,
    val typography: DSTypography,
) {
    val color: DSColor get() = if (isDark) colorDark else colorLight
}

data class DSBrand (
    val semanticBrandNegative4: Color, 
    val semanticBrandNegative3: Color, 
    val semanticBrandNegative2: Color, 
    val semanticBrandNegative1: Color, 
    val semanticBrand8: Color, 
    val semanticBrand7: Color, 
    val semanticBrand6: Color, 
    val semanticBrand5: Color, 
    val semanticBrand4: Color, 
    val semanticBrand3: Color, 
    val semanticBrand2: Color, 
    val semanticBrand1: Color, 
    val semanticBrand0: Color, 
)

data class DSNeutral (
    val semanticNeutralNegative4: Color, 
    val semanticNeutralNegative3: Color, 
    val semanticNeutralNegative2: Color, 
    val semanticNeutralNegative1: Color, 
    val semanticNeutral8: Color, 
    val semanticNeutral7: Color, 
    val semanticNeutral6: Color, 
    val semanticNeutral5: Color, 
    val semanticNeutral4: Color, 
    val semanticNeutral3: Color, 
    val semanticNeutral2: Color, 
    val semanticNeutral1: Color, 
    val semanticNeutral0: Color, 
)

data class DSNeutralAlpha (
    val semanticNeutralANegative4: Color, 
    val semanticNeutralANegative3: Color, 
    val semanticNeutralANegative2: Color, 
    val semanticNeutralANegative1: Color, 
    val semanticNeutralA8: Color, 
    val semanticNeutralA7: Color, 
    val semanticNeutralA6: Color, 
    val semanticNeutralA5: Color, 
    val semanticNeutralA4: Color, 
    val semanticNeutralA3: Color, 
    val semanticNeutralA2: Color, 
    val semanticNeutralA1: Color, 
    val semanticNeutralA0: Color, 
)

data class DSInfo (
    val semanticInfoNegative4: Color, 
    val semanticInfoNegative3: Color, 
    val semanticInfoNegative2: Color, 
    val semanticInfoNegative1: Color, 
    val semanticInfo8: Color, 
    val semanticInfo7: Color, 
    val semanticInfo6: Color, 
    val semanticInfo5: Color, 
    val semanticInfo4: Color, 
    val semanticInfo3: Color, 
    val semanticInfo2: Color, 
    val semanticInfo1: Color, 
    val semanticInfo0: Color, 
)

data class DSSuccess (
    val semanticSuccessNegative4: Color, 
    val semanticSuccessNegative3: Color, 
    val semanticSuccessNegative2: Color, 
    val semanticSuccessNegative1: Color, 
    val semanticSuccess8: Color, 
    val semanticSuccess7: Color, 
    val semanticSuccess6: Color, 
    val semanticSuccess5: Color, 
    val semanticSuccess4: Color, 
    val semanticSuccess3: Color, 
    val semanticSuccess2: Color, 
    val semanticSuccess1: Color, 
    val semanticSuccess0: Color, 
)

data class DSWarning (
    val semanticWarningNegative4: Color, 
    val semanticWarningNegative3: Color, 
    val semanticWarningNegative2: Color, 
    val semanticWarningNegative1: Color, 
    val semanticWarning8: Color, 
    val semanticWarning7: Color, 
    val semanticWarning6: Color, 
    val semanticWarning5: Color, 
    val semanticWarning4: Color, 
    val semanticWarning3: Color, 
    val semanticWarning2: Color, 
    val semanticWarning1: Color, 
    val semanticWarning0: Color, 
)

data class DSDanger (
    val semanticDangerNegative4: Color, 
    val semanticDangerNegative3: Color, 
    val semanticDangerNegative2: Color, 
    val semanticDangerNegative1: Color, 
    val semanticDanger8: Color, 
    val semanticDanger7: Color, 
    val semanticDanger6: Color, 
    val semanticDanger5: Color, 
    val semanticDanger4: Color, 
    val semanticDanger3: Color, 
    val semanticDanger2: Color, 
    val semanticDanger1: Color, 
    val semanticDanger0: Color, 
)

data class DSSemantic (
    val warning: DSWarning, 
    val success: DSSuccess, 
    val neutralAlpha: DSNeutralAlpha, 
    val neutral: DSNeutral, 
    val info: DSInfo, 
    val danger: DSDanger, 
    val brand: DSBrand, 
)

data class DSColor (
    val semantic: DSSemantic, 
)

data class DSBorderRadius (
    val xLarge: Double, 
    val small: Double, 
    val none: Double, 
    val medium: Double, 
    val large: Double, 
    val full: Double, 
    val borderRadius4xLarge: Double, 
    val borderRadius3xLarge: Double, 
    val borderRadius2xLarge: Double, 
)

data class DSBorderWidth (
    val xLarge: Double, 
    val small: Double, 
    val none: Double, 
    val medium: Double, 
    val large: Double, 
)

data class DSSize (
    val xSmall: Double, 
    val xLarge: Double, 
    val small: Double, 
    val size3xSmall: Double, 
    val size3xLarge: Double, 
    val size2xSmall: Double, 
    val size2xLarge: Double, 
    val medium: Double, 
    val large: Double, 
)

data class DSPadding (
    val xSmall: Double, 
    val small: Double, 
    val padding6xLarge: Double, 
    val padding5xLarge: Double, 
    val padding4xLarge: Double, 
    val padding3xLarge: Double, 
    val padding2xSmall: Double, 
    val padding2xLarge: Double, 
    val none: Double, 
    val medium: Double, 
    val large: Double, 
)

data class DSGap (
    val xSmall: Double, 
    val xLarge: Double, 
    val small: Double, 
    val none: Double, 
    val medium: Double, 
    val large: Double, 
    val gap3xLarge: Double, 
    val gap2xSmall: Double, 
    val gap2xLarge: Double, 
)

data class DSSpace (
    val padding: DSPadding, 
    val gap: DSGap, 
)

data class DSOpacity (
    val disabled: Double, 
)

data class Typography (
    val lineHeight: Double, 
    val letterSpacing: Double, 
    val fontWeight: Double, 
    val fontSize: Double, 
    val fontFamily: String, 
)

data class DSCode (
    val typographyCodeSmall: Typography, 
    val typographyCodeMedium: Typography, 
    val typographyCodeLarge: Typography, 
)

data class DSUtility (
    val typographyUtilitySmall: Typography, 
    val typographyUtilityMedium: Typography, 
    val typographyUtilityLarge: Typography, 
)

data class DSBody (
    val typographyBodySmall: Typography, 
    val typographyBodyMedium: Typography, 
    val typographyBodyLarge: Typography, 
)

data class DSHeading (
    val typographyHeadingXLarge: Typography, 
    val typographyHeadingSmall: Typography, 
    val typographyHeadingMedium: Typography, 
    val typographyHeadingLarge: Typography, 
    val typographyHeading9xLarge: Typography, 
    val typographyHeading8xLarge: Typography, 
    val typographyHeading7xLarge: Typography, 
    val typographyHeading6xLarge: Typography, 
    val typographyHeading5xLarge: Typography, 
    val typographyHeading4xLarge: Typography, 
    val typographyHeading3xLarge: Typography, 
    val typographyHeading2xLarge: Typography, 
)

data class DSDisplay (
    val typographyDisplayXLarge: Typography, 
    val typographyDisplaySmall: Typography, 
    val typographyDisplayMedium: Typography, 
    val typographyDisplayLarge: Typography, 
    val typographyDisplay3xLarge: Typography, 
    val typographyDisplay2xLarge: Typography, 
)

data class DSTypography (
    val utility: DSUtility, 
    val heading: DSHeading, 
    val display: DSDisplay, 
    val code: DSCode, 
    val body: DSBody, 
)