package com.paynet.advanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("D:\\Downloads\\training\\PayNet2\\Html\\Demo6.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"mousehover\"]"))).perform();
		driver.findElement(By.xpath("//div/fieldset/div/div/a[2]")).click();
		
		
		driver.quit();
		
	}
}
