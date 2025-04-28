package saucedemo_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_project {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement name=driver.findElement(By.name("user-name"));
		name.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();

	}

}
