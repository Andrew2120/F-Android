import androidx.compose.ui.graphics.Color

data class DesignSystem (
    val color: ColorValuesContainer,
    val borderWidth: BorderWidthValuesContainer,
    val borderRadius: BorderRadiusValuesContainer,
    val size: SizeValuesContainer,
    val space: SpaceValuesContainer,
    val opacity: OpacityValuesContainer,
    val typography: TypographyValuesContainer,
    val dimension: DimensionValuesContainer,
    val elevation: ElevationValuesContainer,
    val fontFamily: FontFamilyValuesContainer,
    val fontSize: FontSizeValuesContainer,
    val fontWeight: FontWeightValuesContainer,
    val letterSpacing: LetterSpacingValuesContainer,
    val lineHeight: LineHeightValuesContainer,
)

data class ContentValuesContainer (
    val warningSecondary: Color,
    val warningPrimary: Color,
    val tertiaryInverse: Color,
    val tertiary: Color,
    val successSecondary: Color,
    val successPrimary: Color,
    val secondaryInverse: Color,
    val secondary: Color,
    val primaryInverse: Color,
    val primary: Color,
    val infoSecondary: Color,
    val infoPrimary: Color,
    val disabledInverse: Color,
    val disabled: Color,
    val dangerSecondary: Color,
    val dangerPrimary: Color,
    val brandSecondary: Color,
    val brandPrimary: Color,
)

