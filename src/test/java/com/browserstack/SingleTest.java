package com.browserstack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {
	

	@Test(priority=0)
	public void GoogleSearch() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
		driver.findElement(By.name("q")).sendKeys("BrowserStack");
		driver.findElement(By.name("btnK")).click();

	}

	@Test(priority=1)
	public void SearchResults() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
		driver.findElement(By.name("q")).sendKeys("BrowserStack");
		driver.findElement(By.name("btnK")).click();
		List<WebElement> ResultsReturned = driver
		.findElements(By.xpath("//div[@class='yuRUbf']"));
		System.out.println("First Page Results Returned:" + ResultsReturned.size());
	}
	
	@Test(priority=2)
	public void GoogleHelp() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
	}

	@Test(priority=3)
	public void SearchAdvertising() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Advertising')]")).click();
	}
}
