package net.thunderbird.feature.navigation.drawer.siderail.ui.account

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import app.k9mail.core.ui.compose.theme2.toHarmonizedColor
import net.thunderbird.core.ui.compose.theme2.MainTheme

@Composable
internal fun calculateAccountColor(accountColor: Int): Color {
    return if (accountColor == 0) {
        MainTheme.colors.primary
    } else {
        Color(accountColor).toHarmonizedColor(MainTheme.colors.surface)
    }
}