data class BorderValuesContainer (
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

data class BackgroundValuesContainer (
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

data class PrimaryValuesContainer (
    val actionPrimarySubtleSelected: Color,
    val actionPrimarySubtleNormal: Color,
    val actionPrimarySubtleHover: Color,
    val actionPrimarySubtleActive: Color,
    val actionPrimarySelected: Color,
    val actionPrimaryNormal: Color,
    val actionPrimaryHover: Color,
    val actionPrimaryActive: Color,
)

data class NeutralValuesContainer (
    val actionNeutralSubtleSelected: Color,
    val actionNeutralSubtleNormal: Color,
    val actionNeutralSubtleHover: Color,
    val actionNeutralSubtleActive: Color,
    val actionNeutralSelected: Color,
    val actionNeutralNormal: Color,
    val actionNeutralHover: Color,
    val actionNeutralActive: Color,
)

data class SuccessValuesContainer (
    val actionSuccessSubtleSelected: Color,
    val actionSuccessSubtleNormal: Color,
    val actionSuccessSubtleHover: Color,
    val actionSuccessSubtleActive: Color,
    val actionSuccessSelected: Color,
    val actionSuccessNormal: Color,
    val actionSuccessHover: Color,
    val actionSuccessActive: Color,
)

data class DangerValuesContainer (
    val actionDangerSubtleSelected: Color,
    val actionDangerSubtleNormal: Color,
    val actionDangerSubtleHover: Color,
    val actionDangerSubtleActive: Color,
    val actionDangerSelected: Color,
    val actionDangerNormal: Color,
    val actionDangerHover: Color,
    val actionDangerActive: Color,
)

data class GhostValuesContainer (
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

data class OutlineValuesContainer (
    val actionOutlineSelected: Color,
    val actionOutlineNormal: Color,
    val actionOutlineHover: Color,
    val actionOutlineActive: Color,
)

data class InverseValuesContainer (
    val actionInverseSelected: Color,
    val actionInverseNormal: Color,
    val actionInverseHover: Color,
    val actionInverseActive: Color,
)

data class ReverseInverseValuesContainer (
    val actionReverseInverseSelected: Color,
    val actionReverseInverseNormal: Color,
    val actionReverseInverseHover: Color,
    val actionReverseInverseActive: Color,
)

data class ActionValuesContainer (
    val success: SuccessValuesContainer,
    val reverseInverse: ReverseInverseValuesContainer,
    val primary: PrimaryValuesContainer,
    val outline: OutlineValuesContainer,
    val neutral: NeutralValuesContainer,
    val inverse: InverseValuesContainer,
    val ghost: GhostValuesContainer,
    val danger: DangerValuesContainer,
)

data class DefaultValuesContainer (
    val interactionDefaultSubtleSelected: Color,
    val interactionDefaultSubtleNormal: Color,
    val interactionDefaultSubtleHover: Color,
    val interactionDefaultSubtleActive: Color,
    val interactionDefaultSelected: Color,
    val interactionDefaultNormal: Color,
    val interactionDefaultHover: Color,
    val interactionDefaultActive: Color,
)

data class NeutralValuesContainer1 (
    val interactionNeutralSubtleSelected: Color,
    val interactionNeutralSubtleNormal: Color,
    val interactionNeutralSubtleHover: Color,
    val interactionNeutralSubtleActive: Color,
    val interactionNeutralSelected: Color,
    val interactionNeutralNormal: Color,
    val interactionNeutralHover: Color,
    val interactionNeutralActive: Color,
)

data class DangerValuesContainer1 (
    val interactionDangerSubtleSelected: Color,
    val interactionDangerSubtleNormal: Color,
    val interactionDangerSubtleHover: Color,
    val interactionDangerSubtleActive: Color,
    val interactionDangerSelected: Color,
    val interactionDangerNormal: Color,
    val interactionDangerHover: Color,
    val interactionDangerActive: Color,
)

data class GhostValuesContainer1 (
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

data class DisabledValuesContainer (
    val interactionDisabledSubtleNormal: Color,
    val interactionDisabledSubtleHover: Color,
    val interactionDisabledSubtleActive: Color,
    val interactionDisabledNormal: Color,
    val interactionDisabledHover: Color,
    val interactionDisabledActive: Color,
)

data class BorderValuesContainer1 (
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

data class BackgroundValuesContainer1 (
    val interactionBackgroundSidepanel: Color,
    val interactionBackgroundModelessInverse: Color,
    val interactionBackgroundModeless: Color,
    val interactionBackgroundModal: Color,
    val interactionBackgroundFormField: Color,
    val interactionBackgroundDimmer: Color,
)

data class InverseValuesContainer1 (
    val interactionInverseSelected: Color,
    val interactionInverseNormal: Color,
    val interactionInverseHover: Color,
    val interactionInverseActive: Color,
)

data class FocusValuesContainer (
    val interactionFocusDefault: Color,
)

data class InteractionValuesContainer (
    val neutral: NeutralValuesContainer1,
    val inverse: InverseValuesContainer1,
    val ghost: GhostValuesContainer1,
    val focus: FocusValuesContainer,
    val disabled: DisabledValuesContainer,
    val default: DefaultValuesContainer,
    val danger: DangerValuesContainer1,
    val border: BorderValuesContainer1,
    val background: BackgroundValuesContainer1,
)

data class GrayValuesContainer (
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

data class WhiteValuesContainer (
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

data class RedValuesContainer (
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

data class MagentaValuesContainer (
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

data class PurpleValuesContainer (
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

data class VioletValuesContainer (
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

data class BlueValuesContainer (
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

data class CyanValuesContainer (
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

data class TealValuesContainer (
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

data class AquamarineValuesContainer (
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

data class GreenValuesContainer (
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

data class OrangeValuesContainer (
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

data class NonSemanticValuesContainer (
    val white: WhiteValuesContainer,
    val violet: VioletValuesContainer,
    val teal: TealValuesContainer,
    val red: RedValuesContainer,
    val purple: PurpleValuesContainer,
    val orange: OrangeValuesContainer,
    val magenta: MagentaValuesContainer,
    val green: GreenValuesContainer,
    val gray: GrayValuesContainer,
    val cyan: CyanValuesContainer,
    val blue: BlueValuesContainer,
    val aquamarine: AquamarineValuesContainer,
)

data class BrandValuesContainer (
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

data class NeutralValuesContainer2 (
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

data class NeutralAlphaValuesContainer (
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

data class InfoValuesContainer (
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

data class SuccessValuesContainer1 (
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

data class WarningValuesContainer (
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

data class DangerValuesContainer2 (
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

data class SemanticValuesContainer (
    val warning: WarningValuesContainer,
    val success: SuccessValuesContainer1,
    val neutralAlpha: NeutralAlphaValuesContainer,
    val neutral: NeutralValuesContainer2,
    val info: InfoValuesContainer,
    val danger: DangerValuesContainer2,
    val brand: BrandValuesContainer,
)

data class CoolGrayValuesContainer (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val coolGray8: Color,
    val coolGray7: Color,
    val coolGray6: Color,
    val coolGray5: Color,
    val coolGray4: Color,
    val coolGray3: Color,
    val coolGray2: Color,
    val coolGray1: Color,
    val coolGray0: Color,
)

data class CoolGrayAlphaValuesContainer (
    val coolGrayANegative4: Color,
    val coolGrayANegative3: Color,
    val coolGrayANegative2: Color,
    val coolGrayANegative1: Color,
    val coolGrayA8: Color,
    val coolGrayA7: Color,
    val coolGrayA6: Color,
    val coolGrayA5: Color,
    val coolGrayA4: Color,
    val coolGrayA3: Color,
    val coolGrayA2: Color,
    val coolGrayA1: Color,
    val coolGrayA0: Color,
)

data class NeutralGrayValuesContainer (
    val neutralGray8: Color,
    val neutralGray7: Color,
    val neutralGray6: Color,
    val neutralGray5: Color,
    val neutralGray4: Color,
    val neutralGray3: Color,
    val neutralGray2: Color,
    val neutralGray1: Color,
    val neutralGray0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class NeutralGrayAlphaValuesContainer (
    val neutralGrayANegative4: Color,
    val neutralGrayANegative3: Color,
    val neutralGrayANegative2: Color,
    val neutralGrayANegative1: Color,
    val neutralGrayA8: Color,
    val neutralGrayA7: Color,
    val neutralGrayA6: Color,
    val neutralGrayA5: Color,
    val neutralGrayA4: Color,
    val neutralGrayA3: Color,
    val neutralGrayA2: Color,
    val neutralGrayA1: Color,
    val neutralGrayA0: Color,
)

data class WarmGrayValuesContainer (
    val warmGray8: Color,
    val warmGray7: Color,
    val warmGray6: Color,
    val warmGray5: Color,
    val warmGray4: Color,
    val warmGray3: Color,
    val warmGray2: Color,
    val warmGray1: Color,
    val warmGray0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class WarmGrayAlphaValuesContainer (
    val warmGrayANegative4: Color,
    val warmGrayANegative3: Color,
    val warmGrayANegative2: Color,
    val warmGrayANegative1: Color,
    val warmGrayA8: Color,
    val warmGrayA7: Color,
    val warmGrayA6: Color,
    val warmGrayA5: Color,
    val warmGrayA4: Color,
    val warmGrayA3: Color,
    val warmGrayA2: Color,
    val warmGrayA1: Color,
    val warmGrayA0: Color,
)

data class WhiteAlphaValuesContainer (
    val whiteANegative9: Color,
    val whiteANegative8: Color,
    val whiteANegative7: Color,
    val whiteANegative6: Color,
    val whiteANegative5: Color,
    val whiteANegative4: Color,
    val whiteANegative3: Color,
    val whiteANegative2: Color,
    val whiteANegative12: Color,
    val whiteANegative11: Color,
    val whiteANegative10: Color,
    val whiteANegative1: Color,
    val whiteA0: Color,
)

data class RedValuesContainer1 (
    val red8: Color,
    val red7: Color,
    val red6: Color,
    val red5: Color,
    val red4: Color,
    val red3: Color,
    val red2: Color,
    val red1: Color,
    val red0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class MagentaValuesContainer1 (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val magenta8: Color,
    val magenta7: Color,
    val magenta6: Color,
    val magenta5: Color,
    val magenta4: Color,
    val magenta3: Color,
    val magenta2: Color,
    val magenta1: Color,
    val magenta0: Color,
)

data class PurpleValuesContainer1 (
    val purple8: Color,
    val purple7: Color,
    val purple6: Color,
    val purple5: Color,
    val purple4: Color,
    val purple3: Color,
    val purple2: Color,
    val purple1: Color,
    val purple0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class VioletValuesContainer1 (
    val violet8: Color,
    val violet7: Color,
    val violet6: Color,
    val violet5: Color,
    val violet4: Color,
    val violet3: Color,
    val violet2: Color,
    val violet1: Color,
    val violet0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class BlueValuesContainer1 (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val blue8: Color,
    val blue7: Color,
    val blue6: Color,
    val blue5: Color,
    val blue4: Color,
    val blue3: Color,
    val blue2: Color,
    val blue1: Color,
    val blue0: Color,
)

data class CyanValuesContainer1 (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val cyan8: Color,
    val cyan7: Color,
    val cyan6: Color,
    val cyan5: Color,
    val cyan4: Color,
    val cyan3: Color,
    val cyan2: Color,
    val cyan1: Color,
    val cyan0: Color,
)

data class TealValuesContainer1 (
    val teal8: Color,
    val teal7: Color,
    val teal6: Color,
    val teal5: Color,
    val teal4: Color,
    val teal3: Color,
    val teal2: Color,
    val teal1: Color,
    val teal0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class AquamarineValuesContainer1 (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val aquamarine8: Color,
    val aquamarine7: Color,
    val aquamarine6: Color,
    val aquamarine5: Color,
    val aquamarine4: Color,
    val aquamarine3: Color,
    val aquamarine2: Color,
    val aquamarine1: Color,
    val aquamarine0: Color,
)

data class GreenValuesContainer1 (
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
    val green8: Color,
    val green7: Color,
    val green6: Color,
    val green5: Color,
    val green4: Color,
    val green3: Color,
    val green2: Color,
    val green1: Color,
    val green0: Color,
)

data class OrangeValuesContainer1 (
    val orange8: Color,
    val orange7: Color,
    val orange6: Color,
    val orange5: Color,
    val orange4: Color,
    val orange3: Color,
    val orange2: Color,
    val orange1: Color,
    val orange0: Color,
    val negative4: Color,
    val negative3: Color,
    val negative2: Color,
    val negative1: Color,
)

data class TransparentValuesContainer (
    val transparent: Color,
)

data class ColorValuesContainer (
    val whiteAlpha: WhiteAlphaValuesContainer,
    val warmGrayAlpha: WarmGrayAlphaValuesContainer,
    val warmGray: WarmGrayValuesContainer,
    val violet: VioletValuesContainer1,
    val transparent: TransparentValuesContainer,
    val teal: TealValuesContainer1,
    val semantic: SemanticValuesContainer,
    val red: RedValuesContainer1,
    val purple: PurpleValuesContainer1,
    val orange: OrangeValuesContainer1,
    val nonSemantic: NonSemanticValuesContainer,
    val neutralGrayAlpha: NeutralGrayAlphaValuesContainer,
    val neutralGray: NeutralGrayValuesContainer,
    val magenta: MagentaValuesContainer1,
    val interaction: InteractionValuesContainer,
    val green: GreenValuesContainer1,
    val cyan: CyanValuesContainer1,
    val coolGrayAlpha: CoolGrayAlphaValuesContainer,
    val coolGray: CoolGrayValuesContainer,
    val content: ContentValuesContainer,
    val border: BorderValuesContainer,
    val blue: BlueValuesContainer1,
    val background: BackgroundValuesContainer,
    val aquamarine: AquamarineValuesContainer1,
    val action: ActionValuesContainer,
)

data class BorderWidthValuesContainer (
    val xLarge: Double,
    val small: Double,
    val none: Double,
    val medium: Double,
    val large: Double,
    val focus: Double,
    val borderWidth800: Double,
    val borderWidth400: Double,
    val borderWidth200: Double,
    val borderWidth100: Double,
    val borderWidth0: Double,
)

data class BorderRadiusValuesContainer (
    val xLarge: Double,
    val small: Double,
    val none: Double,
    val medium: Double,
    val large: Double,
    val full: Double,
    val borderRadius999: Double,
    val borderRadius50: Double,
    val borderRadius4xLarge: Double,
    val borderRadius3xLarge: Double,
    val borderRadius300: Double,
    val borderRadius2xLarge: Double,
    val borderRadius250: Double,
    val borderRadius25: Double,
    val borderRadius200: Double,
    val borderRadius150: Double,
    val borderRadius100: Double,
    val borderRadius0: Double,
)

data class SizeValuesContainer (
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

data class PaddingValuesContainer (
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

data class GapValuesContainer (
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

data class SpaceValuesContainer (
    val padding: PaddingValuesContainer,
    val gap: GapValuesContainer,
)

data class OpacityValuesContainer (
    val opacity50: Double,
    val opacity100: Double,
    val opacity0: Double,
    val disabled: Double,
)

data class Typography (
    val lineHeight: Double,
    val letterSpacing: Double,
    val fontWeight: Double,
    val fontSize: Double,
    val fontFamily: String,
)

data class CodeValuesContainer (
    val typographyCodeSmall: Typography,
    val typographyCodeMedium: Typography,
    val typographyCodeLarge: Typography,
)

data class UtilityValuesContainer (
    val typographyUtilitySmall: Typography,
    val typographyUtilityMedium: Typography,
    val typographyUtilityLarge: Typography,
)

data class BodyValuesContainer (
    val typographyBodySmall: Typography,
    val typographyBodyMedium: Typography,
    val typographyBodyLarge: Typography,
)

data class HeadingValuesContainer (
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

data class DisplayValuesContainer (
    val typographyDisplayXLarge: Typography,
    val typographyDisplaySmall: Typography,
    val typographyDisplayMedium: Typography,
    val typographyDisplayLarge: Typography,
    val typographyDisplay3xLarge: Typography,
    val typographyDisplay2xLarge: Typography,
)

data class TypographyValuesContainer (
    val utility: UtilityValuesContainer,
    val heading: HeadingValuesContainer,
    val display: DisplayValuesContainer,
    val code: CodeValuesContainer,
    val body: BodyValuesContainer,
)

data class DimensionValuesContainer (
    val dimension900: Double,
    val dimension800: Double,
    val dimension700: Double,
    val dimension600: Double,
    val dimension550: Double,
    val dimension500: Double,
    val dimension50: Double,
    val dimension400: Double,
    val dimension300: Double,
    val dimension250: Double,
    val dimension25: Double,
    val dimension200: Double,
    val dimension1600: Double,
    val dimension1500: Double,
    val dimension150: Double,
    val dimension1200: Double,
    val dimension1000: Double,
    val dimension100: Double,
    val dimension0: Double,
)

data class BoxShadow (
    val y: Double,
    val x: Double,
    val type: String,
    val spread: Double,
    val color: String,
    val blur: Double,
)

data class BottomValuesContainer (
    val elevationBottom400: List<BoxShadow>,
    val elevationBottom300: List<BoxShadow>,
    val elevationBottom200: List<BoxShadow>,
    val elevationBottom100: BoxShadow,
)

data class TopValuesContainer (
    val elevationTop400: List<BoxShadow>,
    val elevationTop300: List<BoxShadow>,
    val elevationTop200: List<BoxShadow>,
    val elevationTop100: BoxShadow,
)

data class ElevationValuesContainer (
    val top: TopValuesContainer,
    val bottom: BottomValuesContainer,
)

data class FontFamilyValuesContainer (
    val serif: String,
    val sans: String,
    val mono: String,
)

data class FontSizeValuesContainer (
    val fontSize950: Double,
    val fontSize850: Double,
    val fontSize750: Double,
    val fontSize675: Double,
    val fontSize600: Double,
    val fontSize525: Double,
    val fontSize450: Double,
    val fontSize400: Double,
    val fontSize350: Double,
    val fontSize300: Double,
    val fontSize250: Double,
    val fontSize225: Double,
    val fontSize200: Double,
    val fontSize175: Double,
    val fontSize150: Double,
    val fontSize125: Double,
    val fontSize1150: Double,
    val fontSize1050: Double,
    val fontSize100: Double,
)

data class FontWeightValuesContainer (
    val fontWeight700: Double,
    val fontWeight600: Double,
    val fontWeight500: Double,
    val fontWeight400: Double,
    val fontWeight300: Double,
)

data class LetterSpacingValuesContainer (
    val letterSpacing700: Double,
    val letterSpacing600: Double,
    val letterSpacing500: Double,
    val letterSpacing400: Double,
    val letterSpacing300: Double,
    val letterSpacing200: Double,
    val letterSpacing100: Double,
    val letterSpacing0: Double,
)

data class LineHeightValuesContainer (
    val value900: Double,
    val value825: Double,
    val value725: Double,
    val value700: Double,
    val value600: Double,
    val value525: Double,
    val value475: Double,
    val value400: Double,
    val value325: Double,
    val value300: Double,
    val value275: Double,
    val value250: Double,
    val value200: Double,
    val value150: Double,
    val value1400: Double,
    val value1275: Double,
    val value1150: Double,
    val value1025: Double,
)