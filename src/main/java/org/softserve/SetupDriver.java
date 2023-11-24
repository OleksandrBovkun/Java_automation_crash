package org.softserve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.logging.Logger;
import java.util.logging.Level;


import static org.softserve.Config.BROWSER;

public class SetupDriver {
    private final static Logger logger = Logger.getLogger("SetupDriver LOGGER");
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER){
            case "Edge"    -> driver = new EdgeDriver();
            case "Chrome"  -> driver = new ChromeDriver();
            case "FireFox" -> driver = new FirefoxDriver();
            default -> {
                driver = new ChromeDriver();
                logger.log(Level.WARNING, "Driver for browser '" + BROWSER + "' not found, using chrome instead.");
            }
        }
        driver.manage().window().maximize();
        return driver;
    }
}
