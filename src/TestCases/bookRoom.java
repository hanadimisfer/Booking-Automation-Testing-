package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.awt.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
public class bookRoom {
	String roomnum="1",firstname="first",lastname="lasst",email1="sa.alharbi30@gmail.com",email22="sa.alharbi30@gmail.com",country="sa",phoneNo="55555555";
	 
	String cardNo="786896234788767234",month="02" ,year="2021",cardtype="Visa",cvcno="473";
	 @BeforeMethod
	public void bef()throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
		String baseUrl="https://www.booking.com/hotel/sa/ascott-rafal-olaya-riyadh.en-gb.html?aid=376381;label=bookings-naam-0U48THtFadjZBwJ4BHv4SgS455578861560%3Apl%3Ata%3Ap1%3Ap22%2C563%2C000%3Aac%3Aap%3Aneg%3Afi%3Atikwd-65526620%3Alp20987%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YV19IumoQ3O5HnTajxNh2ss;sid=72ed4194b3fe5af3639f934a5d71bbb2;all_sr_blocks=178935401_276033947_0_2_0;checkin=2020-10-03;checkout=2020-10-04;dest_id=900040280;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=178935401_276033947_0_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=178935401_276033947_0_2_0__48578;srepoch=1601449736;srpvid=6076324389c30136;type=total;ucfs=1&"; 
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		Dimension d = new Dimension(300,1080);
		driver.manage().window().maximize();} 
			 
		@Test
		public  void testWithValidData()throws InterruptedException{
			String roomnum="1",firstname="first",lastname="lasst",email1="sa.alharbi30@gmail.com",email22="sa.alharbi30@gmail.com",country="sa",phoneNo="55555555"; 
			String cardNo="786896234788767234",month="02" ,year="2021",cardtype="Visa",cvcno="473";
			System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
			WebDriver driver = new ChromeDriver();		
			String baseUrl="https://www.booking.com/hotel/sa/ascott-rafal-olaya-riyadh.en-gb.html?aid=376381;label=bookings-naam-0U48THtFadjZBwJ4BHv4SgS455578861560%3Apl%3Ata%3Ap1%3Ap22%2C563%2C000%3Aac%3Aap%3Aneg%3Afi%3Atikwd-65526620%3Alp20987%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YV19IumoQ3O5HnTajxNh2ss;sid=72ed4194b3fe5af3639f934a5d71bbb2;all_sr_blocks=178935401_276033947_0_2_0;checkin=2020-10-03;checkout=2020-10-04;dest_id=900040280;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=178935401_276033947_0_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=178935401_276033947_0_2_0__48578;srepoch=1601449736;srpvid=6076324389c30136;type=total;ucfs=1&"; 
			driver.get(baseUrl);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 Dimension d = new Dimension(300,1080);
			 driver.manage().window().maximize();
			 
			
			WebElement element = driver.findElement(By.className("hprt-nos-select"));
			js.executeScript("arguments[0].scrollIntoView();",element );
			Select selec =new Select(driver.findElement(By.className("hprt-nos-select")));
			selec.selectByValue((roomnum));
		    driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[1]/div[1]/div[9]/div[2]/div[1]/div[7]/div[3]/div/form/div[10]/div[2]/div[4]/div[6]/button")).click(); 
		     
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("/html/body")).click();
		    Thread.sleep(4000);
		     
		    
	       WebElement lastnam = driver.findElement(By.id("lastname"));
	        js.executeScript("arguments[0].scrollIntoView();",lastnam );
		    //firstnam.sendKeys(firstname);
		    
		    WebElement lastnamm = driver.findElement(By.id("lastname"));
	         
	         
		    lastnamm.sendKeys(lastname);
		    
		    WebElement email = driver.findElement(By.id("email"));
	        
	         
	        email.sendKeys(email1);
	        WebElement email2 = driver.findElement(By.id("email_confirm"));
	        
	        
	        email2.sendKeys(email22);
	        Thread.sleep(2000);
	        driver.findElement(By.name("book")).click(); 
	        Thread.sleep(2000);
	        driver.quit();}

		@Test
		public  void testwithemptyName()throws InterruptedException{
			String roomnum="1",firstname="first",lastname="",email1="sa.alharbi30@gmail.com",email22="sa.alharbi30@gmail.com",country="sa",phoneNo="55555555"; 
			String cardNo="786896234788767234",month="02" ,year="2021",cardtype="Visa",cvcno="473";
			System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
			WebDriver driver = new ChromeDriver();		
			String baseUrl="https://www.booking.com/hotel/sa/ascott-rafal-olaya-riyadh.en-gb.html?aid=376381;label=bookings-naam-0U48THtFadjZBwJ4BHv4SgS455578861560%3Apl%3Ata%3Ap1%3Ap22%2C563%2C000%3Aac%3Aap%3Aneg%3Afi%3Atikwd-65526620%3Alp20987%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YV19IumoQ3O5HnTajxNh2ss;sid=72ed4194b3fe5af3639f934a5d71bbb2;all_sr_blocks=178935401_276033947_0_2_0;checkin=2020-10-03;checkout=2020-10-04;dest_id=900040280;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=178935401_276033947_0_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=178935401_276033947_0_2_0__48578;srepoch=1601449736;srpvid=6076324389c30136;type=total;ucfs=1&"; 
			driver.get(baseUrl);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 Dimension d = new Dimension(300,1080);
			 driver.manage().window().maximize();

			WebElement element = driver.findElement(By.className("hprt-nos-select"));
			js.executeScript("arguments[0].scrollIntoView();",element );
			Select selec =new Select(driver.findElement(By.className("hprt-nos-select")));
			selec.selectByValue((roomnum));
		    driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[1]/div[1]/div[9]/div[2]/div[1]/div[7]/div[3]/div/form/div[10]/div[2]/div[4]/div[6]/button")).click(); 
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("/html/body")).click();
		    Thread.sleep(2000);
		     
		    
	       WebElement lastnam = driver.findElement(By.id("lastname"));
	       js.executeScript("arguments[0].scrollIntoView();",lastnam );
		     
		    WebElement lastnamm = driver.findElement(By.id("lastname"));
	         
	         
		    lastnamm.sendKeys(lastname);
		    
		    
		    WebElement email = driver.findElement(By.id("email"));
	        
	         
	        email.sendKeys(email1);
	        WebElement email2 = driver.findElement(By.id("email_confirm"));
	        
	        
	        email2.sendKeys(email22);
	         
	        driver.findElement(By.name("book")).click(); 
	        Thread.sleep(15000);
		    driver.findElement(By.xpath("/html/body")).click();
	        WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bp_form_lastname_msg")));
	        String err2 = driver.findElement(By.id("bp_form_lastname_msg")).getText();
		    AssertJUnit.assertEquals(err2,"Please fill in your last name");
		     
		  
		     driver.quit();
	         
		    	 
		    
		    }
		@Test
		public  void testwithemptyEmail()throws InterruptedException{
			String roomnum="1",firstname="first",lastname="last",email1="",email22="",country="sa",phoneNo="55555555"; 
			String cardNo="786896234788767234",month="02" ,year="2021",cardtype="Visa",cvcno="473";
			System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
			WebDriver driver = new ChromeDriver();		
			String baseUrl="https://www.booking.com/hotel/sa/ascott-rafal-olaya-riyadh.en-gb.html?aid=376381;label=bookings-naam-0U48THtFadjZBwJ4BHv4SgS455578861560%3Apl%3Ata%3Ap1%3Ap22%2C563%2C000%3Aac%3Aap%3Aneg%3Afi%3Atikwd-65526620%3Alp20987%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YV19IumoQ3O5HnTajxNh2ss;sid=72ed4194b3fe5af3639f934a5d71bbb2;all_sr_blocks=178935401_276033947_0_2_0;checkin=2020-10-03;checkout=2020-10-04;dest_id=900040280;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=178935401_276033947_0_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=178935401_276033947_0_2_0__48578;srepoch=1601449736;srpvid=6076324389c30136;type=total;ucfs=1&"; 
			driver.get(baseUrl);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 Dimension d = new Dimension(300,1080);
			 driver.manage().window().maximize();

			WebElement element = driver.findElement(By.className("hprt-nos-select"));
			js.executeScript("arguments[0].scrollIntoView();",element );
			Select selec =new Select(driver.findElement(By.className("hprt-nos-select")));
			selec.selectByValue((roomnum));
		    driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[1]/div[1]/div[9]/div[2]/div[1]/div[7]/div[3]/div/form/div[10]/div[2]/div[4]/div[6]/button")).click(); 
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("/html/body")).click();
		    Thread.sleep(2000);
		     
		    
	       WebElement lastnam = driver.findElement(By.id("lastname"));
	       js.executeScript("arguments[0].scrollIntoView();",lastnam );
		     
		    WebElement lastnamm = driver.findElement(By.id("lastname"));
	         
	         
		    lastnamm.sendKeys(lastname);
		    
		    WebElement email = driver.findElement(By.id("email"));
	        
	         
	        email.sendKeys(email1);
	        WebElement email2 = driver.findElement(By.id("email_confirm"));
	        
	        
	        email2.sendKeys(email22);
	        driver.findElement(By.name("book")).click();
	        Thread.sleep(15000);
		    driver.findElement(By.xpath("/html/body")).click();
	        WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bp_form_email_msg")));
	        String err2 = driver.findElement(By.id("bp_form_email_msg")).getText();
		    AssertJUnit.assertEquals(err2, "Please fill in a valid email address");
		     
		  
		     driver.quit();
	         
		    	 
		    
		    }
		
 
			@AfterMethod
			public void af() {
				WebDriver driver = new ChromeDriver();
				driver.close();
			}
	}
