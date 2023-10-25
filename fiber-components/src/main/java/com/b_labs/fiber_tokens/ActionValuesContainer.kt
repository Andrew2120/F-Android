package com.b_labs.fiber_tokens

import com.b_labs.fiber_tokens.DangerValuesContainer
import com.b_labs.fiber_tokens.GhostValuesContainer
import com.b_labs.fiber_tokens.InverseValuesContainer
import com.b_labs.fiber_tokens.NeutralValuesContainer
import com.b_labs.fiber_tokens.OutlineValuesContainer
import com.b_labs.fiber_tokens.PrimaryValuesContainer
import com.b_labs.fiber_tokens.ReverseInverseValuesContainer
import com.b_labs.fiber_tokens.SuccessValuesContainer

data class ActionValuesContainer(
    val primary: com.b_labs.fiber_tokens.PrimaryValuesContainer = com.b_labs.fiber_tokens.PrimaryValuesContainer(),
    val neutral: com.b_labs.fiber_tokens.NeutralValuesContainer = com.b_labs.fiber_tokens.NeutralValuesContainer(),
    val success: com.b_labs.fiber_tokens.SuccessValuesContainer = com.b_labs.fiber_tokens.SuccessValuesContainer(),
    val danger: com.b_labs.fiber_tokens.DangerValuesContainer = com.b_labs.fiber_tokens.DangerValuesContainer(),
    val ghost: com.b_labs.fiber_tokens.GhostValuesContainer = com.b_labs.fiber_tokens.GhostValuesContainer(),
    val outline: com.b_labs.fiber_tokens.OutlineValuesContainer = com.b_labs.fiber_tokens.OutlineValuesContainer(),
    val inverse: com.b_labs.fiber_tokens.InverseValuesContainer = com.b_labs.fiber_tokens.InverseValuesContainer(),
    val reverseInverse: com.b_labs.fiber_tokens.ReverseInverseValuesContainer = com.b_labs.fiber_tokens.ReverseInverseValuesContainer(),
)