package com.b_labs.fiber_retail
import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import com.b_labs.fiber_tokens.DesignSystem
import com.b_labs.fiber_tokens.DSContent
import com.b_labs.fiber_tokens.DSBorder
import com.b_labs.fiber_tokens.DSBackground
import com.b_labs.fiber_tokens.DSPrimary
import com.b_labs.fiber_tokens.DSNeutral
import com.b_labs.fiber_tokens.DSSuccess
import com.b_labs.fiber_tokens.DSDanger
import com.b_labs.fiber_tokens.DSGhost
import com.b_labs.fiber_tokens.DSOutline
import com.b_labs.fiber_tokens.DSInverse
import com.b_labs.fiber_tokens.DSReverseInverse
import com.b_labs.fiber_tokens.DSAction
import com.b_labs.fiber_tokens.DSDefault
import com.b_labs.fiber_tokens.DSNeutral1
import com.b_labs.fiber_tokens.DSDanger1
import com.b_labs.fiber_tokens.DSGhost1
import com.b_labs.fiber_tokens.DSDisabled
import com.b_labs.fiber_tokens.DSBorder1
import com.b_labs.fiber_tokens.DSBackground1
import com.b_labs.fiber_tokens.DSInverse1
import com.b_labs.fiber_tokens.DSFocus
import com.b_labs.fiber_tokens.DSInteraction
import com.b_labs.fiber_tokens.DSGray
import com.b_labs.fiber_tokens.DSWhite
import com.b_labs.fiber_tokens.DSRed
import com.b_labs.fiber_tokens.DSMagenta
import com.b_labs.fiber_tokens.DSPurple
import com.b_labs.fiber_tokens.DSViolet
import com.b_labs.fiber_tokens.DSBlue
import com.b_labs.fiber_tokens.DSCyan
import com.b_labs.fiber_tokens.DSTeal
import com.b_labs.fiber_tokens.DSAquamarine
import com.b_labs.fiber_tokens.DSGreen
import com.b_labs.fiber_tokens.DSOrange
import com.b_labs.fiber_tokens.DSNonSemantic
import com.b_labs.fiber_tokens.DSBrand
import com.b_labs.fiber_tokens.DSNeutral2
import com.b_labs.fiber_tokens.DSNeutralAlpha
import com.b_labs.fiber_tokens.DSInfo
import com.b_labs.fiber_tokens.DSSuccess1
import com.b_labs.fiber_tokens.DSWarning
import com.b_labs.fiber_tokens.DSDanger2
import com.b_labs.fiber_tokens.DSSemantic
import com.b_labs.fiber_tokens.DSColor
import com.b_labs.fiber_tokens.DSBorderWidth
import com.b_labs.fiber_tokens.DSBorderRadius
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
            success = DSSuccess1(
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
            neutral = DSNeutral2(
                semanticNeutralNegative4 = Color("#30414f".toColorInt()),
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
            danger = DSDanger2(
                semanticDangerNegative4 = Color("#c53434".toColorInt()),
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
                semanticBrandNegative4 = Color("#15665b".toColorInt()),
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
        nonSemantic = DSNonSemantic(
            white = DSWhite(
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
            violet = DSViolet(
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
            teal = DSTeal(
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
            red = DSRed(
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
            purple = DSPurple(
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
            orange = DSOrange(
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
            magenta = DSMagenta(
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
            green = DSGreen(
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
            gray = DSGray(
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
            cyan = DSCyan(
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
            blue = DSBlue(
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
            aquamarine = DSAquamarine(
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
        interaction = DSInteraction(
            neutral = DSNeutral1(
                interactionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                interactionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionNeutralSelected = Color("#3a424a".toColorInt()),
                interactionNeutralNormal = Color("#4a545e".toColorInt()),
                interactionNeutralHover = Color("#3a424a".toColorInt()),
                interactionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = DSInverse1(
                interactionInverseSelected = Color("#ffffffd1".toColorInt()),
                interactionInverseNormal = Color("#ffffff".toColorInt()),
                interactionInverseHover = Color("#ffffffd1".toColorInt()),
                interactionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = DSGhost1(
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
            focus = DSFocus(
                interactionFocusDefault = Color("#6691f4".toColorInt())
            ),
            disabled = DSDisabled(
                interactionDisabledSubtleNormal = Color("#eaedf0".toColorInt()),
                interactionDisabledSubtleHover = Color("#dee3e7".toColorInt()),
                interactionDisabledSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionDisabledNormal = Color("#9ea8b3".toColorInt()),
                interactionDisabledHover = Color("#7e8c9a".toColorInt()),
                interactionDisabledActive = Color("#555f6d".toColorInt())
            ),
            default = DSDefault(
                interactionDefaultSubtleSelected = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleNormal = Color("#ebf0ff".toColorInt()),
                interactionDefaultSubtleHover = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleActive = Color("#ccdcff".toColorInt()),
                interactionDefaultSelected = Color("#1e4fc2".toColorInt()),
                interactionDefaultNormal = Color("#3061d5".toColorInt()),
                interactionDefaultHover = Color("#1e4fc2".toColorInt()),
                interactionDefaultActive = Color("#113997".toColorInt())
            ),
            danger = DSDanger1(
                interactionDangerSubtleSelected = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleNormal = Color("#ffebeb".toColorInt()),
                interactionDangerSubtleHover = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleActive = Color("#fccfcf".toColorInt()),
                interactionDangerSelected = Color("#952d2d".toColorInt()),
                interactionDangerNormal = Color("#c53434".toColorInt()),
                interactionDangerHover = Color("#952d2d".toColorInt()),
                interactionDangerActive = Color("#6f2020".toColorInt())
            ),
            border = DSBorder1(
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
            background = DSBackground1(
                interactionBackgroundSidepanel = Color("#ffffff".toColorInt()),
                interactionBackgroundModelessInverse = Color("#272e35".toColorInt()),
                interactionBackgroundModeless = Color("#ffffff".toColorInt()),
                interactionBackgroundModal = Color("#ffffff".toColorInt()),
                interactionBackgroundFormField = Color("#ffffff".toColorInt()),
                interactionBackgroundDimmer = Color("#182639bd".toColorInt())
            )
        ),
        content = DSContent(
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
        border = DSBorder(
            warningSubtle = Color("#fff5eb".toColorInt()),
            warningStrong = Color("#f59638".toColorInt()),
            successSubtle = Color("#f4fbf4".toColorInt()),
            successStrong = Color("#347434".toColorInt()),
            neutralSubtle = Color("#f5f7f9".toColorInt()),
            neutralStrong = Color("#555f6d".toColorInt()),
            inverse = Color("#272e35".toColorInt()),
            infoSubtle = Color("#f5f8ff".toColorInt()),
            infoStrong = Color("#3061d5".toColorInt()),
            defaultA = Color("#10284717".toColorInt()),
            default = Color("#ffffff".toColorInt()),
            dangerSubtle = Color("#fef5f5".toColorInt()),
            dangerStrong = Color("#c53434".toColorInt())
        ),
        background = DSBackground(
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
        action = DSAction(
            success = DSSuccess(
                actionSuccessSubtleSelected = Color("#dff6df".toColorInt()),
                actionSuccessSubtleNormal = Color("#e6f9e6".toColorInt()),
                actionSuccessSubtleHover = Color("#dff6df".toColorInt()),
                actionSuccessSubtleActive = Color("#c6ecc6".toColorInt()),
                actionSuccessSelected = Color("#246626".toColorInt()),
                actionSuccessNormal = Color("#347434".toColorInt()),
                actionSuccessHover = Color("#246626".toColorInt()),
                actionSuccessActive = Color("#135315".toColorInt())
            ),
            reverseInverse = DSReverseInverse(
                actionReverseInverseSelected = Color("#1d2835cc".toColorInt()),
                actionReverseInverseNormal = Color("#0a121ae0".toColorInt()),
                actionReverseInverseHover = Color("#1d2835cc".toColorInt()),
                actionReverseInverseActive = Color("#182639bd".toColorInt())
            ),
            primary = DSPrimary(
                actionPrimarySubtleSelected = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleNormal = Color("#ebf0ff".toColorInt()),
                actionPrimarySubtleHover = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleActive = Color("#ccdcff".toColorInt()),
                actionPrimarySelected = Color("#1e4fc2".toColorInt()),
                actionPrimaryNormal = Color("#c53434".toColorInt()),
                actionPrimaryHover = Color("#1e4fc2".toColorInt()),
                actionPrimaryActive = Color("#113997".toColorInt())
            ),
            outline = DSOutline(
                actionOutlineSelected = Color("#9ea8b3".toColorInt()),
                actionOutlineNormal = Color("#cfd6dd".toColorInt()),
                actionOutlineHover = Color("#9ea8b3".toColorInt()),
                actionOutlineActive = Color("#7e8c9a".toColorInt())
            ),
            neutral = DSNeutral(
                actionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                actionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                actionNeutralSelected = Color("#3a424a".toColorInt()),
                actionNeutralNormal = Color("#4a545e".toColorInt()),
                actionNeutralHover = Color("#3a424a".toColorInt()),
                actionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = DSInverse(
                actionInverseSelected = Color("#ffffffd1".toColorInt()),
                actionInverseNormal = Color("#ffffff".toColorInt()),
                actionInverseHover = Color("#ffffffd1".toColorInt()),
                actionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = DSGhost(
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
            danger = DSDanger(
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
            success = DSSuccess1(
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
            neutral = DSNeutral2(
                semanticNeutralNegative4 = Color("#30414f".toColorInt()),
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
            danger = DSDanger2(
                semanticDangerNegative4 = Color("#c53434".toColorInt()),
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
                semanticBrandNegative4 = Color("#15665b".toColorInt()),
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
        nonSemantic = DSNonSemantic(
            white = DSWhite(
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
            violet = DSViolet(
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
            teal = DSTeal(
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
            red = DSRed(
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
            purple = DSPurple(
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
            orange = DSOrange(
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
            magenta = DSMagenta(
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
            green = DSGreen(
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
            gray = DSGray(
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
            cyan = DSCyan(
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
            blue = DSBlue(
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
            aquamarine = DSAquamarine(
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
        interaction = DSInteraction(
            neutral = DSNeutral1(
                interactionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                interactionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                interactionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionNeutralSelected = Color("#3a424a".toColorInt()),
                interactionNeutralNormal = Color("#4a545e".toColorInt()),
                interactionNeutralHover = Color("#3a424a".toColorInt()),
                interactionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = DSInverse1(
                interactionInverseSelected = Color("#ffffffd1".toColorInt()),
                interactionInverseNormal = Color("#ffffff".toColorInt()),
                interactionInverseHover = Color("#ffffffd1".toColorInt()),
                interactionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = DSGhost1(
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
            focus = DSFocus(
                interactionFocusDefault = Color("#6691f4".toColorInt())
            ),
            disabled = DSDisabled(
                interactionDisabledSubtleNormal = Color("#eaedf0".toColorInt()),
                interactionDisabledSubtleHover = Color("#dee3e7".toColorInt()),
                interactionDisabledSubtleActive = Color("#cfd6dd".toColorInt()),
                interactionDisabledNormal = Color("#9ea8b3".toColorInt()),
                interactionDisabledHover = Color("#7e8c9a".toColorInt()),
                interactionDisabledActive = Color("#555f6d".toColorInt())
            ),
            default = DSDefault(
                interactionDefaultSubtleSelected = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleNormal = Color("#ebf0ff".toColorInt()),
                interactionDefaultSubtleHover = Color("#e5eeff".toColorInt()),
                interactionDefaultSubtleActive = Color("#ccdcff".toColorInt()),
                interactionDefaultSelected = Color("#1e4fc2".toColorInt()),
                interactionDefaultNormal = Color("#3061d5".toColorInt()),
                interactionDefaultHover = Color("#1e4fc2".toColorInt()),
                interactionDefaultActive = Color("#113997".toColorInt())
            ),
            danger = DSDanger1(
                interactionDangerSubtleSelected = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleNormal = Color("#ffebeb".toColorInt()),
                interactionDangerSubtleHover = Color("#fee7e7".toColorInt()),
                interactionDangerSubtleActive = Color("#fccfcf".toColorInt()),
                interactionDangerSelected = Color("#952d2d".toColorInt()),
                interactionDangerNormal = Color("#c53434".toColorInt()),
                interactionDangerHover = Color("#952d2d".toColorInt()),
                interactionDangerActive = Color("#6f2020".toColorInt())
            ),
            border = DSBorder1(
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
            background = DSBackground1(
                interactionBackgroundSidepanel = Color("#ffffff".toColorInt()),
                interactionBackgroundModelessInverse = Color("#272e35".toColorInt()),
                interactionBackgroundModeless = Color("#ffffff".toColorInt()),
                interactionBackgroundModal = Color("#ffffff".toColorInt()),
                interactionBackgroundFormField = Color("#ffffff".toColorInt()),
                interactionBackgroundDimmer = Color("#182639bd".toColorInt())
            )
        ),
        content = DSContent(
            warningSecondary = Color("#f59638".toColorInt()),
            warningPrimary = Color("#7a4510".toColorInt()),
            tertiaryInverse = Color("#ffffff66".toColorInt()),
            tertiary = Color("#7e8c9a".toColorInt()),
            successSecondary = Color("#347434".toColorInt()),
            successPrimary = Color("#135315".toColorInt()),
            secondaryInverse = Color("#ffffffa3".toColorInt()),
            secondary = Color("#555f6d".toColorInt()),
            primaryInverse = Color("#ffffff".toColorInt()),
            primary = Color("#952d2d".toColorInt()),
            infoSecondary = Color("#3061d5".toColorInt()),
            infoPrimary = Color("#113997".toColorInt()),
            disabledInverse = Color("#ffffff3d".toColorInt()),
            disabled = Color("#9ea8b3".toColorInt()),
            dangerSecondary = Color("#c53434".toColorInt()),
            dangerPrimary = Color("#6f2020".toColorInt()),
            brandSecondary = Color("#3061d5".toColorInt()),
            brandPrimary = Color("#113997".toColorInt())
        ),
        border = DSBorder(
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
        background = DSBackground(
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
        action = DSAction(
            success = DSSuccess(
                actionSuccessSubtleSelected = Color("#dff6df".toColorInt()),
                actionSuccessSubtleNormal = Color("#e6f9e6".toColorInt()),
                actionSuccessSubtleHover = Color("#dff6df".toColorInt()),
                actionSuccessSubtleActive = Color("#c6ecc6".toColorInt()),
                actionSuccessSelected = Color("#246626".toColorInt()),
                actionSuccessNormal = Color("#347434".toColorInt()),
                actionSuccessHover = Color("#246626".toColorInt()),
                actionSuccessActive = Color("#135315".toColorInt())
            ),
            reverseInverse = DSReverseInverse(
                actionReverseInverseSelected = Color("#1d2835cc".toColorInt()),
                actionReverseInverseNormal = Color("#0a121ae0".toColorInt()),
                actionReverseInverseHover = Color("#1d2835cc".toColorInt()),
                actionReverseInverseActive = Color("#182639bd".toColorInt())
            ),
            primary = DSPrimary(
                actionPrimarySubtleSelected = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleNormal = Color("#ebf0ff".toColorInt()),
                actionPrimarySubtleHover = Color("#e5eeff".toColorInt()),
                actionPrimarySubtleActive = Color("#ccdcff".toColorInt()),
                actionPrimarySelected = Color("#1e4fc2".toColorInt()),
                actionPrimaryNormal = Color("#3061d5".toColorInt()),
                actionPrimaryHover = Color("#1e4fc2".toColorInt()),
                actionPrimaryActive = Color("#113997".toColorInt())
            ),
            outline = DSOutline(
                actionOutlineSelected = Color("#9ea8b3".toColorInt()),
                actionOutlineNormal = Color("#cfd6dd".toColorInt()),
                actionOutlineHover = Color("#9ea8b3".toColorInt()),
                actionOutlineActive = Color("#7e8c9a".toColorInt())
            ),
            neutral = DSNeutral(
                actionNeutralSubtleSelected = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleNormal = Color("#f0f3f5".toColorInt()),
                actionNeutralSubtleHover = Color("#eaedf0".toColorInt()),
                actionNeutralSubtleActive = Color("#cfd6dd".toColorInt()),
                actionNeutralSelected = Color("#3a424a".toColorInt()),
                actionNeutralNormal = Color("#4a545e".toColorInt()),
                actionNeutralHover = Color("#3a424a".toColorInt()),
                actionNeutralActive = Color("#272e35".toColorInt())
            ),
            inverse = DSInverse(
                actionInverseSelected = Color("#ffffffd1".toColorInt()),
                actionInverseNormal = Color("#ffffff".toColorInt()),
                actionInverseHover = Color("#ffffffd1".toColorInt()),
                actionInverseActive = Color("#ffffffb8".toColorInt())
            ),
            ghost = DSGhost(
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
            danger = DSDanger(
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
    borderWidth = DSBorderWidth(
        xLarge = 8.0,
        small = 1.0,
        none = 0.0,
        medium = 2.0,
        large = 4.0,
        focus = 2.0
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