package com.b_labs.fiber_tokens


import androidx.compose.ui.graphics.Color

data class DesignSystem(
    val color: ColorValuesContainer1,
    val borderWidth: BorderWidthValuesContainer1,
    val size: SizeValuesContainer1,
    val space: SpaceValuesContainer1,
    val opacity: OpacityValuesContainer1,
    val typography: TypographyValuesContainer1,
    val dimension: DimensionValuesContainer1,
    val elevation: ElevationValuesContainer1,
    val fontFamily: FontFamilyValuesContainer1,
    val fontSize: FontSizeValuesContainer1,
    val fontWeight: FontWeightValuesContainer1,
    val letterSpacing: LetterSpacingValuesContainer1,
    val lineHeight: LineHeightValuesContainer1,
)

data class ContentValuesContainer(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val disabled: Color,
    val primaryInverse: Color,
    val secondaryInverse: Color,
    val tertiaryInverse: Color,
    val disabledInverse: Color,
    val infoPrimary: Color,
    val infoSecondary: Color,
    val successPrimary: Color,
    val successSecondary: Color,
    val warningPrimary: Color,
    val warningSecondary: Color,
    val dangerPrimary: Color,
    val dangerSecondary: Color,
    val brandPrimary: Color,
    val brandSecondary: Color
)

data class BorderValuesContainer(
    val default: Color,
    val defaultA: Color,
    val inverse: Color,
    val neutralStrong: Color,
    val neutralSubtle: Color,
    val infoStrong: Color,
    val infoSubtle: Color,
    val successStrong: Color,
    val successSubtle: Color,
    val warningStrong: Color,
    val warningSubtle: Color,
    val dangerStrong: Color,
    val dangerSubtle: Color
)

data class BackgroundValuesContainer(
    val default: Color,
    val inverse: Color,
    val neutralStrong: Color,
    val neutralMuted: Color,
    val neutralOnSubtle: Color,
    val neutralSubtle: Color,
    val neutralSurface: Color,
    val infoStrong: Color,
    val infoMuted: Color,
    val infoOnSubtle: Color,
    val infoSubtle: Color,
    val infoSurface: Color,
    val successStrong: Color,
    val successMuted: Color,
    val successOnSubtle: Color,
    val successSubtle: Color,
    val successSurface: Color,
    val warningStrong: Color,
    val warningMuted: Color,
    val warningOnSubtle: Color,
    val warningSubtle: Color,
    val warningSurface: Color,
    val dangerStrong: Color,
    val dangerMuted: Color,
    val dangerOnSubtle: Color,
    val dangerSubtle: Color,
    val dangerSurface: Color,
    val brandStrong: Color,
    val brandMuted: Color,
    val brandOnSubtle: Color,
    val brandSurface: Color,
    val brandSubtle: Color
)

data class PrimaryValuesContainer(
    val actionPrimaryNormal: Color,
    val actionPrimaryHover: Color,
    val actionPrimaryActive: Color,
    val actionPrimarySelected: Color,
    val actionPrimarySubtleNormal: Color,
    val actionPrimarySubtleHover: Color,
    val actionPrimarySubtleActive: Color,
    val actionPrimarySubtleSelected: Color
)

data class NeutralValuesContainer(
    val actionNeutralNormal: Color,
    val actionNeutralHover: Color,
    val actionNeutralActive: Color,
    val actionNeutralSelected: Color,
    val actionNeutralSubtleNormal: Color,
    val actionNeutralSubtleHover: Color,
    val actionNeutralSubtleActive: Color,
    val actionNeutralSubtleSelected: Color
)

data class SuccessValuesContainer(
    val actionSuccessNormal: Color,
    val actionSuccessHover: Color,
    val actionSuccessActive: Color,
    val actionSuccessSelected: Color,
    val actionSuccessSubtleNormal: Color,
    val actionSuccessSubtleHover: Color,
    val actionSuccessSubtleActive: Color,
    val actionSuccessSubtleSelected: Color
)

data class DangerValuesContainer(
    val actionDangerNormal: Color,
    val actionDangerHover: Color,
    val actionDangerActive: Color,
    val actionDangerSelected: Color,
    val actionDangerSubtleNormal: Color,
    val actionDangerSubtleHover: Color,
    val actionDangerSubtleActive: Color,
    val actionDangerSubtleSelected: Color
)

data class GhostValuesContainer(
    val actionGhostNormal: Color,
    val actionGhostHover: Color,
    val actionGhostActive: Color,
    val actionGhostSelected: Color,
    val actionGhostInverseHover: Color,
    val actionGhostInverseActive: Color,
    val actionGhostInverseSelected: Color,
    val actionGhostDangerHover: Color,
    val actionGhostDangerActive: Color,
    val actionGhostDangerSelected: Color
)

data class OutlineValuesContainer(
    val actionOutlineNormal: Color,
    val actionOutlineHover: Color,
    val actionOutlineActive: Color,
    val actionOutlineSelected: Color
)

data class InverseValuesContainer(
    val actionInverseNormal: Color,
    val actionInverseHover: Color,
    val actionInverseActive: Color,
    val actionInverseSelected: Color
)

data class ReverseInverseValuesContainer(
    val actionReverseInverseNormal: Color,
    val actionReverseInverseHover: Color,
    val actionReverseInverseActive: Color,
    val actionReverseInverseSelected: Color
)

data class ActionValuesContainer(
    val primary: PrimaryValuesContainer,
    val neutral: NeutralValuesContainer,
    val success: SuccessValuesContainer,
    val danger: DangerValuesContainer,
    val ghost: GhostValuesContainer,
    val outline: OutlineValuesContainer,
    val inverse: InverseValuesContainer,
    val reverseInverse: ReverseInverseValuesContainer
)

data class DefaultValuesContainer(
    val interactionDefaultNormal: Color,
    val interactionDefaultHover: Color,
    val interactionDefaultActive: Color,
    val interactionDefaultSelected: Color,
    val interactionDefaultSubtleNormal: Color,
    val interactionDefaultSubtleHover: Color,
    val interactionDefaultSubtleActive: Color,
    val interactionDefaultSubtleSelected: Color
)

data class NeutralValuesContainer1(
    val interactionNeutralNormal: Color,
    val interactionNeutralHover: Color,
    val interactionNeutralActive: Color,
    val interactionNeutralSelected: Color,
    val interactionNeutralSubtleNormal: Color,
    val interactionNeutralSubtleHover: Color,
    val interactionNeutralSubtleActive: Color,
    val interactionNeutralSubtleSelected: Color
)

data class DangerValuesContainer1(
    val interactionDangerNormal: Color,
    val interactionDangerHover: Color,
    val interactionDangerActive: Color,
    val interactionDangerSelected: Color,
    val interactionDangerSubtleNormal: Color,
    val interactionDangerSubtleHover: Color,
    val interactionDangerSubtleActive: Color,
    val interactionDangerSubtleSelected: Color
)

data class GhostValuesContainer1(
    val interactionGhostNormal: Color,
    val interactionGhostHover: Color,
    val interactionGhostActive: Color,
    val interactionGhostSelected: Color,
    val interactionGhostInverseHover: Color,
    val interactionGhostInverseNormal: Color,
    val interactionGhostInverseSelected: Color,
    val interactionGhostDangerHover: Color,
    val interactionGhostDangerNormal: Color,
    val interactionGhostDangerSelected: Color
)

data class DisabledValuesContainer(
    val interactionDisabledNormal: Color,
    val interactionDisabledHover: Color,
    val interactionDisabledActive: Color,
    val interactionDisabledSubtleNormal: Color,
    val interactionDisabledSubtleHover: Color,
    val interactionDisabledSubtleActive: Color
)

data class BorderValuesContainer1(
    val interactionBorderNormal: Color,
    val interactionBorderHover: Color,
    val interactionBorderActive: Color,
    val interactionBorderSelected: Color,
    val interactionBorderNeutralNormal: Color,
    val interactionBorderNeutralHover: Color,
    val interactionBorderNeutralActive: Color,
    val interactionBorderNeutralSelected: Color,
    val interactionBorderDanger: Color
)

data class BackgroundValuesContainer1(
    val interactionBackgroundModal: Color,
    val interactionBackgroundModeless: Color,
    val interactionBackgroundModelessInverse: Color,
    val interactionBackgroundSidepanel: Color,
    val interactionBackgroundFormField: Color,
    val interactionBackgroundDimmer: Color
)

data class InverseValuesContainer1(
    val interactionInverseNormal: Color,
    val interactionInverseHover: Color,
    val interactionInverseActive: Color,
    val interactionInverseSelected: Color
)

