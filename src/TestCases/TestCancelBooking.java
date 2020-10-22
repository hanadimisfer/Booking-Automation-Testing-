package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCancelBooking {
	WebDriver driver;
	String ExpectErrorMessage;
	String ActualErrorMessage;
	
	
	@Test(priority=1)
	public void Cancel() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		 driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadim@outlook.com"); 
		next.click(); 
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("Hn@30113011"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button")).submit();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#basiclayout > div.bui-card.bui-u-bleed\\@small.entry-upcoming-booking-card.js-ds-new-upcoming-booking > div > div.entry-upcoming-booking-card__view-booking > a.bui-link.bui-link--primary")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#b2myreservationsPage > div.modal-wrapper.gta-lightbox-wrapper > button")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#mb-container > div.mb-main-details.mb-details--compact > div.mb_cancellation_timeline > div.mb_cancellation_timeline__buttons > a")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#v3_none_of_the_above")).click();
		Thread.sleep(3000);
		WebElement msg=driver.findElement(By.id("v3_uav_cxl_survey_reasons_other_reasons_txt")); 
		Thread.sleep(3000);
		msg.sendKeys("others"); 		
		driver.findElement(By.cssSelector("#cancel_sure")).click(); 
		System.out.println("Test PASSED");
		driver.quit();	
	}
	
	@Test(priority=0)
	public void VerifyCancelErrorMessage() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadim@outlook.com"); 
		next.click(); 
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("Hn@30113011"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button")).submit();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#basiclayout > div.bui-card.bui-u-bleed\\@small.entry-upcoming-booking-card.js-ds-new-upcoming-booking > div > div.entry-upcoming-booking-card__view-booking > a.bui-link.bui-link--primary")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#b2myreservationsPage > div.modal-wrapper.gta-lightbox-wrapper > button")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mb-container\"]/div[5]/div[3]/div[3]/a")).click(); 
		Thread.sleep(3000);		
		driver.findElement(By.cssSelector("#cancel_sure")).click(); 
		Thread.sleep(3000);
		ExpectErrorMessage="Please tell us your reason for cancelling your booking"; 
		ActualErrorMessage= driver.findElement(By.xpath("//*[@id=\"b_mybooking_cancel_entire_booking\"]/fieldset/p")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		Thread.sleep(3000);
		System.out.println("Test PASSED");
		driver.quit();
	}

}
