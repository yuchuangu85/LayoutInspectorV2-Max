package org.jetbrains.plugins.template.action

import com.esotericsoftware.kryo.kryo5.minlog.Log
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import org.jetbrains.plugins.template.res.Icons

class AndroidRunLayoutInspectorAction: DumbAwareAction(
    "Layout Inspector V2",
    "V2 protocol is faster than v1.",
    Icons.LOGO
) {

    override fun update(e: AnActionEvent) {
        super.update(e)
        Log.debug("AndroidLayoutInspectorAction", "update" + e.project)
    }

    override fun actionPerformed(p0: AnActionEvent) {
       Log.debug("AndroidLayoutInspectorAction", "actionPerformed")
    }
}
