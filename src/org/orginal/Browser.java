package org.orginal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harishankar\\eclipse-workspace\\Pratices\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("hari");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("9840160108");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    System.out.println(screenshotAs);
		File f= new File("C:\\Users\\Harishankar\\eclipse-workspace\\Pratices\\images\\fb5.png");
	    FileUtils.copyFile(screenshotAs, f);
		
		
	}

}
