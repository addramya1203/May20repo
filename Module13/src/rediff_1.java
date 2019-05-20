import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediff_1 {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://rediff.com");
		
		WebElement box=driver.findElement(By.xpath("//*[@id='new_design']"));
		
		List<WebElement> links=box.findElements(By.tagName("a"));
		System.out.println("Total links"+links.size());
		System.out.println("Text of links-->");
		for(int i=0;i<links.size();i++) 
		{
	    System.out.println(links.get(i).getText());
	     
	    links.get(i).click();
	    System.out.println("----------------------------------------------------------");
	    System.out.println("Title on page"+driver.getTitle());
	    
	    driver.get("http://rediff.com");
        box=driver.findElement(By.xpath("//*[@id='new_design']"));
		
		 links=box.findElements(By.tagName("a"));

}
	}
}
