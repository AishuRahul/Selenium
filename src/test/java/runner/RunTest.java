package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
glue= {"steps","pages","hooks"},
monochrome=true,
//dryRun=true,
snippets=SnippetType.CAMELCASE,
strict=true,
plugin= {"pretty","html:reports"})
@RunWith(Cucumber.class)

public class RunTest{

}