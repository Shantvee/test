package Prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrpt_2 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	String ur=driver.getCurrentUrl();
	System.out.println(ur);
	String pg=driver.getPageSource();
	System.out.println(pg);
	String tl=driver.getTitle();
	System.out.println(tl);
	}
}
