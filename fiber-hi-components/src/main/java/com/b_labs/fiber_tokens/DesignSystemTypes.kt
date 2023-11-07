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
    val borderWidth: DSBorderWidth,
    val borderRadius: DSBorderRadius,
    val size: DSSize,
    val space: DSSpace,
    val opacity: DSOpacity,
    val typography: DSTypography,
) {
    val color: DSColor get() = if (isDark) colorDark else colorLight
}

data class DSPrimary (
    val `value`: String, 
    val type: String, 
    val description: String, 
)

data class DSContent (
    val warningSecondary: Color, 
    val warningPrimary: Color, 
    val tertiaryInverse: Color, 
    val tertiary: Color, 
    val successSecondary: Color, 
    val successPrimary: Color, 
    val secondaryInverse: Color, 
    val secondary: Color, 
    val primaryInverse: Color, 
    val primary: DSPrimary, 
    val infoSecondary: Color, 
    val infoPrimary: Color, 
    val disabledInverse: Color, 
    val disabled: Color, 
    val dangerSecondary: Color, 
    val dangerPrimary: Color, 
    val brandSecondary: Color, 
    val brandPrimary: Color, 
)

data class DSBorder (
    val warningSubtle: Color, 
    val warningStrong: Color, 
    val successSubtle: Color, 
    val successStrong: Color, 
    val neutralSubtle: Color, 
    val neutralStrong: Color, 
    val inverse: Color, 
    val infoSubtle: Color, 
    val infoStrong: Color, 
    val defaultA: Color, 
    val default: Color, 
    val dangerSubtle: Color, 
    val dangerStrong: Color, 
)

data class DSBackground (
    val warningSurface: Color, 
    val warningSubtle: Color, 
    val warningStrong: Color, 
    val warningOnSubtle: Color, 
    val warningMuted: Color, 
    val successSurface: Color, 
    val successSubtle: Color, 
    val successStrong: Color, 
    val successOnSubtle: Color, 
    val successMuted: Color, 
    val neutralSurface: Color, 
    val neutralSubtle: Color, 
    val neutralStrong: Color, 
    val neutralOnSubtle: Color, 
    val neutralMuted: Color, 
    val inverse: Color, 
    val infoSurface: Color, 
    val infoSubtle: Color, 
    val infoStrong: Color, 
    val infoOnSubtle: Color, 
    val infoMuted: Color, 
    val default: Color, 
    val dangerSurface: Color, 
    val dangerSubtle: Color, 
    val dangerStrong: Color, 
    val dangerOnSubtle: Color, 
    val dangerMuted: Color, 
    val brandSurface: Color, 
    val brandSubtle: Color, 
    val brandStrong: Color, 
    val brandOnSubtle: Color, 
    val brandMuted: Color, 
)

data class DSPrimary1 (
    val actionPrimarySubtleSelected: Color, 
    val actionPrimarySubtleNormal: Color, 
    val actionPrimarySubtleHover: Color, 
    val actionPrimarySubtleActive: Color, 
    val actionPrimarySelected: Color, 
    val actionPrimaryNormal: Color, 
    val actionPrimaryHover: Color, 
    val actionPrimaryActive: Color, 
)

data class DSNeutral (
    val actionNeutralSubtleSelected: Color, 
    val actionNeutralSubtleNormal: Color, 
    val actionNeutralSubtleHover: Color, 
    val actionNeutralSubtleActive: Color, 
    val actionNeutralSelected: Color, 
    val actionNeutralNormal: Color, 
    val actionNeutralHover: Color, 
    val actionNeutralActive: Color, 
)

data class DSSuccess (
    val actionSuccessSubtleSelected: Color, 
    val actionSuccessSubtleNormal: Color, 
    val actionSuccessSubtleHover: Color, 
    val actionSuccessSubtleActive: Color, 
    val actionSuccessSelected: Color, 
    val actionSuccessNormal: Color, 
    val actionSuccessHover: Color, 
    val actionSuccessActive: Color, 
)

data class DSDanger (
    val actionDangerSubtleSelected: Color, 
    val actionDangerSubtleNormal: Color, 
    val actionDangerSubtleHover: Color, 
    val actionDangerSubtleActive: Color, 
    val actionDangerSelected: Color, 
    val actionDangerNormal: Color, 
    val actionDangerHover: Color, 
    val actionDangerActive: Color, 
)

