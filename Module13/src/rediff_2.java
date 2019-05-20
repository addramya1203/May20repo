import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediff_2 {
   static WebDriver driver=null;
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://flipkart.com");
		
	driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[4]/a/span")).click();
	
	
	/*String part1="//*[@id='container']/div/header/div[2]/div/ul/li[4]/ul/li/ul/li[1]/ul/li[";
			
	String part2="]/a";
	
	int i=3;
	while(isElementPresent(part1+i+part2)) {
		
		String text= driver.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(text);
		
		i++;

	}
	
	}*/
	/*public static boolean isElementPresent(String xpathExp) {
		
       List<WebElement> allElements=driver.findElements(By.xpath(xpathExp));
       if(allElements.size()==0) 
    	   return false;
    	   else
    		   return true;
	}*/

}
}
