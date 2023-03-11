package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sambath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		//Select by Index
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s= new Select(dropdown);
		s.selectByIndex(4);
		
		//select by visibletext
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s1= new Select(dropdown1);
		s1.selectByVisibleText("Automobile");
		
		//select by value
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select s2= new Select(dropdown2);
		s2.selectByValue("OWN_CCORP");
			
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}
}
