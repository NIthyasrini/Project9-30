package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCredentialsCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\MavenSampleProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		Thread.sleep(2000);
	WebElement element =driver.findElement(By.id("identifierId"));
		element.sendKeys("nithya9090987@gmail.com");
		
		WebElement button =driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		button.click();
		Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("gogmail");
		
		WebElement btnNext=driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
		
		Thread.sleep(10000);
		driver.close();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\MavenSampleProject\\driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.gmail.com");
		
		Thread.sleep(10000);
		
		WebElement element1 =driver1.findElement(By.id("identifierId"));
		element1.sendKeys("srininithya@gmail.com");
		
		WebElement button1 =driver1.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		button1.click();
		Thread.sleep(10000);
		
		WebElement password1=driver1.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("gogmail");
		
		WebElement btnNext1=driver1.findElement(By.xpath("//span[text()='Next']"));
		btnNext1.click();
		Thread.sleep(10000);
		driver1.close();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\MavenSampleProject\\driver\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.gmail.com");
		
		WebElement element2 =driver2.findElement(By.id("identifierId"));
		element2.sendKeys("nithya9090987@gmail.com");
		
		WebElement button2 =driver2.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		button2.click();
		Thread.sleep(10000);
		
		WebElement password2=driver2.findElement(By.xpath("//input[@name='password']"));
		password2.sendKeys("g1o0g8m5ail$");
		
		WebElement btnNext2=driver2.findElement(By.xpath("//span[text()='Next']"));
		btnNext2.click();
		
		Thread.sleep(10000);
		driver2.close();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RamaKrishnan\\eclipse-workspace\\MavenSampleProject\\driver\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.gmail.com");
		
		WebElement element3 =driver3.findElement(By.id("identifierId"));
		element3.sendKeys("srininithya@gmail.com");
		
		WebElement button3 =driver3.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		button3.click();
		Thread.sleep(10000);
		
		WebElement password3=driver3.findElement(By.xpath("//input[@name='password']"));
		password3.sendKeys("g1o0g8m5ail$");
		
		WebElement btnNext3=driver3.findElement(By.xpath("//span[text()='Next']"));
		btnNext3.click();
		
		Thread.sleep(10000);
		driver3.close();
		
	
		
		
	}
}