data class FocusValuesContainer(
    val interactionFocusDefault: Color
)

data class InteractionValuesContainer(
    val default: DefaultValuesContainer,
    val neutral: NeutralValuesContainer1,
    val danger: DangerValuesContainer1,
    val ghost: GhostValuesContainer1,
    val disabled: DisabledValuesContainer,
    val border: BorderValuesContainer1,
    val background: BackgroundValuesContainer1,
    val inverse: InverseValuesContainer1,
    val focus: FocusValuesContainer
)

data class GrayValuesContainer(
    val nonSemanticGrayContentPrimary: Color,
    val nonSemanticGrayContentSecondary: Color,
    val nonSemanticGrayBorderDefault: Color,
    val nonSemanticGrayBorderStrong: Color,
    val nonSemanticGrayBorderSubtle: Color,
    val nonSemanticGrayBackgroundStrong: Color,
    val nonSemanticGrayBackgroundMuted: Color,
    val nonSemanticGrayBackgroundOnSubtle: Color,
    val nonSemanticGrayBackgroundSubtle: Color,
    val nonSemanticGrayBackgroundSurface: Color
)

data class WhiteValuesContainer(
    val nonSemanticWhiteContentPrimary: Color,
    val nonSemanticWhiteContentSecondary: Color,
    val nonSemanticWhiteBorderDefault: Color,
    val nonSemanticWhiteBorderStrong: Color,
    val nonSemanticWhiteBorderSubtle: Color,
    val nonSemanticWhiteBackgroundStrong: Color,
    val nonSemanticWhiteBackgroundMuted: Color,
    val nonSemanticWhiteBackgroundOnSubtle: Color,
    val nonSemanticWhiteBackgroundSubtle: Color,
    val nonSemanticWhiteBackgroundSurface: Color
)

data class RedValuesContainer(
    val nonSemanticRedContentPrimary: Color,
    val nonSemanticRedContentSecondary: Color,
    val nonSemanticRedBorderDefault: Color,
    val nonSemanticRedBorderStrong: Color,
    val nonSemanticRedBorderSubtle: Color,
    val nonSemanticRedBackgroundStrong: Color,
    val nonSemanticRedBackgroundMuted: Color,
    val nonSemanticRedBackgroundOnSubtle: Color,
    val nonSemanticRedBackgroundSubtle: Color,
    val nonSemanticRedBackgroundSurface: Color
)

data class MagentaValuesContainer(
    val nonSemanticMagentaContentPrimary: Color,
    val nonSemanticMagentaContentSecondary: Color,
    val nonSemanticMagentaBorderDefault: Color,
    val nonSemanticMagentaBorderStrong: Color,
    val nonSemanticMagentaBorderSubtle: Color,
    val nonSemanticMagentaBackgroundStrong: Color,
    val nonSemanticMagentaBackgroundMuted: Color,
    val nonSemanticMagentaBackgroundOnSubtle: Color,
    val nonSemanticMagentaBackgroundSubtle: Color,
    val nonSemanticMagentaBackgroundSurface: Color
)

data class PurpleValuesContainer(
    val nonSemanticPurpleContentPrimary: Color,
    val nonSemanticPurpleContentSecondary: Color,
    val nonSemanticPurpleBorderDefault: Color,
    val nonSemanticPurpleBorderStrong: Color,
    val nonSemanticPurpleBorderSubtle: Color,
    val nonSemanticPurpleBackgroundStrong: Color,
    val nonSemanticPurpleBackgroundMuted: Color,
    val nonSemanticPurpleBackgroundOnSubtle: Color,
    val nonSemanticPurpleBackgroundSubtle: Color,
    val nonSemanticPurpleBackgroundSurface: Color
)

data class VioletValuesContainer(
    val nonSemanticVioletContentPrimary: Color,
    val nonSemanticVioletContentSecondary: Color,
    val nonSemanticVioletBorderDefault: Color,
    val nonSemanticVioletBorderStrong: Color,
    val nonSemanticVioletBorderSubtle: Color,
    val nonSemanticVioletBackgroundStrong: Color,
    val nonSemanticVioletBackgroundMuted: Color,
    val nonSemanticVioletBackgroundOnSubtle: Color,
    val nonSemanticVioletBackgroundSubtle: Color,
    val nonSemanticVioletBackgroundSurface: Color
)

data class BlueValuesContainer(
    val nonSemanticBlueContentPrimary: Color,
    val nonSemanticBlueContentSecondary: Color,
    val nonSemanticBlueBorderDefault: Color,
    val nonSemanticBlueBorderStrong: Color,
    val nonSemanticBlueBorderSubtle: Color,
    val nonSemanticBlueBackgroundStrong: Color,
    val nonSemanticBlueBackgroundMuted: Color,
    val nonSemanticBlueBackgroundOnSubtle: Color,
    val nonSemanticBlueBackgroundSubtle: Color,
    val nonSemanticBlueBackgroundSurface: Color
)

data class CyanValuesContainer(
    val nonSemanticCyanContentPrimary: Color,
    val nonSemanticCyanContentSecondary: Color,
    val nonSemanticCyanBorderDefault: Color,
    val nonSemanticCyanBorderStrong: Color,
    val nonSemanticCyanBorderSubtle: Color,
    val nonSemanticCyanBackgroundStrong: Color,
    val nonSemanticCyanBackgroundMuted: Color,
    val nonSemanticCyanBackgroundOnSubtle: Color,
    val nonSemanticCyanBackgroundSubtle: Color,
    val nonSemanticCyanBackgroundSurface: Color
)

data class TealValuesContainer(
    val nonSemanticTealContentPrimary: Color,
    val nonSemanticTealContentSecondary: Color,
    val nonSemanticTealBorderDefault: Color,
    val nonSemanticTealBorderStrong: Color,
    val nonSemanticTealBorderSubtle: Color,
    val nonSemanticTealBackgroundStrong: Color,
    val nonSemanticTealBackgroundMuted: Color,
    val nonSemanticTealBackgroundOnSubtle: Color,
    val nonSemanticTealBackgroundSubtle: Color,
    val nonSemanticTealBackgroundSurface: Color
)

data class AquamarineValuesContainer(
    val nonSemanticAquamarineContentPrimary: Color,
    val nonSemanticAquamarineContentSecondary: Color,
    val nonSemanticAquamarineBorderDefault: Color,
    val nonSemanticAquamarineBorderStrong: Color,
    val nonSemanticAquamarineBorderSubtle: Color,
    val nonSemanticAquamarineBackgroundStrong: Color,
    val nonSemanticAquamarineBackgroundMuted: Color,
    val nonSemanticAquamarineBackgroundOnSubtle: Color,
    val nonSemanticAquamarineBackgroundSubtle: Color,
    val nonSemanticAquamarineBackgroundSurface: Color
)

data class GreenValuesContainer(
    val nonSemanticGreenContentPrimary: Color,
    val nonSemanticGreenContentSecondary: Color,
    val nonSemanticGreenBorderDefault: Color,
    val nonSemanticGreenBorderStrong: Color,
    val nonSemanticGreenBorderSubtle: Color,
    val nonSemanticGreenBackgroundStrong: Color,
    val nonSemanticGreenBackgroundMuted: Color,
    val nonSemanticGreenBackgroundOnSubtle: Color,
    val nonSemanticGreenBackgroundSubtle: Color,
    val nonSemanticGreenBackgroundSurface: Color
)

data class OrangeValuesContainer(
    val nonSemanticOrangeContentPrimary: Color,
    val nonSemanticOrangeContentSecondary: Color,
    val nonSemanticOrangeBorderDefault: Color,
    val nonSemanticOrangeBorderStrong: Color,
    val nonSemanticOrangeBorderSubtle: Color,
    val nonSemanticOrangeBackgroundStrong: Color,
    val nonSemanticOrangeBackgroundMuted: Color,
    val nonSemanticOrangeBackgroundOnSubtle: Color,
    val nonSemanticOrangeBackgroundSubtle: Color,
    val nonSemanticOrangeBackgroundSurface: Color
)

data class NonSemanticValuesContainer(
    val gray: GrayValuesContainer,
    val white: WhiteValuesContainer,
    val red: RedValuesContainer,
    val magenta: MagentaValuesContainer,
    val purple: PurpleValuesContainer,
    val violet: VioletValuesContainer,
    val blue: BlueValuesContainer,
    val cyan: CyanValuesContainer,
    val teal: TealValuesContainer,
    val aquamarine: AquamarineValuesContainer,
    val green: GreenValuesContainer,
    val orange: OrangeValuesContainer
)

