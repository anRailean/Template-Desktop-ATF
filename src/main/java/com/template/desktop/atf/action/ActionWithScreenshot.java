package com.template.desktop.atf.action;

import com.template.desktop.atf.SikuliConfiguration;
import io.cucumber.spring.ScenarioScope;
import org.sikuli.script.FindFailed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class ActionWithScreenshot {

    @Autowired
    private SikuliConfiguration sikuliConfiguration;

    public void clickOnScreenShot(String nameOfScreenShot) throws FindFailed {
        sikuliConfiguration.getScreen()
                .click(sikuliConfiguration.getBasePath() + nameOfScreenShot + ".png");
    }
}