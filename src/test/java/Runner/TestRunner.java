package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/featuresFiles", // Path to the directory containing your feature files
            glue = "step.definitions", // Package where your step definitions are located
            monochrome = true,
            dryRun=false,
            plugin = {"json:build/cucumber-reports/cucumber.json",
            "rerun:build/cucumber-reports/rerun.txt"} // Report generation options
    )
    public class TestRunner {
        // This class should be empty
    }





