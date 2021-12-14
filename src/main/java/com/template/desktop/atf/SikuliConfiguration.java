package com.template.desktop.atf;

import io.cucumber.spring.ScenarioScope;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.net.URL;

@Component
@ScenarioScope
public class SikuliConfiguration {

    private Screen screen;

    private String basePath;

    public SikuliConfiguration() throws URISyntaxException {
        screen = new Screen();
        URL resourceFolderURL = this.getClass().getClassLoader().getResource("images");
        basePath = resourceFolderURL.toURI().getPath() + "/";
    }

    public Screen getScreen() {
        return screen;
    }

    public String getBasePath() {
        return basePath;
    }
}