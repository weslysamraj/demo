package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hovering {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions Action=new Actions(driver);
		WebElement fashions=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img"));
		Thread.sleep(2000);
		Action.moveToElement(fashions).perform();
		WebElement mensfootwear=driver.findElement(By.xpath("/html/body/div[4]/div[1]/object/a[4]"));
		mensfootwear.click();
		
		
		
		

	}

}
