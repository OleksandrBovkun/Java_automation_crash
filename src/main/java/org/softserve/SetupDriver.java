package org.softserve;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

import static org.softserve.Config.BROWSER;

public class SetupDriver {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER){
            case "Edge":
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--remote-allow-origins=*");
//                driver = new ChromeDriver(options);
                driver = new EdgeDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "FireFox":
                driver = new FirefoxDriver();
                break;

            default:
                Assert.isTrue(true, "Incorrect platform, or browser name : ", BROWSER);
        }
        driver.manage().window().maximize();
//        driver.manage().timeouts().
//                implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
        return driver;
    }
}