data class BrandValuesContainer(
    val semanticBrandNegative4: Color,
    val semanticBrandNegative3: Color,
    val semanticBrandNegative2: Color,
    val semanticBrandNegative1: Color,
    val semanticBrand0: Color,
    val semanticBrand1: Color,
    val semanticBrand2: Color,
    val semanticBrand3: Color,
    val semanticBrand4: Color,
    val semanticBrand5: Color,
    val semanticBrand6: Color,
    val semanticBrand7: Color,
    val semanticBrand8: Color
)

data class NeutralValuesContainer2(
    val semanticNeutralNegative4: Color,
    val semanticNeutralNegative3: Color,
    val semanticNeutralNegative2: Color,
    val semanticNeutralNegative1: Color,
    val semanticNeutral0: Color,
    val semanticNeutral1: Color,
    val semanticNeutral2: Color,
    val semanticNeutral3: Color,
    val semanticNeutral4: Color,
    val semanticNeutral5: Color,
    val semanticNeutral6: Color,
    val semanticNeutral7: Color,
    val semanticNeutral8: Color
)

data class NeutralAlphaValuesContainer(
    val semanticNeutralANegative4: Color,
    val semanticNeutralANegative3: Color,
    val semanticNeutralANegative2: Color,
    val semanticNeutralANegative1: Color,
    val semanticNeutralA0: Color,
    val semanticNeutralA1: Color,
    val semanticNeutralA2: Color,
    val semanticNeutralA3: Color,
    val semanticNeutralA4: Color,
    val semanticNeutralA5: Color,
    val semanticNeutralA6: Color,
    val semanticNeutralA7: Color,
    val semanticNeutralA8: Color
)

data class InfoValuesContainer(
    val semanticInfoNegative4: Color,
    val semanticInfoNegative3: Color,
    val semanticInfoNegative2: Color,
    val semanticInfoNegative1: Color,
    val semanticInfo0: Color,
    val semanticInfo1: Color,
    val semanticInfo2: Color,
    val semanticInfo3: Color,
    val semanticInfo4: Color,
    val semanticInfo5: Color,
    val semanticInfo6: Color,
    val semanticInfo7: Color,
    val semanticInfo8: Color
)

data class SuccessValuesContainer1(
    val semanticSuccessNegative4: Color,
    val semanticSuccessNegative3: Color,
    val semanticSuccessNegative2: Color,
    val semanticSuccessNegative1: Color,
    val semanticSuccess0: Color,
    val semanticSuccess1: Color,
    val semanticSuccess2: Color,
    val semanticSuccess3: Color,
    val semanticSuccess4: Color,
    val semanticSuccess5: Color,
    val semanticSuccess6: Color,
    val semanticSuccess7: Color,
    val semanticSuccess8: Color
)

data class WarningValuesContainer(
    val semanticWarningNegative4: Color,
    val semanticWarningNegative3: Color,
    val semanticWarningNegative2: Color,
    val semanticWarningNegative1: Color,
    val semanticWarning0: Color,
    val semanticWarning1: Color,
    val semanticWarning2: Color,
    val semanticWarning3: Color,
    val semanticWarning4: Color,
    val semanticWarning5: Color,
    val semanticWarning6: Color,
    val semanticWarning7: Color,
    val semanticWarning8: Color
)

data class DangerValuesContainer2(
    val semanticDangerNegative4: Color,
    val semanticDangerNegative3: Color,
    val semanticDangerNegative2: Color,
    val semanticDangerNegative1: Color,
    val semanticDanger0: Color,
    val semanticDanger1: Color,
    val semanticDanger2: Color,
    val semanticDanger3: Color,
    val semanticDanger4: Color,
    val semanticDanger5: Color,
    val semanticDanger6: Color,
    val semanticDanger7: Color,
    val semanticDanger8: Color
)

data class SemanticValuesContainer(
    val brand: BrandValuesContainer,
    val neutral: NeutralValuesContainer2,
    val neutralAlpha: NeutralAlphaValuesContainer,
    val info: InfoValuesContainer,
    val success: SuccessValuesContainer1,
    val warning: WarningValuesContainer,
    val danger: DangerValuesContainer2,
)

data class CoolGrayValuesContainer(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val coolGray0: Color,
    val coolGray1: Color,
    val coolGray2: Color,
    val coolGray3: Color,
    val coolGray4: Color,
    val coolGray5: Color,
    val coolGray6: Color,
    val coolGray7: Color,
    val coolGray8: Color
)

data class CoolGrayAlphaValuesContainer(
    val coolGrayANegative4: Color,
    val coolGrayANegative3: Color,
    val coolGrayANegative2: Color,
    val coolGrayANegative1: Color,
    val coolGrayA0: Color,
    val coolGrayA1: Color,
    val coolGrayA2: Color,
    val coolGrayA3: Color,
    val coolGrayA4: Color,
    val coolGrayA5: Color,
    val coolGrayA6: Color,
    val coolGrayA7: Color,
    val coolGrayA8: Color
)

data class NeutralGrayValuesContainer(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val neutralGray0: Color,
    val neutralGray1: Color,
    val neutralGray2: Color,
    val neutralGray3: Color,
    val neutralGray4: Color,
    val neutralGray5: Color,
    val neutralGray6: Color,
    val neutralGray7: Color,
    val neutralGray8: Color
)

data class NeutralGrayAlphaValuesContainer(
    val neutralGrayANegative4: Color,
    val neutralGrayANegative3: Color,
    val neutralGrayANegative2: Color,
    val neutralGrayANegative1: Color,
    val neutralGrayA0: Color,
    val neutralGrayA1: Color,
    val neutralGrayA2: Color,
    val neutralGrayA3: Color,
    val neutralGrayA4: Color,
    val neutralGrayA5: Color,
    val neutralGrayA6: Color,
    val neutralGrayA7: Color,
    val neutralGrayA8: Color
)

data class WarmGrayValuesContainer(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val warmGray0: Color,
    val warmGray1: Color,
    val warmGray2: Color,
    val warmGray3: Color,
    val warmGray4: Color,
    val warmGray5: Color,
    val warmGray6: Color,
    val warmGray7: Color,
    val warmGray8: Color
)

data class WarmGrayAlphaValuesContainer(
    val warmGrayANegative4: Color,
    val warmGrayANegative3: Color,
    val warmGrayANegative2: Color,
    val warmGrayANegative1: Color,
    val warmGrayA0: Color,
    val warmGrayA1: Color,
    val warmGrayA2: Color,
    val warmGrayA3: Color,
    val warmGrayA4: Color,
    val warmGrayA5: Color,
    val warmGrayA6: Color,
    val warmGrayA7: Color,
    val warmGrayA8: Color
)

data class WhiteAlphaValuesContainer(
    val whiteANegative12: Color,
    val whiteANegative11: Color,
    val whiteANegative10: Color,
    val whiteANegative9: Color,
    val whiteANegative8: Color,
    val whiteANegative7: Color,
    val whiteANegative6: Color,
    val whiteANegative5: Color,
    val whiteANegative4: Color,
    val whiteANegative3: Color,
    val whiteANegative2: Color,
    val whiteANegative1: Color,
    val whiteA0: Color
)

data class RedValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val red0: Color,
    val red1: Color,
    val red2: Color,
    val red3: Color,
    val red4: Color,
    val red5: Color,
    val red6: Color,
    val red7: Color,
    val red8: Color
)

data class MagentaValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val magenta0: Color,
    val magenta1: Color,
    val magenta2: Color,
    val magenta3: Color,
    val magenta4: Color,
    val magenta5: Color,
    val magenta6: Color,
    val magenta7: Color,
    val magenta8: Color
)

data class PurpleValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val purple0: Color,
    val purple1: Color,
    val purple2: Color,
    val purple3: Color,
    val purple4: Color,
    val purple5: Color,
    val purple6: Color,
    val purple7: Color,
    val purple8: Color
)

data class VioletValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val violet0: Color,
    val violet1: Color,
    val violet2: Color,
    val violet3: Color,
    val violet4: Color,
    val violet5: Color,
    val violet6: Color,
    val violet7: Color,
    val violet8: Color
)

data class BlueValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val blue0: Color,
    val blue1: Color,
    val blue2: Color,
    val blue3: Color,
    val blue4: Color,
    val blue5: Color,
    val blue6: Color,
    val blue7: Color,
    val blue8: Color
)

