package com.b_labs.fiber_retail


import androidx.compose.ui.graphics.Color
import com.b_labs.fiber_tokens.ActionValuesContainer1
import com.b_labs.fiber_tokens.AquamarineValuesContainer2
import com.b_labs.fiber_tokens.AquamarineValuesContainer3
import com.b_labs.fiber_tokens.BackgroundValuesContainer2
import com.b_labs.fiber_tokens.BackgroundValuesContainer3
import com.b_labs.fiber_tokens.BlueValuesContainer2
import com.b_labs.fiber_tokens.BlueValuesContainer3
import com.b_labs.fiber_tokens.BodyValuesContainer1
import com.b_labs.fiber_tokens.BorderValuesContainer2
import com.b_labs.fiber_tokens.BorderValuesContainer3
import com.b_labs.fiber_tokens.BorderWidthValuesContainer1
import com.b_labs.fiber_tokens.BottomValuesContainer1
import com.b_labs.fiber_tokens.BoxShadow
import com.b_labs.fiber_tokens.BrandValuesContainer1
import com.b_labs.fiber_tokens.CodeValuesContainer1
import com.b_labs.fiber_tokens.ColorValuesContainer1
import com.b_labs.fiber_tokens.ContentValuesContainer1
import com.b_labs.fiber_tokens.CoolGrayAlphaValuesContainer1
import com.b_labs.fiber_tokens.CoolGrayValuesContainer1
import com.b_labs.fiber_tokens.CyanValuesContainer2
import com.b_labs.fiber_tokens.CyanValuesContainer3
import com.b_labs.fiber_tokens.DangerValuesContainer3
import com.b_labs.fiber_tokens.DangerValuesContainer4
import com.b_labs.fiber_tokens.DangerValuesContainer5
import com.b_labs.fiber_tokens.DefaultValuesContainer1

import com.b_labs.fiber_tokens.DesignSystem
import com.b_labs.fiber_tokens.DimensionValuesContainer1
import com.b_labs.fiber_tokens.DisabledValuesContainer1
import com.b_labs.fiber_tokens.DisplayValuesContainer1
import com.b_labs.fiber_tokens.ElevationValuesContainer1
import com.b_labs.fiber_tokens.FocusValuesContainer1
import com.b_labs.fiber_tokens.FontFamilyValuesContainer1
import com.b_labs.fiber_tokens.FontSizeValuesContainer1
import com.b_labs.fiber_tokens.FontWeightValuesContainer1
import com.b_labs.fiber_tokens.GapValuesContainer1
import com.b_labs.fiber_tokens.GhostValuesContainer2
import com.b_labs.fiber_tokens.GhostValuesContainer3
import com.b_labs.fiber_tokens.GrayValuesContainer1
import com.b_labs.fiber_tokens.GreenValuesContainer2
import com.b_labs.fiber_tokens.GreenValuesContainer3
import com.b_labs.fiber_tokens.HeadingValuesContainer1
import com.b_labs.fiber_tokens.InfoValuesContainer1
import com.b_labs.fiber_tokens.InteractionValuesContainer1
import com.b_labs.fiber_tokens.InverseValuesContainer2
import com.b_labs.fiber_tokens.InverseValuesContainer3
import com.b_labs.fiber_tokens.LetterSpacingValuesContainer1
import com.b_labs.fiber_tokens.LineHeightValuesContainer1
import com.b_labs.fiber_tokens.MagentaValuesContainer2
import com.b_labs.fiber_tokens.MagentaValuesContainer3
import com.b_labs.fiber_tokens.NeutralAlphaValuesContainer1
import com.b_labs.fiber_tokens.NeutralGrayAlphaValuesContainer1
import com.b_labs.fiber_tokens.NeutralGrayValuesContainer1
import com.b_labs.fiber_tokens.NeutralValuesContainer3
import com.b_labs.fiber_tokens.NeutralValuesContainer4
import com.b_labs.fiber_tokens.NeutralValuesContainer5
import com.b_labs.fiber_tokens.NonSemanticValuesContainer1
import com.b_labs.fiber_tokens.OpacityValuesContainer1
import com.b_labs.fiber_tokens.OrangeValuesContainer2
import com.b_labs.fiber_tokens.OrangeValuesContainer3
import com.b_labs.fiber_tokens.OutlineValuesContainer1
import com.b_labs.fiber_tokens.PaddingValuesContainer1
import com.b_labs.fiber_tokens.PrimaryValuesContainer1
import com.b_labs.fiber_tokens.PurpleValuesContainer2
import com.b_labs.fiber_tokens.PurpleValuesContainer3
import com.b_labs.fiber_tokens.RedValuesContainer2
import com.b_labs.fiber_tokens.RedValuesContainer3
import com.b_labs.fiber_tokens.ReverseInverseValuesContainer1
import com.b_labs.fiber_tokens.SemanticValuesContainer1
import com.b_labs.fiber_tokens.SizeValuesContainer1
import com.b_labs.fiber_tokens.SpaceValuesContainer1
import com.b_labs.fiber_tokens.SuccessValuesContainer2
import com.b_labs.fiber_tokens.SuccessValuesContainer3
import com.b_labs.fiber_tokens.TealValuesContainer2
import com.b_labs.fiber_tokens.TealValuesContainer3
import com.b_labs.fiber_tokens.TopValuesContainer1
import com.b_labs.fiber_tokens.TransparentValuesContainer1
import com.b_labs.fiber_tokens.Typography
import com.b_labs.fiber_tokens.TypographyValuesContainer1
import com.b_labs.fiber_tokens.UtilityValuesContainer1
import com.b_labs.fiber_tokens.VioletValuesContainer2
import com.b_labs.fiber_tokens.VioletValuesContainer3
import com.b_labs.fiber_tokens.WarmGrayAlphaValuesContainer1
import com.b_labs.fiber_tokens.WarmGrayValuesContainer1
import com.b_labs.fiber_tokens.WarningValuesContainer1
import com.b_labs.fiber_tokens.WhiteAlphaValuesContainer1
import com.b_labs.fiber_tokens.WhiteValuesContainer1

