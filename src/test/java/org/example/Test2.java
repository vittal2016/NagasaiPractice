package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2 {
    @Test
    public void login()
    {System.out.println("vittal");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvallabhapur\\.cache\\selenium\\chromedriver\\win64\\123.0.6312.86\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        System.out.println("vittal1");
        WebDriver driver=new ChromeDriver();
        System.out.println("vittal1");
        driver.get("https://www.amazon.in/");
        System.out.println("vittal2");
       // driver.quit();

    }
}
