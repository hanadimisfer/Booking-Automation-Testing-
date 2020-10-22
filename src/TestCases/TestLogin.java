package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	// TODO Successful Login with valid credential
	@Test 
	public void login() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadim@outlook.com"); 
		next.click(); 
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("Hn@30113011"); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button")).submit();
		String actualUrl="https://account.booking.com/sign-in/password?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU";
		String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualUrl); 
		System.out.println("Test PASSED");
		driver.quit();
	}
	// TODO  Login with Empty Input	
	@Test
	public void VerifyEmailErrorMessage() { 
		String ExpectErrorMessage= "Enter your email address";
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys(" "); 
		next.click(); 
		String ActualErrorMessage = driver.findElement(By.id("username-description")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		System.out.println("Test PASSED");
		driver.quit();
	}

	@Test 
	public void VerifyPasswordErrorMessage() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadim@outlook.com"); 
		next.click(); 
		String ExpectErrorMessage= "Enter your Booking.com password";
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys(""); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button")).submit();
		String ActualErrorMessage = driver.findElement(By.id("password-description")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		System.out.println("Test PASSED");
		driver.quit();
	}

	@Test 
	public void UnexistEmail() throws InterruptedException { 
		String ExpectErrorMessage= "Looks like there isn't an account associated with this email address. You can create an account to access our services.";
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadi@outlook.com"); 
		next.click(); 
		Thread.sleep(2000);
		String ActualErrorMessage = driver.findElement(By.className("bui-form__error")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		System.out.println("Test PASSED");
		driver.quit();
	}

	@Test 
	public void IncorrectCombination() throws InterruptedException { 
		String ExpectErrorMessage= "The email and password combination you entered doesn't match.";
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLlBAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qhARVb0FEbFhELWpjeHNPdkxOVlRvcnhQaF94QWJOSFhVd3JRZWZPNV91WWhTUGRUTjlVaHV4bzRSZGlwQUM0bF9pVGtFWHpsQm5YT19KWHh3TW1YRnRYY2dyQ1lzSU9OTGtJaVZhQ2RrMlhBRXdmZVpzdnB3a1B5N2d6Vm12VU9xN1dSNG1oeWpqS0Y5d0p3WDJ6dTk4aTEyakJ1NUktTnJIbnN1cGgzd2JvemM1OXdwcTMxRDNMbTVaSjJTSzVVYWdaVk5QTDI2bkNxNVp6bEZndWp3ZXNNZURhZ3g1SU9Cd01QcG5hUUhDMVFJWjVydm9nQkVaV1pyMG9tdTFnYzVmWlAxUkh1dGpLbnc3OVRYbTJVaFhtX09Feml5QW1SZk50OVFaNVNiZGl6RjZPU0hLMzVyX0JiNlVZUVRLRVRSN0NhMWFha3Fnc0xNUmtqWVBVellmMEdPLUF3OWY3VWpQYU1kdlBrZW9qX2lPcWhtb1YyaUR2elJ3VWNCRFB4a0RackdYOXE2SUJUWGxNOGlzRHlhWHJ2akM3U1BsYk9RZmFYSWVYZWtrTHE2SXZYNGxNcmlEb2wwRVBMbnZISV9tU2RaT0dwWmRKaXVETS1LWmZZek0wYzdJMkZtWXE0SE9XWlhhNXpHV3FOZzBjY2FVZ2kwc3FXR3RlcXJ0aUlWM1lBeGFCBGNvZGUqFgiOyBIwyLT6lua0JDoAQgBYobLL-wU"); 
		WebElement username=driver.findElement(By.cssSelector("input[type=email]")); 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[3]/button/span"));
		username.sendKeys("hanadim@outlook.com"); 
		next.click(); 
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password")); 
		password.sendKeys("123"); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button")).submit();
		Thread.sleep(2000);
		String ActualErrorMessage = driver.findElement(By.className("bui-form__error")).getText();
		Assert.assertEquals(ExpectErrorMessage,ActualErrorMessage); 
		System.out.println("Test PASSED");
		driver.quit();
	}

}
