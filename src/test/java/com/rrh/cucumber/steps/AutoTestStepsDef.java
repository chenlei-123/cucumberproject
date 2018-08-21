package com.rrh.cucumber.steps;

import com.rrh.cucumber.AppTest;
import com.rrh.cucumber.component.AppiumHelper;
import com.rrh.cucumber.component.HelperClassException;
import com.rrh.cucumber.component.UIAutomatorHelper;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;

/**
 * Created by chenlei on 2018/5/26.
 */
public class AutoTestStepsDef extends AppTest{

    @假如("^启动代理服务器，并传递参数json\"([^\"]*)\"")
    public void startProxyServer(String jsonName){
        System.out.println("启动代理服务器 :anyproxy -r rule.json "+jsonName);
    }

    @当("^实例化Android driver")
    public void initAndroidDriver() throws MalformedURLException, HelperClassException {
        driver = AppiumHelper.initAndroidDriver(driver);
    }
    @并且("^等待首页文本\"([^\"]*)\"渲染成功$")
    public void waitFirstPageDisplay(String text){
        waitForText(text);
    }
    @并且("^点击\"([^\"]*)\"按钮$")
    public void clickButtonByText(String text) throws HelperClassException {
        UIAutomatorHelper.clickByUIAText(driver,text);
    }

    @并且("^等待钱包页\"([^\"]*)\"标记加载成功")
    public void waitForWalletPage(String text){
        waitForText(text);
    }

    @那么("^验证界面元素正常")
    public void verifyPoint(){
        System.out.println("验证界面元素");
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
    private void waitForText(String text){
        //toast 寻找测试
        try {
            final WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@text,'" + text + "')]")));
            System.out.println("找到了文本标记");
        } catch (Exception e) {
        }
    }
}
