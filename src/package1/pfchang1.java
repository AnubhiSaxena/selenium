package package1;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class pfchang1 {
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\an40024565\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		String baseUrl="https://www.pfchangs.com";
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(baseUrl);
		
		/*WebElement element= driver.findElement(By.xpath("//*[@id='NotificationRedViolator']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'",element);*/
		
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		
		//sign up
		 /*Thread.sleep(1000);
		    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		    String baseUrl="https://www.pfchangs.com";
		    driver.get(baseUrl);
		    Thread.sleep(1000);
		    driver.manage().window().maximize();
		    String actualtitle=driver.getTitle();
		    System.out.println(actualtitle);
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='register-btn']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id='contentPlaceholder_T37E341B3010_Col00']/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/label/input")).sendKeys("asdf123@gmail.com");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id='contentPlaceholder_T37E341B3010_Col00']/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]/div[1]/a")).click();
		    Thread.sleep(3000);*/
		
		
		//signin
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='baseForm']/div[3]/div[12]/div[2]/div/div[2]/div[1]/label/input")).sendKeys("asdf12@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='baseForm']/div[3]/div[12]/div[2]/div/div[2]/div[1]/a")).click();
		Thread.sleep(20000);
		driver.findElement(By.name("password")).sendKeys("asdf@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='baseForm']/div[3]/div[3]/div[2]/div/div[2]/div[1]/a")).click();
		Thread.sleep(15000);
		System.out.println("Able to sign in the PF Chang's website.");
		
		
		//menu
		
		driver.findElement(By.linkText("Menu")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Main Entrées")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C020_Col00']/div[9]/section/div[2]/div[3]/p[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C050_Col01']/div/div/div/a")).click();
		Thread.sleep(15000);
		/*driver.findElement(By.name("StreetAddress")).sendKeys("Tempe");
		Thread.sleep(1000);
		driver.findElement(By.id("frmGetStartedSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Advance']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Skip to View Menu')]")).click();
		Thread.sleep(15000); */
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		links.get(new Random().nextInt(5)).click();
		/*driver.findElement(By.xpath("//img[@src='https://olo-images-live.imgix.net/33/33752baf89bb4b8c89ed3f2e29be94a3.jpg?auto=format%2Ccompress&q=60&cs=tinysrgb&w=238&h=158&fit=fill&fm=png32&bg=transparent&s=5027bc7aa52926575947a628f879fbc0']")).click();
		*/
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='AddProductToBasket']")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		System.out.println("Menu item ordered successfully.");
		
		
		//reservations
		driver.findElement(By.linkText("Reservations")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='text-input-style truncate-loc text-align step-1-alignment ng-scope']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("locationOption")).sendKeys("Tempe");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Temperanceville, VA, USA")).click();
		Thread.sleep(5000);
		
		/*List<WebElement> links2 = driver.findElements(By.className("location-name ng-binding"));
		System.out.println("Total links are " + links.size());
		links2.get(new Random().nextInt(3)).click();*/
		
		driver.findElement(By.xpath("//*[@id='locationModal']/div/div/div[2]/div[2]/div/div[4]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("reservationDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/label/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("timeInput")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[2]/div[3]/div/time-input-dropdown/div/div[2]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[2]/div[4]/div/input-dropdown/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[2]/div[4]/div/input-dropdown/div/div[3]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
		Thread.sleep(8000);
		if(driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[1]/div/div/div[2]"))!=null)
		{
			driver.navigate().to("https://www.pfchangs.com/");
			Thread.sleep(5000);
			System.out.println("For valid reservation, please contact to the PF Chang's contact number");
		}
		else
		{
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C021_Col00']/div[2]/div[2]/ng-form/div/div/div/div[2]/div[2]/div/div/div/div[4]/button")).click();
		Thread.sleep(3000);		
		System.out.println("Submit details to do reservation.");
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		System.out.println("Able to do reservation successfully, confirmation number is provided.");
		}
		
		
		//rewards
		/*new tab rewards*/
		driver.findElement(By.linkText("Rewards")).sendKeys(selectLinkOpeninNewTab);
		/*driver.findElement(By.xpath("//*[@id='mainNavbar']/li[3]/a")).click();*/
		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_T37E341B3010_Col00']/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(3000);
		System.out.println("Able to navigate to rewards page.");
		/*driver.findElement(By.xpath("//*[@id='contentPlaceholder_T37E341B3010_Col00']/div[3]/div/div/div[1]/div/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='account-overview-wrap']/div/div[2]/div/div/div[5]/div[2]/div/div[2]/div/div/div[3]/div/div[3]/a")).click();
		Thread.sleep(10000);*/
		/*driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(8000);*/
		
		//catering
		
		driver.findElement(By.xpath("//*[@id='mainNavbar']/li[4]/a")).click();
        Thread.sleep(5000);
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs3.get(2));
        System.out.println("Catering account opened.");
        /*driver.get("https://catering.pfchangs.com/");*/
        Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='heading_home']/div[1]/div/div/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='main_content']/article/div/div[2]/div/div[1]/div/a/span")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id='psid_587']/div/fieldset/div[5]/a")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id='orderForm_587']/div/div/div[5]/div/span[2]/button/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='submit_587']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='production_item_2_587_557']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='production_item_3_587_366']")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id='sub_note_587']")).sendKeys("Prepare it deliciously");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='submit_duplicate_config']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='site-nav']/ul/li[3]/ul/li[5]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='sub_468']")).sendKeys("3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='submit_468']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='submit_config']")).click();
        Thread.sleep(3000);
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		System.out.println("Able to order a catering item successfully.");
        
		//Offers
		driver.findElement(By.linkText("Offers")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_C022_Col00']/div/div/div/a")).click();
		Thread.sleep(3000);
		System.out.println("Navigated to an offers page.");
		
		//Careers
		driver.findElement(By.linkText("Careers")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(3000);
		ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs4.get(3));
		/*driver.navigate().to("https://jobs.pfchangs.com/");*/
		Thread.sleep(15000);
		/*driver.findElement(By.xpath("//*[@id='keyword-search']")).sendKeys("server");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(6000);*/
		
		/*driver.findElement(By.xpath("//*[@id='188-9-jpm']/div[1]/p/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='188-9-jpm']/div[2]/p[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apply Now")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id='job-search']/div[5]/div/div/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[3]/div/p/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[3]/div/div/ul/li[4]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[3]/div/div/div/p[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[4]/div/p/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[4]/div/div/ul/li[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='map-search']/div[4]/div/div[1]/div/div/div[4]/div/div/div/p[1]")).click();
		Thread.sleep(3000);
		
		driver.navigate().to("https://jobs.pfchangs.com/jobsearch/#['server']|||1|1|0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='job-search']/div[5]/div/div/a[2]")).click();
		Thread.sleep(6000);
		driver.navigate().to("https://jobs.pfchangs.com/");
		driver.findElement(By.xpath("//*[@id='home']/div[3]/div/div/header/nav/ul/li[3]/a")).click();
		Thread.sleep(6000);
		

		driver.findElement(By.xpath("//*[@id='working-here']/div[3]/div/div/header/nav/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='about-us']/div[5]/div/div/div/div[1]/div[2]/div/a")).click();
		Thread.sleep(6000);*/
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(6000);
		System.out.println("Navigated to the Careers page.");
		
		//Gift cards
		driver.findElement(By.xpath("//*[@id='mainNavbar']/li[7]/a")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(6000);
		ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs5.get(4));
	    Thread.sleep(4000);
		/*driver.findElement(By.xpath("//*[@id='mainNavbar']/li[7]/a")).click();
		Thread.sleep(10000);
		/*driver.findElement(By.xpath("//*[@id='contentPlaceholder_C015_Col00']/div/div/section/div/section/div[3]/div/div[1]/div[2]/a/span")).click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);*/
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		System.out.println("Able to view the Gift cards page");
		
		//viewmore
		/*driver.findElement(By.xpath("//*[@id='fire-on-my-position']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='fly-nav']/ul[1]/li[1]/a")).click();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fire-on-my-position']/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='fly-nav']/ul[1]/li[2]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fire-on-my-position']/span[1]")).click();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[1]/a[1]")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[1]/a[2]")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[1]/a[3]")).click();
		Thread.sleep(3000);				
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[1]/a[4]")).click();
		System.out.println("Checked more options like About us, blog, media and food philosophy.");
		Thread.sleep(3000);	
        driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3066_Col00']/div[2]/div/div/div[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3066_Col00']/div[2]/div/div/div[1]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3066_Col00']/div[2]/div/div/div[1]/a[3]")).click();
		Thread.sleep(5000);
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);
		System.out.println("Checked links Term of use, Privacy policy and site map for PFChang's website.");
		
		//location
		driver.findElement(By.xpath("//*[@id='headerPlaceholder_T37E341B3007_Col00']/div/a[1]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/ul/li[7]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//*[@id='js-infoBox']/div[1]/div[2]/div/div/a")).click();
		Thread.sleep(5000);
		
		ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs6.get(4));
	    Thread.sleep(3000);*/
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(5000);
		System.out.println("Found a location through google map.");
		
		//foodphilosophy
		/*driver.findElement(By.xpath("//*[@id='contentPlaceholder_C060_Col00']/div[2]/div/div[3]/a")).click();
		Thread.sleep(7000);
		driver.navigate().to("https://www.pfchangs.com/");
		Thread.sleep(3000);*/
		
		//more
		
		/*driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[2]/div/a[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='contentPlaceholder_T37E341B3010_Col00']/div[3]/div/div/div/a[1]")).click();
        Thread.sleep(8000);*/
       
      
      
        /*driver.findElement(By.xpath("//*[@id='contentPlaceholder_C009_Col00']/div/div/div[1]/div/a[4]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='contentPlaceholder_C009_Col00']/div/div/div[1]/div/a[5]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id='contentPlaceholder_C009_Col00']/div/div/div[1]/div/a[6]")).click();
        Thread.sleep(10000);*/
        /*driver.navigate().to("https://www.pfchangs.com/");
        Thread.sleep(3000);*/
        driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[2]/div/a[3]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[2]/div/a[4]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='accordionheader']/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='ui-id-12']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='footerPlaceholder_T37E341B3065_Col00']/div[2]/div/a[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("firstName")).sendKeys("as");
        Thread.sleep(3000);
        driver.findElement(By.id("lastName")).sendKeys("df");
        Thread.sleep(3000);
        driver.findElement(By.id("emailAddress")).sendKeys("asdf12@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("phoneNumber")).sendKeys("9123456789");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='TopicOptionsInput']/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='TopicOptionsInput']/div/div[6]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='feedback']")).sendKeys("Excellent");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='contentPlaceholder_C013_Col00']/div[1]/div[3]/fieldset/ng-form/div[4]/div[9]/div[2]/button")).click();
		Thread.sleep(5000);
		System.out.println("Feedback is given successfully for PF Chang's restuarant.");
		
        
		//signout
		driver.findElement(By.xpath("//*[@id='logout-btn']")).click();
		Thread.sleep(5000);
		System.out.println("Sign out from the PF Chang's website.");
		System.out.println("All the links are traversed successfully.");
		driver.manage().deleteAllCookies();
		Thread.sleep(10000);
		/*driver.manage().getCookies();
		Thread.sleep(10000);*/
		driver.quit();
		System.out.println("Browser is able to close itself.");
                Thread.sleep(5000);
		
	
	}
		
		

}