data class CyanValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val cyan0: Color,
    val cyan1: Color,
    val cyan2: Color,
    val cyan3: Color,
    val cyan4: Color,
    val cyan5: Color,
    val cyan6: Color,
    val cyan7: Color,
    val cyan8: Color
)

data class TealValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val teal0: Color,
    val teal1: Color,
    val teal2: Color,
    val teal3: Color,
    val teal4: Color,
    val teal5: Color,
    val teal6: Color,
    val teal7: Color,
    val teal8: Color
)

data class AquamarineValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val aquamarine0: Color,
    val aquamarine1: Color,
    val aquamarine2: Color,
    val aquamarine3: Color,
    val aquamarine4: Color,
    val aquamarine5: Color,
    val aquamarine6: Color,
    val aquamarine7: Color,
    val aquamarine8: Color
)

data class GreenValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val green0: Color,
    val green1: Color,
    val green2: Color,
    val green3: Color,
    val green4: Color,
    val green5: Color,
    val green6: Color,
    val green7: Color,
    val green8: Color
)

data class OrangeValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val orange0: Color,
    val orange1: Color,
    val orange2: Color,
    val orange3: Color,
    val orange4: Color,
    val orange5: Color,
    val orange6: Color,
    val orange7: Color,
    val orange8: Color
)

data class TransparentValuesContainer(
    val transparent: Color
)

data class ColorValuesContainer(
    val content: ContentValuesContainer,
    val border: BorderValuesContainer,
    val background: BackgroundValuesContainer,
    val action: ActionValuesContainer,
    val interaction: InteractionValuesContainer,
    val nonSemantic: NonSemanticValuesContainer,
    val semantic: SemanticValuesContainer,
    val coolGray: CoolGrayValuesContainer,
    val coolGrayAlpha: CoolGrayAlphaValuesContainer,
    val neutralGray: NeutralGrayValuesContainer,
    val neutralGrayAlpha: NeutralGrayAlphaValuesContainer,
    val warmGray: WarmGrayValuesContainer,
    val warmGrayAlpha: WarmGrayAlphaValuesContainer,
    val whiteAlpha: WhiteAlphaValuesContainer
)

data class BorderWidthValuesContainer(
    val focus: Double,
    val none: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val borderWidth0: Double,
    val borderWidth100: Double,
    val borderWidth200: Double,
    val borderWidth400: Double,
    val borderWidth800: Double
)

data class BorderRadiusValuesContainer(
    val none: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val borderRadius2xLarge: Double,
    val borderRadius3xLarge: Double,
    val borderRadius4xLarge: Double,
    val full: Double,
    val borderRadius0: Double,
    val borderRadius25: Double,
    val borderRadius50: Double,
    val borderRadius100: Double,
    val borderRadius150: Double,
    val borderRadius200: Double,
    val borderRadius250: Double,
    val borderRadius300: Double,
    val borderRadius999: Double
)

data class SizeValuesContainer(
    val size3xLarge: Double,
    val size2xLarge: Double,
    val xLarge: Double,
    val large: Double,
    val medium: Double,
    val small: Double,
    val xSmall: Double,
    val size2xSmall: Double,
    val size3xSmall: Double
)

data class PaddingValuesContainer(
    val none: Double,
    val padding2xSmall: Double,
    val xSmall: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val padding2xLarge: Double,
    val padding3xLarge: Double,
    val padding4xLarge: Double,
    val padding5xLarge: Double,
    val padding6xLarge: Double
)

data class GapValuesContainer(
    val none: Double,
    val gap2xSmall: Double,
    val xSmall: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val gap2xLarge: Double,
    val gap3xLarge: Double
)

data class SpaceValuesContainer(
    val padding: PaddingValuesContainer,
    val gap: GapValuesContainer
)

data class OpacityValuesContainer(
    val disabled: Double,
    val opacity0: Double,
    val opacity50: Double,
    val opacity100: Double
)

data class CodeValuesContainer(
    val typographyCodeSmall: Typography,
    val typographyCodeMedium: Typography,
    val typographyCodeLarge: Typography
)

data class UtilityValuesContainer(
    val typographyUtilitySmall: Typography,
    val typographyUtilityMedium: Typography,
    val typographyUtilityLarge: Typography
)

data class BodyValuesContainer(
    val typographyBodySmall: Typography,
    val typographyBodyMedium: Typography,
    val typographyBodyLarge: Typography
)

data class HeadingValuesContainer(
    val typographyHeadingSmall: Typography,
    val typographyHeadingMedium: Typography,
    val typographyHeadingLarge: Typography,
    val typographyHeadingXLarge: Typography,
    val typographyHeading2xLarge: Typography,
    val typographyHeading3xLarge: Typography,
    val typographyHeading4xLarge: Typography,
    val typographyHeading5xLarge: Typography,
    val typographyHeading6xLarge: Typography,
    val typographyHeading7xLarge: Typography,
    val typographyHeading8xLarge: Typography,
    val typographyHeading9xLarge: Typography
)

data class DisplayValuesContainer(
    val typographyDisplaySmall: Typography,
    val typographyDisplayMedium: Typography,
    val typographyDisplayLarge: Typography,
    val typographyDisplayXLarge: Typography,
    val typographyDisplay2xLarge: Typography,
    val typographyDisplay3xLarge: Typography
)

data class TypographyValuesContainer(
    val code: CodeValuesContainer,
    val utility: UtilityValuesContainer,
    val body: BodyValuesContainer,
    val heading: HeadingValuesContainer,
    val display: DisplayValuesContainer
)

data class DimensionValuesContainer(
    val dimension0: Double,
    val dimension25: Double,
    val dimension50: Double,
    val dimension100: Double,
    val dimension150: Double,
    val dimension200: Double,
    val dimension250: Double,
    val dimension300: Double,
    val dimension400: Double,
    val dimension500: Double,
    val dimension550: Double,
    val dimension600: Double,
    val dimension700: Double,
    val dimension800: Double,
    val dimension900: Double,
    val dimension1000: Double,
    val dimension1200: Double,
    val dimension1500: Double,
    val dimension1600: Double
)

data class BottomValuesContainer(
    val elevationBottom100: BoxShadow,
    val elevationBottom200: List<BoxShadow>,
    val elevationBottom300: List<BoxShadow>,
    val elevationBottom400: List<BoxShadow>
)

data class TopValuesContainer(
    val elevationTop100: BoxShadow,
    val elevationTop200: List<BoxShadow>,
    val elevationTop300: List<BoxShadow>,
    val elevationTop400: List<BoxShadow>
)

data class ElevationValuesContainer(
    val bottom: BottomValuesContainer,
    val top: TopValuesContainer
)

data class FontFamilyValuesContainer(
    val sans: String,
    val serif: String,
    val mono: String
)

data class FontSizeValuesContainer(
    val fontSize100: Double,
    val fontSize125: Double,
    val fontSize150: Double,
    val fontSize175: Double,
    val fontSize200: Double,
    val fontSize225: Double,
    val fontSize250: Double,
    val fontSize300: Double,
    val fontSize350: Double,
    val fontSize400: Double,
    val fontSize450: Double,
    val fontSize525: Double,
    val fontSize600: Double,
    val fontSize675: Double,
    val fontSize750: Double,
    val fontSize850: Double,
    val fontSize950: Double,
    val fontSize1050: Double,
    val fontSize1150: Double
)

data class FontWeightValuesContainer(
    val fontWeight300: Double,
    val fontWeight400: Double,
    val fontWeight500: Double,
    val fontWeight600: Double,
    val fontWeight700: Double
)

data class LetterSpacingValuesContainer(
    val letterSpacing0: Double,
    val letterSpacing100: Double,
    val letterSpacing200: Double,
    val letterSpacing300: Double,
    val letterSpacing400: Double,
    val letterSpacing500: Double,
    val letterSpacing600: Double,
    val letterSpacing700: Double
)

data class LineHeightValuesContainer(
    val value150: Double,
    val value200: Double,
    val value250: Double,
    val value275: Double,
    val value300: Double,
    val value325: Double,
    val value400: Double,
    val value475: Double,
    val value525: Double,
    val value600: Double,
    val value700: Double,
    val value725: Double,
    val value825: Double,
    val value900: Double,
    val value1025: Double,
    val value1150: Double,
    val value1275: Double,
    val value1400: Double
)

