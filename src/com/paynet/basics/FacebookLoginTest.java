package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
//		driver.get("http://demo.openemr.io/b/openemr/");
		driver.get("https://opensource-demo.orangehrmlive.com");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']")).click();
		driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']")).click();

		Select selectJob = new Select(driver.findElement(By.xpath("//*[@id=\"searchDirectory_job_title\"]")));
		selectJob.selectByVisibleText("IT Manager");		
//		driver.findElement(By.xpath("//*[@id=\"searchDirectory_job_title\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"searchDirectory_job_title\"]/option[16]")).click();

		Select selectLocation = new Select(driver.findElement(By.xpath("//*[@id=\"searchDirectory_location\"]")));
		selectLocation.selectByValue("1,2,5,-1");
//		driver.findElement(By.xpath("//*[@id=\"searchDirectory_location\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"searchDirectory_location\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		
		
		
		
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='welcome']")));
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
		
		driver.quit();
		
	}

}