data class DSGhost (
    val actionGhostSelected: Color, 
    val actionGhostNormal: Color, 
    val actionGhostInverseSelected: Color, 
    val actionGhostInverseHover: Color, 
    val actionGhostInverseActive: Color, 
    val actionGhostHover: Color, 
    val actionGhostDangerSelected: Color, 
    val actionGhostDangerHover: Color, 
    val actionGhostDangerActive: Color, 
    val actionGhostActive: Color, 
)

data class DSOutline (
    val actionOutlineSelected: Color, 
    val actionOutlineNormal: Color, 
    val actionOutlineHover: Color, 
    val actionOutlineActive: Color, 
)

data class DSInverse (
    val actionInverseSelected: Color, 
    val actionInverseNormal: Color, 
    val actionInverseHover: Color, 
    val actionInverseActive: Color, 
)

data class DSReverseInverse (
    val actionReverseInverseSelected: Color, 
    val actionReverseInverseNormal: Color, 
    val actionReverseInverseHover: Color, 
    val actionReverseInverseActive: Color, 
)

data class DSAction (
    val success: DSSuccess, 
    val reverseInverse: DSReverseInverse, 
    val primary: DSPrimary1, 
    val outline: DSOutline, 
    val neutral: DSNeutral, 
    val inverse: DSInverse, 
    val ghost: DSGhost, 
    val danger: DSDanger, 
)

data class DSDefault (
    val interactionDefaultSubtleSelected: Color, 
    val interactionDefaultSubtleNormal: Color, 
    val interactionDefaultSubtleHover: Color, 
    val interactionDefaultSubtleActive: Color, 
    val interactionDefaultSelected: Color, 
    val interactionDefaultNormal: Color, 
    val interactionDefaultHover: Color, 
    val interactionDefaultActive: Color, 
)

data class DSNeutral1 (
    val interactionNeutralSubtleSelected: Color, 
    val interactionNeutralSubtleNormal: Color, 
    val interactionNeutralSubtleHover: Color, 
    val interactionNeutralSubtleActive: Color, 
    val interactionNeutralSelected: Color, 
    val interactionNeutralNormal: Color, 
    val interactionNeutralHover: Color, 
    val interactionNeutralActive: Color, 
)

data class DSDanger1 (
    val interactionDangerSubtleSelected: Color, 
    val interactionDangerSubtleNormal: Color, 
    val interactionDangerSubtleHover: Color, 
    val interactionDangerSubtleActive: Color, 
    val interactionDangerSelected: Color, 
    val interactionDangerNormal: Color, 
    val interactionDangerHover: Color, 
    val interactionDangerActive: Color, 
)

data class DSGhost1 (
    val interactionGhostSelected: Color, 
    val interactionGhostNormal: Color, 
    val interactionGhostInverseSelected: Color, 
    val interactionGhostInverseNormal: Color, 
    val interactionGhostInverseHover: Color, 
    val interactionGhostHover: Color, 
    val interactionGhostDangerSelected: Color, 
    val interactionGhostDangerNormal: Color, 
    val interactionGhostDangerHover: Color, 
    val interactionGhostActive: Color, 
)

data class DSDisabled (
    val interactionDisabledSubtleNormal: Color, 
    val interactionDisabledSubtleHover: Color, 
    val interactionDisabledSubtleActive: Color, 
    val interactionDisabledNormal: Color, 
    val interactionDisabledHover: Color, 
    val interactionDisabledActive: Color, 
)

data class DSBorder1 (
    val interactionBorderSelected: Color, 
    val interactionBorderNormal: Color, 
    val interactionBorderNeutralSelected: Color, 
    val interactionBorderNeutralNormal: Color, 
    val interactionBorderNeutralHover: Color, 
    val interactionBorderNeutralActive: Color, 
    val interactionBorderHover: Color, 
    val interactionBorderDanger: Color, 
    val interactionBorderActive: Color, 
)

data class DSBackground1 (
    val interactionBackgroundSidepanel: Color, 
    val interactionBackgroundModelessInverse: Color, 
    val interactionBackgroundModeless: Color, 
    val interactionBackgroundModal: Color, 
    val interactionBackgroundFormField: Color, 
    val interactionBackgroundDimmer: Color, 
)

data class DSInverse1 (
    val interactionInverseSelected: Color, 
    val interactionInverseNormal: Color, 
    val interactionInverseHover: Color, 
    val interactionInverseActive: Color, 
)

data class DSFocus (
    val interactionFocusDefault: Color, 
)

data class DSInteraction (
    val neutral: DSNeutral1, 
    val inverse: DSInverse1, 
    val ghost: DSGhost1, 
    val focus: DSFocus, 
    val disabled: DSDisabled, 
    val default: DSDefault, 
    val danger: DSDanger1, 
    val border: DSBorder1, 
    val background: DSBackground1, 
)