data class ContentValuesContainer1(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val disabled: Color,
    val primaryInverse: Color,
    val secondaryInverse: Color,
    val tertiaryInverse: Color,
    val disabledInverse: Color,
    val infoPrimary: Color,
    val infoSecondary: Color,
    val successPrimary: Color,
    val successSecondary: Color,
    val warningPrimary: Color,
    val warningSecondary: Color,
    val dangerPrimary: Color,
    val dangerSecondary: Color,
    val brandPrimary: Color,
    val brandSecondary: Color
)

data class BorderValuesContainer2(
    val default: Color,
    val defaultA: Color,
    val inverse: Color,
    val neutralStrong: Color,
    val neutralSubtle: Color,
    val infoStrong: Color,
    val infoSubtle: Color,
    val successStrong: Color,
    val successSubtle: Color,
    val warningStrong: Color,
    val warningSubtle: Color,
    val dangerStrong: Color,
    val dangerSubtle: Color
)

data class BackgroundValuesContainer2(
    val default: Color,
    val inverse: Color,
    val neutralStrong: Color,
    val neutralMuted: Color,
    val neutralOnSubtle: Color,
    val neutralSubtle: Color,
    val neutralSurface: Color,
    val infoStrong: Color,
    val infoMuted: Color,
    val infoOnSubtle: Color,
    val infoSubtle: Color,
    val infoSurface: Color,
    val successStrong: Color,
    val successMuted: Color,
    val successOnSubtle: Color,
    val successSubtle: Color,
    val successSurface: Color,
    val warningStrong: Color,
    val warningMuted: Color,
    val warningOnSubtle: Color,
    val warningSubtle: Color,
    val warningSurface: Color,
    val dangerStrong: Color,
    val dangerMuted: Color,
    val dangerOnSubtle: Color,
    val dangerSubtle: Color,
    val dangerSurface: Color,
    val brandStrong: Color,
    val brandMuted: Color,
    val brandOnSubtle: Color,
    val brandSurface: Color,
    val brandSubtle: Color
)

data class PrimaryValuesContainer1(
    val actionPrimaryNormal: Color,
    val actionPrimaryHover: Color,
    val actionPrimaryActive: Color,
    val actionPrimarySelected: Color,
    val actionPrimarySubtleNormal: Color,
    val actionPrimarySubtleHover: Color,
    val actionPrimarySubtleActive: Color,
    val actionPrimarySubtleSelected: Color
)

data class NeutralValuesContainer3(
    val actionNeutralNormal: Color,
    val actionNeutralHover: Color,
    val actionNeutralActive: Color,
    val actionNeutralSelected: Color,
    val actionNeutralSubtleNormal: Color,
    val actionNeutralSubtleHover: Color,
    val actionNeutralSubtleActive: Color,
    val actionNeutralSubtleSelected: Color
)

data class SuccessValuesContainer2(
    val actionSuccessNormal: Color,
    val actionSuccessHover: Color,
    val actionSuccessActive: Color,
    val actionSuccessSelected: Color,
    val actionSuccessSubtleNormal: Color,
    val actionSuccessSubtleHover: Color,
    val actionSuccessSubtleActive: Color,
    val actionSuccessSubtleSelected: Color
)

data class DangerValuesContainer3(
    val actionDangerNormal: Color,
    val actionDangerHover: Color,
    val actionDangerActive: Color,
    val actionDangerSelected: Color,
    val actionDangerSubtleNormal: Color,
    val actionDangerSubtleHover: Color,
    val actionDangerSubtleActive: Color,
    val actionDangerSubtleSelected: Color
)

data class GhostValuesContainer2(
    val actionGhostNormal: Color,
    val actionGhostHover: Color,
    val actionGhostActive: Color,
    val actionGhostSelected: Color,
    val actionGhostInverseHover: Color,
    val actionGhostInverseActive: Color,
    val actionGhostInverseSelected: Color,
    val actionGhostDangerHover: Color,
    val actionGhostDangerActive: Color,
    val actionGhostDangerSelected: Color
)

data class OutlineValuesContainer1(
    val actionOutlineNormal: Color,
    val actionOutlineHover: Color,
    val actionOutlineActive: Color,
    val actionOutlineSelected: Color
)

data class InverseValuesContainer2(
    val actionInverseNormal: Color,
    val actionInverseHover: Color,
    val actionInverseActive: Color,
    val actionInverseSelected: Color
)

data class ReverseInverseValuesContainer1(
    val actionReverseInverseNormal: Color,
    val actionReverseInverseHover: Color,
    val actionReverseInverseActive: Color,
    val actionReverseInverseSelected: Color
)

data class ActionValuesContainer1(
    val primary: PrimaryValuesContainer1,
    val neutral: NeutralValuesContainer3,
    val success: SuccessValuesContainer2,
    val danger: DangerValuesContainer3,
    val ghost: GhostValuesContainer2,
    val outline: OutlineValuesContainer1,
    val inverse: InverseValuesContainer2,
    val reverseInverse: ReverseInverseValuesContainer1
)

data class DefaultValuesContainer1(
    val interactionDefaultNormal: Color,
    val interactionDefaultHover: Color,
    val interactionDefaultActive: Color,
    val interactionDefaultSelected: Color,
    val interactionDefaultSubtleNormal: Color,
    val interactionDefaultSubtleHover: Color,
    val interactionDefaultSubtleActive: Color,
    val interactionDefaultSubtleSelected: Color
)

data class NeutralValuesContainer4(
    val interactionNeutralNormal: Color,
    val interactionNeutralHover: Color,
    val interactionNeutralActive: Color,
    val interactionNeutralSelected: Color,
    val interactionNeutralSubtleNormal: Color,
    val interactionNeutralSubtleHover: Color,
    val interactionNeutralSubtleActive: Color,
    val interactionNeutralSubtleSelected: Color
)

data class DangerValuesContainer4(
    val interactionDangerNormal: Color,
    val interactionDangerHover: Color,
    val interactionDangerActive: Color,
    val interactionDangerSelected: Color,
    val interactionDangerSubtleNormal: Color,
    val interactionDangerSubtleHover: Color,
    val interactionDangerSubtleActive: Color,
    val interactionDangerSubtleSelected: Color
)

data class GhostValuesContainer3(
    val interactionGhostNormal: Color,
    val interactionGhostHover: Color,
    val interactionGhostActive: Color,
    val interactionGhostSelected: Color,
    val interactionGhostInverseHover: Color,
    val interactionGhostInverseNormal: Color,
    val interactionGhostInverseSelected: Color,
    val interactionGhostDangerHover: Color,
    val interactionGhostDangerNormal: Color,
    val interactionGhostDangerSelected: Color
)

data class DisabledValuesContainer1(
    val interactionDisabledNormal: Color,
    val interactionDisabledHover: Color,
    val interactionDisabledActive: Color,
    val interactionDisabledSubtleNormal: Color,
    val interactionDisabledSubtleHover: Color,
    val interactionDisabledSubtleActive: Color
)

data class BorderValuesContainer3(
    val interactionBorderNormal: Color,
    val interactionBorderHover: Color,
    val interactionBorderActive: Color,
    val interactionBorderSelected: Color,
    val interactionBorderNeutralNormal: Color,
    val interactionBorderNeutralHover: Color,
    val interactionBorderNeutralActive: Color,
    val interactionBorderNeutralSelected: Color,
    val interactionBorderDanger: Color
)

data class BackgroundValuesContainer3(
    val interactionBackgroundModal: Color,
    val interactionBackgroundModeless: Color,
    val interactionBackgroundModelessInverse: Color,
    val interactionBackgroundSidepanel: Color,
    val interactionBackgroundFormField: Color,
    val interactionBackgroundDimmer: Color
)

data class InverseValuesContainer3(
    val interactionInverseNormal: Color,
    val interactionInverseHover: Color,
    val interactionInverseActive: Color,
    val interactionInverseSelected: Color
)

data class FocusValuesContainer1(
    val interactionFocusDefault: Color
)

data class InteractionValuesContainer1(
    val default: DefaultValuesContainer1,
    val neutral: NeutralValuesContainer4,
    val danger: DangerValuesContainer4,
    val ghost: GhostValuesContainer3,
    val disabled: DisabledValuesContainer1,
    val border: BorderValuesContainer3,
    val background: BackgroundValuesContainer3,
    val inverse: InverseValuesContainer3,
    val focus: FocusValuesContainer1
)

data class GrayValuesContainer1(
    val nonSemanticGrayContentPrimary: Color,
    val nonSemanticGrayContentSecondary: Color,
    val nonSemanticGrayBorderDefault: Color,
    val nonSemanticGrayBorderStrong: Color,
    val nonSemanticGrayBorderSubtle: Color,
    val nonSemanticGrayBackgroundStrong: Color,
    val nonSemanticGrayBackgroundMuted: Color,
    val nonSemanticGrayBackgroundOnSubtle: Color,
    val nonSemanticGrayBackgroundSubtle: Color,
    val nonSemanticGrayBackgroundSurface: Color
)