val designSystem = DesignSystem(
    color = ColorValuesContainer1(
        content = ContentValuesContainer1(
            primary = Color(0xFFFF9800),
            secondary = Color(0xFFFFFFFF),
            tertiary = Color(0xFFD14646),
            disabled = Color(0xFFD14646),
            primaryInverse = Color(0xFFD14646),
            secondaryInverse = Color(0xFFD14646),
            tertiaryInverse = Color(0xFFD14646),
            disabledInverse = Color(0xFFD14646),
            infoPrimary = Color(0xFFD14646),
            infoSecondary = Color(0xFFD14646),
            successPrimary = Color(0xFFD14646),
            successSecondary = Color(0xFFD14646),
            warningPrimary = Color(0xFFD14646),
            warningSecondary = Color(0xFFD14646),
            dangerPrimary = Color(0xFFD14646),
            dangerSecondary = Color(0xFFD14646),
            brandPrimary = Color(0xFFD14646),
            brandSecondary = Color(0xFFD14646)
        ), border = BorderValuesContainer2(
            default = Color(0xFFD14646),
            defaultA = Color(0xFFD14646),
            inverse = Color(0xFFD14646),
            neutralStrong = Color(0xFFD14646),
            neutralSubtle = Color(0xFFD14646),
            infoStrong = Color(0xFFD14646),
            infoSubtle = Color(0xFFD14646),
            successStrong = Color(0xFFD14646),
            successSubtle = Color(0xFFD14646),
            warningStrong = Color(0xFFD14646),
            warningSubtle = Color(0xFFD14646),
            dangerStrong = Color(0xFFD14646),
            dangerSubtle = Color(0xFFD14646)
        ), background = BackgroundValuesContainer2(
            default = Color(0xFFD14646),
            inverse = Color(0xFFD14646),
            neutralStrong = Color(0xFFD14646),
            neutralMuted = Color(0xFFD14646),
            neutralOnSubtle = Color(0xFFD14646),
            neutralSubtle = Color(0xFFD14646),
            neutralSurface = Color(0xFFD14646),
            infoStrong = Color(0xFFD14646),
            infoMuted = Color(0xFFD14646),
            infoOnSubtle = Color(0xFFD14646),
            infoSubtle = Color(0xFFD14646),
            infoSurface = Color(0xFFD14646),
            successStrong = Color(0xFFD14646),
            successMuted = Color(0xFFD14646),
            successOnSubtle = Color(0xFFD14646),
            successSubtle = Color(0xFFD14646),
            successSurface = Color(0xFFD14646),
            warningStrong = Color(0xFFD14646),
            warningMuted = Color(0xFFD14646),
            warningOnSubtle = Color(0xFFD14646),
            warningSubtle = Color(0xFFD14646),
            warningSurface = Color(0xFFD14646),
            dangerStrong = Color(0xFFD14646),
            dangerMuted = Color(0xFFD14646),
            dangerOnSubtle = Color(0xFFD14646),
            dangerSubtle = Color(0xFFD14646),
            dangerSurface = Color(0xFFD14646),
            brandStrong = Color(0xFFD14646),
            brandMuted = Color(0xFFD14646),
            brandOnSubtle = Color(0xFFD14646),
            brandSurface = Color(0xFFD14646),
            brandSubtle = Color(0xFFD14646)
        ), action = ActionValuesContainer1(
            primary = PrimaryValuesContainer1(
                actionPrimaryNormal = Color(0xFFD14646),
                actionPrimaryHover = Color(0xFFD14646),
                actionPrimaryActive = Color(0xFFD14646),
                actionPrimarySelected = Color(0xFFD14646),
                actionPrimarySubtleNormal = Color(0xFFD14646),
                actionPrimarySubtleHover = Color(0xFFD14646),
                actionPrimarySubtleActive = Color(0xFFD14646),
                actionPrimarySubtleSelected = Color(0xFFD14646)
            ), neutral = NeutralValuesContainer3(
                actionNeutralNormal = Color(0xFFD14646),
                actionNeutralHover = Color(0xFFD14646),
                actionNeutralActive = Color(0xFFD14646),
                actionNeutralSelected = Color(0xFFD14646),
                actionNeutralSubtleNormal = Color(0xFFD14646),
                actionNeutralSubtleHover = Color(0xFFD14646),
                actionNeutralSubtleActive = Color(0xFFD14646),
                actionNeutralSubtleSelected = Color(0xFFD14646)
            ), success = SuccessValuesContainer2(
                actionSuccessNormal = Color(0xFFD14646),
                actionSuccessHover = Color(0xFFD14646),
                actionSuccessActive = Color(0xFFD14646),
                actionSuccessSelected = Color(0xFFD14646),
                actionSuccessSubtleNormal = Color(0xFFD14646),
                actionSuccessSubtleHover = Color(0xFFD14646),
                actionSuccessSubtleActive = Color(0xFFD14646),
                actionSuccessSubtleSelected = Color(0xFFD14646)
            ), danger = DangerValuesContainer3(
                actionDangerNormal = Color(0xFFD14646),
                actionDangerHover = Color(0xFFD14646),
                actionDangerActive = Color(0xFFD14646),
                actionDangerSelected = Color(0xFFD14646),
                actionDangerSubtleNormal = Color(0xFFD14646),
                actionDangerSubtleHover = Color(0xFFD14646),
                actionDangerSubtleActive = Color(0xFFD14646),
                actionDangerSubtleSelected = Color(0xFFD14646)
            ), ghost = GhostValuesContainer2(
                actionGhostNormal = Color(0xFFD14646),
                actionGhostHover = Color(0xFFD14646),
                actionGhostActive = Color(0xFFD14646),
                actionGhostSelected = Color(0xFFD14646),
                actionGhostInverseHover = Color(0xFFD14646),
                actionGhostInverseActive = Color(0xFFD14646),
                actionGhostInverseSelected = Color(0xFFD14646),
                actionGhostDangerHover = Color(0xFFD14646),
                actionGhostDangerActive = Color(0xFFD14646),
                actionGhostDangerSelected = Color(0xFFD14646)
            ), outline = OutlineValuesContainer1(
                actionOutlineNormal = Color(0xFFD14646),
                actionOutlineHover = Color(0xFFD14646),
                actionOutlineActive = Color(0xFFD14646),
                actionOutlineSelected = Color(0xFFD14646)
            ), inverse = InverseValuesContainer2(
                actionInverseNormal = Color(0xFFD14646),
                actionInverseHover = Color(0xFFD14646),
                actionInverseActive = Color(0xFFD14646),
                actionInverseSelected = Color(0xFFD14646)
            ), reverseInverse = ReverseInverseValuesContainer1(
                actionReverseInverseNormal = Color(0xFFD14646),
                actionReverseInverseHover = Color(0xFFD14646),
                actionReverseInverseActive = Color(0xFFD14646),
                actionReverseInverseSelected = Color(0xFFD14646)
            )
        ), interaction = InteractionValuesContainer1(
            default = DefaultValuesContainer1(
                interactionDefaultNormal = Color(0xFFD14646),
                interactionDefaultHover = Color(0xFFD14646),
                interactionDefaultActive = Color(0xFFD14646),
                interactionDefaultSelected = Color(0xFFD14646),
                interactionDefaultSubtleNormal = Color(0xFFD14646),
                interactionDefaultSubtleHover = Color(0xFFD14646),
                interactionDefaultSubtleActive = Color(0xFFD14646),
                interactionDefaultSubtleSelected = Color(0xFFD14646)
            ), neutral = NeutralValuesContainer4(
                interactionNeutralNormal = Color(0xFFD14646),
                interactionNeutralHover = Color(0xFFD14646),
                interactionNeutralActive = Color(0xFFD14646),
                interactionNeutralSelected = Color(0xFFD14646),
                interactionNeutralSubtleNormal = Color(0xFFD14646),
                interactionNeutralSubtleHover = Color(0xFFD14646),
                interactionNeutralSubtleActive = Color(0xFFD14646),
                interactionNeutralSubtleSelected = Color(0xFFD14646)
            ), danger = DangerValuesContainer4(
                interactionDangerNormal = Color(0xFFD14646),
                interactionDangerHover = Color(0xFFD14646),
                interactionDangerActive = Color(0xFFD14646),
                interactionDangerSelected = Color(0xFFD14646),
                interactionDangerSubtleNormal = Color(0xFFD14646),
                interactionDangerSubtleHover = Color(0xFFD14646),
                interactionDangerSubtleActive = Color(0xFFD14646),
                interactionDangerSubtleSelected = Color(0xFFD14646)
            ), ghost = GhostValuesContainer3(
                interactionGhostNormal = Color(0xFFD14646),
                interactionGhostHover = Color(0xFFD14646),
                interactionGhostActive = Color(0xFFD14646),
                interactionGhostSelected = Color(0xFFD14646),
                interactionGhostInverseHover = Color(0xFFD14646),
                interactionGhostInverseNormal = Color(0xFFD14646),
                interactionGhostInverseSelected = Color(0xFFD14646),
                interactionGhostDangerHover = Color(0xFFD14646),
                interactionGhostDangerNormal = Color(0xFFD14646),
                interactionGhostDangerSelected = Color(0xFFD14646)
            ), disabled = DisabledValuesContainer1(
                interactionDisabledNormal = Color(0xFFD14646),
                interactionDisabledHover = Color(0xFFD14646),
                interactionDisabledActive = Color(0xFFD14646),
                interactionDisabledSubtleNormal = Color(0xFFD14646),
                interactionDisabledSubtleHover = Color(0xFFD14646),
                interactionDisabledSubtleActive = Color(0xFFD14646)
            ), border = BorderValuesContainer3(
                interactionBorderNormal = Color(0xFFD14646),
                interactionBorderHover = Color(0xFFD14646),
                interactionBorderActive = Color(0xFFD14646),
                interactionBorderSelected = Color(0xFFD14646),
                interactionBorderNeutralNormal = Color(0xFFD14646),
                interactionBorderNeutralHover = Color(0xFFD14646),
                interactionBorderNeutralActive = Color(0xFFD14646),
                interactionBorderNeutralSelected = Color(0xFFD14646),
                interactionBorderDanger = Color(0xFFD14646)
            ), background = BackgroundValuesContainer3(
                interactionBackgroundModal = Color(0xFFD14646),
                interactionBackgroundModeless = Color(0xFFD14646),
                interactionBackgroundModelessInverse = Color(0xFFD14646),
                interactionBackgroundSidepanel = Color(0xFFD14646),
                interactionBackgroundFormField = Color(0xFFD14646),
                interactionBackgroundDimmer = Color(0xFFD14646)
            ), inverse = InverseValuesContainer3(
                interactionInverseNormal = Color(0xFFD14646),
                interactionInverseHover = Color(0xFFD14646),
                interactionInverseActive = Color(0xFFD14646),
                interactionInverseSelected = Color(0xFFD14646)
            ), focus = FocusValuesContainer1(interactionFocusDefault = Color(0xFFD14646))
        ), nonSemantic = NonSemanticValuesContainer1(
            gray = GrayValuesContainer1(
                nonSemanticGrayContentPrimary = Color(0xFFD14646),
                nonSemanticGrayContentSecondary = Color(0xFFD14646),
                nonSemanticGrayBorderDefault = Color(0xFFD14646),
                nonSemanticGrayBorderStrong = Color(0xFFD14646),
                nonSemanticGrayBorderSubtle = Color(0xFFD14646),
                nonSemanticGrayBackgroundStrong = Color(0xFFD14646),
                nonSemanticGrayBackgroundMuted = Color(0xFFD14646),
                nonSemanticGrayBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticGrayBackgroundSubtle = Color(0xFFD14646),
                nonSemanticGrayBackgroundSurface = Color(0xFFD14646)
            ),
            white = WhiteValuesContainer1(
                nonSemanticWhiteContentPrimary = Color(0xFFD14646),
                nonSemanticWhiteContentSecondary = Color(0xFFD14646),
                nonSemanticWhiteBorderDefault = Color(0xFFD14646),
                nonSemanticWhiteBorderStrong = Color(0xFFD14646),
                nonSemanticWhiteBorderSubtle = Color(0xFFD14646),
                nonSemanticWhiteBackgroundStrong = Color(0xFFD14646),
                nonSemanticWhiteBackgroundMuted = Color(0xFFD14646),
                nonSemanticWhiteBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticWhiteBackgroundSubtle = Color(0xFFD14646),
                nonSemanticWhiteBackgroundSurface = Color(0xFFD14646)
            ), red = RedValuesContainer2(
                nonSemanticRedContentPrimary = Color(0xFFD14646),
                nonSemanticRedContentSecondary = Color(0xFFD14646),
                nonSemanticRedBorderDefault = Color(0xFFD14646),
                nonSemanticRedBorderStrong = Color(0xFFD14646),
                nonSemanticRedBorderSubtle = Color(0xFFD14646),
                nonSemanticRedBackgroundStrong = Color(0xFFD14646),
                nonSemanticRedBackgroundMuted = Color(0xFFD14646),
                nonSemanticRedBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticRedBackgroundSubtle = Color(0xFFD14646),
                nonSemanticRedBackgroundSurface = Color(0xFFD14646)
            ), magenta = MagentaValuesContainer2(
                nonSemanticMagentaContentPrimary = Color(0xFFD14646),
                nonSemanticMagentaContentSecondary = Color(0xFFD14646),
                nonSemanticMagentaBorderDefault = Color(0xFFD14646),
                nonSemanticMagentaBorderStrong = Color(0xFFD14646),
                nonSemanticMagentaBorderSubtle = Color(0xFFD14646),
                nonSemanticMagentaBackgroundStrong = Color(0xFFD14646),
                nonSemanticMagentaBackgroundMuted = Color(0xFFD14646),
                nonSemanticMagentaBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticMagentaBackgroundSubtle = Color(0xFFD14646),
                nonSemanticMagentaBackgroundSurface = Color(0xFFD14646)
            ), purple = PurpleValuesContainer2(
                nonSemanticPurpleContentPrimary = Color(0xFFD14646),
                nonSemanticPurpleContentSecondary = Color(0xFFD14646),
                nonSemanticPurpleBorderDefault = Color(0xFFD14646),
                nonSemanticPurpleBorderStrong = Color(0xFFD14646),
                nonSemanticPurpleBorderSubtle = Color(0xFFD14646),
                nonSemanticPurpleBackgroundStrong = Color(0xFFD14646),
                nonSemanticPurpleBackgroundMuted = Color(0xFFD14646),
                nonSemanticPurpleBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticPurpleBackgroundSubtle = Color(0xFFD14646),
                nonSemanticPurpleBackgroundSurface = Color(0xFFD14646)
            ), violet = VioletValuesContainer2(
                nonSemanticVioletContentPrimary = Color(0xFFD14646),
                nonSemanticVioletContentSecondary = Color(0xFFD14646),
                nonSemanticVioletBorderDefault = Color(0xFFD14646),
                nonSemanticVioletBorderStrong = Color(0xFFD14646),
                nonSemanticVioletBorderSubtle = Color(0xFFD14646),
                nonSemanticVioletBackgroundStrong = Color(0xFFD14646),
                nonSemanticVioletBackgroundMuted = Color(0xFFD14646),
                nonSemanticVioletBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticVioletBackgroundSubtle = Color(0xFFD14646),
                nonSemanticVioletBackgroundSurface = Color(0xFFD14646)
            ), blue = BlueValuesContainer2(
                nonSemanticBlueContentPrimary = Color(0xFFD14646),
                nonSemanticBlueContentSecondary = Color(0xFFD14646),
                nonSemanticBlueBorderDefault = Color(0xFFD14646),
                nonSemanticBlueBorderStrong = Color(0xFFD14646),
                nonSemanticBlueBorderSubtle = Color(0xFFD14646),
                nonSemanticBlueBackgroundStrong = Color(0xFFD14646),
                nonSemanticBlueBackgroundMuted = Color(0xFFD14646),
                nonSemanticBlueBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticBlueBackgroundSubtle = Color(0xFFD14646),
                nonSemanticBlueBackgroundSurface = Color(0xFFD14646)
            ), cyan = CyanValuesContainer2(
                nonSemanticCyanContentPrimary = Color(0xFFD14646),
                nonSemanticCyanContentSecondary = Color(0xFFD14646),
                nonSemanticCyanBorderDefault = Color(0xFFD14646),
                nonSemanticCyanBorderStrong = Color(0xFFD14646),
                nonSemanticCyanBorderSubtle = Color(0xFFD14646),
                nonSemanticCyanBackgroundStrong = Color(0xFFD14646),
                nonSemanticCyanBackgroundMuted = Color(0xFFD14646),
                nonSemanticCyanBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticCyanBackgroundSubtle = Color(0xFFD14646),
                nonSemanticCyanBackgroundSurface = Color(0xFFD14646)
            ), teal = TealValuesContainer2(
                nonSemanticTealContentPrimary = Color(0xFFD14646),
                nonSemanticTealContentSecondary = Color(0xFFD14646),
                nonSemanticTealBorderDefault = Color(0xFFD14646),
                nonSemanticTealBorderStrong = Color(0xFFD14646),
                nonSemanticTealBorderSubtle = Color(0xFFD14646),
                nonSemanticTealBackgroundStrong = Color(0xFFD14646),
                nonSemanticTealBackgroundMuted = Color(0xFFD14646),
                nonSemanticTealBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticTealBackgroundSubtle = Color(0xFFD14646),
                nonSemanticTealBackgroundSurface = Color(0xFFD14646)
            ), aquamarine = AquamarineValuesContainer2(
                nonSemanticAquamarineContentPrimary = Color(0xFFD14646),
                nonSemanticAquamarineContentSecondary = Color(0xFFD14646),
                nonSemanticAquamarineBorderDefault = Color(0xFFD14646),
                nonSemanticAquamarineBorderStrong = Color(0xFFD14646),
                nonSemanticAquamarineBorderSubtle = Color(0xFFD14646),
                nonSemanticAquamarineBackgroundStrong = Color(0xFFD14646),
                nonSemanticAquamarineBackgroundMuted = Color(0xFFD14646),
                nonSemanticAquamarineBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticAquamarineBackgroundSubtle = Color(0xFFD14646),
                nonSemanticAquamarineBackgroundSurface = Color(0xFFD14646)
            ), green = GreenValuesContainer2(
                nonSemanticGreenContentPrimary = Color(0xFFD14646),
                nonSemanticGreenContentSecondary = Color(0xFFD14646),
                nonSemanticGreenBorderDefault = Color(0xFFD14646),
                nonSemanticGreenBorderStrong = Color(0xFFD14646),
                nonSemanticGreenBorderSubtle = Color(0xFFD14646),
                nonSemanticGreenBackgroundStrong = Color(0xFFD14646),
                nonSemanticGreenBackgroundMuted = Color(0xFFD14646),
                nonSemanticGreenBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticGreenBackgroundSubtle = Color(0xFFD14646),
                nonSemanticGreenBackgroundSurface = Color(0xFFD14646)
            ), orange = OrangeValuesContainer2(
                nonSemanticOrangeContentPrimary = Color(0xFFD14646),
                nonSemanticOrangeContentSecondary = Color(0xFFD14646),
                nonSemanticOrangeBorderDefault = Color(0xFFD14646),
                nonSemanticOrangeBorderStrong = Color(0xFFD14646),
                nonSemanticOrangeBorderSubtle = Color(0xFFD14646),
                nonSemanticOrangeBackgroundStrong = Color(0xFFD14646),
                nonSemanticOrangeBackgroundMuted = Color(0xFFD14646),
                nonSemanticOrangeBackgroundOnSubtle = Color(0xFFD14646),
                nonSemanticOrangeBackgroundSubtle = Color(0xFFD14646),
                nonSemanticOrangeBackgroundSurface = Color(0xFFD14646)
            )
        ), semantic = SemanticValuesContainer1(
            brand = BrandValuesContainer1(
                semanticBrandNegative4 = Color(0xFFD14646),
                semanticBrandNegative3 = Color(0xFFD14646),
                semanticBrandNegative2 = Color(0xFFD14646),
                semanticBrandNegative1 = Color(0xFFD14646),
                semanticBrand0 = Color(0xFFD14646),
                semanticBrand1 = Color(0xFFD14646),
                semanticBrand2 = Color(0xFFD14646),
                semanticBrand3 = Color(0xFFD14646),
                semanticBrand4 = Color(0xFFD14646),
                semanticBrand5 = Color(0xFFD14646),
                semanticBrand6 = Color(0xFFD14646),
                semanticBrand7 = Color(0xFFD14646),
                semanticBrand8 = Color(0xFFD14646)
            ), neutral = NeutralValuesContainer5(
                semanticNeutralNegative4 = Color(0xFFD14646),
                semanticNeutralNegative3 = Color(0xFFD14646),
                semanticNeutralNegative2 = Color(0xFFD14646),
                semanticNeutralNegative1 = Color(0xFFD14646),
                semanticNeutral0 = Color(0xFFD14646),
                semanticNeutral1 = Color(0xFFD14646),
                semanticNeutral2 = Color(0xFFD14646),
                semanticNeutral3 = Color(0xFFD14646),
                semanticNeutral4 = Color(0xFFD14646),
                semanticNeutral5 = Color(0xFFD14646),
                semanticNeutral6 = Color(0xFFD14646),
                semanticNeutral7 = Color(0xFFD14646),
                semanticNeutral8 = Color(0xFFD14646)
            ), neutralAlpha = NeutralAlphaValuesContainer1(
                semanticNeutralANegative4 = Color(0xFFD14646),
                semanticNeutralANegative3 = Color(0xFFD14646),
                semanticNeutralANegative2 = Color(0xFFD14646),
                semanticNeutralANegative1 = Color(0xFFD14646),
                semanticNeutralA0 = Color(0xFFD14646),
                semanticNeutralA1 = Color(0xFFD14646),
                semanticNeutralA2 = Color(0xFFD14646),
                semanticNeutralA3 = Color(0xFFD14646),
                semanticNeutralA4 = Color(0xFFD14646),
                semanticNeutralA5 = Color(0xFFD14646),
                semanticNeutralA6 = Color(0xFFD14646),
                semanticNeutralA7 = Color(0xFFD14646),
                semanticNeutralA8 = Color(0xFFD14646)
            ), info = InfoValuesContainer1(
                semanticInfoNegative4 = Color(0xFFD14646),
                semanticInfoNegative3 = Color(0xFFD14646),
                semanticInfoNegative2 = Color(0xFFD14646),
                semanticInfoNegative1 = Color(0xFFD14646),
                semanticInfo0 = Color(0xFFD14646),
                semanticInfo1 = Color(0xFFD14646),
                semanticInfo2 = Color(0xFFD14646),
                semanticInfo3 = Color(0xFFD14646),
                semanticInfo4 = Color(0xFFD14646),
                semanticInfo5 = Color(0xFFD14646),
                semanticInfo6 = Color(0xFFD14646),
                semanticInfo7 = Color(0xFFD14646),
                semanticInfo8 = Color(0xFFD14646)
            ), success = SuccessValuesContainer3(
                semanticSuccessNegative4 = Color(0xFFD14646),
                semanticSuccessNegative3 = Color(0xFFD14646),
                semanticSuccessNegative2 = Color(0xFFD14646),
                semanticSuccessNegative1 = Color(0xFFD14646),
                semanticSuccess0 = Color(0xFFD14646),
                semanticSuccess1 = Color(0xFFD14646),
                semanticSuccess2 = Color(0xFFD14646),
                semanticSuccess3 = Color(0xFFD14646),
                semanticSuccess4 = Color(0xFFD14646),
                semanticSuccess5 = Color(0xFFD14646),
                semanticSuccess6 = Color(0xFFD14646),
                semanticSuccess7 = Color(0xFFD14646),
                semanticSuccess8 = Color(0xFFD14646)
            ), warning = WarningValuesContainer1(
                semanticWarningNegative4 = Color(0xFFD14646),
                semanticWarningNegative3 = Color(0xFFD14646),
                semanticWarningNegative2 = Color(0xFFD14646),
                semanticWarningNegative1 = Color(0xFFD14646),
                semanticWarning0 = Color(0xFFD14646),
                semanticWarning1 = Color(0xFFD14646),
                semanticWarning2 = Color(0xFFD14646),
                semanticWarning3 = Color(0xFFD14646),
                semanticWarning4 = Color(0xFFD14646),
                semanticWarning5 = Color(0xFFD14646),
                semanticWarning6 = Color(0xFFD14646),
                semanticWarning7 = Color(0xFFD14646),
                semanticWarning8 = Color(0xFFD14646)
            ), danger = DangerValuesContainer5(
                semanticDangerNegative4 = Color(0xFFD14646),
                semanticDangerNegative3 = Color(0xFFD14646),
                semanticDangerNegative2 = Color(0xFFD14646),
                semanticDangerNegative1 = Color(0xFFD14646),
                semanticDanger0 = Color(0xFFD14646),
                semanticDanger1 = Color(0xFFD14646),
                semanticDanger2 = Color(0xFFD14646),
                semanticDanger3 = Color(0xFFD14646),
                semanticDanger4 = Color(0xFFD14646),
                semanticDanger5 = Color(0xFFD14646),
                semanticDanger6 = Color(0xFFD14646),
                semanticDanger7 = Color(0xFFD14646),
                semanticDanger8 = Color(0xFFD14646)
            )
        ), coolGray = CoolGrayValuesContainer1(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            coolGray0 = Color(0xFFD14646),
            coolGray1 = Color(0xFFD14646),
            coolGray2 = Color(0xFFD14646),
            coolGray3 = Color(0xFFD14646),
            coolGray4 = Color(0xFFD14646),
            coolGray5 = Color(0xFFD14646),
            coolGray6 = Color(0xFFD14646),
            coolGray7 = Color(0xFFD14646),
            coolGray8 = Color(0xFFD14646)
        ), coolGrayAlpha = CoolGrayAlphaValuesContainer1(
            coolGrayANegative4 = Color(0xFFD14646),
            coolGrayANegative3 = Color(0xFFD14646),
            coolGrayANegative2 = Color(0xFFD14646),
            coolGrayANegative1 = Color(0xFFD14646),
            coolGrayA0 = Color(0xFFD14646),
            coolGrayA1 = Color(0xFFD14646),
            coolGrayA2 = Color(0xFFD14646),
            coolGrayA3 = Color(0xFFD14646),
            coolGrayA4 = Color(0xFFD14646),
            coolGrayA5 = Color(0xFFD14646),
            coolGrayA6 = Color(0xFFD14646),
            coolGrayA7 = Color(0xFFD14646),
            coolGrayA8 = Color(0xFFD14646)
        ), neutralGray = NeutralGrayValuesContainer1(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            neutralGray0 = Color(0xFFD14646),
            neutralGray1 = Color(0xFFD14646),
            neutralGray2 = Color(0xFFD14646),
            neutralGray3 = Color(0xFFD14646),
            neutralGray4 = Color(0xFFD14646),
            neutralGray5 = Color(0xFFD14646),
            neutralGray6 = Color(0xFFD14646),
            neutralGray7 = Color(0xFFD14646),
            neutralGray8 = Color(0xFFD14646)
        ), neutralGrayAlpha = NeutralGrayAlphaValuesContainer1(
            neutralGrayANegative4 = Color(0xFFD14646),
            neutralGrayANegative3 = Color(0xFFD14646),
            neutralGrayANegative2 = Color(0xFFD14646),
            neutralGrayANegative1 = Color(0xFFD14646),
            neutralGrayA0 = Color(0xFFD14646),
            neutralGrayA1 = Color(0xFFD14646),
            neutralGrayA2 = Color(0xFFD14646),
            neutralGrayA3 = Color(0xFFD14646),
            neutralGrayA4 = Color(0xFFD14646),
            neutralGrayA5 = Color(0xFFD14646),
            neutralGrayA6 = Color(0xFFD14646),
            neutralGrayA7 = Color(0xFFD14646),
            neutralGrayA8 = Color(0xFFD14646)
        ), warmGray = WarmGrayValuesContainer1(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            warmGray0 = Color(0xFFD14646),
            warmGray1 = Color(0xFFD14646),
            warmGray2 = Color(0xFFD14646),
            warmGray3 = Color(0xFFD14646),
            warmGray4 = Color(0xFFD14646),
            warmGray5 = Color(0xFFD14646),
            warmGray6 = Color(0xFFD14646),
            warmGray7 = Color(0xFFD14646),
            warmGray8 = Color(0xFFD14646)
        ), warmGrayAlpha = WarmGrayAlphaValuesContainer1(
            warmGrayANegative4 = Color(0xFFD14646),
            warmGrayANegative3 = Color(0xFFD14646),
            warmGrayANegative2 = Color(0xFFD14646),
            warmGrayANegative1 = Color(0xFFD14646),
            warmGrayA0 = Color(0xFFD14646),
            warmGrayA1 = Color(0xFFD14646),
            warmGrayA2 = Color(0xFFD14646),
            warmGrayA3 = Color(0xFFD14646),
            warmGrayA4 = Color(0xFFD14646),
            warmGrayA5 = Color(0xFFD14646),
            warmGrayA6 = Color(0xFFD14646),
            warmGrayA7 = Color(0xFFD14646),
            warmGrayA8 = Color(0xFFD14646)
        ), whiteAlpha = WhiteAlphaValuesContainer1(
            whiteANegative12 = Color(0xFFD14646),
            whiteANegative11 = Color(0xFFD14646),
            whiteANegative10 = Color(0xFFD14646),
            whiteANegative9 = Color(0xFFD14646),
            whiteANegative8 = Color(0xFFD14646),
            whiteANegative7 = Color(0xFFD14646),
            whiteANegative6 = Color(0xFFD14646),
            whiteANegative5 = Color(0xFFD14646),
            whiteANegative4 = Color(0xFFD14646),
            whiteANegative3 = Color(0xFFD14646),
            whiteANegative2 = Color(0xFFD14646),
            whiteANegative1 = Color(0xFFD14646),
            whiteA0 = Color(0xFFD14646)
        ), red = RedValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            red0 = Color(0xFFD14646),
            red1 = Color(0xFFD14646),
            red2 = Color(0xFFD14646),
            red3 = Color(0xFFD14646),
            red4 = Color(0xFFD14646),
            red5 = Color(0xFFD14646),
            red6 = Color(0xFFD14646),
            red7 = Color(0xFFD14646),
            red8 = Color(0xFFD14646)
        ), magenta = MagentaValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            magenta0 = Color(0xFFD14646),
            magenta1 = Color(0xFFD14646),
            magenta2 = Color(0xFFD14646),
            magenta3 = Color(0xFFD14646),
            magenta4 = Color(0xFFD14646),
            magenta5 = Color(0xFFD14646),
            magenta6 = Color(0xFFD14646),
            magenta7 = Color(0xFFD14646),
            magenta8 = Color(0xFFD14646)
        ), purple = PurpleValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            purple0 = Color(0xFFD14646),
            purple1 = Color(0xFFD14646),
            purple2 = Color(0xFFD14646),
            purple3 = Color(0xFFD14646),
            purple4 = Color(0xFFD14646),
            purple5 = Color(0xFFD14646),
            purple6 = Color(0xFFD14646),
            purple7 = Color(0xFFD14646),
            purple8 = Color(0xFFD14646)
        ), violet = VioletValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            violet0 = Color(0xFFD14646),
            violet1 = Color(0xFFD14646),
            violet2 = Color(0xFFD14646),
            violet3 = Color(0xFFD14646),
            violet4 = Color(0xFFD14646),
            violet5 = Color(0xFFD14646),
            violet6 = Color(0xFFD14646),
            violet7 = Color(0xFFD14646),
            violet8 = Color(0xFFD14646)
        ), blue = BlueValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            blue0 = Color(0xFFD14646),
            blue1 = Color(0xFFD14646),
            blue2 = Color(0xFFD14646),
            blue3 = Color(0xFFD14646),
            blue4 = Color(0xFFD14646),
            blue5 = Color(0xFFD14646),
            blue6 = Color(0xFFD14646),
            blue7 = Color(0xFFD14646),
            blue8 = Color(0xFFD14646)
        ), cyan = CyanValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            cyan0 = Color(0xFFD14646),
            cyan1 = Color(0xFFD14646),
            cyan2 = Color(0xFFD14646),
            cyan3 = Color(0xFFD14646),
            cyan4 = Color(0xFFD14646),
            cyan5 = Color(0xFFD14646),
            cyan6 = Color(0xFFD14646),
            cyan7 = Color(0xFFD14646),
            cyan8 = Color(0xFFD14646)
        ), teal = TealValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            teal0 = Color(0xFFD14646),
            teal1 = Color(0xFFD14646),
            teal2 = Color(0xFFD14646),
            teal3 = Color(0xFFD14646),
            teal4 = Color(0xFFD14646),
            teal5 = Color(0xFFD14646),
            teal6 = Color(0xFFD14646),
            teal7 = Color(0xFFD14646),
            teal8 = Color(0xFFD14646)
        ), aquamarine = AquamarineValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            aquamarine0 = Color(0xFFD14646),
            aquamarine1 = Color(0xFFD14646),
            aquamarine2 = Color(0xFFD14646),
            aquamarine3 = Color(0xFFD14646),
            aquamarine4 = Color(0xFFD14646),
            aquamarine5 = Color(0xFFD14646),
            aquamarine6 = Color(0xFFD14646),
            aquamarine7 = Color(0xFFD14646),
            aquamarine8 = Color(0xFFD14646)
        ), green = GreenValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            green0 = Color(0xFFD14646),
            green1 = Color(0xFFD14646),
            green2 = Color(0xFFD14646),
            green3 = Color(0xFFD14646),
            green4 = Color(0xFFD14646),
            green5 = Color(0xFFD14646),
            green6 = Color(0xFFD14646),
            green7 = Color(0xFFD14646),
            green8 = Color(0xFFD14646)
        ), orange = OrangeValuesContainer3(
            negative4 = Color(0xFFD14646),
            negative3 = Color(0xFFD14646),
            negative2 = Color(0xFFD14646),
            negative1 = Color(0xFFD14646),
            orange0 = Color(0xFFD14646),
            orange1 = Color(0xFFD14646),
            orange2 = Color(0xFFD14646),
            orange3 = Color(0xFFD14646),
            orange4 = Color(0xFFD14646),
            orange5 = Color(0xFFD14646),
            orange6 = Color(0xFFD14646),
            orange7 = Color(0xFFD14646),
            orange8 = Color(0xFFD14646)
        ), transparent = TransparentValuesContainer1(transparent = Color(0xFFD14646))
    ), borderWidth = BorderWidthValuesContainer1(
        focus = 0.1,
        none = 2.3,
        small = 4.5,
        medium = 6.7,
        large = 8.9,
        xLarge = 10.11,
        borderWidth0 = 12.13,
        borderWidth100 = 14.15,
        borderWidth200 = 16.17,
        borderWidth400 = 18.19,
        borderWidth800 = 20.21
    ), size = SizeValuesContainer1(
        size3xLarge = 22.23,
        size2xLarge = 24.25,
        xLarge = 26.27,
        large = 28.29,
        medium = 30.31,
        small = 32.33,
        xSmall = 34.35,
        size2xSmall = 36.37,
        size3xSmall = 38.39
    ), space = SpaceValuesContainer1(
        padding = PaddingValuesContainer1(
            none = 40.41,
            padding2xSmall = 42.43,
            xSmall = 44.45,
            small = 46.47,
            medium = 48.49,
            large = 50.51,
            padding2xLarge = 52.53,
            padding3xLarge = 54.55,
            padding4xLarge = 56.57,
            padding5xLarge = 58.59,
            padding6xLarge = 60.61
        ), gap = GapValuesContainer1(
            none = 62.63,
            gap2xSmall = 64.65,
            xSmall = 66.67,
            small = 68.69,
            medium = 70.71,
            large = 72.73,
            xLarge = 74.75,
            gap2xLarge = 76.77,
            gap3xLarge = 78.79
        )
    ), opacity = OpacityValuesContainer1(
        disabled = 80.81,
        opacity0 = 82.83,
        opacity50 = 84.85,
        opacity100 = 86.87
    ), typography = TypographyValuesContainer1(
        code = CodeValuesContainer1(
            typographyCodeSmall = Typography(
                lineHeight = 88.89,
                letterSpacing = 90.91,
                fontWeight = 92.93,
                fontSize = 94.95,
                fontFamily = "novum"
            ), typographyCodeMedium = Typography(
                lineHeight = 96.97,
                letterSpacing = 98.99,
                fontWeight = 100.101,
                fontSize = 102.103,
                fontFamily = "sapientem"
            ), typographyCodeLarge = Typography(
                lineHeight = 104.105,
                letterSpacing = 106.107,
                fontWeight = 108.109,
                fontSize = 110.111,
                fontFamily = "labores"
            )
        ), utility = UtilityValuesContainer1(
            typographyUtilitySmall = Typography(
                lineHeight = 112.113,
                letterSpacing = 114.115,
                fontWeight = 116.117,
                fontSize = 118.119,
                fontFamily = "omittantur"
            ), typographyUtilityMedium = Typography(
                lineHeight = 120.121,
                letterSpacing = 122.123,
                fontWeight = 124.125,
                fontSize = 126.127,
                fontFamily = "praesent"
            ), typographyUtilityLarge = Typography(
                lineHeight = 128.129,
                letterSpacing = 130.131,
                fontWeight = 132.133,
                fontSize = 134.135,
                fontFamily = "liber"
            )
        ), body = BodyValuesContainer1(
            typographyBodySmall = Typography(
                lineHeight = 136.137,
                letterSpacing = 138.139,
                fontWeight = 140.141,
                fontSize = 142.143,
                fontFamily = "quas"
            ), typographyBodyMedium = Typography(
                lineHeight = 144.145,
                letterSpacing = 146.147,
                fontWeight = 148.149,
                fontSize = 150.151,
                fontFamily = "tractatos"
            ), typographyBodyLarge = Typography(
                lineHeight = 152.153,
                letterSpacing = 154.155,
                fontWeight = 156.157,
                fontSize = 158.159,
                fontFamily = "accumsan"
            )
        ), heading = HeadingValuesContainer1(
            typographyHeadingSmall = Typography(
                lineHeight = 160.161,
                letterSpacing = 162.163,
                fontWeight = 164.165,
                fontSize = 166.167,
                fontFamily = "dico"
            ), typographyHeadingMedium = Typography(
                lineHeight = 168.169,
                letterSpacing = 170.171,
                fontWeight = 172.173,
                fontSize = 174.175,
                fontFamily = "tale"
            ), typographyHeadingLarge = Typography(
                lineHeight = 176.177,
                letterSpacing = 178.179,
                fontWeight = 180.181,
                fontSize = 182.183,
                fontFamily = "adipisci"
            ), typographyHeadingXLarge = Typography(
                lineHeight = 184.185,
                letterSpacing = 186.187,
                fontWeight = 188.189,
                fontSize = 190.191,
                fontFamily = "idque"
            ), typographyHeading2xLarge = Typography(
                lineHeight = 192.193,
                letterSpacing = 194.195,
                fontWeight = 196.197,
                fontSize = 198.199,
                fontFamily = "habemus"
            ), typographyHeading3xLarge = Typography(
                lineHeight = 200.201,
                letterSpacing = 202.203,
                fontWeight = 204.205,
                fontSize = 206.207,
                fontFamily = "splendide"
            ), typographyHeading4xLarge = Typography(
                lineHeight = 208.209,
                letterSpacing = 210.211,
                fontWeight = 212.213,
                fontSize = 214.215,
                fontFamily = "quas"
            ), typographyHeading5xLarge = Typography(
                lineHeight = 216.217,
                letterSpacing = 218.219,
                fontWeight = 220.221,
                fontSize = 222.223,
                fontFamily = "repudiare"
            ), typographyHeading6xLarge = Typography(
                lineHeight = 224.225,
                letterSpacing = 226.227,
                fontWeight = 228.229,
                fontSize = 230.231,
                fontFamily = "laudem"
            ), typographyHeading7xLarge = Typography(
                lineHeight = 232.233,
                letterSpacing = 234.235,
                fontWeight = 236.237,
                fontSize = 238.239,
                fontFamily = "aperiri"
            ), typographyHeading8xLarge = Typography(
                lineHeight = 240.241,
                letterSpacing = 242.243,
                fontWeight = 244.245,
                fontSize = 246.247,
                fontFamily = "quam"
            ), typographyHeading9xLarge = Typography(
                lineHeight = 248.249,
                letterSpacing = 250.251,
                fontWeight = 252.253,
                fontSize = 254.255,
                fontFamily = "errem"
            )
        ), display = DisplayValuesContainer1(
            typographyDisplaySmall = Typography(
                lineHeight = 256.257,
                letterSpacing = 258.259,
                fontWeight = 260.261,
                fontSize = 262.263,
                fontFamily = "egestas"
            ), typographyDisplayMedium = Typography(
                lineHeight = 264.265,
                letterSpacing = 266.267,
                fontWeight = 268.269,
                fontSize = 270.271,
                fontFamily = "mnesarchum"
            ), typographyDisplayLarge = Typography(
                lineHeight = 272.273,
                letterSpacing = 274.275,
                fontWeight = 276.277,
                fontSize = 278.279,
                fontFamily = "delenit"
            ), typographyDisplayXLarge = Typography(
                lineHeight = 280.281,
                letterSpacing = 282.283,
                fontWeight = 284.285,
                fontSize = 286.287,
                fontFamily = "harum"
            ), typographyDisplay2xLarge = Typography(
                lineHeight = 288.289,
                letterSpacing = 290.291,
                fontWeight = 292.293,
                fontSize = 294.295,
                fontFamily = "tale"
            ), typographyDisplay3xLarge = Typography(
                lineHeight = 296.297,
                letterSpacing = 298.299,
                fontWeight = 300.301,
                fontSize = 302.303,
                fontFamily = "tempus"
            )
        )
    ), dimension = DimensionValuesContainer1(
        dimension0 = 304.305,
        dimension25 = 306.307,
        dimension50 = 308.309,
        dimension100 = 310.311,
        dimension150 = 312.313,
        dimension200 = 314.315,
        dimension250 = 316.317,
        dimension300 = 318.319,
        dimension400 = 320.321,
        dimension500 = 322.323,
        dimension550 = 324.325,
        dimension600 = 326.327,
        dimension700 = 328.329,
        dimension800 = 330.331,
        dimension900 = 332.333,
        dimension1000 = 334.335,
        dimension1200 = 336.337,
        dimension1500 = 338.339,
        dimension1600 = 340.341
    ), elevation = ElevationValuesContainer1(
        bottom = BottomValuesContainer1(
            elevationBottom100 = BoxShadow(
                y = 342.343,
                x = 344.345,
                type = "tristique",
                spread = 346.347,
                color = "suscipit",
                blur = 348.349
            ),
            elevationBottom200 = listOf(),
            elevationBottom300 = listOf(),
            elevationBottom400 = listOf()
        ), top = TopValuesContainer1(
            elevationTop100 = BoxShadow(
                y = 350.351,
                x = 352.353,
                type = "posidonium",
                spread = 354.355,
                color = "vivendo",
                blur = 356.357
            ), elevationTop200 = listOf(), elevationTop300 = listOf(), elevationTop400 = listOf()
        )
    ), fontFamily = FontFamilyValuesContainer1(
        sans = "orci",
        serif = "ne",
        mono = "nonumes"
    ), fontSize = FontSizeValuesContainer1(
        fontSize100 = 40.0,
        fontSize125 = 360.361,
        fontSize150 = 362.363,
        fontSize175 = 364.365,
        fontSize200 = 366.367,
        fontSize225 = 368.369,
        fontSize250 = 370.371,
        fontSize300 = 372.373,
        fontSize350 = 374.375,
        fontSize400 = 376.377,
        fontSize450 = 378.379,
        fontSize525 = 380.381,
        fontSize600 = 382.383,
        fontSize675 = 384.385,
        fontSize750 = 386.387,
        fontSize850 = 388.389,
        fontSize950 = 390.391,
        fontSize1050 = 392.393,
        fontSize1150 = 394.395
    ), fontWeight = FontWeightValuesContainer1(
        fontWeight300 = 396.397,
        fontWeight400 = 398.399,
        fontWeight500 = 400.401,
        fontWeight600 = 402.403,
        fontWeight700 = 404.405
    ), letterSpacing = LetterSpacingValuesContainer1(
        letterSpacing0 = 406.407,
        letterSpacing100 = 408.409,
        letterSpacing200 = 410.411,
        letterSpacing300 = 412.413,
        letterSpacing400 = 414.415,
        letterSpacing500 = 416.417,
        letterSpacing600 = 418.419,
        letterSpacing700 = 420.421
    ), lineHeight = LineHeightValuesContainer1(
        value150 = 422.423,
        value200 = 424.425,
        value250 = 426.427,
        value275 = 428.429,
        value300 = 430.431,
        value325 = 432.433,
        value400 = 434.435,
        value475 = 436.437,
        value525 = 438.439,
        value600 = 440.441,
        value700 = 442.443,
        value725 = 444.445,
        value825 = 446.447,
        value900 = 448.449,
        value1025 = 450.451,
        value1150 = 452.453,
        value1275 = 454.455,
        value1400 = 456.457
    )

)
