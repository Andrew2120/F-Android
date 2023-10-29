import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import android.graphics.Color.parseColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import com.b_labs.fiber_tokens.DesignSystem
import com.b_labs.fiber_tokens.ContentValuesContainer
import com.b_labs.fiber_tokens.BorderValuesContainer
import com.b_labs.fiber_tokens.BackgroundValuesContainer
import com.b_labs.fiber_tokens.PrimaryValuesContainer
import com.b_labs.fiber_tokens.NeutralValuesContainer
import com.b_labs.fiber_tokens.SuccessValuesContainer
import com.b_labs.fiber_tokens.DangerValuesContainer
import com.b_labs.fiber_tokens.GhostValuesContainer
import com.b_labs.fiber_tokens.OutlineValuesContainer
import com.b_labs.fiber_tokens.InverseValuesContainer
import com.b_labs.fiber_tokens.ReverseInverseValuesContainer
import com.b_labs.fiber_tokens.ActionValuesContainer
import com.b_labs.fiber_tokens.DefaultValuesContainer
import com.b_labs.fiber_tokens.NeutralValuesContainer1
import com.b_labs.fiber_tokens.DangerValuesContainer1
import com.b_labs.fiber_tokens.GhostValuesContainer1
import com.b_labs.fiber_tokens.DisabledValuesContainer
import com.b_labs.fiber_tokens.BorderValuesContainer1
import com.b_labs.fiber_tokens.BackgroundValuesContainer1
import com.b_labs.fiber_tokens.InverseValuesContainer1
import com.b_labs.fiber_tokens.FocusValuesContainer
import com.b_labs.fiber_tokens.InteractionValuesContainer
import com.b_labs.fiber_tokens.GrayValuesContainer
import com.b_labs.fiber_tokens.WhiteValuesContainer
import com.b_labs.fiber_tokens.RedValuesContainer
import com.b_labs.fiber_tokens.MagentaValuesContainer
import com.b_labs.fiber_tokens.PurpleValuesContainer
import com.b_labs.fiber_tokens.VioletValuesContainer
import com.b_labs.fiber_tokens.BlueValuesContainer
import com.b_labs.fiber_tokens.CyanValuesContainer
import com.b_labs.fiber_tokens.TealValuesContainer
import com.b_labs.fiber_tokens.AquamarineValuesContainer
import com.b_labs.fiber_tokens.GreenValuesContainer
import com.b_labs.fiber_tokens.OrangeValuesContainer
import com.b_labs.fiber_tokens.NonSemanticValuesContainer
import com.b_labs.fiber_tokens.BrandValuesContainer
import com.b_labs.fiber_tokens.NeutralValuesContainer2
import com.b_labs.fiber_tokens.NeutralAlphaValuesContainer
import com.b_labs.fiber_tokens.InfoValuesContainer
import com.b_labs.fiber_tokens.SuccessValuesContainer1
import com.b_labs.fiber_tokens.WarningValuesContainer
import com.b_labs.fiber_tokens.DangerValuesContainer2
import com.b_labs.fiber_tokens.SemanticValuesContainer
import com.b_labs.fiber_tokens.CoolGrayValuesContainer
import com.b_labs.fiber_tokens.CoolGrayAlphaValuesContainer
import com.b_labs.fiber_tokens.NeutralGrayValuesContainer
import com.b_labs.fiber_tokens.NeutralGrayAlphaValuesContainer
import com.b_labs.fiber_tokens.WarmGrayValuesContainer
import com.b_labs.fiber_tokens.WarmGrayAlphaValuesContainer
import com.b_labs.fiber_tokens.WhiteAlphaValuesContainer
import com.b_labs.fiber_tokens.RedValuesContainer1
import com.b_labs.fiber_tokens.MagentaValuesContainer1
import com.b_labs.fiber_tokens.PurpleValuesContainer1
import com.b_labs.fiber_tokens.VioletValuesContainer1
import com.b_labs.fiber_tokens.BlueValuesContainer1
import com.b_labs.fiber_tokens.CyanValuesContainer1
import com.b_labs.fiber_tokens.TealValuesContainer1
import com.b_labs.fiber_tokens.AquamarineValuesContainer1
import com.b_labs.fiber_tokens.GreenValuesContainer1
import com.b_labs.fiber_tokens.OrangeValuesContainer1
import com.b_labs.fiber_tokens.TransparentValuesContainer
import com.b_labs.fiber_tokens.ColorValuesContainer
import com.b_labs.fiber_tokens.BorderWidthValuesContainer
import com.b_labs.fiber_tokens.BorderRadiusValuesContainer
import com.b_labs.fiber_tokens.SizeValuesContainer
import com.b_labs.fiber_tokens.PaddingValuesContainer
import com.b_labs.fiber_tokens.GapValuesContainer
import com.b_labs.fiber_tokens.SpaceValuesContainer
import com.b_labs.fiber_tokens.OpacityValuesContainer
import com.b_labs.fiber_tokens.Typography
import com.b_labs.fiber_tokens.CodeValuesContainer
import com.b_labs.fiber_tokens.UtilityValuesContainer
import com.b_labs.fiber_tokens.BodyValuesContainer
import com.b_labs.fiber_tokens.HeadingValuesContainer
import com.b_labs.fiber_tokens.DisplayValuesContainer
import com.b_labs.fiber_tokens.TypographyValuesContainer
import com.b_labs.fiber_tokens.DimensionValuesContainer
import com.b_labs.fiber_tokens.BoxShadow
import com.b_labs.fiber_tokens.BottomValuesContainer
import com.b_labs.fiber_tokens.TopValuesContainer
import com.b_labs.fiber_tokens.ElevationValuesContainer
import com.b_labs.fiber_tokens.FontFamilyValuesContainer
import com.b_labs.fiber_tokens.FontSizeValuesContainer
import com.b_labs.fiber_tokens.FontWeightValuesContainer
import com.b_labs.fiber_tokens.LetterSpacingValuesContainer
import com.b_labs.fiber_tokens.LineHeightValuesContainer




