package com.skysanner.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue = {"com.skyscanner.stepDefinitions"},
plugin = { "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
		"junit:target/cucumber-reports/cucumber.xml",
		},
monochrome = true,
tags = "@scenario3"
)
public class TestRunner {


}
