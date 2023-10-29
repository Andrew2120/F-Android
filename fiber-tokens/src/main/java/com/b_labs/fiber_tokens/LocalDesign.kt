package com.b_labs.fiber_tokens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val localDesign = staticCompositionLocalOf {
    DesignSystem(
        color = ColorValuesContainer(
            whiteAlpha = WhiteAlphaValuesContainer(
                whiteANegative9 = Color(android.graphics.Color.parseColor("#ffffff14")),
                whiteANegative8 = Color(android.graphics.Color.parseColor("#ffffff1a")),
                whiteANegative7 = Color(android.graphics.Color.parseColor("#ffffff1f")),
                whiteANegative6 = Color(android.graphics.Color.parseColor("#ffffff3d")),
                whiteANegative5 = Color(android.graphics.Color.parseColor("#ffffff66")),
                whiteANegative4 = Color(android.graphics.Color.parseColor("#ffffffa3")),
                whiteANegative3 = Color(android.graphics.Color.parseColor("#ffffffad")),
                whiteANegative2 = Color(android.graphics.Color.parseColor("#ffffffb8")),
                whiteANegative12 = Color(android.graphics.Color.parseColor("#ffffff05")),
                whiteANegative11 = Color(android.graphics.Color.parseColor("#ffffff08")),
                whiteANegative10 = Color(android.graphics.Color.parseColor("#ffffff0d")),
                whiteANegative1 = Color(android.graphics.Color.parseColor("#ffffffd1")),
                whiteA0 = Color(android.graphics.Color.parseColor("#ffffff"))
            ),
            warmGrayAlpha = WarmGrayAlphaValuesContainer(
                warmGrayANegative4 = Color(android.graphics.Color.parseColor("#131311ed")),
                warmGrayANegative3 = Color(android.graphics.Color.parseColor("#12120de0")),
                warmGrayANegative2 = Color(android.graphics.Color.parseColor("#22221bdb")),
                warmGrayANegative1 = Color(android.graphics.Color.parseColor("#272720cc")),
                warmGrayA8 = Color(android.graphics.Color.parseColor("#52525205")),
                warmGrayA7 = Color(android.graphics.Color.parseColor("#2f2f2d0a")),
                warmGrayA6 = Color(android.graphics.Color.parseColor("#2f2f0e0f")),
                warmGrayA5 = Color(android.graphics.Color.parseColor("#22220217")),
                warmGrayA4 = Color(android.graphics.Color.parseColor("#33331421")),
                warmGrayA3 = Color(android.graphics.Color.parseColor("#3e3e1d33")),
                warmGrayA2 = Color(android.graphics.Color.parseColor("#28281166")),
                warmGrayA1 = Color(android.graphics.Color.parseColor("#2f2f238f")),
                warmGrayA0 = Color(android.graphics.Color.parseColor("#26261cbd"))
            ),
            warmGray = WarmGrayValuesContainer(
                warmGray8 = Color(android.graphics.Color.parseColor("#fdfdfc")),
                warmGray7 = Color(android.graphics.Color.parseColor("#f8f8f7")),
                warmGray6 = Color(android.graphics.Color.parseColor("#f3f3f1")),
                warmGray5 = Color(android.graphics.Color.parseColor("#eaeae6")),
                warmGray4 = Color(android.graphics.Color.parseColor("#e5e5e1")),
                warmGray3 = Color(android.graphics.Color.parseColor("#d9d9d3")),
                warmGray2 = Color(android.graphics.Color.parseColor("#a8a89f")),
                warmGray1 = Color(android.graphics.Color.parseColor("#8b8b84")),
                warmGray0 = Color(android.graphics.Color.parseColor("#5f5f58")),
                negative4 = Color(android.graphics.Color.parseColor("#222220")),
                negative3 = Color(android.graphics.Color.parseColor("#30302c")),
                negative2 = Color(android.graphics.Color.parseColor("#40403a")),
                negative1 = Color(android.graphics.Color.parseColor("#52524c"))
            ),
            violet = VioletValuesContainer1(
                violet8 = Color(android.graphics.Color.parseColor("#fbfaff")),
                violet7 = Color(android.graphics.Color.parseColor("#f7f5ff")),
                violet6 = Color(android.graphics.Color.parseColor("#f3f0ff")),
                violet5 = Color(android.graphics.Color.parseColor("#eeebff")),
                violet4 = Color(android.graphics.Color.parseColor("#e3e0ff")),
                violet3 = Color(android.graphics.Color.parseColor("#dcd6ff")),
                violet2 = Color(android.graphics.Color.parseColor("#aba2fb")),
                violet1 = Color(android.graphics.Color.parseColor("#927ef1")),
                violet0 = Color(android.graphics.Color.parseColor("#634eca")),
                negative4 = Color(android.graphics.Color.parseColor("#201263")),
                negative3 = Color(android.graphics.Color.parseColor("#39288a")),
                negative2 = Color(android.graphics.Color.parseColor("#4e38bc")),
                negative1 = Color(android.graphics.Color.parseColor("#573fcf"))
            ),
            transparent = TransparentValuesContainer(
                transparent = Color(android.graphics.Color.parseColor("#ffffff00"))
            ),
            teal = TealValuesContainer1(
                teal8 = Color(android.graphics.Color.parseColor("#fafeff")),
                teal7 = Color(android.graphics.Color.parseColor("#f0fbff")),
                teal6 = Color(android.graphics.Color.parseColor("#e8f7fc")),
                teal5 = Color(android.graphics.Color.parseColor("#e0f3fa")),
                teal4 = Color(android.graphics.Color.parseColor("#c5ecf7")),
                teal3 = Color(android.graphics.Color.parseColor("#b8e8f5")),
                teal2 = Color(android.graphics.Color.parseColor("#7ac0dc")),
                teal1 = Color(android.graphics.Color.parseColor("#4f9eba")),
                teal0 = Color(android.graphics.Color.parseColor("#077597")),
                negative4 = Color(android.graphics.Color.parseColor("#012a37")),
                negative3 = Color(android.graphics.Color.parseColor("#0a495c")),
                negative2 = Color(android.graphics.Color.parseColor("#196076")),
                negative1 = Color(android.graphics.Color.parseColor("#196c85"))
            ),
            semantic = SemanticValuesContainer(
                warning = WarningValuesContainer(
                    semanticWarningNegative4 = Color(android.graphics.Color.parseColor("#492909")),
                    semanticWarningNegative3 = Color(android.graphics.Color.parseColor("#7a4510")),
                    semanticWarningNegative2 = Color(android.graphics.Color.parseColor("#a05c1c")),
                    semanticWarningNegative1 = Color(android.graphics.Color.parseColor("#b4610e")),
                    semanticWarning8 = Color(android.graphics.Color.parseColor("#fffcfa")),
                    semanticWarning7 = Color(android.graphics.Color.parseColor("#fff5eb")),
                    semanticWarning6 = Color(android.graphics.Color.parseColor("#fff0e0")),
                    semanticWarning5 = Color(android.graphics.Color.parseColor("#ffe8d1")),
                    semanticWarning4 = Color(android.graphics.Color.parseColor("#fcdec0")),
                    semanticWarning3 = Color(android.graphics.Color.parseColor("#ffd4a8")),
                    semanticWarning2 = Color(android.graphics.Color.parseColor("#feb871")),
                    semanticWarning1 = Color(android.graphics.Color.parseColor("#f6a351")),
                    semanticWarning0 = Color(android.graphics.Color.parseColor("#f59638"))
                ),
                success = SuccessValuesContainer1(
                    semanticSuccessNegative4 = Color(android.graphics.Color.parseColor("#0a2e0b")),
                    semanticSuccessNegative3 = Color(android.graphics.Color.parseColor("#135315")),
                    semanticSuccessNegative2 = Color(android.graphics.Color.parseColor("#246626")),
                    semanticSuccessNegative1 = Color(android.graphics.Color.parseColor("#2f6f2f")),
                    semanticSuccess8 = Color(android.graphics.Color.parseColor("#fbfefb")),
                    semanticSuccess7 = Color(android.graphics.Color.parseColor("#f4fbf4")),
                    semanticSuccess6 = Color(android.graphics.Color.parseColor("#e6f9e6")),
                    semanticSuccess5 = Color(android.graphics.Color.parseColor("#dff6df")),
                    semanticSuccess4 = Color(android.graphics.Color.parseColor("#cff2cf")),
                    semanticSuccess3 = Color(android.graphics.Color.parseColor("#c6ecc6")),
                    semanticSuccess2 = Color(android.graphics.Color.parseColor("#87c987")),
                    semanticSuccess1 = Color(android.graphics.Color.parseColor("#55a555")),
                    semanticSuccess0 = Color(android.graphics.Color.parseColor("#347434"))
                ),
                neutralAlpha = NeutralAlphaValuesContainer(
                    semanticNeutralANegative4 = Color(android.graphics.Color.parseColor("#09131aed")),
                    semanticNeutralANegative3 = Color(android.graphics.Color.parseColor("#0a121ae0")),
                    semanticNeutralANegative2 = Color(android.graphics.Color.parseColor("#1a232ddb")),
                    semanticNeutralANegative1 = Color(android.graphics.Color.parseColor("#1d2835cc")),
                    semanticNeutralA8 = Color(android.graphics.Color.parseColor("#1f529e05")),
                    semanticNeutralA7 = Color(android.graphics.Color.parseColor("#00295c0a")),
                    semanticNeutralA6 = Color(android.graphics.Color.parseColor("#022e500f")),
                    semanticNeutralA5 = Color(android.graphics.Color.parseColor("#10284717")),
                    semanticNeutralA4 = Color(android.graphics.Color.parseColor("#04294321")),
                    semanticNeutralA3 = Color(android.graphics.Color.parseColor("#10315633")),
                    semanticNeutralA2 = Color(android.graphics.Color.parseColor("#0d253f66")),
                    semanticNeutralA1 = Color(android.graphics.Color.parseColor("#1830498f")),
                    semanticNeutralA0 = Color(android.graphics.Color.parseColor("#182639bd"))
                ),
                neutral = NeutralValuesContainer2(
                    semanticNeutralNegative4 = Color(android.graphics.Color.parseColor("#1b242c")),
                    semanticNeutralNegative3 = Color(android.graphics.Color.parseColor("#272e35")),
                    semanticNeutralNegative2 = Color(android.graphics.Color.parseColor("#3a424a")),
                    semanticNeutralNegative1 = Color(android.graphics.Color.parseColor("#4a545e")),
                    semanticNeutral8 = Color(android.graphics.Color.parseColor("#fcfcfd")),
                    semanticNeutral7 = Color(android.graphics.Color.parseColor("#f5f7f9")),
                    semanticNeutral6 = Color(android.graphics.Color.parseColor("#f0f3f5")),
                    semanticNeutral5 = Color(android.graphics.Color.parseColor("#eaedf0")),
                    semanticNeutral4 = Color(android.graphics.Color.parseColor("#dee3e7")),
                    semanticNeutral3 = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    semanticNeutral2 = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    semanticNeutral1 = Color(android.graphics.Color.parseColor("#7e8c9a")),
                    semanticNeutral0 = Color(android.graphics.Color.parseColor("#555f6d"))
                ),
                info = InfoValuesContainer(
                    semanticInfoNegative4 = Color(android.graphics.Color.parseColor("#041f5d")),
                    semanticInfoNegative3 = Color(android.graphics.Color.parseColor("#113997")),
                    semanticInfoNegative2 = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    semanticInfoNegative1 = Color(android.graphics.Color.parseColor("#2759ce")),
                    semanticInfo8 = Color(android.graphics.Color.parseColor("#fafbff")),
                    semanticInfo7 = Color(android.graphics.Color.parseColor("#f5f8ff")),
                    semanticInfo6 = Color(android.graphics.Color.parseColor("#ebf0ff")),
                    semanticInfo5 = Color(android.graphics.Color.parseColor("#e5eeff")),
                    semanticInfo4 = Color(android.graphics.Color.parseColor("#d6e3ff")),
                    semanticInfo3 = Color(android.graphics.Color.parseColor("#ccdcff")),
                    semanticInfo2 = Color(android.graphics.Color.parseColor("#8eb0fb")),
                    semanticInfo1 = Color(android.graphics.Color.parseColor("#6691f4")),
                    semanticInfo0 = Color(android.graphics.Color.parseColor("#3061d5"))
                ),
                danger = DangerValuesContainer2(
                    semanticDangerNegative4 = Color(android.graphics.Color.parseColor("#4a0d0d")),
                    semanticDangerNegative3 = Color(android.graphics.Color.parseColor("#6f2020")),
                    semanticDangerNegative2 = Color(android.graphics.Color.parseColor("#952d2d")),
                    semanticDangerNegative1 = Color(android.graphics.Color.parseColor("#a13636")),
                    semanticDanger8 = Color(android.graphics.Color.parseColor("#fffafa")),
                    semanticDanger7 = Color(android.graphics.Color.parseColor("#fef5f5")),
                    semanticDanger6 = Color(android.graphics.Color.parseColor("#ffebeb")),
                    semanticDanger5 = Color(android.graphics.Color.parseColor("#fee7e7")),
                    semanticDanger4 = Color(android.graphics.Color.parseColor("#fcd9d9")),
                    semanticDanger3 = Color(android.graphics.Color.parseColor("#fccfcf")),
                    semanticDanger2 = Color(android.graphics.Color.parseColor("#f49090")),
                    semanticDanger1 = Color(android.graphics.Color.parseColor("#f26363")),
                    semanticDanger0 = Color(android.graphics.Color.parseColor("#c53434"))
                ),
                brand = BrandValuesContainer(
                    semanticBrandNegative4 = Color(android.graphics.Color.parseColor("#952d2d")),
                    semanticBrandNegative3 = Color(android.graphics.Color.parseColor("#113997")),
                    semanticBrandNegative2 = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    semanticBrandNegative1 = Color(android.graphics.Color.parseColor("#2759ce")),
                    semanticBrand8 = Color(android.graphics.Color.parseColor("#fafbff")),
                    semanticBrand7 = Color(android.graphics.Color.parseColor("#f5f8ff")),
                    semanticBrand6 = Color(android.graphics.Color.parseColor("#ebf0ff")),
                    semanticBrand5 = Color(android.graphics.Color.parseColor("#e5eeff")),
                    semanticBrand4 = Color(android.graphics.Color.parseColor("#d6e3ff")),
                    semanticBrand3 = Color(android.graphics.Color.parseColor("#ccdcff")),
                    semanticBrand2 = Color(android.graphics.Color.parseColor("#8eb0fb")),
                    semanticBrand1 = Color(android.graphics.Color.parseColor("#6691f4")),
                    semanticBrand0 = Color(android.graphics.Color.parseColor("#3061d5"))
                )
            ),
            red = RedValuesContainer1(
                red8 = Color(android.graphics.Color.parseColor("#fffafa")),
                red7 = Color(android.graphics.Color.parseColor("#fef5f5")),
                red6 = Color(android.graphics.Color.parseColor("#ffebeb")),
                red5 = Color(android.graphics.Color.parseColor("#fee7e7")),
                red4 = Color(android.graphics.Color.parseColor("#fcd9d9")),
                red3 = Color(android.graphics.Color.parseColor("#fccfcf")),
                red2 = Color(android.graphics.Color.parseColor("#f49090")),
                red1 = Color(android.graphics.Color.parseColor("#f26363")),
                red0 = Color(android.graphics.Color.parseColor("#c53434")),
                negative4 = Color(android.graphics.Color.parseColor("#4a0d0d")),
                negative3 = Color(android.graphics.Color.parseColor("#6f2020")),
                negative2 = Color(android.graphics.Color.parseColor("#952d2d")),
                negative1 = Color(android.graphics.Color.parseColor("#a13636"))
            ),
            purple = PurpleValuesContainer1(
                purple8 = Color(android.graphics.Color.parseColor("#fefaff")),
                purple7 = Color(android.graphics.Color.parseColor("#fdf5ff")),
                purple6 = Color(android.graphics.Color.parseColor("#faedfd")),
                purple5 = Color(android.graphics.Color.parseColor("#f8e2fd")),
                purple4 = Color(android.graphics.Color.parseColor("#f5d5fb")),
                purple3 = Color(android.graphics.Color.parseColor("#f4caf7")),
                purple2 = Color(android.graphics.Color.parseColor("#d98eec")),
                purple1 = Color(android.graphics.Color.parseColor("#c466db")),
                purple0 = Color(android.graphics.Color.parseColor("#9939ac")),
                negative4 = Color(android.graphics.Color.parseColor("#410b2f")),
                negative3 = Color(android.graphics.Color.parseColor("#5b1e67")),
                negative2 = Color(android.graphics.Color.parseColor("#792989")),
                negative1 = Color(android.graphics.Color.parseColor("#853295"))
            ),
            orange = OrangeValuesContainer1(
                orange8 = Color(android.graphics.Color.parseColor("#fffcfa")),
                orange7 = Color(android.graphics.Color.parseColor("#fff5eb")),
                orange6 = Color(android.graphics.Color.parseColor("#fff0e0")),
                orange5 = Color(android.graphics.Color.parseColor("#ffe8d1")),
                orange4 = Color(android.graphics.Color.parseColor("#fcdec0")),
                orange3 = Color(android.graphics.Color.parseColor("#ffd4a8")),
                orange2 = Color(android.graphics.Color.parseColor("#feb871")),
                orange1 = Color(android.graphics.Color.parseColor("#f6a351")),
                orange0 = Color(android.graphics.Color.parseColor("#f59638")),
                negative4 = Color(android.graphics.Color.parseColor("#492909")),
                negative3 = Color(android.graphics.Color.parseColor("#7a4510")),
                negative2 = Color(android.graphics.Color.parseColor("#a05c1c")),
                negative1 = Color(android.graphics.Color.parseColor("#b4610e"))
            ),
            nonSemantic = NonSemanticValuesContainer(
                white = WhiteValuesContainer(
                    nonSemanticWhiteContentSecondary = Color(android.graphics.Color.parseColor("#ffffffa3")),
                    nonSemanticWhiteContentPrimary = Color(android.graphics.Color.parseColor("#ffffff")),
                    nonSemanticWhiteBorderSubtle = Color(android.graphics.Color.parseColor("#ffffffad")),
                    nonSemanticWhiteBorderStrong = Color(android.graphics.Color.parseColor("#ffffff")),
                    nonSemanticWhiteBorderDefault = Color(android.graphics.Color.parseColor("#ffffff66")),
                    nonSemanticWhiteBackgroundSurface = Color(android.graphics.Color.parseColor("#ffffff1a")),
                    nonSemanticWhiteBackgroundSubtle = Color(android.graphics.Color.parseColor("#ffffff1f")),
                    nonSemanticWhiteBackgroundStrong = Color(android.graphics.Color.parseColor("#ffffff")),
                    nonSemanticWhiteBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#ffffff66")),
                    nonSemanticWhiteBackgroundMuted = Color(android.graphics.Color.parseColor("#ffffffa3"))
                ),
                violet = VioletValuesContainer(
                    nonSemanticVioletContentSecondary = Color(android.graphics.Color.parseColor("#634eca")),
                    nonSemanticVioletContentPrimary = Color(android.graphics.Color.parseColor("#39288a")),
                    nonSemanticVioletBorderSubtle = Color(android.graphics.Color.parseColor("#dcd6ff")),
                    nonSemanticVioletBorderStrong = Color(android.graphics.Color.parseColor("#634eca")),
                    nonSemanticVioletBorderDefault = Color(android.graphics.Color.parseColor("#eeebff")),
                    nonSemanticVioletBackgroundSurface = Color(android.graphics.Color.parseColor("#fbfaff")),
                    nonSemanticVioletBackgroundSubtle = Color(android.graphics.Color.parseColor("#f7f5ff")),
                    nonSemanticVioletBackgroundStrong = Color(android.graphics.Color.parseColor("#634eca")),
                    nonSemanticVioletBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#eeebff")),
                    nonSemanticVioletBackgroundMuted = Color(android.graphics.Color.parseColor("#e3e0ff"))
                ),
                teal = TealValuesContainer(
                    nonSemanticTealContentSecondary = Color(android.graphics.Color.parseColor("#077597")),
                    nonSemanticTealContentPrimary = Color(android.graphics.Color.parseColor("#0a495c")),
                    nonSemanticTealBorderSubtle = Color(android.graphics.Color.parseColor("#b8e8f5")),
                    nonSemanticTealBorderStrong = Color(android.graphics.Color.parseColor("#077597")),
                    nonSemanticTealBorderDefault = Color(android.graphics.Color.parseColor("#e0f3fa")),
                    nonSemanticTealBackgroundSurface = Color(android.graphics.Color.parseColor("#fafeff")),
                    nonSemanticTealBackgroundSubtle = Color(android.graphics.Color.parseColor("#f0fbff")),
                    nonSemanticTealBackgroundStrong = Color(android.graphics.Color.parseColor("#077597")),
                    nonSemanticTealBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#e0f3fa")),
                    nonSemanticTealBackgroundMuted = Color(android.graphics.Color.parseColor("#c5ecf7"))
                ),
                red = RedValuesContainer(
                    nonSemanticRedContentSecondary = Color(android.graphics.Color.parseColor("#c53434")),
                    nonSemanticRedContentPrimary = Color(android.graphics.Color.parseColor("#6f2020")),
                    nonSemanticRedBorderSubtle = Color(android.graphics.Color.parseColor("#fccfcf")),
                    nonSemanticRedBorderStrong = Color(android.graphics.Color.parseColor("#c53434")),
                    nonSemanticRedBorderDefault = Color(android.graphics.Color.parseColor("#fee7e7")),
                    nonSemanticRedBackgroundSurface = Color(android.graphics.Color.parseColor("#fffafa")),
                    nonSemanticRedBackgroundSubtle = Color(android.graphics.Color.parseColor("#fef5f5")),
                    nonSemanticRedBackgroundStrong = Color(android.graphics.Color.parseColor("#c53434")),
                    nonSemanticRedBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#fee7e7")),
                    nonSemanticRedBackgroundMuted = Color(android.graphics.Color.parseColor("#fcd9d9"))
                ),
                purple = PurpleValuesContainer(
                    nonSemanticPurpleContentSecondary = Color(android.graphics.Color.parseColor("#9939ac")),
                    nonSemanticPurpleContentPrimary = Color(android.graphics.Color.parseColor("#5b1e67")),
                    nonSemanticPurpleBorderSubtle = Color(android.graphics.Color.parseColor("#f4caf7")),
                    nonSemanticPurpleBorderStrong = Color(android.graphics.Color.parseColor("#9939ac")),
                    nonSemanticPurpleBorderDefault = Color(android.graphics.Color.parseColor("#f8e2fd")),
                    nonSemanticPurpleBackgroundSurface = Color(android.graphics.Color.parseColor("#fefaff")),
                    nonSemanticPurpleBackgroundSubtle = Color(android.graphics.Color.parseColor("#fdf5ff")),
                    nonSemanticPurpleBackgroundStrong = Color(android.graphics.Color.parseColor("#9939ac")),
                    nonSemanticPurpleBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#f8e2fd")),
                    nonSemanticPurpleBackgroundMuted = Color(android.graphics.Color.parseColor("#f5d5fb"))
                ),
                orange = OrangeValuesContainer(
                    nonSemanticOrangeContentSecondary = Color(android.graphics.Color.parseColor("#f59638")),
                    nonSemanticOrangeContentPrimary = Color(android.graphics.Color.parseColor("#7a4510")),
                    nonSemanticOrangeBorderSubtle = Color(android.graphics.Color.parseColor("#ffd4a8")),
                    nonSemanticOrangeBorderStrong = Color(android.graphics.Color.parseColor("#f59638")),
                    nonSemanticOrangeBorderDefault = Color(android.graphics.Color.parseColor("#ffe8d1")),
                    nonSemanticOrangeBackgroundSurface = Color(android.graphics.Color.parseColor("#fffcfa")),
                    nonSemanticOrangeBackgroundSubtle = Color(android.graphics.Color.parseColor("#fff5eb")),
                    nonSemanticOrangeBackgroundStrong = Color(android.graphics.Color.parseColor("#f59638")),
                    nonSemanticOrangeBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#ffe8d1")),
                    nonSemanticOrangeBackgroundMuted = Color(android.graphics.Color.parseColor("#fcdec0"))
                ),
                magenta = MagentaValuesContainer(
                    nonSemanticMagentaContentSecondary = Color(android.graphics.Color.parseColor("#b12f86")),
                    nonSemanticMagentaContentPrimary = Color(android.graphics.Color.parseColor("#671e4d")),
                    nonSemanticMagentaBorderSubtle = Color(android.graphics.Color.parseColor("#f7cae8")),
                    nonSemanticMagentaBorderStrong = Color(android.graphics.Color.parseColor("#b12f86")),
                    nonSemanticMagentaBorderDefault = Color(android.graphics.Color.parseColor("#fde2f4")),
                    nonSemanticMagentaBackgroundSurface = Color(android.graphics.Color.parseColor("#fffafd")),
                    nonSemanticMagentaBackgroundSubtle = Color(android.graphics.Color.parseColor("#fef6fb")),
                    nonSemanticMagentaBackgroundStrong = Color(android.graphics.Color.parseColor("#b12f86")),
                    nonSemanticMagentaBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#fde2f4")),
                    nonSemanticMagentaBackgroundMuted = Color(android.graphics.Color.parseColor("#fbd5ee"))
                ),
                green = GreenValuesContainer(
                    nonSemanticGreenContentSecondary = Color(android.graphics.Color.parseColor("#347434")),
                    nonSemanticGreenContentPrimary = Color(android.graphics.Color.parseColor("#135315")),
                    nonSemanticGreenBorderSubtle = Color(android.graphics.Color.parseColor("#c6ecc6")),
                    nonSemanticGreenBorderStrong = Color(android.graphics.Color.parseColor("#347434")),
                    nonSemanticGreenBorderDefault = Color(android.graphics.Color.parseColor("#dff6df")),
                    nonSemanticGreenBackgroundSurface = Color(android.graphics.Color.parseColor("#fbfefb")),
                    nonSemanticGreenBackgroundSubtle = Color(android.graphics.Color.parseColor("#f4fbf4")),
                    nonSemanticGreenBackgroundStrong = Color(android.graphics.Color.parseColor("#347434")),
                    nonSemanticGreenBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#dff6df")),
                    nonSemanticGreenBackgroundMuted = Color(android.graphics.Color.parseColor("#cff2cf"))
                ),
                gray = GrayValuesContainer(
                    nonSemanticGrayContentSecondary = Color(android.graphics.Color.parseColor("#555f6d")),
                    nonSemanticGrayContentPrimary = Color(android.graphics.Color.parseColor("#272e35")),
                    nonSemanticGrayBorderSubtle = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    nonSemanticGrayBorderStrong = Color(android.graphics.Color.parseColor("#555f6d")),
                    nonSemanticGrayBorderDefault = Color(android.graphics.Color.parseColor("#eaedf0")),
                    nonSemanticGrayBackgroundSurface = Color(android.graphics.Color.parseColor("#fcfcfd")),
                    nonSemanticGrayBackgroundSubtle = Color(android.graphics.Color.parseColor("#f5f7f9")),
                    nonSemanticGrayBackgroundStrong = Color(android.graphics.Color.parseColor("#555f6d")),
                    nonSemanticGrayBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#eaedf0")),
                    nonSemanticGrayBackgroundMuted = Color(android.graphics.Color.parseColor("#dee3e7"))
                ),
                cyan = CyanValuesContainer(
                    nonSemanticCyanContentSecondary = Color(android.graphics.Color.parseColor("#0870ba")),
                    nonSemanticCyanContentPrimary = Color(android.graphics.Color.parseColor("#0c456e")),
                    nonSemanticCyanBorderSubtle = Color(android.graphics.Color.parseColor("#c2e2ff")),
                    nonSemanticCyanBorderStrong = Color(android.graphics.Color.parseColor("#0870ba")),
                    nonSemanticCyanBorderDefault = Color(android.graphics.Color.parseColor("#e0f1ff")),
                    nonSemanticCyanBackgroundSurface = Color(android.graphics.Color.parseColor("#fafdff")),
                    nonSemanticCyanBackgroundSubtle = Color(android.graphics.Color.parseColor("#f0f9ff")),
                    nonSemanticCyanBackgroundStrong = Color(android.graphics.Color.parseColor("#0870ba")),
                    nonSemanticCyanBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#e0f1ff")),
                    nonSemanticCyanBackgroundMuted = Color(android.graphics.Color.parseColor("#cce7ff"))
                ),
                blue = BlueValuesContainer(
                    nonSemanticBlueContentSecondary = Color(android.graphics.Color.parseColor("#3061d5")),
                    nonSemanticBlueContentPrimary = Color(android.graphics.Color.parseColor("#113997")),
                    nonSemanticBlueBorderSubtle = Color(android.graphics.Color.parseColor("#ccdcff")),
                    nonSemanticBlueBorderStrong = Color(android.graphics.Color.parseColor("#3061d5")),
                    nonSemanticBlueBorderDefault = Color(android.graphics.Color.parseColor("#e5eeff")),
                    nonSemanticBlueBackgroundSurface = Color(android.graphics.Color.parseColor("#fafbff")),
                    nonSemanticBlueBackgroundSubtle = Color(android.graphics.Color.parseColor("#f5f8ff")),
                    nonSemanticBlueBackgroundStrong = Color(android.graphics.Color.parseColor("#3061d5")),
                    nonSemanticBlueBackgroundOnSubtle = Color(android.graphics.Color.parseColor("#e5eeff")),
                    nonSemanticBlueBackgroundMuted = Color(android.graphics.Color.parseColor("#d6e3ff"))
                ),
                aquamarine = AquamarineValuesContainer(
                    nonSemanticAquamarineContentSecondary = Color(
                        android.graphics.Color.parseColor(
                            "#097b68"
                        )
                    ),
                    nonSemanticAquamarineContentPrimary = Color(android.graphics.Color.parseColor("#0d4a42")),
                    nonSemanticAquamarineBorderSubtle = Color(android.graphics.Color.parseColor("#bee9e4")),
                    nonSemanticAquamarineBorderStrong = Color(android.graphics.Color.parseColor("#097b68")),
                    nonSemanticAquamarineBorderDefault = Color(android.graphics.Color.parseColor("#daf6f3")),
                    nonSemanticAquamarineBackgroundSurface = Color(
                        android.graphics.Color.parseColor(
                            "#fbfefe"
                        )
                    ),
                    nonSemanticAquamarineBackgroundSubtle = Color(
                        android.graphics.Color.parseColor(
                            "#f0faf9"
                        )
                    ),
                    nonSemanticAquamarineBackgroundStrong = Color(
                        android.graphics.Color.parseColor(
                            "#097b68"
                        )
                    ),
                    nonSemanticAquamarineBackgroundOnSubtle = Color(
                        android.graphics.Color.parseColor(
                            "#daf6f3"
                        )
                    ),
                    nonSemanticAquamarineBackgroundMuted = Color(android.graphics.Color.parseColor("#c5f2ec"))
                )
            ),
            neutralGrayAlpha = NeutralGrayAlphaValuesContainer(
                neutralGrayANegative4 = Color(android.graphics.Color.parseColor("#121212ed")),
                neutralGrayANegative3 = Color(android.graphics.Color.parseColor("#0f0f0fe0")),
                neutralGrayANegative2 = Color(android.graphics.Color.parseColor("#212121db")),
                neutralGrayANegative1 = Color(android.graphics.Color.parseColor("#262626cc")),
                neutralGrayA8 = Color(android.graphics.Color.parseColor("#52525205")),
                neutralGrayA7 = Color(android.graphics.Color.parseColor("#2e2e2e0a")),
                neutralGrayA6 = Color(android.graphics.Color.parseColor("#2121210f")),
                neutralGrayA5 = Color(android.graphics.Color.parseColor("#1c1c1c17")),
                neutralGrayA4 = Color(android.graphics.Color.parseColor("#1f1f1f21")),
                neutralGrayA3 = Color(android.graphics.Color.parseColor("#2e2e2e33")),
                neutralGrayA2 = Color(android.graphics.Color.parseColor("#21212166")),
                neutralGrayA1 = Color(android.graphics.Color.parseColor("#2b2b2b8f")),
                neutralGrayA0 = Color(android.graphics.Color.parseColor("#262627bd"))
            ),
            neutralGray = NeutralGrayValuesContainer(
                neutralGray8 = Color(android.graphics.Color.parseColor("#fcfcfc")),
                neutralGray7 = Color(android.graphics.Color.parseColor("#f7f7f7")),
                neutralGray6 = Color(android.graphics.Color.parseColor("#f2f2f2")),
                neutralGray5 = Color(android.graphics.Color.parseColor("#ebebeb")),
                neutralGray4 = Color(android.graphics.Color.parseColor("#e3e3e3")),
                neutralGray3 = Color(android.graphics.Color.parseColor("#d6d6d6")),
                neutralGray2 = Color(android.graphics.Color.parseColor("#a6a6a6")),
                neutralGray1 = Color(android.graphics.Color.parseColor("#8a8a8a")),
                neutralGray0 = Color(android.graphics.Color.parseColor("#5e5e5e")),
                negative4 = Color(android.graphics.Color.parseColor("#212121")),
                negative3 = Color(android.graphics.Color.parseColor("#2e2e2e")),
                negative2 = Color(android.graphics.Color.parseColor("#404040")),
                negative1 = Color(android.graphics.Color.parseColor("#525252"))
            ),
            magenta = MagentaValuesContainer1(
                negative4 = Color(android.graphics.Color.parseColor("#410b2f")),
                negative3 = Color(android.graphics.Color.parseColor("#671e4d")),
                negative2 = Color(android.graphics.Color.parseColor("#892969")),
                negative1 = Color(android.graphics.Color.parseColor("#953274")),
                magenta8 = Color(android.graphics.Color.parseColor("#fffafd")),
                magenta7 = Color(android.graphics.Color.parseColor("#fef6fb")),
                magenta6 = Color(android.graphics.Color.parseColor("#fdedf8")),
                magenta5 = Color(android.graphics.Color.parseColor("#fde2f4")),
                magenta4 = Color(android.graphics.Color.parseColor("#fbd5ee")),
                magenta3 = Color(android.graphics.Color.parseColor("#f7cae8")),
                magenta2 = Color(android.graphics.Color.parseColor("#ec89cb")),
                magenta1 = Color(android.graphics.Color.parseColor("#de5eb3")),
                magenta0 = Color(android.graphics.Color.parseColor("#b12f86"))
            ),
            interaction = InteractionValuesContainer(
                neutral = NeutralValuesContainer1(
                    interactionNeutralSubtleSelected = Color(android.graphics.Color.parseColor("#eaedf0")),
                    interactionNeutralSubtleNormal = Color(android.graphics.Color.parseColor("#f0f3f5")),
                    interactionNeutralSubtleHover = Color(android.graphics.Color.parseColor("#eaedf0")),
                    interactionNeutralSubtleActive = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    interactionNeutralSelected = Color(android.graphics.Color.parseColor("#3a424a")),
                    interactionNeutralNormal = Color(android.graphics.Color.parseColor("#4a545e")),
                    interactionNeutralHover = Color(android.graphics.Color.parseColor("#3a424a")),
                    interactionNeutralActive = Color(android.graphics.Color.parseColor("#272e35"))
                ),
                inverse = InverseValuesContainer1(
                    interactionInverseSelected = Color(android.graphics.Color.parseColor("#ffffffd1")),
                    interactionInverseNormal = Color(android.graphics.Color.parseColor("#ffffff")),
                    interactionInverseHover = Color(android.graphics.Color.parseColor("#ffffffd1")),
                    interactionInverseActive = Color(android.graphics.Color.parseColor("#ffffffb8"))
                ),
                ghost = GhostValuesContainer1(
                    interactionGhostSelected = Color(android.graphics.Color.parseColor("#022e500f")),
                    interactionGhostNormal = Color(android.graphics.Color.parseColor("#ffffff00")),
                    interactionGhostInverseSelected = Color(android.graphics.Color.parseColor("#ffffff1a")),
                    interactionGhostInverseNormal = Color(android.graphics.Color.parseColor("#ffffff1f")),
                    interactionGhostInverseHover = Color(android.graphics.Color.parseColor("#ffffff1a")),
                    interactionGhostHover = Color(android.graphics.Color.parseColor("#022e500f")),
                    interactionGhostDangerSelected = Color(android.graphics.Color.parseColor("#ffebeb")),
                    interactionGhostDangerNormal = Color(android.graphics.Color.parseColor("#fee7e7")),
                    interactionGhostDangerHover = Color(android.graphics.Color.parseColor("#ffebeb")),
                    interactionGhostActive = Color(android.graphics.Color.parseColor("#10284717"))
                ),
                focus = FocusValuesContainer(
                    interactionFocusDefault = Color(android.graphics.Color.parseColor("#6691f4"))
                ),
                disabled = DisabledValuesContainer(
                    interactionDisabledSubtleNormal = Color(android.graphics.Color.parseColor("#eaedf0")),
                    interactionDisabledSubtleHover = Color(android.graphics.Color.parseColor("#dee3e7")),
                    interactionDisabledSubtleActive = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    interactionDisabledNormal = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    interactionDisabledHover = Color(android.graphics.Color.parseColor("#7e8c9a")),
                    interactionDisabledActive = Color(android.graphics.Color.parseColor("#555f6d"))
                ),
                default = DefaultValuesContainer(
                    interactionDefaultSubtleSelected = Color(android.graphics.Color.parseColor("#e5eeff")),
                    interactionDefaultSubtleNormal = Color(android.graphics.Color.parseColor("#ebf0ff")),
                    interactionDefaultSubtleHover = Color(android.graphics.Color.parseColor("#e5eeff")),
                    interactionDefaultSubtleActive = Color(android.graphics.Color.parseColor("#ccdcff")),
                    interactionDefaultSelected = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    interactionDefaultNormal = Color(android.graphics.Color.parseColor("#3061d5")),
                    interactionDefaultHover = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    interactionDefaultActive = Color(android.graphics.Color.parseColor("#113997"))
                ),
                danger = DangerValuesContainer1(
                    interactionDangerSubtleSelected = Color(android.graphics.Color.parseColor("#fee7e7")),
                    interactionDangerSubtleNormal = Color(android.graphics.Color.parseColor("#ffebeb")),
                    interactionDangerSubtleHover = Color(android.graphics.Color.parseColor("#fee7e7")),
                    interactionDangerSubtleActive = Color(android.graphics.Color.parseColor("#fccfcf")),
                    interactionDangerSelected = Color(android.graphics.Color.parseColor("#952d2d")),
                    interactionDangerNormal = Color(android.graphics.Color.parseColor("#c53434")),
                    interactionDangerHover = Color(android.graphics.Color.parseColor("#952d2d")),
                    interactionDangerActive = Color(android.graphics.Color.parseColor("#6f2020"))
                ),
                border = BorderValuesContainer1(
                    interactionBorderSelected = Color(android.graphics.Color.parseColor("#3061d5")),
                    interactionBorderNormal = Color(android.graphics.Color.parseColor("#8eb0fb")),
                    interactionBorderNeutralSelected = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    interactionBorderNeutralNormal = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    interactionBorderNeutralHover = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    interactionBorderNeutralActive = Color(android.graphics.Color.parseColor("#7e8c9a")),
                    interactionBorderHover = Color(android.graphics.Color.parseColor("#6691f4")),
                    interactionBorderDanger = Color(android.graphics.Color.parseColor("#f26363")),
                    interactionBorderActive = Color(android.graphics.Color.parseColor("#2759ce"))
                ),
                background = BackgroundValuesContainer1(
                    interactionBackgroundSidepanel = Color(android.graphics.Color.parseColor("#ffffff")),
                    interactionBackgroundModelessInverse = Color(android.graphics.Color.parseColor("#272e35")),
                    interactionBackgroundModeless = Color(android.graphics.Color.parseColor("#ffffff")),
                    interactionBackgroundModal = Color(android.graphics.Color.parseColor("#ffffff")),
                    interactionBackgroundFormField = Color(android.graphics.Color.parseColor("#ffffff")),
                    interactionBackgroundDimmer = Color(android.graphics.Color.parseColor("#182639bd"))
                )
            ),
            green = GreenValuesContainer1(
                negative4 = Color(android.graphics.Color.parseColor("#0a2e0b")),
                negative3 = Color(android.graphics.Color.parseColor("#135315")),
                negative2 = Color(android.graphics.Color.parseColor("#246626")),
                negative1 = Color(android.graphics.Color.parseColor("#2f6f2f")),
                green8 = Color(android.graphics.Color.parseColor("#fbfefb")),
                green7 = Color(android.graphics.Color.parseColor("#f4fbf4")),
                green6 = Color(android.graphics.Color.parseColor("#e6f9e6")),
                green5 = Color(android.graphics.Color.parseColor("#dff6df")),
                green4 = Color(android.graphics.Color.parseColor("#cff2cf")),
                green3 = Color(android.graphics.Color.parseColor("#c6ecc6")),
                green2 = Color(android.graphics.Color.parseColor("#87c987")),
                green1 = Color(android.graphics.Color.parseColor("#55a555")),
                green0 = Color(android.graphics.Color.parseColor("#347434"))
            ),
            cyan = CyanValuesContainer1(
                negative4 = Color(android.graphics.Color.parseColor("#002742")),
                negative3 = Color(android.graphics.Color.parseColor("#0c456e")),
                negative2 = Color(android.graphics.Color.parseColor("#165c8d")),
                negative1 = Color(android.graphics.Color.parseColor("#1b679d")),
                cyan8 = Color(android.graphics.Color.parseColor("#fafdff")),
                cyan7 = Color(android.graphics.Color.parseColor("#f0f9ff")),
                cyan6 = Color(android.graphics.Color.parseColor("#ebf5ff")),
                cyan5 = Color(android.graphics.Color.parseColor("#e0f1ff")),
                cyan4 = Color(android.graphics.Color.parseColor("#cce7ff")),
                cyan3 = Color(android.graphics.Color.parseColor("#c2e2ff")),
                cyan2 = Color(android.graphics.Color.parseColor("#79bcf6")),
                cyan1 = Color(android.graphics.Color.parseColor("#5699dc")),
                cyan0 = Color(android.graphics.Color.parseColor("#0870ba"))
            ),
            coolGrayAlpha = CoolGrayAlphaValuesContainer(
                coolGrayANegative4 = Color(android.graphics.Color.parseColor("#09131aed")),
                coolGrayANegative3 = Color(android.graphics.Color.parseColor("#0a121ae0")),
                coolGrayANegative2 = Color(android.graphics.Color.parseColor("#1a232ddb")),
                coolGrayANegative1 = Color(android.graphics.Color.parseColor("#1d2835cc")),
                coolGrayA8 = Color(android.graphics.Color.parseColor("#1f529e05")),
                coolGrayA7 = Color(android.graphics.Color.parseColor("#00295c0a")),
                coolGrayA6 = Color(android.graphics.Color.parseColor("#022e500f")),
                coolGrayA5 = Color(android.graphics.Color.parseColor("#10284717")),
                coolGrayA4 = Color(android.graphics.Color.parseColor("#04294321")),
                coolGrayA3 = Color(android.graphics.Color.parseColor("#10315633")),
                coolGrayA2 = Color(android.graphics.Color.parseColor("#0d253f66")),
                coolGrayA1 = Color(android.graphics.Color.parseColor("#1830498f")),
                coolGrayA0 = Color(android.graphics.Color.parseColor("#182639bd"))
            ),
            coolGray = CoolGrayValuesContainer(
                negative4 = Color(android.graphics.Color.parseColor("#1b242c")),
                negative3 = Color(android.graphics.Color.parseColor("#272e35")),
                negative2 = Color(android.graphics.Color.parseColor("#3a424a")),
                negative1 = Color(android.graphics.Color.parseColor("#4a545e")),
                coolGray8 = Color(android.graphics.Color.parseColor("#fcfcfd")),
                coolGray7 = Color(android.graphics.Color.parseColor("#f5f7f9")),
                coolGray6 = Color(android.graphics.Color.parseColor("#f0f3f5")),
                coolGray5 = Color(android.graphics.Color.parseColor("#eaedf0")),
                coolGray4 = Color(android.graphics.Color.parseColor("#dee3e7")),
                coolGray3 = Color(android.graphics.Color.parseColor("#cfd6dd")),
                coolGray2 = Color(android.graphics.Color.parseColor("#9ea8b3")),
                coolGray1 = Color(android.graphics.Color.parseColor("#7e8c9a")),
                coolGray0 = Color(android.graphics.Color.parseColor("#555f6d"))
            ),
            content = ContentValuesContainer(
                warningSecondary = Color(android.graphics.Color.parseColor("#f59638")),
                warningPrimary = Color(android.graphics.Color.parseColor("#7a4510")),
                tertiaryInverse = Color(android.graphics.Color.parseColor("#ffffff66")),
                tertiary = Color(android.graphics.Color.parseColor("#7e8c9a")),
                successSecondary = Color(android.graphics.Color.parseColor("#347434")),
                successPrimary = Color(android.graphics.Color.parseColor("#135315")),
                secondaryInverse = Color(android.graphics.Color.parseColor("#ffffffa3")),
                secondary = Color(android.graphics.Color.parseColor("#555f6d")),
                primaryInverse = Color(android.graphics.Color.parseColor("#ffffff")),
                primary = Color(android.graphics.Color.parseColor("#272e35")),
                infoSecondary = Color(android.graphics.Color.parseColor("#3061d5")),
                infoPrimary = Color(android.graphics.Color.parseColor("#113997")),
                disabledInverse = Color(android.graphics.Color.parseColor("#ffffff3d")),
                disabled = Color(android.graphics.Color.parseColor("#9ea8b3")),
                dangerSecondary = Color(android.graphics.Color.parseColor("#c53434")),
                dangerPrimary = Color(android.graphics.Color.parseColor("#6f2020")),
                brandSecondary = Color(android.graphics.Color.parseColor("#3061d5")),
                brandPrimary = Color(android.graphics.Color.parseColor("#113997"))
            ),
            border = BorderValuesContainer(
                warningSubtle = Color(android.graphics.Color.parseColor("#ffd4a8")),
                warningStrong = Color(android.graphics.Color.parseColor("#f59638")),
                successSubtle = Color(android.graphics.Color.parseColor("#c6ecc6")),
                successStrong = Color(android.graphics.Color.parseColor("#347434")),
                neutralSubtle = Color(android.graphics.Color.parseColor("#cfd6dd")),
                neutralStrong = Color(android.graphics.Color.parseColor("#555f6d")),
                inverse = Color(android.graphics.Color.parseColor("#ffffff")),
                infoSubtle = Color(android.graphics.Color.parseColor("#ccdcff")),
                infoStrong = Color(android.graphics.Color.parseColor("#3061d5")),
                defaultA = Color(android.graphics.Color.parseColor("#10284717")),
                default = Color(android.graphics.Color.parseColor("#eaedf0")),
                dangerSubtle = Color(android.graphics.Color.parseColor("#fccfcf")),
                dangerStrong = Color(android.graphics.Color.parseColor("#c53434"))
            ),
            blue = BlueValuesContainer1(
                negative4 = Color(android.graphics.Color.parseColor("#041f5d")),
                negative3 = Color(android.graphics.Color.parseColor("#113997")),
                negative2 = Color(android.graphics.Color.parseColor("#1e4fc2")),
                negative1 = Color(android.graphics.Color.parseColor("#2759ce")),
                blue8 = Color(android.graphics.Color.parseColor("#fafbff")),
                blue7 = Color(android.graphics.Color.parseColor("#f5f8ff")),
                blue6 = Color(android.graphics.Color.parseColor("#ebf0ff")),
                blue5 = Color(android.graphics.Color.parseColor("#e5eeff")),
                blue4 = Color(android.graphics.Color.parseColor("#d6e3ff")),
                blue3 = Color(android.graphics.Color.parseColor("#ccdcff")),
                blue2 = Color(android.graphics.Color.parseColor("#8eb0fb")),
                blue1 = Color(android.graphics.Color.parseColor("#6691f4")),
                blue0 = Color(android.graphics.Color.parseColor("#3061d5"))
            ),
            background = BackgroundValuesContainer(
                warningSurface = Color(android.graphics.Color.parseColor("#fffcfa")),
                warningSubtle = Color(android.graphics.Color.parseColor("#fff5eb")),
                warningStrong = Color(android.graphics.Color.parseColor("#f59638")),
                warningOnSubtle = Color(android.graphics.Color.parseColor("#ffe8d1")),
                warningMuted = Color(android.graphics.Color.parseColor("#fcdec0")),
                successSurface = Color(android.graphics.Color.parseColor("#fbfefb")),
                successSubtle = Color(android.graphics.Color.parseColor("#f4fbf4")),
                successStrong = Color(android.graphics.Color.parseColor("#347434")),
                successOnSubtle = Color(android.graphics.Color.parseColor("#dff6df")),
                successMuted = Color(android.graphics.Color.parseColor("#cff2cf")),
                neutralSurface = Color(android.graphics.Color.parseColor("#fcfcfd")),
                neutralSubtle = Color(android.graphics.Color.parseColor("#f5f7f9")),
                neutralStrong = Color(android.graphics.Color.parseColor("#555f6d")),
                neutralOnSubtle = Color(android.graphics.Color.parseColor("#eaedf0")),
                neutralMuted = Color(android.graphics.Color.parseColor("#dee3e7")),
                inverse = Color(android.graphics.Color.parseColor("#272e35")),
                infoSurface = Color(android.graphics.Color.parseColor("#fafbff")),
                infoSubtle = Color(android.graphics.Color.parseColor("#f5f8ff")),
                infoStrong = Color(android.graphics.Color.parseColor("#3061d5")),
                infoOnSubtle = Color(android.graphics.Color.parseColor("#e5eeff")),
                infoMuted = Color(android.graphics.Color.parseColor("#d6e3ff")),
                default = Color(android.graphics.Color.parseColor("#ffffff")),
                dangerSurface = Color(android.graphics.Color.parseColor("#fffafa")),
                dangerSubtle = Color(android.graphics.Color.parseColor("#fef5f5")),
                dangerStrong = Color(android.graphics.Color.parseColor("#c53434")),
                dangerOnSubtle = Color(android.graphics.Color.parseColor("#fee7e7")),
                dangerMuted = Color(android.graphics.Color.parseColor("#fcd9d9")),
                brandSurface = Color(android.graphics.Color.parseColor("#fafbff")),
                brandSubtle = Color(android.graphics.Color.parseColor("#f5f8ff")),
                brandStrong = Color(android.graphics.Color.parseColor("#3061d5")),
                brandOnSubtle = Color(android.graphics.Color.parseColor("#e5eeff")),
                brandMuted = Color(android.graphics.Color.parseColor("#d6e3ff"))
            ),
            aquamarine = AquamarineValuesContainer1(
                negative4 = Color(android.graphics.Color.parseColor("#012d26")),
                negative3 = Color(android.graphics.Color.parseColor("#0d4a42")),
                negative2 = Color(android.graphics.Color.parseColor("#15665b")),
                negative1 = Color(android.graphics.Color.parseColor("#1a7061")),
                aquamarine8 = Color(android.graphics.Color.parseColor("#fbfefe")),
                aquamarine7 = Color(android.graphics.Color.parseColor("#f0faf9")),
                aquamarine6 = Color(android.graphics.Color.parseColor("#e2f8f5")),
                aquamarine5 = Color(android.graphics.Color.parseColor("#daf6f3")),
                aquamarine4 = Color(android.graphics.Color.parseColor("#c5f2ec")),
                aquamarine3 = Color(android.graphics.Color.parseColor("#bee9e4")),
                aquamarine2 = Color(android.graphics.Color.parseColor("#6ec9bf")),
                aquamarine1 = Color(android.graphics.Color.parseColor("#3da496")),
                aquamarine0 = Color(android.graphics.Color.parseColor("#097b68"))
            ),
            action = ActionValuesContainer(
                success = SuccessValuesContainer(
                    actionSuccessSubtleSelected = Color(android.graphics.Color.parseColor("#dff6df")),
                    actionSuccessSubtleNormal = Color(android.graphics.Color.parseColor("#e6f9e6")),
                    actionSuccessSubtleHover = Color(android.graphics.Color.parseColor("#dff6df")),
                    actionSuccessSubtleActive = Color(android.graphics.Color.parseColor("#c6ecc6")),
                    actionSuccessSelected = Color(android.graphics.Color.parseColor("#246626")),
                    actionSuccessNormal = Color(android.graphics.Color.parseColor("#347434")),
                    actionSuccessHover = Color(android.graphics.Color.parseColor("#246626")),
                    actionSuccessActive = Color(android.graphics.Color.parseColor("#135315"))
                ),
                reverseInverse = ReverseInverseValuesContainer(
                    actionReverseInverseSelected = Color(android.graphics.Color.parseColor("#1d2835cc")),
                    actionReverseInverseNormal = Color(android.graphics.Color.parseColor("#0a121ae0")),
                    actionReverseInverseHover = Color(android.graphics.Color.parseColor("#1d2835cc")),
                    actionReverseInverseActive = Color(android.graphics.Color.parseColor("#182639bd"))
                ),
                primary = PrimaryValuesContainer(
                    actionPrimarySubtleSelected = Color(android.graphics.Color.parseColor("#e5eeff")),
                    actionPrimarySubtleNormal = Color(android.graphics.Color.parseColor("#ebf0ff")),
                    actionPrimarySubtleHover = Color(android.graphics.Color.parseColor("#e5eeff")),
                    actionPrimarySubtleActive = Color(android.graphics.Color.parseColor("#ccdcff")),
                    actionPrimarySelected = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    actionPrimaryNormal = Color(android.graphics.Color.parseColor("#3061d5")),
                    actionPrimaryHover = Color(android.graphics.Color.parseColor("#1e4fc2")),
                    actionPrimaryActive = Color(android.graphics.Color.parseColor("#113997"))
                ),
                outline = OutlineValuesContainer(
                    actionOutlineSelected = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    actionOutlineNormal = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    actionOutlineHover = Color(android.graphics.Color.parseColor("#9ea8b3")),
                    actionOutlineActive = Color(android.graphics.Color.parseColor("#7e8c9a"))
                ),
                neutral = NeutralValuesContainer(
                    actionNeutralSubtleSelected = Color(android.graphics.Color.parseColor("#eaedf0")),
                    actionNeutralSubtleNormal = Color(android.graphics.Color.parseColor("#f0f3f5")),
                    actionNeutralSubtleHover = Color(android.graphics.Color.parseColor("#eaedf0")),
                    actionNeutralSubtleActive = Color(android.graphics.Color.parseColor("#cfd6dd")),
                    actionNeutralSelected = Color(android.graphics.Color.parseColor("#3a424a")),
                    actionNeutralNormal = Color(android.graphics.Color.parseColor("#4a545e")),
                    actionNeutralHover = Color(android.graphics.Color.parseColor("#3a424a")),
                    actionNeutralActive = Color(android.graphics.Color.parseColor("#272e35"))
                ),
                inverse = InverseValuesContainer(
                    actionInverseSelected = Color(android.graphics.Color.parseColor("#ffffffd1")),
                    actionInverseNormal = Color(android.graphics.Color.parseColor("#ffffff")),
                    actionInverseHover = Color(android.graphics.Color.parseColor("#ffffffd1")),
                    actionInverseActive = Color(android.graphics.Color.parseColor("#ffffffb8"))
                ),
                ghost = GhostValuesContainer(
                    actionGhostSelected = Color(android.graphics.Color.parseColor("#022e500f")),
                    actionGhostNormal = Color(android.graphics.Color.parseColor("#ffffff00")),
                    actionGhostInverseSelected = Color(android.graphics.Color.parseColor("#ffffff1a")),
                    actionGhostInverseHover = Color(android.graphics.Color.parseColor("#ffffff1a")),
                    actionGhostInverseActive = Color(android.graphics.Color.parseColor("#ffffff1f")),
                    actionGhostHover = Color(android.graphics.Color.parseColor("#022e500f")),
                    actionGhostDangerSelected = Color(android.graphics.Color.parseColor("#ffebeb")),
                    actionGhostDangerHover = Color(android.graphics.Color.parseColor("#ffebeb")),
                    actionGhostDangerActive = Color(android.graphics.Color.parseColor("#fee7e7")),
                    actionGhostActive = Color(android.graphics.Color.parseColor("#10284717"))
                ),
                danger = DangerValuesContainer(
                    actionDangerSubtleSelected = Color(android.graphics.Color.parseColor("#fee7e7")),
                    actionDangerSubtleNormal = Color(android.graphics.Color.parseColor("#ffebeb")),
                    actionDangerSubtleHover = Color(android.graphics.Color.parseColor("#fee7e7")),
                    actionDangerSubtleActive = Color(android.graphics.Color.parseColor("#fccfcf")),
                    actionDangerSelected = Color(android.graphics.Color.parseColor("#952d2d")),
                    actionDangerNormal = Color(android.graphics.Color.parseColor("#c53434")),
                    actionDangerHover = Color(android.graphics.Color.parseColor("#952d2d")),
                    actionDangerActive = Color(android.graphics.Color.parseColor("#6f2020"))
                )
            )
        ),
        borderWidth = BorderWidthValuesContainer(
            xLarge = 8.0,
            small = 1.0,
            none = 0.0,
            medium = 2.0,
            large = 4.0,
            focus = 2.0,
            borderWidth800 = 8.0,
            borderWidth400 = 4.0,
            borderWidth200 = 2.0,
            borderWidth100 = 1.0,
            borderWidth0 = 0.0
        ),
        borderRadius = BorderRadiusValuesContainer(
            xLarge = 12.0,
            small = 2.0,
            none = 0.0,
            medium = 4.0,
            large = 8.0,
            full = 999.0,
            borderRadius999 = 999.0,
            borderRadius50 = 4.0,
            borderRadius4xLarge = 24.0,
            borderRadius3xLarge = 20.0,
            borderRadius300 = 24.0,
            borderRadius2xLarge = 16.0,
            borderRadius250 = 20.0,
            borderRadius25 = 2.0,
            borderRadius200 = 16.0,
            borderRadius150 = 12.0,
            borderRadius100 = 8.0,
            borderRadius0 = 0.0
        ),
        size = SizeValuesContainer(
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
        space = SpaceValuesContainer(
            padding = PaddingValuesContainer(
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
            gap = GapValuesContainer(
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
        opacity = OpacityValuesContainer(
            opacity50 = 0.5,
            opacity100 = 1.0,
            opacity0 = 0.0,
            disabled = 0.5
        ),
        typography = TypographyValuesContainer(
            utility = UtilityValuesContainer(
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
            heading = HeadingValuesContainer(
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
            display = DisplayValuesContainer(
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
            code = CodeValuesContainer(
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
            body = BodyValuesContainer(
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
        ),
        dimension = DimensionValuesContainer(
            dimension900 = 72.0,
            dimension800 = 64.0,
            dimension700 = 56.0,
            dimension600 = 48.0,
            dimension550 = 44.0,
            dimension500 = 40.0,
            dimension50 = 4.0,
            dimension400 = 32.0,
            dimension300 = 24.0,
            dimension250 = 20.0,
            dimension25 = 2.0,
            dimension200 = 16.0,
            dimension1600 = 128.0,
            dimension1500 = 120.0,
            dimension150 = 12.0,
            dimension1200 = 96.0,
            dimension1000 = 80.0,
            dimension100 = 8.0,
            dimension0 = 0.0
        ),
        elevation = ElevationValuesContainer(
            top = TopValuesContainer(
                elevationTop400 = listOf(
                    BoxShadow(
                        y = -2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = -16.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -6.0,
                        color = "#1b242c29",
                        blur = 24.0
                    )
                ),
                elevationTop300 = listOf(
                    BoxShadow(
                        y = -2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = -8.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -2.0,
                        color = "#1b242c1f",
                        blur = 16.0
                    )
                ),
                elevationTop200 = listOf(
                    BoxShadow(
                        y = -2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = -2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c14",
                        blur = 8.0
                    )
                ),
                elevationTop100 = BoxShadow(
                    y = -1.0,
                    x = 0.0,
                    type = "dropShadow",
                    spread = 0.0,
                    color = "#1b242c1f",
                    blur = 2.0
                )
            ),
            bottom = BottomValuesContainer(
                elevationBottom400 = listOf(
                    BoxShadow(
                        y = 2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = 16.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -6.0,
                        color = "#1b242c29",
                        blur = 24.0
                    )
                ),
                elevationBottom300 = listOf(
                    BoxShadow(
                        y = 2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = 8.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -2.0,
                        color = "#1b242c1f",
                        blur = 16.0
                    )
                ),
                elevationBottom200 = listOf(
                    BoxShadow(
                        y = 2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c0a",
                        blur = 2.0
                    ), BoxShadow(
                        y = 2.0,
                        x = 0.0,
                        type = "dropShadow",
                        spread = -1.0,
                        color = "#1b242c14",
                        blur = 8.0
                    )
                ),
                elevationBottom100 = BoxShadow(
                    y = 1.0,
                    x = 0.0,
                    type = "dropShadow",
                    spread = 0.0,
                    color = "#1b242c1f",
                    blur = 2.0
                )
            )
        ),
        fontFamily = FontFamilyValuesContainer(
            serif = "Noto Serif",
            sans = "Noto Sans",
            mono = "Noto Sans Mono"
        ),
        fontSize = FontSizeValuesContainer(
            fontSize950 = 76.0,
            fontSize850 = 68.0,
            fontSize750 = 60.0,
            fontSize675 = 54.0,
            fontSize600 = 48.0,
            fontSize525 = 42.0,
            fontSize450 = 36.0,
            fontSize400 = 32.0,
            fontSize350 = 28.0,
            fontSize300 = 24.0,
            fontSize250 = 20.0,
            fontSize225 = 18.0,
            fontSize200 = 16.0,
            fontSize175 = 14.0,
            fontSize150 = 12.0,
            fontSize125 = 10.0,
            fontSize1150 = 92.0,
            fontSize1050 = 84.0,
            fontSize100 = 8.0
        ),
        fontWeight = FontWeightValuesContainer(
            fontWeight700 = 700.0,
            fontWeight600 = 600.0,
            fontWeight500 = 500.0,
            fontWeight400 = 400.0,
            fontWeight300 = 300.0
        ),
        letterSpacing = LetterSpacingValuesContainer(
            letterSpacing700 = -0.022,
            letterSpacing600 = -0.021,
            letterSpacing500 = -0.019,
            letterSpacing400 = -0.017,
            letterSpacing300 = -0.014,
            letterSpacing200 = -0.011,
            letterSpacing100 = -0.006,
            letterSpacing0 = 0.0
        ),
        lineHeight = LineHeightValuesContainer(
            value900 = 72.0,
            value825 = 66.0,
            value725 = 58.0,
            value700 = 56.0,
            value600 = 48.0,
            value525 = 42.0,
            value475 = 38.0,
            value400 = 32.0,
            value325 = 26.0,
            value300 = 24.0,
            value275 = 22.0,
            value250 = 20.0,
            value200 = 16.0,
            value150 = 12.0,
            value1400 = 112.0,
            value1275 = 102.0,
            value1150 = 92.0,
            value1025 = 82.0
        )
    )
  
}

object FiberTheme {
    val designSystem
        @Composable
        get() = localDesign.current
}
