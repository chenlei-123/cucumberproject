package com.rrh.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;


/**
 * Created by chenlei on 2018/5/24.
 */

@CucumberOptions(
        format = {"json:target/json-report/dw.json"}
        , features = {"classpath:com.rrh.cucumber/AutoTest.feature"}
        , glue = {"com.rrh.cucumber"}
)

public class AppTest extends AbstractTestNGCucumberTests{
    public AndroidDriver driver;
}

//public class AppTest {
//    @Test()
//    public void runCukes() {
//        new TestNGCucumberRunner(getClass()).runCukes();
//    }
//}
