package testRunner;

        import org.junit.runner.RunWith;
        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Pikky's PC\\IdeaProjects\\RestAPItest\\src\\main\\java\\feature\\firstAPI.feature" //the path of the feature files
        ,glue={"stepdefinition"},//the path of the step definition files
        format= {"pretty","html:test-outout"},
        plugin =  {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
        //tags = {"@EDUBankTeller"}
)
public class runner {
}
