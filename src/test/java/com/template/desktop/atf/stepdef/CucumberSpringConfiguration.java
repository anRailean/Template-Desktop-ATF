package com.template.desktop.atf.stepdef;

import com.template.desktop.atf.ActionConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.context.annotation.Import;

@CucumberContextConfiguration
@Import(ActionConfiguration.class)
public class CucumberSpringConfiguration {
}