package com.paynet.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("D:\\Downloads\\training\\PayNet2\\Html\\Demo6.html");
		
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String text= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(text);
		
		driver.quit();
	}

}
