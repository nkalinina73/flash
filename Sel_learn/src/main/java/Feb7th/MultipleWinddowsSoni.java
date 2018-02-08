package Feb7th;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinddowsSoni {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
	       WebDriver dr = new ChromeDriver();
	       dr.get("file:///C:/Users/Natalia/Google%20Drive/QAUBER/Java_Automation/Srikant/popup.html");
	       String parenthandle = dr.getWindowHandle();

	       Thread.sleep(3000);

	       for (int i = 1; i < 5; i++) {
	           dr.findElement(By.xpath("/html/body/h1[" + i + "]/a")).click();

	           // "//input[@id='twotabsearchtextbox']" --amazon
	           // "//input[@id='lst-ib']"--google
	           // //input[@id='uh-search-box'] --yahoo
	           // //div[@id='srchinputcopy'--rediff


	           Set<String> wHandles = dr.getWindowHandles();
	           System.out.println(wHandles.size());
	           //title still shows the title of parent window
	           System.out.println("Parent page Title:" + dr.getTitle());

	           for (String s : wHandles) {
	               System.out.println(s);

	               if (!s.equals(parenthandle)) {
	                   System.out.println("Child Window:" + s);

	                   //switching to child window and now driver controls the child window
	                   dr.switchTo().window(s);
	                   System.out.println("Child Window Title:" + dr.getTitle());

	                   String popuptitle = dr.getTitle();
	                   if (popuptitle.contains("Amazon.com")) {
	                       dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	                       dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
	                       Thread.sleep(5000);
	                       dr.close();
	                   }
	                  if (popuptitle.contains("Google")) {
	                       dr.findElement(By.xpath("//input[@id='lst-ib']")).clear();
	                       dr.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("books");
	                       Thread.sleep(5000);
	                       dr.close();
	                   }
	                    if (popuptitle.contains("Yahoo")) {
	                      dr.findElement(By.xpath("//input[@id='uh-search-box']")).clear();
	                      dr.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("directions");
	                      Thread.sleep(5000);
	                      dr.close();
	                  }
	                  if (popuptitle.contains("Rediff.com")) {
	                      dr.findElement(By.xpath("//input[@id='srchword']")).clear();
	                      dr.findElement(By.xpath("//input[@id='srchword']")).sendKeys("phones");
	                      Thread.sleep(5000);
	                      dr.close();
	                  }
	               }
	                   dr.switchTo().window(parenthandle);




	           }


	       }
	       dr.quit();
	   }

	}

