package day21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class firsttestcase {

	public static void main(String[] args) {
		
		//1)lounch browser
		
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		//2)open url "http://demo.opencart.com/"
		
driver.get("http://demo.opencart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//3)Validate title should be your store 
String act_title=driver.getTitle();

if(act_title.equals("Your Store")) 
{
	System.out.println("Test Passed");
}
else {
	System.out.println("test failed");
	
}

//4)close browser

//driver.close();


driver.quit();
	}}


