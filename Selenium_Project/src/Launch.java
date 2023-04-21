import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch
{
public static void main(String[]args)throws InterruptedException
{
	String expected = " Facebook - home page";
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver Driver = new FirefoxDriver();
	Thread.sleep(1000);
	Driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	String actual = Driver.getTitle();
	if(actual.equals(expected))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	Thread.sleep(1000);
	Driver.close();
}
}
