package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch {
	@Test 
	public void SuccessfulSearch() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.booking.com/index.en-gb.html?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwtLXDvuq0JDoAQgBYxrjL-wU"); 
		driver.findElement(By.id("ss")).clear();
		WebElement Search=driver.findElement(By.id("ss")); 
		WebElement button=driver.findElement(By.className("sb-searchbox__button")); 
		Search.sendKeys("Khobaer"); 
		Thread.sleep(2000);
		button.click(); 
		System.out.println("Test PASSED");
		driver.quit();
	}
	
	@Test 
	public void VerifyErrorMessage() throws InterruptedException { 
		String ExpectErrorMessage= "Error:\n"
				+ "Please enter a destination to start searching.";
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.booking.com/index.en-gb.html?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwtLXDvuq0JDoAQgBYxrjL-wU"); 
		WebElement Search=driver.findElement(By.id("ss")); 
		WebElement button=driver.findElement(By.className("sb-searchbox__button")); 
		Search.sendKeys(""); 
		button.click(); 
		String ActualErrorMessage = driver.findElement(By.className("fe_banner__message")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		System.out.println("Test PASSED");
		driver.quit();
	}
}
