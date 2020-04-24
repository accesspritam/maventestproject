import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        strict = true,
        plugin = {
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-report/cucumber.json"
        }
)
public class RunTest {
}
