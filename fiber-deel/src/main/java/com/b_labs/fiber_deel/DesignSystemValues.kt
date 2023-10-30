package com.b_labs.fiber_deel

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
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
            whiteANegative9 = Color("#ffffff14".toColorInt()),
            whiteANegative8 = Color("#ffffff1a".toColorInt()),
            whiteANegative7 = Color("#ffffff1f".toColorInt()),
            whiteANegative6 = Color("#ffffff3d".toColorInt()),
            whiteANegative5 = Color("#ffffff66".toColorInt()),
            whiteANegative4 = Color("#ffffffa3".toColorInt()),
            whiteANegative3 = Color("#ffffffad".toColorInt()),
            whiteANegative2 = Color("#ffffffb8".toColorInt()),
            whiteANegative12 = Color("#ffffff05".toColorInt()),
            whiteANegative11 = Color("#ffffff08".toColorInt()),
            whiteANegative10 = Color("#ffffff0d".toColorInt()),
            whiteANegative1 = Color("#ffffffd1".toColorInt()),
            whiteA0 = Color("#ffffff".toColorInt())
        ),
        warmGrayAlpha = WarmGrayAlphaValuesContainer(
            warmGrayANegative4 = Color("#131311ed".toColorInt()),
            warmGrayANegative3 = Color("#12120de0".toColorInt()),
            warmGrayANegative2 = Color("#22221bdb".toColorInt()),
            warmGrayANegative1 = Color("#272720cc".toColorInt()),
            warmGrayA8 = Color("#52525205".toColorInt()),
            warmGrayA7 = Color("#2f2f2d0a".toColorInt()),
            warmGrayA6 = Color("#2f2f0e0f".toColorInt()),
            warmGrayA5 = Color("#22220217".toColorInt()),
            warmGrayA4 = Color("#33331421".toColorInt()),
            warmGrayA3 = Color("#3e3e1d33".toColorInt()),
            warmGrayA2 = Color("#28281166".toColorInt()),
            warmGrayA1 = Color("#2f2f238f".toColorInt()),
            warmGrayA0 = Color("#26261cbd".toColorInt())
        ),
        warmGray = WarmGrayValuesContainer(
            warmGray8 = Color("#fdfdfc".toColorInt()),
            warmGray7 = Color("#f8f8f7".toColorInt()),
            warmGray6 = Color("#f3f3f1".toColorInt()),
            warmGray5 = Color("#eaeae6".toColorInt()),
            warmGray4 = Color("#e5e5e1".toColorInt()),
            warmGray3 = Color("#d9d9d3".toColorInt()),
            warmGray2 = Color("#a8a89f".toColorInt()),
            warmGray1 = Color("#8b8b84".toColorInt()),
            warmGray0 = Color("#5f5f58".toColorInt()),
            negative4 = Color("#222220".toColorInt()),
            negative3 = Color("#30302c".toColorInt()),
            negative2 = Color("#40403a".toColorInt()),
            negative1 = Color("#52524c".toColorInt())
        ),
        violet = VioletValuesContainer1(
            violet8 = Color("#fbfaff".toColorInt()),
            violet7 = Color("#f7f5ff".toColorInt()),
            violet6 = Color("#f3f0ff".toColorInt()),
            violet5 = Color("#eeebff".toColorInt()),
            violet4 = Color("#e3e0ff".toColorInt()),
            violet3 = Color("#dcd6ff".toColorInt()),
            violet2 = Color("#aba2fb".toColorInt()),
            violet1 = Color("#927ef1".toColorInt()),
            violet0 = Color("#634eca".toColorInt()),
            negative4 = Color("#201263".toColorInt()),
            negative3 = Color("#39288a".toColorInt()),
            negative2 = Color("#4e38bc".toColorInt()),
            negative1 = Color("#573fcf".toColorInt())
        ),
        transparent = TransparentValuesContainer(
            transparent = Color("#ffffff00".toColorInt())
        ),
        teal = TealValuesContainer1(
            teal8 = Color("#fafeff".toColorInt()),
            teal7 = Color("#f0fbff".toColorInt()),
            teal6 = Color("#e8f7fc".toColorInt()),
            teal5 = Color("#e0f3fa".toColorInt()),
            teal4 = Color("#c5ecf7".toColorInt()),
            teal3 = Color("#b8e8f5".toColorInt()),
            teal2 = Color("#7ac0dc".toColorInt()),
            teal1 = Color("#4f9eba".toColorInt()),
            teal0 = Color("#077597".toColorInt()),
            negative4 = Color("#012a37".toColorInt()),
            negative3 = Color("#0a495c".toColorInt()),
            negative2 = Color("#196076".toColorInt()),
            negative1 = Color("#196c85".toColorInt())
        ),
        semantic = SemanticValuesContainer(
            warning = WarningValuesContainer(
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
            success = SuccessValuesContainer1(
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
            neutralAlpha = NeutralAlphaValuesContainer(
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
            neutral = NeutralValuesContainer2(
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
            info = InfoValuesContainer(
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
            danger = DangerValuesContainer2(
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
            brand = BrandValuesContainer(
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
        ),
        red = RedValuesContainer1(
            red8 = Color("#fffafa".toColorInt()),
            red7 = Color("#fef5f5".toColorInt()),
            red6 = Color("#ffebeb".toColorInt()),
            red5 = Color("#fee7e7".toColorInt()),
            red4 = Color("#fcd9d9".toColorInt()),
            red3 = Color("#fccfcf".toColorInt()),
            red2 = Color("#f49090".toColorInt()),
            red1 = Color("#f26363".toColorInt()),
            red0 = Color("#c53434".toColorInt()),
            negative4 = Color("#4a0d0d".toColorInt()),
            negative3 = Color("#6f2020".toColorInt()),
            negative2 = Color("#952d2d".toColorInt()),
            negative1 = Color("#a13636".toColorInt())
        ),
        purple = PurpleValuesContainer1(
            purple8 = Color("#fefaff".toColorInt()),
            purple7 = Color("#fdf5ff".toColorInt()),
            purple6 = Color("#faedfd".toColorInt()),
            purple5 = Color("#f8e2fd".toColorInt()),
            purple4 = Color("#f5d5fb".toColorInt()),
            purple3 = Color("#f4caf7".toColorInt()),
            purple2 = Color("#d98eec".toColorInt()),
            purple1 = Color("#c466db".toColorInt()),
            purple0 = Color("#9939ac".toColorInt()),
            negative4 = Color("#410b2f".toColorInt()),
            negative3 = Color("#5b1e67".toColorInt()),
            negative2 = Color("#792989".toColorInt()),
            negative1 = Color("#853295".toColorInt())
        ),
        orange = OrangeValuesContainer1(
            orange8 = Color("#fffcfa".toColorInt()),
            orange7 = Color("#fff5eb".toColorInt()),
            orange6 = Color("#fff0e0".toColorInt()),
            orange5 = Color("#ffe8d1".toColorInt()),
            orange4 = Color("#fcdec0".toColorInt()),
            orange3 = Color("#ffd4a8".toColorInt()),
            orange2 = Color("#feb871".toColorInt()),
            orange1 = Color("#f6a351".toColorInt()),
            orange0 = Color("#f59638".toColorInt()),
            negative4 = Color("#492909".toColorInt()),
            negative3 = Color("#7a4510".toColorInt()),
            negative2 = Color("#a05c1c".toColorInt()),
            negative1 = Color("#b4610e".toColorInt())
        ),
        nonSemantic = NonSemanticValuesContainer(
            white = WhiteValuesContainer(
                nonSemanticWhiteContentSecondary = Color("#ffffffa3".toColorInt()),
                nonSemanticWhiteContentPrimary = Color("#ffffff".toColorInt()),
                nonSemanticWhiteBorderSubtle = Color("#ffffffad".toColorInt()),
                nonSemanticWhiteBorderStrong = Color("#ffffff".toColorInt()),
                nonSemanticWhiteBorderDefault = Color("#ffffff66".toColorInt()),
                nonSemanticWhiteBackgroundSurface = Color("#ffffff1a".toColorInt()),
                nonSemanticWhiteBackgroundSubtle = Color("#ffffff1f".toColorInt()),
                nonSemanticWhiteBackgroundStrong = Color("#ffffff".toColorInt()),
                nonSemanticWhiteBackgroundOnSubtle = Color("#ffffff66".toColorInt()),
                nonSemanticWhiteBackgroundMuted = Color("#ffffffa3".toColorInt())
            ),
            violet = VioletValuesContainer(
                nonSemanticVioletContentSecondary = Color("#634eca".toColorInt()),
                nonSemanticVioletContentPrimary = Color("#39288a".toColorInt()),
                nonSemanticVioletBorderSubtle = Color("#dcd6ff".toColorInt()),
                nonSemanticVioletBorderStrong = Color("#634eca".toColorInt()),
                nonSemanticVioletBorderDefault = Color("#eeebff".toColorInt()),
                nonSemanticVioletBackgroundSurface = Color("#fbfaff".toColorInt()),
                nonSemanticVioletBackgroundSubtle = Color("#f7f5ff".toColorInt()),
                nonSemanticVioletBackgroundStrong = Color("#634eca".toColorInt()),
                nonSemanticVioletBackgroundOnSubtle = Color("#eeebff".toColorInt()),
                nonSemanticVioletBackgroundMuted = Color("#e3e0ff".toColorInt())
            ),
            teal = TealValuesContainer(
                nonSemanticTealContentSecondary = Color("#077597".toColorInt()),
                nonSemanticTealContentPrimary = Color("#0a495c".toColorInt()),
                nonSemanticTealBorderSubtle = Color("#b8e8f5".toColorInt()),
                nonSemanticTealBorderStrong = Color("#077597".toColorInt()),
                nonSemanticTealBorderDefault = Color("#e0f3fa".toColorInt()),
                nonSemanticTealBackgroundSurface = Color("#fafeff".toColorInt()),
                nonSemanticTealBackgroundSubtle = Color("#f0fbff".toColorInt()),
                nonSemanticTealBackgroundStrong = Color("#077597".toColorInt()),
                nonSemanticTealBackgroundOnSubtle = Color("#e0f3fa".toColorInt()),
                nonSemanticTealBackgroundMuted = Color("#c5ecf7".toColorInt())
            ),
            red = RedValuesContainer(
                nonSemanticRedContentSecondary = Color("#c53434".toColorInt()),
                nonSemanticRedContentPrimary = Color("#6f2020".toColorInt()),
                nonSemanticRedBorderSubtle = Color("#fccfcf".toColorInt()),
                nonSemanticRedBorderStrong = Color("#c53434".toColorInt()),
                nonSemanticRedBorderDefault = Color("#fee7e7".toColorInt()),
                nonSemanticRedBackgroundSurface = Color("#fffafa".toColorInt()),
                nonSemanticRedBackgroundSubtle = Color("#fef5f5".toColorInt()),
                nonSemanticRedBackgroundStrong = Color("#c53434".toColorInt()),
                nonSemanticRedBackgroundOnSubtle = Color("#fee7e7".toColorInt()),
                nonSemanticRedBackgroundMuted = Color("#fcd9d9".toColorInt())
            ),
            purple = PurpleValuesContainer(
                nonSemanticPurpleContentSecondary = Color("#9939ac".toColorInt()),
                nonSemanticPurpleContentPrimary = Color("#5b1e67".toColorInt()),
                nonSemanticPurpleBorderSubtle = Color("#f4caf7".toColorInt()),
                nonSemanticPurpleBorderStrong = Color("#9939ac".toColorInt()),
                nonSemanticPurpleBorderDefault = Color("#f8e2fd".toColorInt()),
                nonSemanticPurpleBackgroundSurface = Color("#fefaff".toColorInt()),
                nonSemanticPurpleBackgroundSubtle = Color("#fdf5ff".toColorInt()),
                nonSemanticPurpleBackgroundStrong = Color("#9939ac".toColorInt()),
                nonSemanticPurpleBackgroundOnSubtle = Color("#f8e2fd".toColorInt()),
                nonSemanticPurpleBackgroundMuted = Color("#f5d5fb".toColorInt())
            ),
            orange = OrangeValuesContainer(
                nonSemanticOrangeContentSecondary = Color("#f59638".toColorInt()),
                nonSemanticOrangeContentPrimary = Color("#7a4510".toColorInt()),
                nonSemanticOrangeBorderSubtle = Color("#ffd4a8".toColorInt()),
                nonSemanticOrangeBorderStrong = Color("#f59638".toColorInt()),
                nonSemanticOrangeBorderDefault = Color("#ffe8d1".toColorInt()),
                nonSemanticOrangeBackgroundSurface = Color("#fffcfa".toColorInt()),
                nonSemanticOrangeBackgroundSubtle = Color("#fff5eb".toColorInt()),
                nonSemanticOrangeBackgroundStrong = Color("#f59638".toColorInt()),
                nonSemanticOrangeBackgroundOnSubtle = Color("#ffe8d1".toColorInt()),
                nonSemanticOrangeBackgroundMuted = Color("#fcdec0".toColorInt())
            ),
            magenta = MagentaValuesContainer(
                nonSemanticMagentaContentSecondary = Color("#b12f86".toColorInt()),
                nonSemanticMagentaContentPrimary = Color("#671e4d".toColorInt()),
                nonSemanticMagentaBorderSubtle = Color("#f7cae8".toColorInt()),
                nonSemanticMagentaBorderStrong = Color("#b12f86".toColorInt()),
                nonSemanticMagentaBorderDefault = Color("#fde2f4".toColorInt()),
                nonSemanticMagentaBackgroundSurface = Color("#fffafd".toColorInt()),
                nonSemanticMagentaBackgroundSubtle = Color("#fef6fb".toColorInt()),
                nonSemanticMagentaBackgroundStrong = Color("#b12f86".toColorInt()),
                nonSemanticMagentaBackgroundOnSubtle = Color("#fde2f4".toColorInt()),
                nonSemanticMagentaBackgroundMuted = Color("#fbd5ee".toColorInt())
            ),
            green = GreenValuesContainer(
                nonSemanticGreenContentSecondary = Color("#347434".toColorInt()),
                nonSemanticGreenContentPrimary = Color("#135315".toColorInt()),
                nonSemanticGreenBorderSubtle = Color("#c6ecc6".toColorInt()),
                nonSemanticGreenBorderStrong = Color("#347434".toColorInt()),
                nonSemanticGreenBorderDefault = Color("#dff6df".toColorInt()),
                nonSemanticGreenBackgroundSurface = Color("#fbfefb".toColorInt()),
                nonSemanticGreenBackgroundSubtle = Color("#f4fbf4".toColorInt()),
                nonSemanticGreenBackgroundStrong = Color("#347434".toColorInt()),
                nonSemanticGreenBackgroundOnSubtle = Color("#dff6df".toColorInt()),
                nonSemanticGreenBackgroundMuted = Color("#cff2cf".toColorInt())
            ),
            gray = GrayValuesContainer(
                nonSemanticGrayContentSecondary = Color("#555f6d".toColorInt()),
                nonSemanticGrayContentPrimary = Color("#272e35".toColorInt()),
                nonSemanticGrayBorderSubtle = Color("#cfd6dd".toColorInt()),
                nonSemanticGrayBorderStrong = Color("#555f6d".toColorInt()),
                nonSemanticGrayBorderDefault = Color("#eaedf0".toColorInt()),
                nonSemanticGrayBackgroundSurface = Color("#fcfcfd".toColorInt()),
                nonSemanticGrayBackgroundSubtle = Color("#f5f7f9".toColorInt()),
                nonSemanticGrayBackgroundStrong = Color("#555f6d".toColorInt()),
                nonSemanticGrayBackgroundOnSubtle = Color("#eaedf0".toColorInt()),
                nonSemanticGrayBackgroundMuted = Color("#dee3e7".toColorInt())
            ),
            cyan = CyanValuesContainer(
                nonSemanticCyanContentSecondary = Color("#0870ba".toColorInt()),
                nonSemanticCyanContentPrimary = Color("#0c456e".toColorInt()),
                nonSemanticCyanBorderSubtle = Color("#c2e2ff".toColorInt()),
                nonSemanticCyanBorderStrong = Color("#0870ba".toColorInt()),
                nonSemanticCyanBorderDefault = Color("#e0f1ff".toColorInt()),
                nonSemanticCyanBackgroundSurface = Color("#fafdff".toColorInt()),
                nonSemanticCyanBackgroundSubtle = Color("#f0f9ff".toColorInt()),
                nonSemanticCyanBackgroundStrong = Color("#0870ba".toColorInt()),
                nonSemanticCyanBackgroundOnSubtle = Color("#e0f1ff".toColorInt()),
                nonSemanticCyanBackgroundMuted = Color("#cce7ff".toColorInt())
            ),
            blue = BlueValuesContainer(
                nonSemanticBlueContentSecondary = Color("#3061d5".toColorInt()),
                nonSemanticBlueContentPrimary = Color("#113997".toColorInt()),
                nonSemanticBlueBorderSubtle = Color("#ccdcff".toColorInt()),
                nonSemanticBlueBorderStrong = Color("#3061d5".toColorInt()),
                nonSemanticBlueBorderDefault = Color("#e5eeff".toColorInt()),
                nonSemanticBlueBackgroundSurface = Color("#fafbff".toColorInt()),
                nonSemanticBlueBackgroundSubtle = Color("#f5f8ff".toColorInt()),
                nonSemanticBlueBackgroundStrong = Color("#3061d5".toColorInt()),
                nonSemanticBlueBackgroundOnSubtle = Color("#e5eeff".toColorInt()),
                nonSemanticBlueBackgroundMuted = Color("#d6e3ff".toColorInt())
            ),
            aquamarine = AquamarineValuesContainer(
                nonSemanticAquamarineContentSecondary = Color("#097b68".toColorInt()),
                nonSemanticAquamarineContentPrimary = Color("#0d4a42".toColorInt()),
                nonSemanticAquamarineBorderSubtle = Color("#bee9e4".toColorInt()),
                nonSemanticAquamarineBorderStrong = Color("#097b68".toColorInt()),
                nonSemanticAquamarineBorderDefault = Color("#daf6f3".toColorInt()),
                nonSemanticAquamarineBackgroundSurface = Color("#fbfefe".toColorInt()),
                nonSemanticAquamarineBackgroundSubtle = Color("#f0faf9".toColorInt()),
                nonSemanticAquamarineBackgroundStrong = Color("#097b68".toColorInt()),
                nonSemanticAquamarineBackgroundOnSubtle = Color("#daf6f3".toColorInt()),
                nonSemanticAquamarineBackgroundMuted = Color("#c5f2ec".toColorInt())
            )
        ),
        neutralGrayAlpha = NeutralGrayAlphaValuesContainer(
            neutralGrayANegative4 = Color("#121212ed".toColorInt()),
            neutralGrayANegative3 = Color("#0f0f0fe0".toColorInt()),
            neutralGrayANegative2 = Color("#212121db".toColorInt()),
            neutralGrayANegative1 = Color("#262626cc".toColorInt()),
            neutralGrayA8 = Color("#52525205".toColorInt()),
            neutralGrayA7 = Color("#2e2e2e0a".toColorInt()),
            neutralGrayA6 = Color("#2121210f".toColorInt()),
            neutralGrayA5 = Color("#1c1c1c17".toColorInt()),
            neutralGrayA4 = Color("#1f1f1f21".toColorInt()),
            neutralGrayA3 = Color("#2e2e2e33".toColorInt()),
            neutralGrayA2 = Color("#21212166".toColorInt()),
            neutralGrayA1 = Color("#2b2b2b8f".toColorInt()),
            neutralGrayA0 = Color("#262627bd".toColorInt())
        ),
        neutralGray = NeutralGrayValuesContainer(
            neutralGray8 = Color("#fcfcfc".toColorInt()),
            neutralGray7 = Color("#f7f7f7".toColorInt()),
            neutralGray6 = Color("#f2f2f2".toColorInt()),
            neutralGray5 = Color("#ebebeb".toColorInt()),
            neutralGray4 = Color("#e3e3e3".toColorInt()),
            neutralGray3 = Color("#d6d6d6".toColorInt()),
            neutralGray2 = Color("#a6a6a6".toColorInt()),
            neutralGray1 = Color("#8a8a8a".toColorInt()),
            neutralGray0 = Color("#5e5e5e".toColorInt()),
            negative4 = Color("#212121".toColorInt()),
            negative3 = Color("#2e2e2e".toColorInt()),
            negative2 = Color("#404040".toColorInt()),
            negative1 = Color("#525252".toColorInt())
        ),
        magenta = MagentaValuesContainer1(
            negative4 = Color("#410b2f".toColorInt()),
            negative3 = Color("#671e4d".toColorInt()),
            negative2 = Color("#892969".toColorInt()),
            negative1 = Color("#953274".toColorInt()),
            magenta8 = Color("#fffafd".toColorInt()),
            magenta7 = Color("#fef6fb".toColorInt()),
            magenta6 = Color("#fdedf8".toColorInt()),
            magenta5 = Color("#fde2f4".toColorInt()),
            magenta4 = Color("#fbd5ee".toColorInt()),
            magenta3 = Color("#f7cae8".toColorInt()),
            magenta2 = Color("#ec89cb".toColorInt()),
            magenta1 = Color("#de5eb3".toColorInt()),
            magenta0 = Color("#b12f86".toColorInt())
        ),
        interaction = InteractionValuesContainer(
            neutral = NeutralValuesContainer1(
                interactionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                interactionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionNeutralSelected = Color("#3a424a".toColorInt()),
                interactionNeutralNormal = Color("#4a545e".toColorInt()),
                interactionNeutralHover = Color("#3a424a".toColorInt()),
                interactionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = InverseValuesContainer1(
                interactionInverseSelected = Color("#ffffffd1".toColorInt()),
                interactionInverseNormal = Color("#ffffff".toColorInt()),
                interactionInverseHover = Color("#ffffffd1".toColorInt()),
                interactionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = GhostValuesContainer1(
                interactionGhostSelected = Color("#022e500f".toColorInt()),
                interactionGhostNormal = Color("#ffffff00".toColorInt()),
                interactionGhostInverseSelected = Color("#ffffff1a".toColorInt()),
                interactionGhostInverseNormal = Color("#ffffff1f".toColorInt()),
                interactionGhostInverseHover = Color("#ffffff1a".toColorInt()),
                interactionGhostHover = Color("#022e500f".toColorInt()),
                interactionGhostDangerSelected = Color("#ffebeb".toColorInt()),
                interactionGhostDangerNormal = Color("#fee7e7".toColorInt()),
                interactionGhostDangerHover = Color("#ffebeb".toColorInt()),
                interactionGhostActive = Color("#10284717".toColorInt())
            ),
            focus = FocusValuesContainer(
                interactionFocusDefault = Color("#6691f4".toColorInt())
            ),
            disabled = DisabledValuesContainer(
                interactionDisabledSubtleNormal = Color("#eaedf0".toColorInt()),
                interactionDisabledSubtleHover = Color("#dee3e7".toColorInt()),
                interactionDisabledSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionDisabledNormal = Color("#9ea8b3".toColorInt()),
                interactionDisabledHover = Color("#7e8c9a".toColorInt()),
                interactionDisabledActive = Color("#555f6d".toColorInt())
            ),
            default = DefaultValuesContainer(
                interactionDefaultSubtleSelected = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleNormal = Color("#ebf0ff".toColorInt()),
                interactionDefaultSubtleHover = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleActive = Color("#ccdcff".toColorInt()),
                interactionDefaultSelected = Color("#1e4fc2".toColorInt()),
                interactionDefaultNormal = Color("#3061d5".toColorInt()),
                interactionDefaultHover = Color("#1e4fc2".toColorInt()),
                interactionDefaultActive = Color("#113997".toColorInt())
            ),
            danger = DangerValuesContainer1(
                interactionDangerSubtleSelected = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleNormal = Color("#ffebeb".toColorInt()),
                interactionDangerSubtleHover = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleActive = Color("#fccfcf".toColorInt()),
                interactionDangerSelected = Color("#952d2d".toColorInt()),
                interactionDangerNormal = Color("#c53434".toColorInt()),
                interactionDangerHover = Color("#952d2d".toColorInt()),
                interactionDangerActive = Color("#6f2020".toColorInt())
            ),
            border = BorderValuesContainer1(
                interactionBorderSelected = Color("#3061d5".toColorInt()),
                interactionBorderNormal = Color("#8eb0fb".toColorInt()),
                interactionBorderNeutralSelected = Color("#9ea8b3".toColorInt()),
                interactionBorderNeutralNormal = Color("#cfd6dd".toColorInt()),
                interactionBorderNeutralHover = Color("#9ea8b3".toColorInt()),
                interactionBorderNeutralActive = Color("#7e8c9a".toColorInt()),
                interactionBorderHover = Color("#6691f4".toColorInt()),
                interactionBorderDanger = Color("#f26363".toColorInt()),
                interactionBorderActive = Color("#2759ce".toColorInt())
            ),
            background = BackgroundValuesContainer1(
                interactionBackgroundSidepanel = Color("#ffffff".toColorInt()),
                interactionBackgroundModelessInverse = Color("#272e35".toColorInt()),
                interactionBackgroundModeless = Color("#ffffff".toColorInt()),
                interactionBackgroundModal = Color("#ffffff".toColorInt()),
                interactionBackgroundFormField = Color("#ffffff".toColorInt()),
                interactionBackgroundDimmer = Color("#182639bd".toColorInt())
            )
        ),
        green = GreenValuesContainer1(
            negative4 = Color("#0a2e0b".toColorInt()),
            negative3 = Color("#135315".toColorInt()),
            negative2 = Color("#246626".toColorInt()),
            negative1 = Color("#2f6f2f".toColorInt()),
            green8 = Color("#fbfefb".toColorInt()),
            green7 = Color("#f4fbf4".toColorInt()),
            green6 = Color("#e6f9e6".toColorInt()),
            green5 = Color("#dff6df".toColorInt()),
            green4 = Color("#cff2cf".toColorInt()),
            green3 = Color("#c6ecc6".toColorInt()),
            green2 = Color("#87c987".toColorInt()),
            green1 = Color("#55a555".toColorInt()),
            green0 = Color("#347434".toColorInt())
        ),
        cyan = CyanValuesContainer1(
            negative4 = Color("#002742".toColorInt()),
            negative3 = Color("#0c456e".toColorInt()),
            negative2 = Color("#165c8d".toColorInt()),
            negative1 = Color("#1b679d".toColorInt()),
            cyan8 = Color("#fafdff".toColorInt()),
            cyan7 = Color("#f0f9ff".toColorInt()),
            cyan6 = Color("#ebf5ff".toColorInt()),
            cyan5 = Color("#e0f1ff".toColorInt()),
            cyan4 = Color("#cce7ff".toColorInt()),
            cyan3 = Color("#c2e2ff".toColorInt()),
            cyan2 = Color("#79bcf6".toColorInt()),
            cyan1 = Color("#5699dc".toColorInt()),
            cyan0 = Color("#0870ba".toColorInt())
        ),
        coolGrayAlpha = CoolGrayAlphaValuesContainer(
            coolGrayANegative4 = Color("#09131aed".toColorInt()),
            coolGrayANegative3 = Color("#0a121ae0".toColorInt()),
            coolGrayANegative2 = Color("#1a232ddb".toColorInt()),
            coolGrayANegative1 = Color("#1d2835cc".toColorInt()),
            coolGrayA8 = Color("#1f529e05".toColorInt()),
            coolGrayA7 = Color("#00295c0a".toColorInt()),
            coolGrayA6 = Color("#022e500f".toColorInt()),
            coolGrayA5 = Color("#10284717".toColorInt()),
            coolGrayA4 = Color("#04294321".toColorInt()),
            coolGrayA3 = Color("#10315633".toColorInt()),
            coolGrayA2 = Color("#0d253f66".toColorInt()),
            coolGrayA1 = Color("#1830498f".toColorInt()),
            coolGrayA0 = Color("#182639bd".toColorInt())
        ),
        coolGray = CoolGrayValuesContainer(
            negative4 = Color("#1b242c".toColorInt()),
            negative3 = Color("#272e35".toColorInt()),
            negative2 = Color("#3a424a".toColorInt()),
            negative1 = Color("#4a545e".toColorInt()),
            coolGray8 = Color("#fcfcfd".toColorInt()),
            coolGray7 = Color("#f5f7f9".toColorInt()),
            coolGray6 = Color("#f0f3f5".toColorInt()),
            coolGray5 = Color("#eaedf0".toColorInt()),
            coolGray4 = Color("#dee3e7".toColorInt()),
            coolGray3 = Color("#cfd6dd".toColorInt()),
            coolGray2 = Color("#9ea8b3".toColorInt()),
            coolGray1 = Color("#7e8c9a".toColorInt()),
            coolGray0 = Color("#555f6d".toColorInt())
        ),
        content = ContentValuesContainer(
            warningSecondary = Color("#f59638".toColorInt()),
            warningPrimary = Color("#7a4510".toColorInt()),
            tertiaryInverse = Color("#ffffff66".toColorInt()),
            tertiary = Color("#7e8c9a".toColorInt()),
            successSecondary = Color("#347434".toColorInt()),
            successPrimary = Color("#135315".toColorInt()),
            secondaryInverse = Color("#ffffffa3".toColorInt()),
            secondary = Color("#555f6d".toColorInt()),
            primaryInverse = Color("#ffffff".toColorInt()),
            primary = Color("#272e35".toColorInt()),
            infoSecondary = Color("#3061d5".toColorInt()),
            infoPrimary = Color("#113997".toColorInt()),
            disabledInverse = Color("#ffffff3d".toColorInt()),
            disabled = Color("#9ea8b3".toColorInt()),
            dangerSecondary = Color("#c53434".toColorInt()),
            dangerPrimary = Color("#6f2020".toColorInt()),
            brandSecondary = Color("#3061d5".toColorInt()),
            brandPrimary = Color("#113997".toColorInt())
        ),
        border = BorderValuesContainer(
            warningSubtle = Color("#ffd4a8".toColorInt()),
            warningStrong = Color("#f59638".toColorInt()),
            successSubtle = Color("#c6ecc6".toColorInt()),
            successStrong = Color("#347434".toColorInt()),
            neutralSubtle = Color("#cfd6dd".toColorInt()),
            neutralStrong = Color("#555f6d".toColorInt()),
            inverse = Color("#ffffff".toColorInt()),
            infoSubtle = Color("#ccdcff".toColorInt()),
            infoStrong = Color("#3061d5".toColorInt()),
            defaultA = Color("#10284717".toColorInt()),
            default = Color("#eaedf0".toColorInt()),
            dangerSubtle = Color("#fccfcf".toColorInt()),
            dangerStrong = Color("#c53434".toColorInt())
        ),
        blue = BlueValuesContainer1(
            negative4 = Color("#041f5d".toColorInt()),
            negative3 = Color("#113997".toColorInt()),
            negative2 = Color("#1e4fc2".toColorInt()),
            negative1 = Color("#2759ce".toColorInt()),
            blue8 = Color("#fafbff".toColorInt()),
            blue7 = Color("#f5f8ff".toColorInt()),
            blue6 = Color("#ebf0ff".toColorInt()),
            blue5 = Color("#e5eeff".toColorInt()),
            blue4 = Color("#d6e3ff".toColorInt()),
            blue3 = Color("#ccdcff".toColorInt()),
            blue2 = Color("#8eb0fb".toColorInt()),
            blue1 = Color("#6691f4".toColorInt()),
            blue0 = Color("#3061d5".toColorInt())
        ),
        background = BackgroundValuesContainer(
            warningSurface = Color("#fffcfa".toColorInt()),
            warningSubtle = Color("#fff5eb".toColorInt()),
            warningStrong = Color("#f59638".toColorInt()),
            warningOnSubtle = Color("#ffe8d1".toColorInt()),
            warningMuted = Color("#fcdec0".toColorInt()),
            successSurface = Color("#fbfefb".toColorInt()),
            successSubtle = Color("#f4fbf4".toColorInt()),
            successStrong = Color("#347434".toColorInt()),
            successOnSubtle = Color("#dff6df".toColorInt()),
            successMuted = Color("#cff2cf".toColorInt()),
            neutralSurface = Color("#fcfcfd".toColorInt()),
            neutralSubtle = Color("#f5f7f9".toColorInt()),
            neutralStrong = Color("#555f6d".toColorInt()),
            neutralOnSubtle = Color("#eaedf0".toColorInt()),
            neutralMuted = Color("#dee3e7".toColorInt()),
            inverse = Color("#272e35".toColorInt()),
            infoSurface = Color("#fafbff".toColorInt()),
            infoSubtle = Color("#f5f8ff".toColorInt()),
            infoStrong = Color("#3061d5".toColorInt()),
            infoOnSubtle = Color("#e5eeff".toColorInt()),
            infoMuted = Color("#d6e3ff".toColorInt()),
            default = Color("#ffffff".toColorInt()),
            dangerSurface = Color("#fffafa".toColorInt()),
            dangerSubtle = Color("#fef5f5".toColorInt()),
            dangerStrong = Color("#c53434".toColorInt()),
            dangerOnSubtle = Color("#fee7e7".toColorInt()),
            dangerMuted = Color("#fcd9d9".toColorInt()),
            brandSurface = Color("#fafbff".toColorInt()),
            brandSubtle = Color("#f5f8ff".toColorInt()),
            brandStrong = Color("#3061d5".toColorInt()),
            brandOnSubtle = Color("#e5eeff".toColorInt()),
            brandMuted = Color("#d6e3ff".toColorInt())
        ),
        aquamarine = AquamarineValuesContainer1(
            negative4 = Color("#012d26".toColorInt()),
            negative3 = Color("#0d4a42".toColorInt()),
            negative2 = Color("#15665b".toColorInt()),
            negative1 = Color("#1a7061".toColorInt()),
            aquamarine8 = Color("#fbfefe".toColorInt()),
            aquamarine7 = Color("#f0faf9".toColorInt()),
            aquamarine6 = Color("#e2f8f5".toColorInt()),
            aquamarine5 = Color("#daf6f3".toColorInt()),
            aquamarine4 = Color("#c5f2ec".toColorInt()),
            aquamarine3 = Color("#bee9e4".toColorInt()),
            aquamarine2 = Color("#6ec9bf".toColorInt()),
            aquamarine1 = Color("#3da496".toColorInt()),
            aquamarine0 = Color("#097b68".toColorInt())
        ),
        action = ActionValuesContainer(
            success = SuccessValuesContainer(
                actionSuccessSubtleSelected = Color("#dff6df".toColorInt()),
                actionSuccessSubtleNormal = Color("#e6f9e6".toColorInt()),
                actionSuccessSubtleHover = Color("#dff6df".toColorInt()),
                actionSuccessSubtleActive = Color("#c6ecc6".toColorInt()),
                actionSuccessSelected = Color("#246626".toColorInt()),
                actionSuccessNormal = Color("#347434".toColorInt()),
                actionSuccessHover = Color("#246626".toColorInt()),
                actionSuccessActive = Color("#135315".toColorInt())
            ),
            reverseInverse = ReverseInverseValuesContainer(
                actionReverseInverseSelected = Color("#1d2835cc".toColorInt()),
                actionReverseInverseNormal = Color("#0a121ae0".toColorInt()),
                actionReverseInverseHover = Color("#1d2835cc".toColorInt()),
                actionReverseInverseActive = Color("#182639bd".toColorInt())
            ),
            primary = PrimaryValuesContainer(
                actionPrimarySubtleSelected = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleNormal = Color("#ebf0ff".toColorInt()),
                actionPrimarySubtleHover = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleActive = Color("#ccdcff".toColorInt()),
                actionPrimarySelected = Color("#1e4fc2".toColorInt()),
                actionPrimaryNormal = Color("#3061d5".toColorInt()),
                actionPrimaryHover = Color("#1e4fc2".toColorInt()),
                actionPrimaryActive = Color("#113997".toColorInt())
            ),
            outline = OutlineValuesContainer(
                actionOutlineSelected = Color("#9ea8b3".toColorInt()),
                actionOutlineNormal = Color("#cfd6dd".toColorInt()),
                actionOutlineHover = Color("#9ea8b3".toColorInt()),
                actionOutlineActive = Color("#7e8c9a".toColorInt())
            ),
            neutral = NeutralValuesContainer(
                actionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                actionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                actionNeutralSelected = Color("#3a424a".toColorInt()),
                actionNeutralNormal = Color("#4a545e".toColorInt()),
                actionNeutralHover = Color("#3a424a".toColorInt()),
                actionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = InverseValuesContainer(
                actionInverseSelected = Color("#ffffffd1".toColorInt()),
                actionInverseNormal = Color("#ffffff".toColorInt()),
                actionInverseHover = Color("#ffffffd1".toColorInt()),
                actionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = GhostValuesContainer(
                actionGhostSelected = Color("#022e500f".toColorInt()),
                actionGhostNormal = Color("#ffffff00".toColorInt()),
                actionGhostInverseSelected = Color("#ffffff1a".toColorInt()),
                actionGhostInverseHover = Color("#ffffff1a".toColorInt()),
                actionGhostInverseActive = Color("#ffffff1f".toColorInt()),
                actionGhostHover = Color("#022e500f".toColorInt()),
                actionGhostDangerSelected = Color("#ffebeb".toColorInt()),
                actionGhostDangerHover = Color("#ffebeb".toColorInt()),
                actionGhostDangerActive = Color("#fee7e7".toColorInt()),
                actionGhostActive = Color("#10284717".toColorInt())
            ),
            danger = DangerValuesContainer(
                actionDangerSubtleSelected = Color("#fee7e7".toColorInt()),
                actionDangerSubtleNormal = Color("#ffebeb".toColorInt()),
                actionDangerSubtleHover = Color("#fee7e7".toColorInt()),
                actionDangerSubtleActive = Color("#fccfcf".toColorInt()),
                actionDangerSelected = Color("#952d2d".toColorInt()),
                actionDangerNormal = Color("#c53434".toColorInt()),
                actionDangerHover = Color("#952d2d".toColorInt()),
                actionDangerActive = Color("#6f2020".toColorInt())
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