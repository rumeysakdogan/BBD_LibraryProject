package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/JSONReports/report.json",
                    "junit:target/JunitReports/report.xml",
                    "html:target/HtmlReports",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/library/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CucumberRunner {
}




