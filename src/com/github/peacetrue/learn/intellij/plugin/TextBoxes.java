package com.github.peacetrue.learn.intellij.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class TextBoxes extends AnAction {

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        Messages.showInputDialog(
                project,
                "What is your name?",
                "Input Your Name",
                Messages.getQuestionIcon());
    }
}