val designSystem = DesignSystem(
    color = ColorValuesContainer(
        whiteAlpha = WhiteAlphaValuesContainer(
            whiteANegative9 = Color(parseColor("#ffffff14")),
            whiteANegative8 = Color(parseColor("#ffffff1a")),
            whiteANegative7 = Color(parseColor("#ffffff1f")),
            whiteANegative6 = Color(parseColor("#ffffff3d")),
            whiteANegative5 = Color(parseColor("#ffffff66")),
            whiteANegative4 = Color(parseColor("#ffffffa3")),
            whiteANegative3 = Color(parseColor("#ffffffad")),
            whiteANegative2 = Color(parseColor("#ffffffb8")),
            whiteANegative12 = Color(parseColor("#ffffff05")),
            whiteANegative11 = Color(parseColor("#ffffff08")),
            whiteANegative10 = Color(parseColor("#ffffff0d")),
            whiteANegative1 = Color(parseColor("#ffffffd1")),
            whiteA0 = Color(parseColor("#ffffff"))
        ),
        warmGrayAlpha = WarmGrayAlphaValuesContainer(
            warmGrayANegative4 = Color(parseColor("#131311ed")),
            warmGrayANegative3 = Color(parseColor("#12120de0")),
            warmGrayANegative2 = Color(parseColor("#22221bdb")),
            warmGrayANegative1 = Color(parseColor("#272720cc")),
            warmGrayA8 = Color(parseColor("#52525205")),
            warmGrayA7 = Color(parseColor("#2f2f2d0a")),
            warmGrayA6 = Color(parseColor("#2f2f0e0f")),
            warmGrayA5 = Color(parseColor("#22220217")),
            warmGrayA4 = Color(parseColor("#33331421")),
            warmGrayA3 = Color(parseColor("#3e3e1d33")),
            warmGrayA2 = Color(parseColor("#28281166")),
            warmGrayA1 = Color(parseColor("#2f2f238f")),
            warmGrayA0 = Color(parseColor("#26261cbd"))
        ),
        warmGray = WarmGrayValuesContainer(
            warmGray8 = Color(parseColor("#fdfdfc")),
            warmGray7 = Color(parseColor("#f8f8f7")),
            warmGray6 = Color(parseColor("#f3f3f1")),
            warmGray5 = Color(parseColor("#eaeae6")),
            warmGray4 = Color(parseColor("#e5e5e1")),
            warmGray3 = Color(parseColor("#d9d9d3")),
            warmGray2 = Color(parseColor("#a8a89f")),
            warmGray1 = Color(parseColor("#8b8b84")),
            warmGray0 = Color(parseColor("#5f5f58")),
            negative4 = Color(parseColor("#222220")),
            negative3 = Color(parseColor("#30302c")),
            negative2 = Color(parseColor("#40403a")),
            negative1 = Color(parseColor("#52524c"))
        ),
        violet = VioletValuesContainer1(
            violet8 = Color(parseColor("#fbfaff")),
            violet7 = Color(parseColor("#f7f5ff")),
            violet6 = Color(parseColor("#f3f0ff")),
            violet5 = Color(parseColor("#eeebff")),
            violet4 = Color(parseColor("#e3e0ff")),
            violet3 = Color(parseColor("#dcd6ff")),
            violet2 = Color(parseColor("#aba2fb")),
            violet1 = Color(parseColor("#927ef1")),
            violet0 = Color(parseColor("#634eca")),
            negative4 = Color(parseColor("#201263")),
            negative3 = Color(parseColor("#39288a")),
            negative2 = Color(parseColor("#4e38bc")),
            negative1 = Color(parseColor("#573fcf"))
        ),
        transparent = TransparentValuesContainer(
            transparent = Color(parseColor("#ffffff00"))
        ),
        teal = TealValuesContainer1(
            teal8 = Color(parseColor("#fafeff")),
            teal7 = Color(parseColor("#f0fbff")),
            teal6 = Color(parseColor("#e8f7fc")),
            teal5 = Color(parseColor("#e0f3fa")),
            teal4 = Color(parseColor("#c5ecf7")),
            teal3 = Color(parseColor("#b8e8f5")),
            teal2 = Color(parseColor("#7ac0dc")),
            teal1 = Color(parseColor("#4f9eba")),
            teal0 = Color(parseColor("#077597")),
            negative4 = Color(parseColor("#012a37")),
            negative3 = Color(parseColor("#0a495c")),
            negative2 = Color(parseColor("#196076")),
            negative1 = Color(parseColor("#196c85"))
        ),
        semantic = SemanticValuesContainer(
            warning = WarningValuesContainer(
                semanticWarningNegative4 = Color(parseColor("#492909")),
                semanticWarningNegative3 = Color(parseColor("#7a4510")),
                semanticWarningNegative2 = Color(parseColor("#a05c1c")),
                semanticWarningNegative1 = Color(parseColor("#b4610e")),
                semanticWarning8 = Color(parseColor("#fffcfa")),
                semanticWarning7 = Color(parseColor("#fff5eb")),
                semanticWarning6 = Color(parseColor("#fff0e0")),
                semanticWarning5 = Color(parseColor("#ffe8d1")),
                semanticWarning4 = Color(parseColor("#fcdec0")),
                semanticWarning3 = Color(parseColor("#ffd4a8")),
                semanticWarning2 = Color(parseColor("#feb871")),
                semanticWarning1 = Color(parseColor("#f6a351")),
                semanticWarning0 = Color(parseColor("#f59638"))
            ),
            success = SuccessValuesContainer1(
                semanticSuccessNegative4 = Color(parseColor("#0a2e0b")),
                semanticSuccessNegative3 = Color(parseColor("#135315")),
                semanticSuccessNegative2 = Color(parseColor("#246626")),
                semanticSuccessNegative1 = Color(parseColor("#2f6f2f")),
                semanticSuccess8 = Color(parseColor("#fbfefb")),
                semanticSuccess7 = Color(parseColor("#f4fbf4")),
                semanticSuccess6 = Color(parseColor("#e6f9e6")),
                semanticSuccess5 = Color(parseColor("#dff6df")),
                semanticSuccess4 = Color(parseColor("#cff2cf")),
                semanticSuccess3 = Color(parseColor("#c6ecc6")),
                semanticSuccess2 = Color(parseColor("#87c987")),
                semanticSuccess1 = Color(parseColor("#55a555")),
                semanticSuccess0 = Color(parseColor("#347434"))
            ),
            neutralAlpha = NeutralAlphaValuesContainer(
                semanticNeutralANegative4 = Color(parseColor("#09131aed")),
                semanticNeutralANegative3 = Color(parseColor("#0a121ae0")),
                semanticNeutralANegative2 = Color(parseColor("#1a232ddb")),
                semanticNeutralANegative1 = Color(parseColor("#1d2835cc")),
                semanticNeutralA8 = Color(parseColor("#1f529e05")),
                semanticNeutralA7 = Color(parseColor("#00295c0a")),
                semanticNeutralA6 = Color(parseColor("#022e500f")),
                semanticNeutralA5 = Color(parseColor("#10284717")),
                semanticNeutralA4 = Color(parseColor("#04294321")),
                semanticNeutralA3 = Color(parseColor("#10315633")),
                semanticNeutralA2 = Color(parseColor("#0d253f66")),
                semanticNeutralA1 = Color(parseColor("#1830498f")),
                semanticNeutralA0 = Color(parseColor("#182639bd"))
            ),
            neutral = NeutralValuesContainer2(
                semanticNeutralNegative4 = Color(parseColor("#1b242c")),
                semanticNeutralNegative3 = Color(parseColor("#272e35")),
                semanticNeutralNegative2 = Color(parseColor("#3a424a")),
                semanticNeutralNegative1 = Color(parseColor("#4a545e")),
                semanticNeutral8 = Color(parseColor("#fcfcfd")),
                semanticNeutral7 = Color(parseColor("#f5f7f9")),
                semanticNeutral6 = Color(parseColor("#f0f3f5")),
                semanticNeutral5 = Color(parseColor("#eaedf0")),
                semanticNeutral4 = Color(parseColor("#dee3e7")),
                semanticNeutral3 = Color(parseColor("#cfd6dd")),
                semanticNeutral2 = Color(parseColor("#9ea8b3")),
                semanticNeutral1 = Color(parseColor("#7e8c9a")),
                semanticNeutral0 = Color(parseColor("#555f6d"))
            ),
            info = InfoValuesContainer(
                semanticInfoNegative4 = Color(parseColor("#041f5d")),
                semanticInfoNegative3 = Color(parseColor("#113997")),
                semanticInfoNegative2 = Color(parseColor("#1e4fc2")),
                semanticInfoNegative1 = Color(parseColor("#2759ce")),
                semanticInfo8 = Color(parseColor("#fafbff")),
                semanticInfo7 = Color(parseColor("#f5f8ff")),
                semanticInfo6 = Color(parseColor("#ebf0ff")),
                semanticInfo5 = Color(parseColor("#e5eeff")),
                semanticInfo4 = Color(parseColor("#d6e3ff")),
                semanticInfo3 = Color(parseColor("#ccdcff")),
                semanticInfo2 = Color(parseColor("#8eb0fb")),
                semanticInfo1 = Color(parseColor("#6691f4")),
                semanticInfo0 = Color(parseColor("#3061d5"))
            ),
            danger = DangerValuesContainer2(
                semanticDangerNegative4 = Color(parseColor("#4a0d0d")),
                semanticDangerNegative3 = Color(parseColor("#6f2020")),
                semanticDangerNegative2 = Color(parseColor("#952d2d")),
                semanticDangerNegative1 = Color(parseColor("#a13636")),
                semanticDanger8 = Color(parseColor("#fffafa")),
                semanticDanger7 = Color(parseColor("#fef5f5")),
                semanticDanger6 = Color(parseColor("#ffebeb")),
                semanticDanger5 = Color(parseColor("#fee7e7")),
                semanticDanger4 = Color(parseColor("#fcd9d9")),
                semanticDanger3 = Color(parseColor("#fccfcf")),
                semanticDanger2 = Color(parseColor("#f49090")),
                semanticDanger1 = Color(parseColor("#f26363")),
                semanticDanger0 = Color(parseColor("#c53434"))
            ),
            brand = BrandValuesContainer(
                semanticBrandNegative4 = Color(parseColor("#f59638")),
                semanticBrandNegative3 = Color(parseColor("#113997")),
                semanticBrandNegative2 = Color(parseColor("#1e4fc2")),
                semanticBrandNegative1 = Color(parseColor("#2759ce")),
                semanticBrand8 = Color(parseColor("#fafbff")),
                semanticBrand7 = Color(parseColor("#f5f8ff")),
                semanticBrand6 = Color(parseColor("#ebf0ff")),
                semanticBrand5 = Color(parseColor("#e5eeff")),
                semanticBrand4 = Color(parseColor("#d6e3ff")),
                semanticBrand3 = Color(parseColor("#ccdcff")),
                semanticBrand2 = Color(parseColor("#8eb0fb")),
                semanticBrand1 = Color(parseColor("#6691f4")),
                semanticBrand0 = Color(parseColor("#3061d5"))
            )
        ),
        red = RedValuesContainer1(
            red8 = Color(parseColor("#fffafa")),
            red7 = Color(parseColor("#fef5f5")),
            red6 = Color(parseColor("#ffebeb")),
            red5 = Color(parseColor("#fee7e7")),
            red4 = Color(parseColor("#fcd9d9")),
            red3 = Color(parseColor("#fccfcf")),
            red2 = Color(parseColor("#f49090")),
            red1 = Color(parseColor("#f26363")),
            red0 = Color(parseColor("#c53434")),
            negative4 = Color(parseColor("#4a0d0d")),
            negative3 = Color(parseColor("#6f2020")),
            negative2 = Color(parseColor("#952d2d")),
            negative1 = Color(parseColor("#a13636"))
        ),
        purple = PurpleValuesContainer1(
            purple8 = Color(parseColor("#fefaff")),
            purple7 = Color(parseColor("#fdf5ff")),
            purple6 = Color(parseColor("#faedfd")),
            purple5 = Color(parseColor("#f8e2fd")),
            purple4 = Color(parseColor("#f5d5fb")),
            purple3 = Color(parseColor("#f4caf7")),
            purple2 = Color(parseColor("#d98eec")),
            purple1 = Color(parseColor("#c466db")),
            purple0 = Color(parseColor("#9939ac")),
            negative4 = Color(parseColor("#410b2f")),
            negative3 = Color(parseColor("#5b1e67")),
            negative2 = Color(parseColor("#792989")),
            negative1 = Color(parseColor("#853295"))
        ),
        orange = OrangeValuesContainer1(
            orange8 = Color(parseColor("#fffcfa")),
            orange7 = Color(parseColor("#fff5eb")),
            orange6 = Color(parseColor("#fff0e0")),
            orange5 = Color(parseColor("#ffe8d1")),
            orange4 = Color(parseColor("#fcdec0")),
            orange3 = Color(parseColor("#ffd4a8")),
            orange2 = Color(parseColor("#feb871")),
            orange1 = Color(parseColor("#f6a351")),
            orange0 = Color(parseColor("#f59638")),
            negative4 = Color(parseColor("#492909")),
            negative3 = Color(parseColor("#7a4510")),
            negative2 = Color(parseColor("#a05c1c")),
            negative1 = Color(parseColor("#b4610e"))
        ),
        nonSemantic = NonSemanticValuesContainer(
            white = WhiteValuesContainer(
                nonSemanticWhiteContentSecondary = Color(parseColor("#ffffffa3")),
                nonSemanticWhiteContentPrimary = Color(parseColor("#ffffff")),
                nonSemanticWhiteBorderSubtle = Color(parseColor("#ffffffad")),
                nonSemanticWhiteBorderStrong = Color(parseColor("#ffffff")),
                nonSemanticWhiteBorderDefault = Color(parseColor("#ffffff66")),
                nonSemanticWhiteBackgroundSurface = Color(parseColor("#ffffff1a")),
                nonSemanticWhiteBackgroundSubtle = Color(parseColor("#ffffff1f")),
                nonSemanticWhiteBackgroundStrong = Color(parseColor("#ffffff")),
                nonSemanticWhiteBackgroundOnSubtle = Color(parseColor("#ffffff66")),
                nonSemanticWhiteBackgroundMuted = Color(parseColor("#ffffffa3"))
            ),
            violet = VioletValuesContainer(
                nonSemanticVioletContentSecondary = Color(parseColor("#634eca")),
                nonSemanticVioletContentPrimary = Color(parseColor("#39288a")),
                nonSemanticVioletBorderSubtle = Color(parseColor("#dcd6ff")),
                nonSemanticVioletBorderStrong = Color(parseColor("#634eca")),
                nonSemanticVioletBorderDefault = Color(parseColor("#eeebff")),
                nonSemanticVioletBackgroundSurface = Color(parseColor("#fbfaff")),
                nonSemanticVioletBackgroundSubtle = Color(parseColor("#f7f5ff")),
                nonSemanticVioletBackgroundStrong = Color(parseColor("#634eca")),
                nonSemanticVioletBackgroundOnSubtle = Color(parseColor("#eeebff")),
                nonSemanticVioletBackgroundMuted = Color(parseColor("#e3e0ff"))
            ),
            teal = TealValuesContainer(
                nonSemanticTealContentSecondary = Color(parseColor("#077597")),
                nonSemanticTealContentPrimary = Color(parseColor("#0a495c")),
                nonSemanticTealBorderSubtle = Color(parseColor("#b8e8f5")),
                nonSemanticTealBorderStrong = Color(parseColor("#077597")),
                nonSemanticTealBorderDefault = Color(parseColor("#e0f3fa")),
                nonSemanticTealBackgroundSurface = Color(parseColor("#fafeff")),
                nonSemanticTealBackgroundSubtle = Color(parseColor("#f0fbff")),
                nonSemanticTealBackgroundStrong = Color(parseColor("#077597")),
                nonSemanticTealBackgroundOnSubtle = Color(parseColor("#e0f3fa")),
                nonSemanticTealBackgroundMuted = Color(parseColor("#c5ecf7"))
            ),
            red = RedValuesContainer(
                nonSemanticRedContentSecondary = Color(parseColor("#c53434")),
                nonSemanticRedContentPrimary = Color(parseColor("#6f2020")),
                nonSemanticRedBorderSubtle = Color(parseColor("#fccfcf")),
                nonSemanticRedBorderStrong = Color(parseColor("#c53434")),
                nonSemanticRedBorderDefault = Color(parseColor("#fee7e7")),
                nonSemanticRedBackgroundSurface = Color(parseColor("#fffafa")),
                nonSemanticRedBackgroundSubtle = Color(parseColor("#fef5f5")),
                nonSemanticRedBackgroundStrong = Color(parseColor("#c53434")),
                nonSemanticRedBackgroundOnSubtle = Color(parseColor("#fee7e7")),
                nonSemanticRedBackgroundMuted = Color(parseColor("#fcd9d9"))
            ),
            purple = PurpleValuesContainer(
                nonSemanticPurpleContentSecondary = Color(parseColor("#9939ac")),
                nonSemanticPurpleContentPrimary = Color(parseColor("#5b1e67")),
                nonSemanticPurpleBorderSubtle = Color(parseColor("#f4caf7")),
                nonSemanticPurpleBorderStrong = Color(parseColor("#9939ac")),
                nonSemanticPurpleBorderDefault = Color(parseColor("#f8e2fd")),
                nonSemanticPurpleBackgroundSurface = Color(parseColor("#fefaff")),
                nonSemanticPurpleBackgroundSubtle = Color(parseColor("#fdf5ff")),
                nonSemanticPurpleBackgroundStrong = Color(parseColor("#9939ac")),
                nonSemanticPurpleBackgroundOnSubtle = Color(parseColor("#f8e2fd")),
                nonSemanticPurpleBackgroundMuted = Color(parseColor("#f5d5fb"))
            ),
            orange = OrangeValuesContainer(
                nonSemanticOrangeContentSecondary = Color(parseColor("#f59638")),
                nonSemanticOrangeContentPrimary = Color(parseColor("#7a4510")),
                nonSemanticOrangeBorderSubtle = Color(parseColor("#ffd4a8")),
                nonSemanticOrangeBorderStrong = Color(parseColor("#f59638")),
                nonSemanticOrangeBorderDefault = Color(parseColor("#ffe8d1")),
                nonSemanticOrangeBackgroundSurface = Color(parseColor("#fffcfa")),
                nonSemanticOrangeBackgroundSubtle = Color(parseColor("#fff5eb")),
                nonSemanticOrangeBackgroundStrong = Color(parseColor("#f59638")),
                nonSemanticOrangeBackgroundOnSubtle = Color(parseColor("#ffe8d1")),
                nonSemanticOrangeBackgroundMuted = Color(parseColor("#fcdec0"))
            ),
            magenta = MagentaValuesContainer(
                nonSemanticMagentaContentSecondary = Color(parseColor("#b12f86")),
                nonSemanticMagentaContentPrimary = Color(parseColor("#671e4d")),
                nonSemanticMagentaBorderSubtle = Color(parseColor("#f7cae8")),
                nonSemanticMagentaBorderStrong = Color(parseColor("#b12f86")),
                nonSemanticMagentaBorderDefault = Color(parseColor("#fde2f4")),
                nonSemanticMagentaBackgroundSurface = Color(parseColor("#fffafd")),
                nonSemanticMagentaBackgroundSubtle = Color(parseColor("#fef6fb")),
                nonSemanticMagentaBackgroundStrong = Color(parseColor("#b12f86")),
                nonSemanticMagentaBackgroundOnSubtle = Color(parseColor("#fde2f4")),
                nonSemanticMagentaBackgroundMuted = Color(parseColor("#fbd5ee"))
            ),
            green = GreenValuesContainer(
                nonSemanticGreenContentSecondary = Color(parseColor("#347434")),
                nonSemanticGreenContentPrimary = Color(parseColor("#135315")),
                nonSemanticGreenBorderSubtle = Color(parseColor("#c6ecc6")),
                nonSemanticGreenBorderStrong = Color(parseColor("#347434")),
                nonSemanticGreenBorderDefault = Color(parseColor("#dff6df")),
                nonSemanticGreenBackgroundSurface = Color(parseColor("#fbfefb")),
                nonSemanticGreenBackgroundSubtle = Color(parseColor("#f4fbf4")),
                nonSemanticGreenBackgroundStrong = Color(parseColor("#347434")),
                nonSemanticGreenBackgroundOnSubtle = Color(parseColor("#dff6df")),
                nonSemanticGreenBackgroundMuted = Color(parseColor("#cff2cf"))
            ),
            gray = GrayValuesContainer(
                nonSemanticGrayContentSecondary = Color(parseColor("#555f6d")),
                nonSemanticGrayContentPrimary = Color(parseColor("#272e35")),
                nonSemanticGrayBorderSubtle = Color(parseColor("#cfd6dd")),
                nonSemanticGrayBorderStrong = Color(parseColor("#555f6d")),
                nonSemanticGrayBorderDefault = Color(parseColor("#eaedf0")),
                nonSemanticGrayBackgroundSurface = Color(parseColor("#fcfcfd")),
                nonSemanticGrayBackgroundSubtle = Color(parseColor("#f5f7f9")),
                nonSemanticGrayBackgroundStrong = Color(parseColor("#555f6d")),
                nonSemanticGrayBackgroundOnSubtle = Color(parseColor("#eaedf0")),
                nonSemanticGrayBackgroundMuted = Color(parseColor("#dee3e7"))
            ),
            cyan = CyanValuesContainer(
                nonSemanticCyanContentSecondary = Color(parseColor("#0870ba")),
                nonSemanticCyanContentPrimary = Color(parseColor("#0c456e")),
                nonSemanticCyanBorderSubtle = Color(parseColor("#c2e2ff")),
                nonSemanticCyanBorderStrong = Color(parseColor("#0870ba")),
                nonSemanticCyanBorderDefault = Color(parseColor("#e0f1ff")),
                nonSemanticCyanBackgroundSurface = Color(parseColor("#fafdff")),
                nonSemanticCyanBackgroundSubtle = Color(parseColor("#f0f9ff")),
                nonSemanticCyanBackgroundStrong = Color(parseColor("#0870ba")),
                nonSemanticCyanBackgroundOnSubtle = Color(parseColor("#e0f1ff")),
                nonSemanticCyanBackgroundMuted = Color(parseColor("#cce7ff"))
            ),
            blue = BlueValuesContainer(
                nonSemanticBlueContentSecondary = Color(parseColor("#3061d5")),
                nonSemanticBlueContentPrimary = Color(parseColor("#113997")),
                nonSemanticBlueBorderSubtle = Color(parseColor("#ccdcff")),
                nonSemanticBlueBorderStrong = Color(parseColor("#3061d5")),
                nonSemanticBlueBorderDefault = Color(parseColor("#e5eeff")),
                nonSemanticBlueBackgroundSurface = Color(parseColor("#fafbff")),
                nonSemanticBlueBackgroundSubtle = Color(parseColor("#f5f8ff")),
                nonSemanticBlueBackgroundStrong = Color(parseColor("#3061d5")),
                nonSemanticBlueBackgroundOnSubtle = Color(parseColor("#e5eeff")),
                nonSemanticBlueBackgroundMuted = Color(parseColor("#d6e3ff"))
            ),
            aquamarine = AquamarineValuesContainer(
                nonSemanticAquamarineContentSecondary = Color(parseColor("#097b68")),
                nonSemanticAquamarineContentPrimary = Color(parseColor("#0d4a42")),
                nonSemanticAquamarineBorderSubtle = Color(parseColor("#bee9e4")),
                nonSemanticAquamarineBorderStrong = Color(parseColor("#097b68")),
                nonSemanticAquamarineBorderDefault = Color(parseColor("#daf6f3")),
                nonSemanticAquamarineBackgroundSurface = Color(parseColor("#fbfefe")),
                nonSemanticAquamarineBackgroundSubtle = Color(parseColor("#f0faf9")),
                nonSemanticAquamarineBackgroundStrong = Color(parseColor("#097b68")),
                nonSemanticAquamarineBackgroundOnSubtle = Color(parseColor("#daf6f3")),
                nonSemanticAquamarineBackgroundMuted = Color(parseColor("#c5f2ec"))
            )
        ),
        neutralGrayAlpha = NeutralGrayAlphaValuesContainer(
            neutralGrayANegative4 = Color(parseColor("#121212ed")),
            neutralGrayANegative3 = Color(parseColor("#0f0f0fe0")),
            neutralGrayANegative2 = Color(parseColor("#212121db")),
            neutralGrayANegative1 = Color(parseColor("#262626cc")),
            neutralGrayA8 = Color(parseColor("#52525205")),
            neutralGrayA7 = Color(parseColor("#2e2e2e0a")),
            neutralGrayA6 = Color(parseColor("#2121210f")),
            neutralGrayA5 = Color(parseColor("#1c1c1c17")),
            neutralGrayA4 = Color(parseColor("#1f1f1f21")),
            neutralGrayA3 = Color(parseColor("#2e2e2e33")),
            neutralGrayA2 = Color(parseColor("#21212166")),
            neutralGrayA1 = Color(parseColor("#2b2b2b8f")),
            neutralGrayA0 = Color(parseColor("#262627bd"))
        ),
        neutralGray = NeutralGrayValuesContainer(
            neutralGray8 = Color(parseColor("#fcfcfc")),
            neutralGray7 = Color(parseColor("#f7f7f7")),
            neutralGray6 = Color(parseColor("#f2f2f2")),
            neutralGray5 = Color(parseColor("#ebebeb")),
            neutralGray4 = Color(parseColor("#e3e3e3")),
            neutralGray3 = Color(parseColor("#d6d6d6")),
            neutralGray2 = Color(parseColor("#a6a6a6")),
            neutralGray1 = Color(parseColor("#8a8a8a")),
            neutralGray0 = Color(parseColor("#5e5e5e")),
            negative4 = Color(parseColor("#212121")),
            negative3 = Color(parseColor("#2e2e2e")),
            negative2 = Color(parseColor("#404040")),
            negative1 = Color(parseColor("#525252"))
        ),
        magenta = MagentaValuesContainer1(
            negative4 = Color(parseColor("#410b2f")),
            negative3 = Color(parseColor("#671e4d")),
            negative2 = Color(parseColor("#892969")),
            negative1 = Color(parseColor("#953274")),
            magenta8 = Color(parseColor("#fffafd")),
            magenta7 = Color(parseColor("#fef6fb")),
            magenta6 = Color(parseColor("#fdedf8")),
            magenta5 = Color(parseColor("#fde2f4")),
            magenta4 = Color(parseColor("#fbd5ee")),
            magenta3 = Color(parseColor("#f7cae8")),
            magenta2 = Color(parseColor("#ec89cb")),
            magenta1 = Color(parseColor("#de5eb3")),
            magenta0 = Color(parseColor("#b12f86"))
        ),
        interaction = InteractionValuesContainer(
            neutral = NeutralValuesContainer1(
                interactionNeutralSubtleSelected = Color(parseColor("#eaedf0")),
                interactionNeutralSubtleNormal = Color(parseColor("#f0f3f5")),
                interactionNeutralSubtleHover = Color(parseColor("#eaedf0")),
                interactionNeutralSubtleActive = Color(parseColor("#cfd6dd")),
                interactionNeutralSelected = Color(parseColor("#3a424a")),
                interactionNeutralNormal = Color(parseColor("#4a545e")),
                interactionNeutralHover = Color(parseColor("#3a424a")),
                interactionNeutralActive = Color(parseColor("#272e35"))
            ),
            inverse = InverseValuesContainer1(
                interactionInverseSelected = Color(parseColor("#ffffffd1")),
                interactionInverseNormal = Color(parseColor("#ffffff")),
                interactionInverseHover = Color(parseColor("#ffffffd1")),
                interactionInverseActive = Color(parseColor("#ffffffb8"))
            ),
            ghost = GhostValuesContainer1(
                interactionGhostSelected = Color(parseColor("#022e500f")),
                interactionGhostNormal = Color(parseColor("#ffffff00")),
                interactionGhostInverseSelected = Color(parseColor("#ffffff1a")),
                interactionGhostInverseNormal = Color(parseColor("#ffffff1f")),
                interactionGhostInverseHover = Color(parseColor("#ffffff1a")),
                interactionGhostHover = Color(parseColor("#022e500f")),
                interactionGhostDangerSelected = Color(parseColor("#ffebeb")),
                interactionGhostDangerNormal = Color(parseColor("#fee7e7")),
                interactionGhostDangerHover = Color(parseColor("#ffebeb")),
                interactionGhostActive = Color(parseColor("#10284717"))
            ),
            focus = FocusValuesContainer(
                interactionFocusDefault = Color(parseColor("#6691f4"))
            ),
            disabled = DisabledValuesContainer(
                interactionDisabledSubtleNormal = Color(parseColor("#eaedf0")),
                interactionDisabledSubtleHover = Color(parseColor("#dee3e7")),
                interactionDisabledSubtleActive = Color(parseColor("#cfd6dd")),
                interactionDisabledNormal = Color(parseColor("#9ea8b3")),
                interactionDisabledHover = Color(parseColor("#7e8c9a")),
                interactionDisabledActive = Color(parseColor("#555f6d"))
            ),
            default = DefaultValuesContainer(
                interactionDefaultSubtleSelected = Color(parseColor("#e5eeff")),
                interactionDefaultSubtleNormal = Color(parseColor("#ebf0ff")),
                interactionDefaultSubtleHover = Color(parseColor("#e5eeff")),
                interactionDefaultSubtleActive = Color(parseColor("#ccdcff")),
                interactionDefaultSelected = Color(parseColor("#1e4fc2")),
                interactionDefaultNormal = Color(parseColor("#3061d5")),
                interactionDefaultHover = Color(parseColor("#1e4fc2")),
                interactionDefaultActive = Color(parseColor("#113997"))
            ),
            danger = DangerValuesContainer1(
                interactionDangerSubtleSelected = Color(parseColor("#fee7e7")),
                interactionDangerSubtleNormal = Color(parseColor("#ffebeb")),
                interactionDangerSubtleHover = Color(parseColor("#fee7e7")),
                interactionDangerSubtleActive = Color(parseColor("#fccfcf")),
                interactionDangerSelected = Color(parseColor("#952d2d")),
                interactionDangerNormal = Color(parseColor("#c53434")),
                interactionDangerHover = Color(parseColor("#952d2d")),
                interactionDangerActive = Color(parseColor("#6f2020"))
            ),
            border = BorderValuesContainer1(
                interactionBorderSelected = Color(parseColor("#3061d5")),
                interactionBorderNormal = Color(parseColor("#8eb0fb")),
                interactionBorderNeutralSelected = Color(parseColor("#9ea8b3")),
                interactionBorderNeutralNormal = Color(parseColor("#cfd6dd")),
                interactionBorderNeutralHover = Color(parseColor("#9ea8b3")),
                interactionBorderNeutralActive = Color(parseColor("#7e8c9a")),
                interactionBorderHover = Color(parseColor("#6691f4")),
                interactionBorderDanger = Color(parseColor("#f26363")),
                interactionBorderActive = Color(parseColor("#2759ce"))
            ),
            background = BackgroundValuesContainer1(
                interactionBackgroundSidepanel = Color(parseColor("#ffffff")),
                interactionBackgroundModelessInverse = Color(parseColor("#272e35")),
                interactionBackgroundModeless = Color(parseColor("#ffffff")),
                interactionBackgroundModal = Color(parseColor("#ffffff")),
                interactionBackgroundFormField = Color(parseColor("#ffffff")),
                interactionBackgroundDimmer = Color(parseColor("#182639bd"))
            )
        ),
        green = GreenValuesContainer1(
            negative4 = Color(parseColor("#0a2e0b")),
            negative3 = Color(parseColor("#135315")),
            negative2 = Color(parseColor("#246626")),
            negative1 = Color(parseColor("#2f6f2f")),
            green8 = Color(parseColor("#fbfefb")),
            green7 = Color(parseColor("#f4fbf4")),
            green6 = Color(parseColor("#e6f9e6")),
            green5 = Color(parseColor("#dff6df")),
            green4 = Color(parseColor("#cff2cf")),
            green3 = Color(parseColor("#c6ecc6")),
            green2 = Color(parseColor("#87c987")),
            green1 = Color(parseColor("#55a555")),
            green0 = Color(parseColor("#347434"))
        ),
        cyan = CyanValuesContainer1(
            negative4 = Color(parseColor("#002742")),
            negative3 = Color(parseColor("#0c456e")),
            negative2 = Color(parseColor("#165c8d")),
            negative1 = Color(parseColor("#1b679d")),
            cyan8 = Color(parseColor("#fafdff")),
            cyan7 = Color(parseColor("#f0f9ff")),
            cyan6 = Color(parseColor("#ebf5ff")),
            cyan5 = Color(parseColor("#e0f1ff")),
            cyan4 = Color(parseColor("#cce7ff")),
            cyan3 = Color(parseColor("#c2e2ff")),
            cyan2 = Color(parseColor("#79bcf6")),
            cyan1 = Color(parseColor("#5699dc")),
            cyan0 = Color(parseColor("#0870ba"))
        ),
        coolGrayAlpha = CoolGrayAlphaValuesContainer(
            coolGrayANegative4 = Color(parseColor("#09131aed")),
            coolGrayANegative3 = Color(parseColor("#0a121ae0")),
            coolGrayANegative2 = Color(parseColor("#1a232ddb")),
            coolGrayANegative1 = Color(parseColor("#1d2835cc")),
            coolGrayA8 = Color(parseColor("#1f529e05")),
            coolGrayA7 = Color(parseColor("#00295c0a")),
            coolGrayA6 = Color(parseColor("#022e500f")),
            coolGrayA5 = Color(parseColor("#10284717")),
            coolGrayA4 = Color(parseColor("#04294321")),
            coolGrayA3 = Color(parseColor("#10315633")),
            coolGrayA2 = Color(parseColor("#0d253f66")),
            coolGrayA1 = Color(parseColor("#1830498f")),
            coolGrayA0 = Color(parseColor("#182639bd"))
        ),
        coolGray = CoolGrayValuesContainer(
            negative4 = Color(parseColor("#1b242c")),
            negative3 = Color(parseColor("#272e35")),
            negative2 = Color(parseColor("#3a424a")),
            negative1 = Color(parseColor("#4a545e")),
            coolGray8 = Color(parseColor("#fcfcfd")),
            coolGray7 = Color(parseColor("#f5f7f9")),
            coolGray6 = Color(parseColor("#f0f3f5")),
            coolGray5 = Color(parseColor("#eaedf0")),
            coolGray4 = Color(parseColor("#dee3e7")),
            coolGray3 = Color(parseColor("#cfd6dd")),
            coolGray2 = Color(parseColor("#9ea8b3")),
            coolGray1 = Color(parseColor("#7e8c9a")),
            coolGray0 = Color(parseColor("#555f6d"))
        ),
        content = ContentValuesContainer(
            warningSecondary = Color(parseColor("#f59638")),
            warningPrimary = Color(parseColor("#7a4510")),
            tertiaryInverse = Color(parseColor("#ffffff66")),
            tertiary = Color(parseColor("#7e8c9a")),
            successSecondary = Color(parseColor("#347434")),
            successPrimary = Color(parseColor("#135315")),
            secondaryInverse = Color(parseColor("#ffffffa3")),
            secondary = Color(parseColor("#555f6d")),
            primaryInverse = Color(parseColor("#ffffff")),
            primary = Color(parseColor("#272e35")),
            infoSecondary = Color(parseColor("#3061d5")),
            infoPrimary = Color(parseColor("#113997")),
            disabledInverse = Color(parseColor("#ffffff3d")),
            disabled = Color(parseColor("#9ea8b3")),
            dangerSecondary = Color(parseColor("#c53434")),
            dangerPrimary = Color(parseColor("#6f2020")),
            brandSecondary = Color(parseColor("#3061d5")),
            brandPrimary = Color(parseColor("#113997"))
        ),
        border = BorderValuesContainer(
            warningSubtle = Color(parseColor("#ffd4a8")),
            warningStrong = Color(parseColor("#f59638")),
            successSubtle = Color(parseColor("#c6ecc6")),
            successStrong = Color(parseColor("#347434")),
            neutralSubtle = Color(parseColor("#cfd6dd")),
            neutralStrong = Color(parseColor("#555f6d")),
            inverse = Color(parseColor("#ffffff")),
            infoSubtle = Color(parseColor("#ccdcff")),
            infoStrong = Color(parseColor("#3061d5")),
            defaultA = Color(parseColor("#10284717")),
            default = Color(parseColor("#eaedf0")),
            dangerSubtle = Color(parseColor("#fccfcf")),
            dangerStrong = Color(parseColor("#c53434"))
        ),
        blue = BlueValuesContainer1(
            negative4 = Color(parseColor("#041f5d")),
            negative3 = Color(parseColor("#113997")),
            negative2 = Color(parseColor("#1e4fc2")),
            negative1 = Color(parseColor("#2759ce")),
            blue8 = Color(parseColor("#fafbff")),
            blue7 = Color(parseColor("#f5f8ff")),
            blue6 = Color(parseColor("#ebf0ff")),
            blue5 = Color(parseColor("#e5eeff")),
            blue4 = Color(parseColor("#d6e3ff")),
            blue3 = Color(parseColor("#ccdcff")),
            blue2 = Color(parseColor("#8eb0fb")),
            blue1 = Color(parseColor("#6691f4")),
            blue0 = Color(parseColor("#3061d5"))
        ),
        background = BackgroundValuesContainer(
            warningSurface = Color(parseColor("#fffcfa")),
            warningSubtle = Color(parseColor("#fff5eb")),
            warningStrong = Color(parseColor("#f59638")),
            warningOnSubtle = Color(parseColor("#ffe8d1")),
            warningMuted = Color(parseColor("#fcdec0")),
            successSurface = Color(parseColor("#fbfefb")),
            successSubtle = Color(parseColor("#f4fbf4")),
            successStrong = Color(parseColor("#347434")),
            successOnSubtle = Color(parseColor("#dff6df")),
            successMuted = Color(parseColor("#cff2cf")),
            neutralSurface = Color(parseColor("#fcfcfd")),
            neutralSubtle = Color(parseColor("#f5f7f9")),
            neutralStrong = Color(parseColor("#555f6d")),
            neutralOnSubtle = Color(parseColor("#eaedf0")),
            neutralMuted = Color(parseColor("#dee3e7")),
            inverse = Color(parseColor("#272e35")),
            infoSurface = Color(parseColor("#fafbff")),
            infoSubtle = Color(parseColor("#f5f8ff")),
            infoStrong = Color(parseColor("#3061d5")),
            infoOnSubtle = Color(parseColor("#e5eeff")),
            infoMuted = Color(parseColor("#d6e3ff")),
            default = Color(parseColor("#ffffff")),
            dangerSurface = Color(parseColor("#fffafa")),
            dangerSubtle = Color(parseColor("#fef5f5")),
            dangerStrong = Color(parseColor("#c53434")),
            dangerOnSubtle = Color(parseColor("#fee7e7")),
            dangerMuted = Color(parseColor("#fcd9d9")),
            brandSurface = Color(parseColor("#fafbff")),
            brandSubtle = Color(parseColor("#f5f8ff")),
            brandStrong = Color(parseColor("#3061d5")),
            brandOnSubtle = Color(parseColor("#e5eeff")),
            brandMuted = Color(parseColor("#d6e3ff"))
        ),
        aquamarine = AquamarineValuesContainer1(
            negative4 = Color(parseColor("#012d26")),
            negative3 = Color(parseColor("#0d4a42")),
            negative2 = Color(parseColor("#15665b")),
            negative1 = Color(parseColor("#1a7061")),
            aquamarine8 = Color(parseColor("#fbfefe")),
            aquamarine7 = Color(parseColor("#f0faf9")),
            aquamarine6 = Color(parseColor("#e2f8f5")),
            aquamarine5 = Color(parseColor("#daf6f3")),
            aquamarine4 = Color(parseColor("#c5f2ec")),
            aquamarine3 = Color(parseColor("#bee9e4")),
            aquamarine2 = Color(parseColor("#6ec9bf")),
            aquamarine1 = Color(parseColor("#3da496")),
            aquamarine0 = Color(parseColor("#097b68"))
        ),
        action = ActionValuesContainer(
            success = SuccessValuesContainer(
                actionSuccessSubtleSelected = Color(parseColor("#dff6df")),
                actionSuccessSubtleNormal = Color(parseColor("#e6f9e6")),
                actionSuccessSubtleHover = Color(parseColor("#dff6df")),
                actionSuccessSubtleActive = Color(parseColor("#c6ecc6")),
                actionSuccessSelected = Color(parseColor("#246626")),
                actionSuccessNormal = Color(parseColor("#347434")),
                actionSuccessHover = Color(parseColor("#246626")),
                actionSuccessActive = Color(parseColor("#135315"))
            ),
            reverseInverse = ReverseInverseValuesContainer(
                actionReverseInverseSelected = Color(parseColor("#1d2835cc")),
                actionReverseInverseNormal = Color(parseColor("#0a121ae0")),
                actionReverseInverseHover = Color(parseColor("#1d2835cc")),
                actionReverseInverseActive = Color(parseColor("#182639bd"))
            ),
            primary = PrimaryValuesContainer(
                actionPrimarySubtleSelected = Color(parseColor("#e5eeff")),
                actionPrimarySubtleNormal = Color(parseColor("#ebf0ff")),
                actionPrimarySubtleHover = Color(parseColor("#e5eeff")),
                actionPrimarySubtleActive = Color(parseColor("#ccdcff")),
                actionPrimarySelected = Color(parseColor("#1e4fc2")),
                actionPrimaryNormal = Color(parseColor("#3061d5")),
                actionPrimaryHover = Color(parseColor("#1e4fc2")),
                actionPrimaryActive = Color(parseColor("#113997"))
            ),
            outline = OutlineValuesContainer(
                actionOutlineSelected = Color(parseColor("#9ea8b3")),
                actionOutlineNormal = Color(parseColor("#cfd6dd")),
                actionOutlineHover = Color(parseColor("#9ea8b3")),
                actionOutlineActive = Color(parseColor("#7e8c9a"))
            ),
            neutral = NeutralValuesContainer(
                actionNeutralSubtleSelected = Color(parseColor("#eaedf0")),
                actionNeutralSubtleNormal = Color(parseColor("#f0f3f5")),
                actionNeutralSubtleHover = Color(parseColor("#eaedf0")),
                actionNeutralSubtleActive = Color(parseColor("#cfd6dd")),
                actionNeutralSelected = Color(parseColor("#3a424a")),
                actionNeutralNormal = Color(parseColor("#4a545e")),
                actionNeutralHover = Color(parseColor("#3a424a")),
                actionNeutralActive = Color(parseColor("#272e35"))
            ),
            inverse = InverseValuesContainer(
                actionInverseSelected = Color(parseColor("#ffffffd1")),
                actionInverseNormal = Color(parseColor("#ffffff")),
                actionInverseHover = Color(parseColor("#ffffffd1")),
                actionInverseActive = Color(parseColor("#ffffffb8"))
            ),
            ghost = GhostValuesContainer(
                actionGhostSelected = Color(parseColor("#022e500f")),
                actionGhostNormal = Color(parseColor("#ffffff00")),
                actionGhostInverseSelected = Color(parseColor("#ffffff1a")),
                actionGhostInverseHover = Color(parseColor("#ffffff1a")),
                actionGhostInverseActive = Color(parseColor("#ffffff1f")),
                actionGhostHover = Color(parseColor("#022e500f")),
                actionGhostDangerSelected = Color(parseColor("#ffebeb")),
                actionGhostDangerHover = Color(parseColor("#ffebeb")),
                actionGhostDangerActive = Color(parseColor("#fee7e7")),
                actionGhostActive = Color(parseColor("#10284717"))
            ),
            danger = DangerValuesContainer(
                actionDangerSubtleSelected = Color(parseColor("#fee7e7")),
                actionDangerSubtleNormal = Color(parseColor("#ffebeb")),
                actionDangerSubtleHover = Color(parseColor("#fee7e7")),
                actionDangerSubtleActive = Color(parseColor("#fccfcf")),
                actionDangerSelected = Color(parseColor("#952d2d")),
                actionDangerNormal = Color(parseColor("#c53434")),
                actionDangerHover = Color(parseColor("#952d2d")),
                actionDangerActive = Color(parseColor("#6f2020"))
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
            elevationTop400 = listOf(BoxShadow(
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
            )),
            elevationTop300 = listOf(BoxShadow(
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
            )),
            elevationTop200 = listOf(BoxShadow(
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
            )),
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
            elevationBottom400 = listOf(BoxShadow(
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
            )),
            elevationBottom300 = listOf(BoxShadow(
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
            )),
            elevationBottom200 = listOf(BoxShadow(
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
            )),
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