package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
		public static void main(String[] args)
		{
			WebDriverManager.chromedriver().setup();		
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
		    String title=driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.id("username")).sendKeys("DemosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			
			String title1=driver.getTitle();
			System.out.println(title1);
			
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Sreevathsav");
			driver.findElement(By.id("lastNameField")).sendKeys("Ammayappan");
			driver.findElement(By.name("submitButton")).click();
			
			String text=driver.findElement(By.id("viewContact_firstName_sp")).getText();
			System.out.println(text);
			
			driver.close();
			
			
		}
	
}
