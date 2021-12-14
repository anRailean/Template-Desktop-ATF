package com.template.desktop.atf.action;

import com.template.desktop.atf.SikuliConfiguration;
import io.cucumber.spring.ScenarioScope;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class HotKeyAction {

    @Autowired
    private SikuliConfiguration sikuliConfiguration;

    public void selectAllHotKeys() {
        sikuliConfiguration.getScreen().type("a", KeyModifier.CTRL);
    }

    public void saveHotKeys() {
        sikuliConfiguration.getScreen().type("s", KeyModifier.CTRL);
    }

    public void copyHotKeys() {
        sikuliConfiguration.getScreen().type("c", KeyModifier.CTRL);
    }

    public void closeHotKeys() {
        sikuliConfiguration.getScreen().type(Key.F4, KeyModifier.ALT);
    }
}