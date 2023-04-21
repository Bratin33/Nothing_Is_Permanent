package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



	public class NewTestScript extends NewLaunch
	{
			@DataProvider(name="Bratin")
		String[][] data()		
		
			{
		String[][] arr= {{"bratin","123"},{"yes","244"},{"belabose", "2441139"}};
			return arr;
		}
		@Test(dataProvider = "Bratin")
			void funcTest(String un, String pwd) throws Exception
		{
				Thread.sleep(2000);
				WebElement emailtxt = driver.findElement(By.xpath("//input[@id='email]'"));
				emailtxt.sendKeys(un);
				WebElement pwdtxt = driver.findElement(By.xpath("//input[@id='email]'"));
				pwdtxt.sendKeys(pwd);
		}
			}