data class WhiteValuesContainer1(
    val nonSemanticWhiteContentPrimary: Color,
    val nonSemanticWhiteContentSecondary: Color,
    val nonSemanticWhiteBorderDefault: Color,
    val nonSemanticWhiteBorderStrong: Color,
    val nonSemanticWhiteBorderSubtle: Color,
    val nonSemanticWhiteBackgroundStrong: Color,
    val nonSemanticWhiteBackgroundMuted: Color,
    val nonSemanticWhiteBackgroundOnSubtle: Color,
    val nonSemanticWhiteBackgroundSubtle: Color,
    val nonSemanticWhiteBackgroundSurface: Color
)

data class RedValuesContainer2(
    val nonSemanticRedContentPrimary: Color,
    val nonSemanticRedContentSecondary: Color,
    val nonSemanticRedBorderDefault: Color,
    val nonSemanticRedBorderStrong: Color,
    val nonSemanticRedBorderSubtle: Color,
    val nonSemanticRedBackgroundStrong: Color,
    val nonSemanticRedBackgroundMuted: Color,
    val nonSemanticRedBackgroundOnSubtle: Color,
    val nonSemanticRedBackgroundSubtle: Color,
    val nonSemanticRedBackgroundSurface: Color
)

data class MagentaValuesContainer2(
    val nonSemanticMagentaContentPrimary: Color,
    val nonSemanticMagentaContentSecondary: Color,
    val nonSemanticMagentaBorderDefault: Color,
    val nonSemanticMagentaBorderStrong: Color,
    val nonSemanticMagentaBorderSubtle: Color,
    val nonSemanticMagentaBackgroundStrong: Color,
    val nonSemanticMagentaBackgroundMuted: Color,
    val nonSemanticMagentaBackgroundOnSubtle: Color,
    val nonSemanticMagentaBackgroundSubtle: Color,
    val nonSemanticMagentaBackgroundSurface: Color
)

data class PurpleValuesContainer2(
    val nonSemanticPurpleContentPrimary: Color,
    val nonSemanticPurpleContentSecondary: Color,
    val nonSemanticPurpleBorderDefault: Color,
    val nonSemanticPurpleBorderStrong: Color,
    val nonSemanticPurpleBorderSubtle: Color,
    val nonSemanticPurpleBackgroundStrong: Color,
    val nonSemanticPurpleBackgroundMuted: Color,
    val nonSemanticPurpleBackgroundOnSubtle: Color,
    val nonSemanticPurpleBackgroundSubtle: Color,
    val nonSemanticPurpleBackgroundSurface: Color
)

data class VioletValuesContainer2(
    val nonSemanticVioletContentPrimary: Color,
    val nonSemanticVioletContentSecondary: Color,
    val nonSemanticVioletBorderDefault: Color,
    val nonSemanticVioletBorderStrong: Color,
    val nonSemanticVioletBorderSubtle: Color,
    val nonSemanticVioletBackgroundStrong: Color,
    val nonSemanticVioletBackgroundMuted: Color,
    val nonSemanticVioletBackgroundOnSubtle: Color,
    val nonSemanticVioletBackgroundSubtle: Color,
    val nonSemanticVioletBackgroundSurface: Color
)

data class BlueValuesContainer2(
    val nonSemanticBlueContentPrimary: Color,
    val nonSemanticBlueContentSecondary: Color,
    val nonSemanticBlueBorderDefault: Color,
    val nonSemanticBlueBorderStrong: Color,
    val nonSemanticBlueBorderSubtle: Color,
    val nonSemanticBlueBackgroundStrong: Color,
    val nonSemanticBlueBackgroundMuted: Color,
    val nonSemanticBlueBackgroundOnSubtle: Color,
    val nonSemanticBlueBackgroundSubtle: Color,
    val nonSemanticBlueBackgroundSurface: Color
)

data class CyanValuesContainer2(
    val nonSemanticCyanContentPrimary: Color,
    val nonSemanticCyanContentSecondary: Color,
    val nonSemanticCyanBorderDefault: Color,
    val nonSemanticCyanBorderStrong: Color,
    val nonSemanticCyanBorderSubtle: Color,
    val nonSemanticCyanBackgroundStrong: Color,
    val nonSemanticCyanBackgroundMuted: Color,
    val nonSemanticCyanBackgroundOnSubtle: Color,
    val nonSemanticCyanBackgroundSubtle: Color,
    val nonSemanticCyanBackgroundSurface: Color
)

data class TealValuesContainer2(
    val nonSemanticTealContentPrimary: Color,
    val nonSemanticTealContentSecondary: Color,
    val nonSemanticTealBorderDefault: Color,
    val nonSemanticTealBorderStrong: Color,
    val nonSemanticTealBorderSubtle: Color,
    val nonSemanticTealBackgroundStrong: Color,
    val nonSemanticTealBackgroundMuted: Color,
    val nonSemanticTealBackgroundOnSubtle: Color,
    val nonSemanticTealBackgroundSubtle: Color,
    val nonSemanticTealBackgroundSurface: Color
)

data class AquamarineValuesContainer2(
    val nonSemanticAquamarineContentPrimary: Color,
    val nonSemanticAquamarineContentSecondary: Color,
    val nonSemanticAquamarineBorderDefault: Color,
    val nonSemanticAquamarineBorderStrong: Color,
    val nonSemanticAquamarineBorderSubtle: Color,
    val nonSemanticAquamarineBackgroundStrong: Color,
    val nonSemanticAquamarineBackgroundMuted: Color,
    val nonSemanticAquamarineBackgroundOnSubtle: Color,
    val nonSemanticAquamarineBackgroundSubtle: Color,
    val nonSemanticAquamarineBackgroundSurface: Color
)

data class GreenValuesContainer2(
    val nonSemanticGreenContentPrimary: Color,
    val nonSemanticGreenContentSecondary: Color,
    val nonSemanticGreenBorderDefault: Color,
    val nonSemanticGreenBorderStrong: Color,
    val nonSemanticGreenBorderSubtle: Color,
    val nonSemanticGreenBackgroundStrong: Color,
    val nonSemanticGreenBackgroundMuted: Color,
    val nonSemanticGreenBackgroundOnSubtle: Color,
    val nonSemanticGreenBackgroundSubtle: Color,
    val nonSemanticGreenBackgroundSurface: Color
)

data class OrangeValuesContainer2(
    val nonSemanticOrangeContentPrimary: Color,
    val nonSemanticOrangeContentSecondary: Color,
    val nonSemanticOrangeBorderDefault: Color,
    val nonSemanticOrangeBorderStrong: Color,
    val nonSemanticOrangeBorderSubtle: Color,
    val nonSemanticOrangeBackgroundStrong: Color,
    val nonSemanticOrangeBackgroundMuted: Color,
    val nonSemanticOrangeBackgroundOnSubtle: Color,
    val nonSemanticOrangeBackgroundSubtle: Color,
    val nonSemanticOrangeBackgroundSurface: Color
)

data class NonSemanticValuesContainer1(
    val gray: GrayValuesContainer1,
    val white: WhiteValuesContainer1,
    val red: RedValuesContainer2,
    val magenta: MagentaValuesContainer2,
    val purple: PurpleValuesContainer2,
    val violet: VioletValuesContainer2,
    val blue: BlueValuesContainer2,
    val cyan: CyanValuesContainer2,
    val teal: TealValuesContainer2,
    val aquamarine: AquamarineValuesContainer2,
    val green: GreenValuesContainer2,
    val orange: OrangeValuesContainer2
)

data class BrandValuesContainer1(
    val semanticBrandNegative4: Color,
    val semanticBrandNegative3: Color,
    val semanticBrandNegative2: Color,
    val semanticBrandNegative1: Color,
    val semanticBrand0: Color,
    val semanticBrand1: Color,
    val semanticBrand2: Color,
    val semanticBrand3: Color,
    val semanticBrand4: Color,
    val semanticBrand5: Color,
    val semanticBrand6: Color,
    val semanticBrand7: Color,
    val semanticBrand8: Color
)

