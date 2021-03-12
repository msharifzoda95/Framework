package SecondPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkIt {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\murod\\\\Desktop\\\\JAVA\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		String title=driver.getTitle();
		
		//System.out.println(title);
		
		if (title=="Instagram")
		{
				System.out.println("Title matches!");
				
		}else {
			System.out.println("Title does not match");
			System.out.println("Correct title is, " + title);
		}
		driver.quit();
	}

}
