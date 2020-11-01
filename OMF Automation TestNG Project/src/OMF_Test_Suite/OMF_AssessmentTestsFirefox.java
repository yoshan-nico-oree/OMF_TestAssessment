package OMF_Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OMF_AssessmentTestsFirefox {
  @Test(priority=1)
  public void HomePageVerificationFireFox() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Nico Master\\Test Lab\\Selenium_WebDriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver(); 
	  
	//Instructions are sent to the webdriver to navigate to the site and to maximize window
			driver.get("https://www.oldmutualfinance.co.za/");
			driver.manage().window().maximize();
			
			
			//Check put into place to ensure that no redirects occurred and that we are hitting Home Page of the Old Mutual site. We're also verifying the Homepage by validating against an ExpectedURL 
			String URL =driver.getCurrentUrl(); 
			System.out.println("Home Page URL :"+URL);
			
			String ExpectedURL =("https://www.oldmutualfinance.co.za/");
		
			
			if (ExpectedURL.equals(URL))
				{
				 System.out.println("HomePage Verification Successful!");
				} 
			else 
			{
				System.out.println("HomePage Verification Failed");
			}
  }
  
  
  
  @Test (priority=2)
	public void PersonalLoan_Verification()
	{
	  System.setProperty("webdriver.gecko.driver", "C:\\Nico Master\\Test Lab\\Selenium_WebDriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver(); 
		
		//Instructions are sent to the webdriver to navigate to the site and to maximize window
		driver.get("https://www.oldmutualfinance.co.za/");
		driver.manage().window().maximize();
		
		//Find the Personal Loans link by xpath and click on it
		
		WebDriverWait wait= new WebDriverWait(driver, 150000); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")));
		
		
		String MysteriousPersonalLoan = driver.findElement(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")).getText(); 
		System.out.print("ElementWasFound:" +MysteriousPersonalLoan);
		
		driver.findElement(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")).click(); 
		
		
		//Print Link to ensure correct URL was navigated
		String CurrentURL = driver.getCurrentUrl(); 
		System.out.println("Personal Loans URL:"+CurrentURL);
		
		
		
		//Expected URL for Personal Loans Page Verification
		String ExpectedURLLoan=("https://www.oldmutualfinance.co.za/personal-loans?"); 
		
		if (ExpectedURLLoan.equals(CurrentURL))
		{
		System.out.println("Personal Loan Page Verification Successful!");	
		}
		
		else 
		 
		{
			System.out.println("Personal Loans Verification Failed");
		}
		
		
	}
	
	@Test (priority=3)
	public void Calculator_Verification()
	{
		  System.setProperty("webdriver.gecko.driver", "C:\\Nico Master\\Test Lab\\Selenium_WebDriver\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver(); 
		
		//Instructions are sent to the webdriver to navigate to the site and to maximize window
		driver.get("https://www.oldmutualfinance.co.za/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")));
		
		
		//Find the Personal Loans link by xpath and click on it
		driver.findElement(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")).click(); 
		
		//Find and click on R50 000 button in Calculator 
		//driver.findElement(By.xpath(".//*[@id=\"calcAmountHold\"]/div/div[5]")).click(); 
		driver.findElement(By.id("calcAmountHold")).click();
		
		//Find and click on 84 months term in Calculator 
		driver.findElement(By.xpath(".//*[@id=\"calcTermHold\"]/div/div[9]")).click(); 
		
		
		//This locates the Minimum Payment element by ID getting the inner text of that element. Element is defined as the element found
		String elementmin = driver.findElement(By.id("paymin")).getText(); 
		
		//Min Element is now validated through the inner text of the element against our expected Value . If matched, print correct amount. If not, print out that's its incorrect
		System.out.println("Minimum Payment Value Is:" +elementmin); 
		
		if (elementmin.equals("R1,521.05")) 
			{
				System.out.println("Minimum Payment Amount is Correct");
			}
			
		else 
			
		{
			System.out.println("Minimum Payment Amount is Incorrect. The amount must be R1,521.05 :"); 
		}
		
		
    //	This locates the Maximum Payment element by ID getting the inner text of that element. Element is defined as the element found
		String elementmax = driver.findElement(By.id("paymax")).getText(); 
		//Max Element is now validated through the inner text of the element against our expected Value . If matched, print correct amount. If not, print out that's its incorrect
		System.out.println("Maximum Payment Value Is:" +elementmax); 
		
		if (elementmax.equals("R1,600.42")) 
			{
				System.out.println("Maximum Payment Amount is Correct");
			}
			
		else 
			
			
		{
			System.out.println("Maximum Payment Amount is Incorrect. The amount must be R1,600.42:"); 
		}
				
		
		
	}
	
	
	@Test (priority=4)
	public void TermCapital_Verification()
	{
		  System.setProperty("webdriver.gecko.driver", "C:\\Nico Master\\Test Lab\\Selenium_WebDriver\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver(); 
		
		//Instructions are sent to the webdriver to navigate to the site and to maximize window
		driver.get("https://www.oldmutualfinance.co.za/");
		driver.manage().window().maximize();
		
		//Find the Personal Loans link by xpath and click on it
				driver.findElement(By.xpath(".//*[@id=\"navbar\"]/ul/li[2]/a")).click(); 
						
		  //Find the element by id and click on the correct amount button (50 000)");
				driver.findElement(By.id("calcAmountHold")).click(); 
				
			//Find the element by xpath and click on the correct monthly term  button (84)");
				driver.findElement(By.xpath(".//*[@id=\"calcTermHold\"]/div/div[9]")).click(); 
		
						
		//Find Breakdown link by xpath and click on it
	     driver.findElement(By.xpath(".//*[@id=\"calcTotalsHold\"]/p[2]/a")).click(); 
		
		
		//Find the element Capital & get its text value. Show text value to validate that the correct Capital value is rendered
		String elementCapital = driver.findElement(By.id("breakdownCapital")).getText();
		System.out.println("Capital Breakdown Is:" +elementCapital); 
		
		if (elementCapital.equals("R50,000.00")) 
		{
			System.out.println("Capital Amount is Correct");
		}
		
	else 
		
	{
		System.out.println("Capital Amount is Incorrect. The amount must be: R50,000.00"); 
	}
	
	
		//Find the element Term & get its text value. Show text value to validate that the correct Term value is rendered
		String elementTerm = driver.findElement(By.id("breakdownTerm")).getText();
		System.out.println("Term Breakdown Is:" +elementTerm); 
		
		if (elementTerm.equals("84 months")) 
		{
			System.out.println("Term in Months is Correct");
		}
		
	else 
		
	{
		System.out.println("Term is Incorrect. The Term  must be: 84 Months" ); 
	}
		
		
	} 
	 
  
  
}
