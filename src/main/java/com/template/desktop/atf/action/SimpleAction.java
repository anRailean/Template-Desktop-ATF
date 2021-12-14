package com.template.desktop.atf.action;

import com.template.desktop.atf.SikuliConfiguration;
import io.cucumber.spring.ScenarioScope;
import org.sikuli.script.App;
import org.sikuli.script.Key;
import org.sikuli.script.ScreenImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class SimpleAction {

    @Autowired
    private SikuliConfiguration sikuliConfiguration;

    public void typeText(String text) {
        sikuliConfiguration.getScreen().type(text);
    }

    public void typeEnter(int amount) {
        for (int i = 0; i < amount; i++) {
            sikuliConfiguration.getScreen().type(Key.ENTER);
        }
    }

    public void typeWinStart() {
        sikuliConfiguration.getScreen().type(Key.WIN);
    }

    public void waitScreen(double seconds) {
        sikuliConfiguration.getScreen().wait(seconds);
    }

    public String getClipboard() {
        return App.getClipboard();
    }

    public void takeScreenshot(String name) {
        sikuliConfiguration.getScreen().capture().getFile("target/generated-sources", name);
        System.out.println("[log]  Take Screenshot - " + name + ".png");
    }
}