data class NeutralValuesContainer5(
    val semanticNeutralNegative4: Color,
    val semanticNeutralNegative3: Color,
    val semanticNeutralNegative2: Color,
    val semanticNeutralNegative1: Color,
    val semanticNeutral0: Color,
    val semanticNeutral1: Color,
    val semanticNeutral2: Color,
    val semanticNeutral3: Color,
    val semanticNeutral4: Color,
    val semanticNeutral5: Color,
    val semanticNeutral6: Color,
    val semanticNeutral7: Color,
    val semanticNeutral8: Color
)

data class NeutralAlphaValuesContainer1(
    val semanticNeutralANegative4: Color,
    val semanticNeutralANegative3: Color,
    val semanticNeutralANegative2: Color,
    val semanticNeutralANegative1: Color,
    val semanticNeutralA0: Color,
    val semanticNeutralA1: Color,
    val semanticNeutralA2: Color,
    val semanticNeutralA3: Color,
    val semanticNeutralA4: Color,
    val semanticNeutralA5: Color,
    val semanticNeutralA6: Color,
    val semanticNeutralA7: Color,
    val semanticNeutralA8: Color
)

data class InfoValuesContainer1(
    val semanticInfoNegative4: Color,
    val semanticInfoNegative3: Color,
    val semanticInfoNegative2: Color,
    val semanticInfoNegative1: Color,
    val semanticInfo0: Color,
    val semanticInfo1: Color,
    val semanticInfo2: Color,
    val semanticInfo3: Color,
    val semanticInfo4: Color,
    val semanticInfo5: Color,
    val semanticInfo6: Color,
    val semanticInfo7: Color,
    val semanticInfo8: Color
)

data class SuccessValuesContainer3(
    val semanticSuccessNegative4: Color,
    val semanticSuccessNegative3: Color,
    val semanticSuccessNegative2: Color,
    val semanticSuccessNegative1: Color,
    val semanticSuccess0: Color,
    val semanticSuccess1: Color,
    val semanticSuccess2: Color,
    val semanticSuccess3: Color,
    val semanticSuccess4: Color,
    val semanticSuccess5: Color,
    val semanticSuccess6: Color,
    val semanticSuccess7: Color,
    val semanticSuccess8: Color
)

data class WarningValuesContainer1(
    val semanticWarningNegative4: Color,
    val semanticWarningNegative3: Color,
    val semanticWarningNegative2: Color,
    val semanticWarningNegative1: Color,
    val semanticWarning0: Color,
    val semanticWarning1: Color,
    val semanticWarning2: Color,
    val semanticWarning3: Color,
    val semanticWarning4: Color,
    val semanticWarning5: Color,
    val semanticWarning6: Color,
    val semanticWarning7: Color,
    val semanticWarning8: Color
)

data class DangerValuesContainer5(
    val semanticDangerNegative4: Color,
    val semanticDangerNegative3: Color,
    val semanticDangerNegative2: Color,
    val semanticDangerNegative1: Color,
    val semanticDanger0: Color,
    val semanticDanger1: Color,
    val semanticDanger2: Color,
    val semanticDanger3: Color,
    val semanticDanger4: Color,
    val semanticDanger5: Color,
    val semanticDanger6: Color,
    val semanticDanger7: Color,
    val semanticDanger8: Color
)

data class SemanticValuesContainer1(
    val brand: BrandValuesContainer1,
    val neutral: NeutralValuesContainer5,
    val neutralAlpha: NeutralAlphaValuesContainer1,
    val info: InfoValuesContainer1,
    val success: SuccessValuesContainer3,
    val warning: WarningValuesContainer1,
    val danger: DangerValuesContainer5
)

data class CoolGrayValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val coolGray0: Color,
    val coolGray1: Color,
    val coolGray2: Color,
    val coolGray3: Color,
    val coolGray4: Color,
    val coolGray5: Color,
    val coolGray6: Color,
    val coolGray7: Color,
    val coolGray8: Color
)

data class CoolGrayAlphaValuesContainer1(
    val coolGrayANegative4: Color,
    val coolGrayANegative3: Color,
    val coolGrayANegative2: Color,
    val coolGrayANegative1: Color,
    val coolGrayA0: Color,
    val coolGrayA1: Color,
    val coolGrayA2: Color,
    val coolGrayA3: Color,
    val coolGrayA4: Color,
    val coolGrayA5: Color,
    val coolGrayA6: Color,
    val coolGrayA7: Color,
    val coolGrayA8: Color
)

data class NeutralGrayValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val neutralGray0: Color,
    val neutralGray1: Color,
    val neutralGray2: Color,
    val neutralGray3: Color,
    val neutralGray4: Color,
    val neutralGray5: Color,
    val neutralGray6: Color,
    val neutralGray7: Color,
    val neutralGray8: Color
)

data class NeutralGrayAlphaValuesContainer1(
    val neutralGrayANegative4: Color,
    val neutralGrayANegative3: Color,
    val neutralGrayANegative2: Color,
    val neutralGrayANegative1: Color,
    val neutralGrayA0: Color,
    val neutralGrayA1: Color,
    val neutralGrayA2: Color,
    val neutralGrayA3: Color,
    val neutralGrayA4: Color,
    val neutralGrayA5: Color,
    val neutralGrayA6: Color,
    val neutralGrayA7: Color,
    val neutralGrayA8: Color
)

data class WarmGrayValuesContainer1(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val warmGray0: Color,
    val warmGray1: Color,
    val warmGray2: Color,
    val warmGray3: Color,
    val warmGray4: Color,
    val warmGray5: Color,
    val warmGray6: Color,
    val warmGray7: Color,
    val warmGray8: Color
)

data class WarmGrayAlphaValuesContainer1(
    val warmGrayANegative4: Color,
    val warmGrayANegative3: Color,
    val warmGrayANegative2: Color,
    val warmGrayANegative1: Color,
    val warmGrayA0: Color,
    val warmGrayA1: Color,
    val warmGrayA2: Color,
    val warmGrayA3: Color,
    val warmGrayA4: Color,
    val warmGrayA5: Color,
    val warmGrayA6: Color,
    val warmGrayA7: Color,
    val warmGrayA8: Color
)

data class WhiteAlphaValuesContainer1(
    val whiteANegative12: Color,
    val whiteANegative11: Color,
    val whiteANegative10: Color,
    val whiteANegative9: Color,
    val whiteANegative8: Color,
    val whiteANegative7: Color,
    val whiteANegative6: Color,
    val whiteANegative5: Color,
    val whiteANegative4: Color,
    val whiteANegative3: Color,
    val whiteANegative2: Color,
    val whiteANegative1: Color,
    val whiteA0: Color
)

data class RedValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val red0: Color,
    val red1: Color,
    val red2: Color,
    val red3: Color,
    val red4: Color,
    val red5: Color,
    val red6: Color,
    val red7: Color,
    val red8: Color
)

data class MagentaValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val magenta0: Color,
    val magenta1: Color,
    val magenta2: Color,
    val magenta3: Color,
    val magenta4: Color,
    val magenta5: Color,
    val magenta6: Color,
    val magenta7: Color,
    val magenta8: Color
)

data class PurpleValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val purple0: Color,
    val purple1: Color,
    val purple2: Color,
    val purple3: Color,
    val purple4: Color,
    val purple5: Color,
    val purple6: Color,
    val purple7: Color,
    val purple8: Color
)

data class VioletValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val violet0: Color,
    val violet1: Color,
    val violet2: Color,
    val violet3: Color,
    val violet4: Color,
    val violet5: Color,
    val violet6: Color,
    val violet7: Color,
    val violet8: Color
)

data class BlueValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val blue0: Color,
    val blue1: Color,
    val blue2: Color,
    val blue3: Color,
    val blue4: Color,
    val blue5: Color,
    val blue6: Color,
    val blue7: Color,
    val blue8: Color
)

data class CyanValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val cyan0: Color,
    val cyan1: Color,
    val cyan2: Color,
    val cyan3: Color,
    val cyan4: Color,
    val cyan5: Color,
    val cyan6: Color,
    val cyan7: Color,
    val cyan8: Color
)

data class TealValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val teal0: Color,
    val teal1: Color,
    val teal2: Color,
    val teal3: Color,
    val teal4: Color,
    val teal5: Color,
    val teal6: Color,
    val teal7: Color,
    val teal8: Color
)

data class AquamarineValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val aquamarine0: Color,
    val aquamarine1: Color,
    val aquamarine2: Color,
    val aquamarine3: Color,
    val aquamarine4: Color,
    val aquamarine5: Color,
    val aquamarine6: Color,
    val aquamarine7: Color,
    val aquamarine8: Color
)

