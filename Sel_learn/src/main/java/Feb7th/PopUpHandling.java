package Feb7th;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
		        WebDriver pop = new ChromeDriver();
		        pop.get("file:///C:/Users/Natalia/Google%20Drive/QAUBER/Java_Automation/Srikant/popup.html");
		        
		        //get the Window Handle (it has unique string)
		        String parentWindowHandle = pop.getWindowHandle();
		        System.out.println(parentWindowHandle);
		        
		        pop.findElement(By.linkText("Visit amazon.com!")).click();
		       
		        
		        Thread.sleep(2000);
		        
		        Set<String> wHandles = pop.getWindowHandles();
		        System.out.println(wHandles.size());
		        
		        //getting Title from the parent page
		       // System.out.println("Parent page Title: " + pop.getTitle());
		        for(String s: wHandles) {
		        	System.out.println(s);
		        	if(!s.equals(parentWindowHandle)) {
		        		System.out.println("Child window: " + s);
		        		pop.switchTo().window(s);
		        		//System.out.println("Child Page Title: " + pop.getTitle());
		        				        		
		        	}
		        }
		        pop.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		        pop.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		        Thread.sleep(2000);
		        pop.switchTo().window(parentWindowHandle);
		        
//pop.close();
	}

}
