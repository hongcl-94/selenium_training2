package com.paynet.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("D:\\Downloads\\training\\PayNet2\\Html\\Demo1.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe")));
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
}
