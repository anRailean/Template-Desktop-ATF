package com.template.desktop.atf.stepdef;

import com.template.desktop.atf.action.HotKeyAction;
import com.template.desktop.atf.action.SimpleAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = CucumberSpringConfiguration.class)
public class SaveWordPadDoc {

    @Autowired
    private SimpleAction simpleAction;

    @Autowired
    private HotKeyAction hotKeyAction;

    @Given("User opens WordPad and type {string} text")
    public void openMSWordAndTypeText(String text) throws InterruptedException {
        simpleAction.typeWinStart();
        simpleAction.waitScreen(2);
        simpleAction.typeText("WordPad");
        simpleAction.typeEnter(1);
        simpleAction.waitScreen(2.0);
        simpleAction.typeText(text);
        simpleAction.takeScreenshot(text);
    }

    @When("User saves the file and re-opens it")
    public void saveAndReOpenFile() {
        hotKeyAction.saveHotKeys();
        simpleAction.waitScreen(1.5);
        simpleAction.typeText("HelloWorld");
        simpleAction.typeEnter(1);
        hotKeyAction.closeHotKeys();
    }

    @Then("File contains {string} text")
    public void fileContains(String text) {
        simpleAction.typeWinStart();
        simpleAction.typeText("C:\\Users\\anrailean\\OneDrive - ENDAVA\\Documents\\HelloWorld.rtf");
        simpleAction.waitScreen(2.0);
        simpleAction.typeEnter(1);
        simpleAction.waitScreen(1.5);
        hotKeyAction.selectAllHotKeys();
        hotKeyAction.copyHotKeys();

        assertThat(text.equals(simpleAction.getClipboard()));
        simpleAction.takeScreenshot("Actual Result");
    }
}