data class GreenValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val green0: Color,
    val green1: Color,
    val green2: Color,
    val green3: Color,
    val green4: Color,
    val green5: Color,
    val green6: Color,
    val green7: Color,
    val green8: Color
)

data class OrangeValuesContainer3(
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val orange0: Color,
    val orange1: Color,
    val orange2: Color,
    val orange3: Color,
    val orange4: Color,
    val orange5: Color,
    val orange6: Color,
    val orange7: Color,
    val orange8: Color
)

data class TransparentValuesContainer1(
    val transparent: Color
)

data class ColorValuesContainer1(
    val content: ContentValuesContainer1,
    val border: BorderValuesContainer2,
    val background: BackgroundValuesContainer2,
    val action: ActionValuesContainer1,
    val interaction: InteractionValuesContainer1,
    val nonSemantic: NonSemanticValuesContainer1,
    val semantic: SemanticValuesContainer1,
    val coolGray: CoolGrayValuesContainer1,
    val coolGrayAlpha: CoolGrayAlphaValuesContainer1,
    val neutralGray: NeutralGrayValuesContainer1,
    val neutralGrayAlpha: NeutralGrayAlphaValuesContainer1,
    val warmGray: WarmGrayValuesContainer1,
    val warmGrayAlpha: WarmGrayAlphaValuesContainer1,
    val whiteAlpha: WhiteAlphaValuesContainer1,
    val red: RedValuesContainer3,
    val magenta: MagentaValuesContainer3,
    val purple: PurpleValuesContainer3,
    val violet: VioletValuesContainer3,
    val blue: BlueValuesContainer3,
    val cyan: CyanValuesContainer3,
    val teal: TealValuesContainer3,
    val aquamarine: AquamarineValuesContainer3,
    val green: GreenValuesContainer3,
    val orange: OrangeValuesContainer3,
    val transparent: TransparentValuesContainer1
)

data class BorderWidthValuesContainer1(
    val focus: Double,
    val none: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val borderWidth0: Double,
    val borderWidth100: Double,
    val borderWidth200: Double,
    val borderWidth400: Double,
    val borderWidth800: Double
)

data class BorderRadiusValuesContainer1(
    val none: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val borderRadius2xLarge: Double,
    val borderRadius3xLarge: Double,
    val borderRadius4xLarge: Double,
    val full: Double,
    val borderRadius0: Double,
    val borderRadius25: Double,
    val borderRadius50: Double,
    val borderRadius100: Double,
    val borderRadius150: Double,
    val borderRadius200: Double,
    val borderRadius250: Double,
    val borderRadius300: Double,
    val borderRadius999: Double
)

data class SizeValuesContainer1(
    val size3xLarge: Double,
    val size2xLarge: Double,
    val xLarge: Double,
    val large: Double,
    val medium: Double,
    val small: Double,
    val xSmall: Double,
    val size2xSmall: Double,
    val size3xSmall: Double
)

data class PaddingValuesContainer1(
    val none: Double,
    val padding2xSmall: Double,
    val xSmall: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val padding2xLarge: Double,
    val padding3xLarge: Double,
    val padding4xLarge: Double,
    val padding5xLarge: Double,
    val padding6xLarge: Double
)

data class GapValuesContainer1(
    val none: Double,
    val gap2xSmall: Double,
    val xSmall: Double,
    val small: Double,
    val medium: Double,
    val large: Double,
    val xLarge: Double,
    val gap2xLarge: Double,
    val gap3xLarge: Double
)

data class SpaceValuesContainer1(
    val padding: PaddingValuesContainer1,
    val gap: GapValuesContainer1
)

data class OpacityValuesContainer1(
    val disabled: Double,
    val opacity0: Double,
    val opacity50: Double,
    val opacity100: Double
)

data class CodeValuesContainer1(
    val typographyCodeSmall: Typography,
    val typographyCodeMedium: Typography,
    val typographyCodeLarge: Typography
)

data class UtilityValuesContainer1(
    val typographyUtilitySmall: Typography,
    val typographyUtilityMedium: Typography,
    val typographyUtilityLarge: Typography
)

data class BodyValuesContainer1(
    val typographyBodySmall: Typography,
    val typographyBodyMedium: Typography,
    val typographyBodyLarge: Typography
)

data class HeadingValuesContainer1(
    val typographyHeadingSmall: Typography,
    val typographyHeadingMedium: Typography,
    val typographyHeadingLarge: Typography,
    val typographyHeadingXLarge: Typography,
    val typographyHeading2xLarge: Typography,
    val typographyHeading3xLarge: Typography,
    val typographyHeading4xLarge: Typography,
    val typographyHeading5xLarge: Typography,
    val typographyHeading6xLarge: Typography,
    val typographyHeading7xLarge: Typography,
    val typographyHeading8xLarge: Typography,
    val typographyHeading9xLarge: Typography
)

data class DisplayValuesContainer1(
    val typographyDisplaySmall: Typography,
    val typographyDisplayMedium: Typography,
    val typographyDisplayLarge: Typography,
    val typographyDisplayXLarge: Typography,
    val typographyDisplay2xLarge: Typography,
    val typographyDisplay3xLarge: Typography
)

data class TypographyValuesContainer1(
    val code: CodeValuesContainer1,
    val utility: UtilityValuesContainer1,
    val body: BodyValuesContainer1,
    val heading: HeadingValuesContainer1,
    val display: DisplayValuesContainer1
)

data class DimensionValuesContainer1(
    val dimension0: Double,
    val dimension25: Double,
    val dimension50: Double,
    val dimension100: Double,
    val dimension150: Double,
    val dimension200: Double,
    val dimension250: Double,
    val dimension300: Double,
    val dimension400: Double,
    val dimension500: Double,
    val dimension550: Double,
    val dimension600: Double,
    val dimension700: Double,
    val dimension800: Double,
    val dimension900: Double,
    val dimension1000: Double,
    val dimension1200: Double,
    val dimension1500: Double,
    val dimension1600: Double
)

data class BottomValuesContainer1(
    val elevationBottom100: BoxShadow,
    val elevationBottom200: List<BoxShadow>,
    val elevationBottom300: List<BoxShadow>,
    val elevationBottom400: List<BoxShadow>
)

data class TopValuesContainer1(
    val elevationTop100: BoxShadow,
    val elevationTop200: List<BoxShadow>,
    val elevationTop300: List<BoxShadow>,
    val elevationTop400: List<BoxShadow>
)

data class ElevationValuesContainer1(
    val bottom: BottomValuesContainer1,
    val top: TopValuesContainer1
)

data class FontFamilyValuesContainer1(
    val sans: String,
    val serif: String,
    val mono: String
)

data class FontSizeValuesContainer1(
    val fontSize100: Double,
    val fontSize125: Double,
    val fontSize150: Double,
    val fontSize175: Double,
    val fontSize200: Double,
    val fontSize225: Double,
    val fontSize250: Double,
    val fontSize300: Double,
    val fontSize350: Double,
    val fontSize400: Double,
    val fontSize450: Double,
    val fontSize525: Double,
    val fontSize600: Double,
    val fontSize675: Double,
    val fontSize750: Double,
    val fontSize850: Double,
    val fontSize950: Double,
    val fontSize1050: Double,
    val fontSize1150: Double
)

data class FontWeightValuesContainer1(
    val fontWeight300: Double,
    val fontWeight400: Double,
    val fontWeight500: Double,
    val fontWeight600: Double,
    val fontWeight700: Double
)

data class LetterSpacingValuesContainer1(
    val letterSpacing0: Double,
    val letterSpacing100: Double,
    val letterSpacing200: Double,
    val letterSpacing300: Double,
    val letterSpacing400: Double,
    val letterSpacing500: Double,
    val letterSpacing600: Double,
    val letterSpacing700: Double
)

data class LineHeightValuesContainer1(
    val value150: Double,
    val value200: Double,
    val value250: Double,
    val value275: Double,
    val value300: Double,
    val value325: Double,
    val value400: Double,
    val value475: Double,
    val value525: Double,
    val value600: Double,
    val value700: Double,
    val value725: Double,
    val value825: Double,
    val value900: Double,
    val value1025: Double,
    val value1150: Double,
    val value1275: Double,
    val value1400: Double
)

data class Typography(
    val lineHeight: Double,
    val letterSpacing: Double,
    val fontWeight: Double,
    val fontSize: Double,
    val fontFamily: String
)

data class BoxShadow(
    val y: Double,
    val x: Double,
    val type: String,
    val spread: Double,
    val color: String,
    val blur: Double
)


