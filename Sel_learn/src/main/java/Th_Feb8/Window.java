package Th_Feb8;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver pop = new ChromeDriver();
        pop.get("file:///C:/Users/Natalia/Google%20Drive/QAUBER/Java_Automation/Srikant/popup.html");
        pop.manage().window().maximize();
        Thread.sleep(2000);
        
        //get size of the window
        System.out.println(pop.manage().window().getSize());
      
		Dimension d = new Dimension( 500, 600);
		//set size of the window
		pop.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//get the position
		System.out.println(pop.manage().window().getPosition());
		
		//set the position of the window
		Point pos = new Point(150,300);
		pop.manage().window().setPosition(pos);
		Thread.sleep(2000);
        
        
        
        pop.close();
	}

}
