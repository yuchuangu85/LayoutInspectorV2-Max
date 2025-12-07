package org.jetbrains.plugins.template.action

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import org.jetbrains.plugins.template.res.Icons

class AndroidLayoutInspectorAction: DumbAwareAction(
    "Layout Inspector V2",
    "V2 protocol is faster than v1.",
    Icons.LOGO
) {

    override fun update(e: AnActionEvent) {
        super.update(e)

    }

    override fun actionPerformed(p0: AnActionEvent) {
        TODO("Not yet implemented")
    }
}
