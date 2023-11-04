package com.b_labs.fiber_deel
import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import com.b_labs.fiber_tokens.DesignSystem
import com.b_labs.fiber_tokens.DSBrand
import com.b_labs.fiber_tokens.DSNeutral
import com.b_labs.fiber_tokens.DSNeutralAlpha
import com.b_labs.fiber_tokens.DSInfo
import com.b_labs.fiber_tokens.DSSuccess
import com.b_labs.fiber_tokens.DSWarning
import com.b_labs.fiber_tokens.DSDanger
import com.b_labs.fiber_tokens.DSSemantic
import com.b_labs.fiber_tokens.DSColor
import com.b_labs.fiber_tokens.DSBorderRadius
import com.b_labs.fiber_tokens.DSBorderWidth
import com.b_labs.fiber_tokens.DSSize
import com.b_labs.fiber_tokens.DSPadding
import com.b_labs.fiber_tokens.DSGap
import com.b_labs.fiber_tokens.DSSpace
import com.b_labs.fiber_tokens.DSOpacity
import com.b_labs.fiber_tokens.Typography
import com.b_labs.fiber_tokens.DSCode
import com.b_labs.fiber_tokens.DSUtility
import com.b_labs.fiber_tokens.DSBody
import com.b_labs.fiber_tokens.DSHeading
import com.b_labs.fiber_tokens.DSDisplay
import com.b_labs.fiber_tokens.DSTypography

