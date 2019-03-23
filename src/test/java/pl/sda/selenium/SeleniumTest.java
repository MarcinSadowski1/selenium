package pl.sda.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    ChromeDriver chromeDriver;

    @Before
    public void przygotujPrzegladarke() {
        System.setProperty("webdriver.chrome.driver", "d:/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }


    @Test
    public void pierwszyTest() {
        System.setProperty("webdriver.gecko.chromeDriver", "d:/chromeDriver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.pl");
    }

    @Test
    public void drugiTest() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.pl");
    }

    @Test
    public void metodyDrivera() {
        chromeDriver.get("http://google.pl");
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());

    }

    @After
    public void posprzataj() {
        chromeDriver.quit();
    }


}

