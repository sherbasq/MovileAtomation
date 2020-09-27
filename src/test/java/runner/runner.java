package runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class runner {
    @Before
    public void beforeCucumber(){
        System.out.println("Before Cucumber");
    }
    @After
    public void afterCucumber(){
        System.out.println("After Cucmber");
    }
}
