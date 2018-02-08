package Feb7th;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver pop = new ChromeDriver();
        pop.get("file:///C:/Users/Natalia/Google%20Drive/QAUBER/Java_Automation/Srikant/popup.html");
        
        //get the Window Handle (it has unique string)
        String parentWindowHandle = pop.getWindowHandle();
        //System.out.println(parentWindowHandle);
        Thread.sleep(2000);
        
        for(int i=1;i<5;i++) 
        {
        	pop.findElement(By.xpath("/html/body/h1[" + i +"]/a")).click();       
        
        	Thread.sleep(2000);
        
        	Set<String> wh1 = pop.getWindowHandles();
        	System.out.println(wh1.size());
        
        	//getting Title from the parent page
        	System.out.println("Parent page Title: " + pop.getTitle());
        
        	for(String s: wh1) 
        	{
        		System.out.println(s);
        	
        		if(!s.equals(parentWindowHandle)) 
        		{
	        		System.out.println("Child window: " + s);
	        		pop.switchTo().window(s);
	        		System.out.println("Child Page Title: " + pop.getTitle());
	        		
	        		String popUpTitle = pop.getTitle();
	        		System.out.println("Title of this window is -" + popUpTitle);
	        		
	        		if(popUpTitle.contains("Amazon.com")) 
	        		{
	        			pop.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
	        			pop.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("books");
	        			//pop.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	        			Thread.sleep(2000);
	        		}
        		
	        		if(popUpTitle.contains("Google")) 
	        		{
	        			pop.findElement(By.className("gsfi")).clear();
	        			pop.findElement(By.className("gsfi")).sendKeys("java learning");
	        			//pop.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
	        			Thread.sleep(2000);       			
	        		}
        		
	        		if(popUpTitle.contains("Rediff.com")) 
	        		{
	        			pop.findElement(By.xpath("//*[@id=\"srchinputcopy\"]")).clear();
	        			pop.findElement(By.xpath("//*[@id=\"srchinputcopy\"]")).sendKeys("bags");
	        			//pop.findElement(By.xpath("//*[@id=\"queryTop\"]/div/input[6]")).click();
	        			Thread.sleep(2000);
        			}   				        		
        		}
        	}
        
        pop.switchTo().window(parentWindowHandle);
} 
pop.close();

	}
}
