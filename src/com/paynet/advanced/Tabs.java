package com.paynet.advanced;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("D:\\Downloads\\training\\PayNet2\\Html\\Demo6.html");
		
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(0));
		driver.switchTo().window(windows.get(1));
		
		driver.quit();

	}

}
