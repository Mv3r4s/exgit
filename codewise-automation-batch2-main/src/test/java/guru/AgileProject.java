package guru;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ApplicationFlow;
import utilities.Driver;

    public class AgileProject {

        @Test
        public void login(){
            Driver.getDriver().get("https://demo.guru99.com");
            Driver.getDriver().findElement(By.linkText("Agile Project")).click();
            WebElement userID = Driver.getDriver().findElement(By.xpath("//ol/li[1]"));
            WebElement password = Driver.getDriver().findElement(By.xpath("//ol/li[2]"));
            String userIDString = userID.getText().trim().substring(9);
            String passwordString = password.getText().trim().substring(11);
            Driver.getDriver().findElement(By.name("uid")).sendKeys(userIDString);
            Driver.getDriver().findElement(By.name("password")).sendKeys(passwordString + Keys.ENTER);
            String expectedURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
            ApplicationFlow.pause(500);
            Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());

        }
    }

