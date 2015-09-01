package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class frst_prg {
	
	@ Test(groups={"SmokeTest"})
	
	public void display()
	{
		WebDriver driver= new FirefoxDriver();
		System.out.println("Hello World");
	}
	

}