val designSystem: DesignSystem = DesignSystem(
    colorDark = DSColor(
        semantic = DSSemantic(
            warning = DSWarning(
                semanticWarningNegative4 = Color("#492909".toColorInt()),
                semanticWarningNegative3 = Color("#7a4510".toColorInt()),
                semanticWarningNegative2 = Color("#a05c1c".toColorInt()),
                semanticWarningNegative1 = Color("#b4610e".toColorInt()),
                semanticWarning8 = Color("#fffcfa".toColorInt()),
                semanticWarning7 = Color("#fff5eb".toColorInt()),
                semanticWarning6 = Color("#fff0e0".toColorInt()),
                semanticWarning5 = Color("#ffe8d1".toColorInt()),
                semanticWarning4 = Color("#fcdec0".toColorInt()),
                semanticWarning3 = Color("#ffd4a8".toColorInt()),
                semanticWarning2 = Color("#feb871".toColorInt()),
                semanticWarning1 = Color("#f6a351".toColorInt()),
                semanticWarning0 = Color("#f59638".toColorInt())
            ),
            success = DSSuccess(
                semanticSuccessNegative4 = Color("#0a2e0b".toColorInt()),
                semanticSuccessNegative3 = Color("#135315".toColorInt()),
                semanticSuccessNegative2 = Color("#246626".toColorInt()),
                semanticSuccessNegative1 = Color("#2f6f2f".toColorInt()),
                semanticSuccess8 = Color("#fbfefb".toColorInt()),
                semanticSuccess7 = Color("#f4fbf4".toColorInt()),
                semanticSuccess6 = Color("#e6f9e6".toColorInt()),
                semanticSuccess5 = Color("#dff6df".toColorInt()),
                semanticSuccess4 = Color("#cff2cf".toColorInt()),
                semanticSuccess3 = Color("#c6ecc6".toColorInt()),
                semanticSuccess2 = Color("#87c987".toColorInt()),
                semanticSuccess1 = Color("#55a555".toColorInt()),
                semanticSuccess0 = Color("#347434".toColorInt())
            ),
            neutralAlpha = DSNeutralAlpha(
                semanticNeutralANegative4 = Color("#09131aed".toColorInt()),
                semanticNeutralANegative3 = Color("#0a121ae0".toColorInt()),
                semanticNeutralANegative2 = Color("#1a232ddb".toColorInt()),
                semanticNeutralANegative1 = Color("#1d2835cc".toColorInt()),
                semanticNeutralA8 = Color("#1f529e05".toColorInt()),
                semanticNeutralA7 = Color("#00295c0a".toColorInt()),
                semanticNeutralA6 = Color("#022e500f".toColorInt()),
                semanticNeutralA5 = Color("#10284717".toColorInt()),
                semanticNeutralA4 = Color("#04294321".toColorInt()),
                semanticNeutralA3 = Color("#10315633".toColorInt()),
                semanticNeutralA2 = Color("#0d253f66".toColorInt()),
                semanticNeutralA1 = Color("#1830498f".toColorInt()),
                semanticNeutralA0 = Color("#182639bd".toColorInt())
            ),
            neutral = DSNeutral(
                semanticNeutralNegative4 = Color("#1b242c".toColorInt()),
                semanticNeutralNegative3 = Color("#272e35".toColorInt()),
                semanticNeutralNegative2 = Color("#3a424a".toColorInt()),
                semanticNeutralNegative1 = Color("#4a545e".toColorInt()),
                semanticNeutral8 = Color("#fcfcfd".toColorInt()),
                semanticNeutral7 = Color("#f5f7f9".toColorInt()),
                semanticNeutral6 = Color("#f0f3f5".toColorInt()),
                semanticNeutral5 = Color("#eaedf0".toColorInt()),
                semanticNeutral4 = Color("#dee3e7".toColorInt()),
                semanticNeutral3 = Color("#cfd6dd".toColorInt()),
                semanticNeutral2 = Color("#9ea8b3".toColorInt()),
                semanticNeutral1 = Color("#7e8c9a".toColorInt()),
                semanticNeutral0 = Color("#555f6d".toColorInt())
            ),
            info = DSInfo(
                semanticInfoNegative4 = Color("#041f5d".toColorInt()),
                semanticInfoNegative3 = Color("#113997".toColorInt()),
                semanticInfoNegative2 = Color("#1e4fc2".toColorInt()),
                semanticInfoNegative1 = Color("#2759ce".toColorInt()),
                semanticInfo8 = Color("#fafbff".toColorInt()),
                semanticInfo7 = Color("#f5f8ff".toColorInt()),
                semanticInfo6 = Color("#ebf0ff".toColorInt()),
                semanticInfo5 = Color("#e5eeff".toColorInt()),
                semanticInfo4 = Color("#d6e3ff".toColorInt()),
                semanticInfo3 = Color("#ccdcff".toColorInt()),
                semanticInfo2 = Color("#8eb0fb".toColorInt()),
                semanticInfo1 = Color("#6691f4".toColorInt()),
                semanticInfo0 = Color("#3061d5".toColorInt())
            ),
            danger = DSDanger(
                semanticDangerNegative4 = Color("#4a0d0d".toColorInt()),
                semanticDangerNegative3 = Color("#6f2020".toColorInt()),
                semanticDangerNegative2 = Color("#952d2d".toColorInt()),
                semanticDangerNegative1 = Color("#a13636".toColorInt()),
                semanticDanger8 = Color("#fffafa".toColorInt()),
                semanticDanger7 = Color("#fef5f5".toColorInt()),
                semanticDanger6 = Color("#ffebeb".toColorInt()),
                semanticDanger5 = Color("#fee7e7".toColorInt()),
                semanticDanger4 = Color("#fcd9d9".toColorInt()),
                semanticDanger3 = Color("#fccfcf".toColorInt()),
                semanticDanger2 = Color("#f49090".toColorInt()),
                semanticDanger1 = Color("#f26363".toColorInt()),
                semanticDanger0 = Color("#c53434".toColorInt())
            ),
            brand = DSBrand(
                semanticBrandNegative4 = Color("#041f5d".toColorInt()),
                semanticBrandNegative3 = Color("#113997".toColorInt()),
                semanticBrandNegative2 = Color("#1e4fc2".toColorInt()),
                semanticBrandNegative1 = Color("#2759ce".toColorInt()),
                semanticBrand8 = Color("#fafbff".toColorInt()),
                semanticBrand7 = Color("#f5f8ff".toColorInt()),
                semanticBrand6 = Color("#ebf0ff".toColorInt()),
                semanticBrand5 = Color("#e5eeff".toColorInt()),
                semanticBrand4 = Color("#d6e3ff".toColorInt()),
                semanticBrand3 = Color("#ccdcff".toColorInt()),
                semanticBrand2 = Color("#8eb0fb".toColorInt()),
                semanticBrand1 = Color("#6691f4".toColorInt()),
                semanticBrand0 = Color("#3061d5".toColorInt())
            )
        )
    ),
    colorLight = DSColor(
        semantic = DSSemantic(
            warning = DSWarning(
                semanticWarningNegative4 = Color("#492909".toColorInt()),
                semanticWarningNegative3 = Color("#7a4510".toColorInt()),
                semanticWarningNegative2 = Color("#a05c1c".toColorInt()),
                semanticWarningNegative1 = Color("#b4610e".toColorInt()),
                semanticWarning8 = Color("#fffcfa".toColorInt()),
                semanticWarning7 = Color("#fff5eb".toColorInt()),
                semanticWarning6 = Color("#fff0e0".toColorInt()),
                semanticWarning5 = Color("#ffe8d1".toColorInt()),
                semanticWarning4 = Color("#fcdec0".toColorInt()),
                semanticWarning3 = Color("#ffd4a8".toColorInt()),
                semanticWarning2 = Color("#feb871".toColorInt()),
                semanticWarning1 = Color("#f6a351".toColorInt()),
                semanticWarning0 = Color("#f59638".toColorInt())
            ),
            success = DSSuccess(
                semanticSuccessNegative4 = Color("#0a2e0b".toColorInt()),
                semanticSuccessNegative3 = Color("#135315".toColorInt()),
                semanticSuccessNegative2 = Color("#246626".toColorInt()),
                semanticSuccessNegative1 = Color("#2f6f2f".toColorInt()),
                semanticSuccess8 = Color("#fbfefb".toColorInt()),
                semanticSuccess7 = Color("#f4fbf4".toColorInt()),
                semanticSuccess6 = Color("#e6f9e6".toColorInt()),
                semanticSuccess5 = Color("#dff6df".toColorInt()),
                semanticSuccess4 = Color("#cff2cf".toColorInt()),
                semanticSuccess3 = Color("#c6ecc6".toColorInt()),
                semanticSuccess2 = Color("#87c987".toColorInt()),
                semanticSuccess1 = Color("#55a555".toColorInt()),
                semanticSuccess0 = Color("#347434".toColorInt())
            ),
            neutralAlpha = DSNeutralAlpha(
                semanticNeutralANegative4 = Color("#09131aed".toColorInt()),
                semanticNeutralANegative3 = Color("#0a121ae0".toColorInt()),
                semanticNeutralANegative2 = Color("#1a232ddb".toColorInt()),
                semanticNeutralANegative1 = Color("#1d2835cc".toColorInt()),
                semanticNeutralA8 = Color("#1f529e05".toColorInt()),
                semanticNeutralA7 = Color("#00295c0a".toColorInt()),
                semanticNeutralA6 = Color("#022e500f".toColorInt()),
                semanticNeutralA5 = Color("#10284717".toColorInt()),
                semanticNeutralA4 = Color("#04294321".toColorInt()),
                semanticNeutralA3 = Color("#10315633".toColorInt()),
                semanticNeutralA2 = Color("#0d253f66".toColorInt()),
                semanticNeutralA1 = Color("#1830498f".toColorInt()),
                semanticNeutralA0 = Color("#182639bd".toColorInt())
            ),
            neutral = DSNeutral(
                semanticNeutralNegative4 = Color("#1b242c".toColorInt()),
                semanticNeutralNegative3 = Color("#272e35".toColorInt()),
                semanticNeutralNegative2 = Color("#3a424a".toColorInt()),
                semanticNeutralNegative1 = Color("#4a545e".toColorInt()),
                semanticNeutral8 = Color("#fcfcfd".toColorInt()),
                semanticNeutral7 = Color("#f5f7f9".toColorInt()),
                semanticNeutral6 = Color("#f0f3f5".toColorInt()),
                semanticNeutral5 = Color("#eaedf0".toColorInt()),
                semanticNeutral4 = Color("#dee3e7".toColorInt()),
                semanticNeutral3 = Color("#cfd6dd".toColorInt()),
                semanticNeutral2 = Color("#9ea8b3".toColorInt()),
                semanticNeutral1 = Color("#7e8c9a".toColorInt()),
                semanticNeutral0 = Color("#555f6d".toColorInt())
            ),
            info = DSInfo(
                semanticInfoNegative4 = Color("#041f5d".toColorInt()),
                semanticInfoNegative3 = Color("#113997".toColorInt()),
                semanticInfoNegative2 = Color("#1e4fc2".toColorInt()),
                semanticInfoNegative1 = Color("#2759ce".toColorInt()),
                semanticInfo8 = Color("#fafbff".toColorInt()),
                semanticInfo7 = Color("#f5f8ff".toColorInt()),
                semanticInfo6 = Color("#ebf0ff".toColorInt()),
                semanticInfo5 = Color("#e5eeff".toColorInt()),
                semanticInfo4 = Color("#d6e3ff".toColorInt()),
                semanticInfo3 = Color("#ccdcff".toColorInt()),
                semanticInfo2 = Color("#8eb0fb".toColorInt()),
                semanticInfo1 = Color("#6691f4".toColorInt()),
                semanticInfo0 = Color("#3061d5".toColorInt())
            ),
            danger = DSDanger(
                semanticDangerNegative4 = Color("#4a0d0d".toColorInt()),
                semanticDangerNegative3 = Color("#6f2020".toColorInt()),
                semanticDangerNegative2 = Color("#952d2d".toColorInt()),
                semanticDangerNegative1 = Color("#a13636".toColorInt()),
                semanticDanger8 = Color("#fffafa".toColorInt()),
                semanticDanger7 = Color("#fef5f5".toColorInt()),
                semanticDanger6 = Color("#ffebeb".toColorInt()),
                semanticDanger5 = Color("#fee7e7".toColorInt()),
                semanticDanger4 = Color("#fcd9d9".toColorInt()),
                semanticDanger3 = Color("#fccfcf".toColorInt()),
                semanticDanger2 = Color("#f49090".toColorInt()),
                semanticDanger1 = Color("#f26363".toColorInt()),
                semanticDanger0 = Color("#c53434".toColorInt())
            ),
            brand = DSBrand(
                semanticBrandNegative4 = Color("#041f5d".toColorInt()),
                semanticBrandNegative3 = Color("#113997".toColorInt()),
                semanticBrandNegative2 = Color("#1e4fc2".toColorInt()),
                semanticBrandNegative1 = Color("#2759ce".toColorInt()),
                semanticBrand8 = Color("#fafbff".toColorInt()),
                semanticBrand7 = Color("#f5f8ff".toColorInt()),
                semanticBrand6 = Color("#ebf0ff".toColorInt()),
                semanticBrand5 = Color("#e5eeff".toColorInt()),
                semanticBrand4 = Color("#d6e3ff".toColorInt()),
                semanticBrand3 = Color("#ccdcff".toColorInt()),
                semanticBrand2 = Color("#8eb0fb".toColorInt()),
                semanticBrand1 = Color("#6691f4".toColorInt()),
                semanticBrand0 = Color("#3061d5".toColorInt())
            )
        )
    ),
    borderRadius = DSBorderRadius(
        xLarge = 12.0,
        small = 2.0,
        none = 0.0,
        medium = 4.0,
        large = 8.0,
        full = 999.0,
        borderRadius4xLarge = 24.0,
        borderRadius3xLarge = 20.0,
        borderRadius2xLarge = 16.0
    ),
    borderWidth = DSBorderWidth(
        xLarge = 8.0,
        small = 1.0,
        none = 0.0,
        medium = 2.0,
        large = 4.0
    ),
    size = DSSize(
        xSmall = 24.0,
        xLarge = 56.0,
        small = 32.0,
        size3xSmall = 16.0,
        size3xLarge = 72.0,
        size2xSmall = 20.0,
        size2xLarge = 64.0,
        medium = 40.0,
        large = 48.0
    ),
    space = DSSpace(
        padding = DSPadding(
            xSmall = 4.0,
            small = 8.0,
            padding6xLarge = 64.0,
            padding5xLarge = 44.0,
            padding4xLarge = 40.0,
            padding3xLarge = 32.0,
            padding2xSmall = 2.0,
            padding2xLarge = 24.0,
            none = 0.0,
            medium = 12.0,
            large = 16.0
        ),
        gap = DSGap(
            xSmall = 4.0,
            xLarge = 24.0,
            small = 8.0,
            none = 0.0,
            medium = 12.0,
            large = 16.0,
            gap3xLarge = 44.0,
            gap2xSmall = 2.0,
            gap2xLarge = 32.0
        )
    ),
    opacity = DSOpacity(
        disabled = 0.5
    ),
    typography = DSTypography(
        utility = DSUtility(
            typographyUtilitySmall = Typography(
                lineHeight = 16.0,
                letterSpacing = 0.0,
                fontWeight = 500.0,
                fontSize = 12.0,
                fontFamily = "Noto Sans"
            ),
            typographyUtilityMedium = Typography(
                lineHeight = 20.0,
                letterSpacing = -0.006,
                fontWeight = 500.0,
                fontSize = 14.0,
                fontFamily = "Noto Sans"
            ),
            typographyUtilityLarge = Typography(
                lineHeight = 22.0,
                letterSpacing = -0.011,
                fontWeight = 500.0,
                fontSize = 16.0,
                fontFamily = "Noto Sans"
            )
        ),
        heading = DSHeading(
            typographyHeadingXLarge = Typography(
                lineHeight = 24.0,
                letterSpacing = -0.014,
                fontWeight = 700.0,
                fontSize = 18.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeadingSmall = Typography(
                lineHeight = 16.0,
                letterSpacing = 0.0,
                fontWeight = 700.0,
                fontSize = 12.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeadingMedium = Typography(
                lineHeight = 20.0,
                letterSpacing = -0.006,
                fontWeight = 700.0,
                fontSize = 14.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeadingLarge = Typography(
                lineHeight = 22.0,
                letterSpacing = -0.011,
                fontWeight = 700.0,
                fontSize = 16.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading9xLarge = Typography(
                lineHeight = 66.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 54.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading8xLarge = Typography(
                lineHeight = 58.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 48.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading7xLarge = Typography(
                lineHeight = 56.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 42.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading6xLarge = Typography(
                lineHeight = 48.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 36.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading5xLarge = Typography(
                lineHeight = 42.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 32.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading4xLarge = Typography(
                lineHeight = 38.0,
                letterSpacing = -0.021,
                fontWeight = 700.0,
                fontSize = 28.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading3xLarge = Typography(
                lineHeight = 32.0,
                letterSpacing = -0.019,
                fontWeight = 700.0,
                fontSize = 24.0,
                fontFamily = "Noto Sans"
            ),
            typographyHeading2xLarge = Typography(
                lineHeight = 26.0,
                letterSpacing = -0.017,
                fontWeight = 700.0,
                fontSize = 20.0,
                fontFamily = "Noto Sans"
            )
        ),
        display = DSDisplay(
            typographyDisplayXLarge = Typography(
                lineHeight = 92.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 76.0,
                fontFamily = "Noto Sans"
            ),
            typographyDisplaySmall = Typography(
                lineHeight = 66.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 54.0,
                fontFamily = "Noto Sans"
            ),
            typographyDisplayMedium = Typography(
                lineHeight = 72.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 60.0,
                fontFamily = "Noto Sans"
            ),
            typographyDisplayLarge = Typography(
                lineHeight = 82.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 68.0,
                fontFamily = "Noto Sans"
            ),
            typographyDisplay3xLarge = Typography(
                lineHeight = 112.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 92.0,
                fontFamily = "Noto Sans"
            ),
            typographyDisplay2xLarge = Typography(
                lineHeight = 102.0,
                letterSpacing = -0.022,
                fontWeight = 700.0,
                fontSize = 84.0,
                fontFamily = "Noto Sans"
            )
        ),
        code = DSCode(
            typographyCodeSmall = Typography(
                lineHeight = 16.0,
                letterSpacing = 0.0,
                fontWeight = 400.0,
                fontSize = 12.0,
                fontFamily = "Noto Sans Mono"
            ),
            typographyCodeMedium = Typography(
                lineHeight = 20.0,
                letterSpacing = -0.006,
                fontWeight = 400.0,
                fontSize = 14.0,
                fontFamily = "Noto Sans Mono"
            ),
            typographyCodeLarge = Typography(
                lineHeight = 22.0,
                letterSpacing = -0.011,
                fontWeight = 400.0,
                fontSize = 16.0,
                fontFamily = "Noto Sans Mono"
            )
        ),
        body = DSBody(
            typographyBodySmall = Typography(
                lineHeight = 16.0,
                letterSpacing = 0.0,
                fontWeight = 400.0,
                fontSize = 12.0,
                fontFamily = "Noto Sans"
            ),
            typographyBodyMedium = Typography(
                lineHeight = 20.0,
                letterSpacing = -0.006,
                fontWeight = 400.0,
                fontSize = 14.0,
                fontFamily = "Noto Sans"
            ),
            typographyBodyLarge = Typography(
                lineHeight = 22.0,
                letterSpacing = -0.011,
                fontWeight = 400.0,
                fontSize = 16.0,
                fontFamily = "Noto Sans"
            )
        )
    )
)