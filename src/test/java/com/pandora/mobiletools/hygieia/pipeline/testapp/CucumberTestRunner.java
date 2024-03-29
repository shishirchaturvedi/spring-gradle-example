package com.pandora.mobiletools.hygieia.pipeline.testapp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:build/cucumber/cucumber-html-report", "json:build/cucumber/json/cucumber-report.json"},
        features = {"src/test/resources"})
public class CucumberTestRunner {

}
