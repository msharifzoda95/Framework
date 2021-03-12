package SecondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTester {

	public static void main(String[] args) throws InterruptedException {
		
	
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/murod/Desktop/JAVA/ChromeDriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			Thread.sleep(5000);
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys("ChromeDriver");
			searchbox.submit();
			Thread.sleep(5000);
			//System.out.println(driver.getTitle());
			driver.quit();
		

	}

}
