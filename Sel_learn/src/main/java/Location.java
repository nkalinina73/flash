import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");                    
		WebDriver driver = new ChromeDriver();                    
		//driver.manage().window().maximize();    
		driver.get("http://demo.guru99.com/test/radio.html");    
		// Selecting CheckBox        
	WebElement option1 = driver.findElement(By.id("vfb-6-1"));
	option1.click();
	
	/*WebElement option2 = driver.findElement(By.id("vfb-7-2"));
	System.out.println(option2.getText);*/
	}

}
