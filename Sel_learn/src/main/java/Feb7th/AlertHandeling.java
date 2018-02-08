package Feb7th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver alert = new ChromeDriver();
        alert.get("file:///C:/Users/Natalia/Google%20Drive/QAUBER/Java_Automation/Srikant/alert.html");
       
        alert.findElement(By.xpath("/html/body/button")).click();
        System.out.println(alert.switchTo().alert().getText());
        
        alert.switchTo().alert().accept();
        System.out.println(alert.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
       
        alert.findElement(By.xpath("/html/body/button")).click();
        alert.switchTo().alert().dismiss();
        System.out.println(alert.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
	}

}
