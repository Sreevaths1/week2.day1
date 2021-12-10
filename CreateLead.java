package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreateLead {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/");		
		driver.manage().window().maximize();				
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ez");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sreevathsav");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ammayappan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sree");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("vathsav");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/27/1995");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("007");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("random thoughts");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("not important enough");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ZXY");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("05");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Joker");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("newmail@newmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("just.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("KV");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("NK");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("New Street1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Opp to old Street2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("California");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600000");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6");
		
		WebElement elementdropdown1=(driver.findElement(By.id("createLeadForm_dataSourceId")));		
		Select dd =new Select(elementdropdown1);
		dd.selectByValue("LEAD_EMPLOYEE");	
		
		WebElement elementdropdown2=(driver.findElement(By.id("createLeadForm_marketingCampaignId")));		
		Select ee =new Select(elementdropdown2);
		ee.selectByVisibleText("Automobile");	
		
		WebElement elementdropdown3=(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));		
		Select ff =new Select(elementdropdown3);
		ff.selectByVisibleText("California");	
		
		WebElement elementdropdown4=(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));		
		Select gg =new Select(elementdropdown4);
		gg.selectByVisibleText("United States");
		
		WebElement elementdropdown5=(driver.findElement(By.id("createLeadForm_industryEnumId")));		
		Select hh =new Select(elementdropdown5);
		hh.selectByVisibleText("Aerospace");
		
		WebElement elementdropdown6=(driver.findElement(By.id("createLeadForm_ownershipEnumId")));		
		Select ii =new Select(elementdropdown6);
		ii.selectByVisibleText("Partnership");
				
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.close();
		
}

}
