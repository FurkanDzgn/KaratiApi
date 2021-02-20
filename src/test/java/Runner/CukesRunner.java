package Runner;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(
        features = "C:\\Users\\furka\\IdeaProjects\\KarateApi\\src\\test\\resources\\SingleUserPost.feature"
)
public class CukesRunner {
}