data class DSGray (
    val nonSemanticGrayContentSecondary: Color, 
    val nonSemanticGrayContentPrimary: Color, 
    val nonSemanticGrayBorderSubtle: Color, 
    val nonSemanticGrayBorderStrong: Color, 
    val nonSemanticGrayBorderDefault: Color, 
    val nonSemanticGrayBackgroundSurface: Color, 
    val nonSemanticGrayBackgroundSubtle: Color, 
    val nonSemanticGrayBackgroundStrong: Color, 
    val nonSemanticGrayBackgroundOnSubtle: Color, 
    val nonSemanticGrayBackgroundMuted: Color, 
)

data class DSWhite (
    val nonSemanticWhiteContentSecondary: Color, 
    val nonSemanticWhiteContentPrimary: Color, 
    val nonSemanticWhiteBorderSubtle: Color, 
    val nonSemanticWhiteBorderStrong: Color, 
    val nonSemanticWhiteBorderDefault: Color, 
    val nonSemanticWhiteBackgroundSurface: Color, 
    val nonSemanticWhiteBackgroundSubtle: Color, 
    val nonSemanticWhiteBackgroundStrong: Color, 
    val nonSemanticWhiteBackgroundOnSubtle: Color, 
    val nonSemanticWhiteBackgroundMuted: Color, 
)

data class DSRed (
    val nonSemanticRedContentSecondary: Color, 
    val nonSemanticRedContentPrimary: Color, 
    val nonSemanticRedBorderSubtle: Color, 
    val nonSemanticRedBorderStrong: Color, 
    val nonSemanticRedBorderDefault: Color, 
    val nonSemanticRedBackgroundSurface: Color, 
    val nonSemanticRedBackgroundSubtle: Color, 
    val nonSemanticRedBackgroundStrong: Color, 
    val nonSemanticRedBackgroundOnSubtle: Color, 
    val nonSemanticRedBackgroundMuted: Color, 
)

data class DSMagenta (
    val nonSemanticMagentaContentSecondary: Color, 
    val nonSemanticMagentaContentPrimary: Color, 
    val nonSemanticMagentaBorderSubtle: Color, 
    val nonSemanticMagentaBorderStrong: Color, 
    val nonSemanticMagentaBorderDefault: Color, 
    val nonSemanticMagentaBackgroundSurface: Color, 
    val nonSemanticMagentaBackgroundSubtle: Color, 
    val nonSemanticMagentaBackgroundStrong: Color, 
    val nonSemanticMagentaBackgroundOnSubtle: Color, 
    val nonSemanticMagentaBackgroundMuted: Color, 
)

data class DSPurple (
    val nonSemanticPurpleContentSecondary: Color, 
    val nonSemanticPurpleContentPrimary: Color, 
    val nonSemanticPurpleBorderSubtle: Color, 
    val nonSemanticPurpleBorderStrong: Color, 
    val nonSemanticPurpleBorderDefault: Color, 
    val nonSemanticPurpleBackgroundSurface: Color, 
    val nonSemanticPurpleBackgroundSubtle: Color, 
    val nonSemanticPurpleBackgroundStrong: Color, 
    val nonSemanticPurpleBackgroundOnSubtle: Color, 
    val nonSemanticPurpleBackgroundMuted: Color, 
)

data class DSViolet (
    val nonSemanticVioletContentSecondary: Color, 
    val nonSemanticVioletContentPrimary: Color, 
    val nonSemanticVioletBorderSubtle: Color, 
    val nonSemanticVioletBorderStrong: Color, 
    val nonSemanticVioletBorderDefault: Color, 
    val nonSemanticVioletBackgroundSurface: Color, 
    val nonSemanticVioletBackgroundSubtle: Color, 
    val nonSemanticVioletBackgroundStrong: Color, 
    val nonSemanticVioletBackgroundOnSubtle: Color, 
    val nonSemanticVioletBackgroundMuted: Color, 
)

data class DSBlue (
    val nonSemanticBlueContentSecondary: Color, 
    val nonSemanticBlueContentPrimary: Color, 
    val nonSemanticBlueBorderSubtle: Color, 
    val nonSemanticBlueBorderStrong: Color, 
    val nonSemanticBlueBorderDefault: Color, 
    val nonSemanticBlueBackgroundSurface: Color, 
    val nonSemanticBlueBackgroundSubtle: Color, 
    val nonSemanticBlueBackgroundStrong: Color, 
    val nonSemanticBlueBackgroundOnSubtle: Color, 
    val nonSemanticBlueBackgroundMuted: Color, 
)

