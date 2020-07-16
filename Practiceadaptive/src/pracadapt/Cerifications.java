package pracadapt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cerifications {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://shop.adaptiveus.com/");
		driver.manage().window().maximize();
		WebElement acceptcookie=driver.findElement(By.id("hs-eu-confirmation-button"));
		if(acceptcookie.isDisplayed())
		{
			acceptcookie.click();
		}
		Thread.sleep(5000);
		driver.close();
	}
	

}
