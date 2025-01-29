package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",// directorio de nuestros archivos .feature
        glue = "steps",//paquete donde tenemos nuestras clases definiendo los steps
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@Navigation"
)
public class TestRunner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }

}
