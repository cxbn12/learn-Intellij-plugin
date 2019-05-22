package com.github.peacetrue.learn.intellij.plugin.appconfig;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author xiayx
 */
public class ApplicationConfigurable implements Configurable {

    private ApplicationConfigurationUI variableUI;

    @Nullable
    @Override
    public JComponent createComponent() {
        if (variableUI == null) variableUI = new ApplicationConfigurationUI();
        return variableUI.$$$getRootComponent$$$();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "PeacetrueLearn插件配置";
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
