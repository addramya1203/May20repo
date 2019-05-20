
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GMAIL_Xpaths {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("ramya.addepalli1203@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("ramya.addepalli1203@gmail.com");
				
		//driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
	     driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		//System.out.println(text1);

	  //  String text1= driver.findElement(By.xpath("//*[@id='headingText' and @class='sfYUmb']")).getText();
	  //  System.out.println(text1);
	    
	    driver.findElement(By.cssSelector("span[class^='RveJvd']")).click();
	    
	    //CSS selectors - CSStagname[attribute=value]  //Xpath-use @ symbol before 
	    //starts with ^
	    //contains *
	    //ends $
	    
	    
	   
	  
	}

}
