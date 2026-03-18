package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class App
{
    public static void main( String[] args )
    {

        TestOpini();

    }

    
    public static boolean TestOpini(){

        WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/programowanie/Documents/4p2/Testowanie/SklepZConfluence/index.html");

        WebElement submitButton = driver.findElement(By.className("btn-primary"));
        submitButton.click();
        

    }

}