data class DSCyan (
    val nonSemanticCyanContentSecondary: Color, 
    val nonSemanticCyanContentPrimary: Color, 
    val nonSemanticCyanBorderSubtle: Color, 
    val nonSemanticCyanBorderStrong: Color, 
    val nonSemanticCyanBorderDefault: Color, 
    val nonSemanticCyanBackgroundSurface: Color, 
    val nonSemanticCyanBackgroundSubtle: Color, 
    val nonSemanticCyanBackgroundStrong: Color, 
    val nonSemanticCyanBackgroundOnSubtle: Color, 
    val nonSemanticCyanBackgroundMuted: Color, 
)

data class DSTeal (
    val nonSemanticTealContentSecondary: Color, 
    val nonSemanticTealContentPrimary: Color, 
    val nonSemanticTealBorderSubtle: Color, 
    val nonSemanticTealBorderStrong: Color, 
    val nonSemanticTealBorderDefault: Color, 
    val nonSemanticTealBackgroundSurface: Color, 
    val nonSemanticTealBackgroundSubtle: Color, 
    val nonSemanticTealBackgroundStrong: Color, 
    val nonSemanticTealBackgroundOnSubtle: Color, 
    val nonSemanticTealBackgroundMuted: Color, 
)

data class DSAquamarine (
    val nonSemanticAquamarineContentSecondary: Color, 
    val nonSemanticAquamarineContentPrimary: Color, 
    val nonSemanticAquamarineBorderSubtle: Color, 
    val nonSemanticAquamarineBorderStrong: Color, 
    val nonSemanticAquamarineBorderDefault: Color, 
    val nonSemanticAquamarineBackgroundSurface: Color, 
    val nonSemanticAquamarineBackgroundSubtle: Color, 
    val nonSemanticAquamarineBackgroundStrong: Color, 
    val nonSemanticAquamarineBackgroundOnSubtle: Color, 
    val nonSemanticAquamarineBackgroundMuted: Color, 
)

data class DSGreen (
    val nonSemanticGreenContentSecondary: Color, 
    val nonSemanticGreenContentPrimary: Color, 
    val nonSemanticGreenBorderSubtle: Color, 
    val nonSemanticGreenBorderStrong: Color, 
    val nonSemanticGreenBorderDefault: Color, 
    val nonSemanticGreenBackgroundSurface: Color, 
    val nonSemanticGreenBackgroundSubtle: Color, 
    val nonSemanticGreenBackgroundStrong: Color, 
    val nonSemanticGreenBackgroundOnSubtle: Color, 
    val nonSemanticGreenBackgroundMuted: Color, 
)

data class DSOrange (
    val nonSemanticOrangeContentSecondary: Color, 
    val nonSemanticOrangeContentPrimary: Color, 
    val nonSemanticOrangeBorderSubtle: Color, 
    val nonSemanticOrangeBorderStrong: Color, 
    val nonSemanticOrangeBorderDefault: Color, 
    val nonSemanticOrangeBackgroundSurface: Color, 
    val nonSemanticOrangeBackgroundSubtle: Color, 
    val nonSemanticOrangeBackgroundStrong: Color, 
    val nonSemanticOrangeBackgroundOnSubtle: Color, 
    val nonSemanticOrangeBackgroundMuted: Color, 
)

data class DSNonSemantic (
    val white: DSWhite, 
    val violet: DSViolet, 
    val teal: DSTeal, 
    val red: DSRed, 
    val purple: DSPurple, 
    val orange: DSOrange, 
    val magenta: DSMagenta, 
    val green: DSGreen, 
    val gray: DSGray, 
    val cyan: DSCyan, 
    val blue: DSBlue, 
    val aquamarine: DSAquamarine, 
)

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

data class DSNeutral2 (
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

data class DSSuccess1 (
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

data class DSDanger2 (
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
    val success: DSSuccess1, 
    val neutralAlpha: DSNeutralAlpha, 
    val neutral: DSNeutral2, 
    val info: DSInfo, 
    val danger: DSDanger2, 
    val brand: DSBrand, 
)

data class DSColor (
    val semantic: DSSemantic, 
    val nonSemantic: DSNonSemantic, 
    val interaction: DSInteraction, 
    val content: DSContent, 
    val border: DSBorder, 
    val background: DSBackground, 
    val action: DSAction, 
)

data class DSBorderWidth (
    val xLarge: Double, 
    val small: Double, 
    val none: Double, 
    val medium: Double, 
    val large: Double, 
    val focus: Double, 
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