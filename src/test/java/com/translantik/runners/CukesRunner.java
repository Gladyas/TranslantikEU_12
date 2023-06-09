package com.translantik.runners;
import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/translantik/step_definitions",

        dryRun = false,
        tags = "@reyhan",
        publish = false

)

public class CukesRunner {

}
