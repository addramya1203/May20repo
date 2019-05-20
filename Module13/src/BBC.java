import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BBC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://bbc.com");
		//Thread.sleep(1000);
		String text= driver.findElement(By.cssSelector("[id='orb-nav-links'] ul li:nth-child(3) a")).getText();
		System.out.println(text);
		
		String url=driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[2]/a")).getAttribute("href");
		System.out.println(url);
		
		driver.findElement(By.linkText("News")).click(); 
		
		//*[@id='orb-nav-links']/ul/li[3]/a
		
		//[id='orb-nav-links] ul li:nth-child(3) a
		
		
		
		
	}

}
