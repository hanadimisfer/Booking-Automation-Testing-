package TestCases;


import static org.testng.Assert.assertEquals;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {
	
	WebDriver driver;
	
	@Test(priority =4)
	public void RegistrationNewAccountSuccessfully() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
		 driver = new ChromeDriver();
		final String randomEmail = randomEmail();

		
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLwCAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qjwhVb2dHb2k5OER5OVMyOE4waDZreFF0dUE1RTAtc0hYcFpDa2Q4OHJKRXZoQWg3UkxjT0xoR1BURkxRZkYxZGk0Vll1UnJvM3N3THBFZ1B5RTAzaTRXdTZScUNSekU4UTZPWjhYOGhULW1zSEZucnJEYjZLSXMyTTF0SkNLZElra0FEcXhieFk5Y3c5RVFfM2ExYjZPVEpqcEUyMElEXzdCeHVTSFRDMENYR3J2T0ZuWDZaZllWRW9Tb1loVUVVa1UzZG9TNElKd0otdE1YUnlja3VSUTh0NWpsQzNid1JEdWZhaHMtbkI0Z19KOWpHYjNOMmx0RXBxX05QbTlBVkZVSU1YVVRwb2NMRFJwNkdLNzdMV05FSzVNTUVTSUdXaE1qb0tJc1lIYjhmQWg3Uk5NR1E3WnhseXM1YWxYWmQwRldOc0dlekZVUnhyVlp5V0c4Z2dEcHRRS1o5VVBLelM3aWZ3M2RsNGdIcDRyTV9IMko4cmNtYk9sMUdpcGUyWnItQkQ3YWt4VmtsOEprWHdUaElyMnBJdFQtSWZaYzF3OWgycU5PSVVCT0ZlTEF4Rnl3QVEyU3VGOWlmdTNRU0FvbjVrQ3h1S28xTWFqRjRYYVJNLXZpVEl1Zkl4andzSnlWY25KdzNhblhja2I0WkUxTHFpd3N0UmxaWlVzLVpuV3hBdUkyTWtVMkh5NVRDVjktVFBwMVlkOFctN3c3V3RzOGR0R1l3cTNycWJIZk13MnRIcGdqTGlqMVZGb0gzZG9kTnpLSUdJa1ZmN2xQQVE2S0pRTG1NNFVxVUljQnA2YTI1UGNXSkwyemFHTFpzWGVfeUlRcmk0U2dJdHBaOGxvX1VpX05Ta2NLRENES1Q1enJyTUJpVnA5Q1VJLWxyMG9ISXF4a3JrVHBrdFh1S0I2Mi1BeVcxai13b0VOVjZ3M1I5T3QtbTVqSFRocGl0QTQ2THJ6X0NXMjRRY01wSE1jbWRHdXFyMjlCLUhkazhXcWdzYVdrdy1FYzBwdXJyaGo0TGtxbGsyNjNvaWlmOHJMUW40RUZxenJwUGJDbGZfa29Db1VpY0l3dWpuVFU4T1Y0WGNubkQ2YXNTRkZsQlpMbjU2T1V5bjVtdDh6d1hJZ3ZtTVA2elJTRE82d3JPRmxYM3ZyZEtrV0dONVdnZDJfU1RoWFZvT3pZb3cteWhYRmh2cTlGbExXVDhwM1l4eEZvanJwTUZpWFBCVnNvUzJkanlWdEpRT0ZnTXpIX2ltc2d2dDlTMFU5QjlBT3JBLWVzZnIzTlpfRXhqZlQ4Q1BGREhxZ0NJOXl6NExGb2tvbnQxbXlvaTY4clRJU2JZcVRaUUxGNGZOWTVsSnM5RGZ4Wk5Ld0xxYnh1aVc3NU9NQgRjb2RlKhYIjsgSMLS57ZDytCQ6AEIAWLDFzPsF&lang=en-gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[5]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login_name_register\"]")).sendKeys(randomEmail);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Os123456*");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("Os123456*");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		


	}
	

	@Test(priority =1)
	public void RegistrationNewAccountWihEmptyFieldEmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
 
		 driver = new ChromeDriver();
		
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLwCAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qjwhVb2dHb2k5OER5OVMyOE4waDZreFF0dUE1RTAtc0hYcFpDa2Q4OHJKRXZoQWg3UkxjT0xoR1BURkxRZkYxZGk0Vll1UnJvM3N3THBFZ1B5RTAzaTRXdTZScUNSekU4UTZPWjhYOGhULW1zSEZucnJEYjZLSXMyTTF0SkNLZElra0FEcXhieFk5Y3c5RVFfM2ExYjZPVEpqcEUyMElEXzdCeHVTSFRDMENYR3J2T0ZuWDZaZllWRW9Tb1loVUVVa1UzZG9TNElKd0otdE1YUnlja3VSUTh0NWpsQzNid1JEdWZhaHMtbkI0Z19KOWpHYjNOMmx0RXBxX05QbTlBVkZVSU1YVVRwb2NMRFJwNkdLNzdMV05FSzVNTUVTSUdXaE1qb0tJc1lIYjhmQWg3Uk5NR1E3WnhseXM1YWxYWmQwRldOc0dlekZVUnhyVlp5V0c4Z2dEcHRRS1o5VVBLelM3aWZ3M2RsNGdIcDRyTV9IMko4cmNtYk9sMUdpcGUyWnItQkQ3YWt4VmtsOEprWHdUaElyMnBJdFQtSWZaYzF3OWgycU5PSVVCT0ZlTEF4Rnl3QVEyU3VGOWlmdTNRU0FvbjVrQ3h1S28xTWFqRjRYYVJNLXZpVEl1Zkl4andzSnlWY25KdzNhblhja2I0WkUxTHFpd3N0UmxaWlVzLVpuV3hBdUkyTWtVMkh5NVRDVjktVFBwMVlkOFctN3c3V3RzOGR0R1l3cTNycWJIZk13MnRIcGdqTGlqMVZGb0gzZG9kTnpLSUdJa1ZmN2xQQVE2S0pRTG1NNFVxVUljQnA2YTI1UGNXSkwyemFHTFpzWGVfeUlRcmk0U2dJdHBaOGxvX1VpX05Ta2NLRENES1Q1enJyTUJpVnA5Q1VJLWxyMG9ISXF4a3JrVHBrdFh1S0I2Mi1BeVcxai13b0VOVjZ3M1I5T3QtbTVqSFRocGl0QTQ2THJ6X0NXMjRRY01wSE1jbWRHdXFyMjlCLUhkazhXcWdzYVdrdy1FYzBwdXJyaGo0TGtxbGsyNjNvaWlmOHJMUW40RUZxenJwUGJDbGZfa29Db1VpY0l3dWpuVFU4T1Y0WGNubkQ2YXNTRkZsQlpMbjU2T1V5bjVtdDh6d1hJZ3ZtTVA2elJTRE82d3JPRmxYM3ZyZEtrV0dONVdnZDJfU1RoWFZvT3pZb3cteWhYRmh2cTlGbExXVDhwM1l4eEZvanJwTUZpWFBCVnNvUzJkanlWdEpRT0ZnTXpIX2ltc2d2dDlTMFU5QjlBT3JBLWVzZnIzTlpfRXhqZlQ4Q1BGREhxZ0NJOXl6NExGb2tvbnQxbXlvaTY4clRJU2JZcVRaUUxGNGZOWTVsSnM5RGZ4Wk5Ld0xxYnh1aVc3NU9NQgRjb2RlKhYIjsgSMLS57ZDytCQ6AEIAWLDFzPsF&lang=en-gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login_name_register\"]")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		String emptyEmailFaild = driver.findElement(By.xpath("//*[@id=\"login_name_register-description\"]")).getText();
        assertEquals(emptyEmailFaild ,"Please enter your email address");
        System.out.println("Test Paseed");
        driver.quit();
	}     
	
	@Test(priority =2)
	public void RegistrationNewAccountWihWrongFormatEmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   

		 driver = new ChromeDriver();
		
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLwCAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qjwhVb2dHb2k5OER5OVMyOE4waDZreFF0dUE1RTAtc0hYcFpDa2Q4OHJKRXZoQWg3UkxjT0xoR1BURkxRZkYxZGk0Vll1UnJvM3N3THBFZ1B5RTAzaTRXdTZScUNSekU4UTZPWjhYOGhULW1zSEZucnJEYjZLSXMyTTF0SkNLZElra0FEcXhieFk5Y3c5RVFfM2ExYjZPVEpqcEUyMElEXzdCeHVTSFRDMENYR3J2T0ZuWDZaZllWRW9Tb1loVUVVa1UzZG9TNElKd0otdE1YUnlja3VSUTh0NWpsQzNid1JEdWZhaHMtbkI0Z19KOWpHYjNOMmx0RXBxX05QbTlBVkZVSU1YVVRwb2NMRFJwNkdLNzdMV05FSzVNTUVTSUdXaE1qb0tJc1lIYjhmQWg3Uk5NR1E3WnhseXM1YWxYWmQwRldOc0dlekZVUnhyVlp5V0c4Z2dEcHRRS1o5VVBLelM3aWZ3M2RsNGdIcDRyTV9IMko4cmNtYk9sMUdpcGUyWnItQkQ3YWt4VmtsOEprWHdUaElyMnBJdFQtSWZaYzF3OWgycU5PSVVCT0ZlTEF4Rnl3QVEyU3VGOWlmdTNRU0FvbjVrQ3h1S28xTWFqRjRYYVJNLXZpVEl1Zkl4andzSnlWY25KdzNhblhja2I0WkUxTHFpd3N0UmxaWlVzLVpuV3hBdUkyTWtVMkh5NVRDVjktVFBwMVlkOFctN3c3V3RzOGR0R1l3cTNycWJIZk13MnRIcGdqTGlqMVZGb0gzZG9kTnpLSUdJa1ZmN2xQQVE2S0pRTG1NNFVxVUljQnA2YTI1UGNXSkwyemFHTFpzWGVfeUlRcmk0U2dJdHBaOGxvX1VpX05Ta2NLRENES1Q1enJyTUJpVnA5Q1VJLWxyMG9ISXF4a3JrVHBrdFh1S0I2Mi1BeVcxai13b0VOVjZ3M1I5T3QtbTVqSFRocGl0QTQ2THJ6X0NXMjRRY01wSE1jbWRHdXFyMjlCLUhkazhXcWdzYVdrdy1FYzBwdXJyaGo0TGtxbGsyNjNvaWlmOHJMUW40RUZxenJwUGJDbGZfa29Db1VpY0l3dWpuVFU4T1Y0WGNubkQ2YXNTRkZsQlpMbjU2T1V5bjVtdDh6d1hJZ3ZtTVA2elJTRE82d3JPRmxYM3ZyZEtrV0dONVdnZDJfU1RoWFZvT3pZb3cteWhYRmh2cTlGbExXVDhwM1l4eEZvanJwTUZpWFBCVnNvUzJkanlWdEpRT0ZnTXpIX2ltc2d2dDlTMFU5QjlBT3JBLWVzZnIzTlpfRXhqZlQ4Q1BGREhxZ0NJOXl6NExGb2tvbnQxbXlvaTY4clRJU2JZcVRaUUxGNGZOWTVsSnM5RGZ4Wk5Ld0xxYnh1aVc3NU9NQgRjb2RlKhYIjsgSMLS57ZDytCQ6AEIAWLDFzPsF&lang=en-gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login_name_register\"]")).sendKeys("osama111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		String WrongFormatEmail = driver.findElement(By.xpath("//*[@id=\"login_name_register-description\"]")).getText();
        assertEquals(WrongFormatEmail ," ");
        System.out.println("Test Paseed");
        driver.quit();
	}
	
	

	@Test(priority =3)
	public void RegistrationNewAccountWithEmptyConformPassword() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
  
		 driver = new ChromeDriver();
		
		driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLwCAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qjwhVb2dHb2k5OER5OVMyOE4waDZreFF0dUE1RTAtc0hYcFpDa2Q4OHJKRXZoQWg3UkxjT0xoR1BURkxRZkYxZGk0Vll1UnJvM3N3THBFZ1B5RTAzaTRXdTZScUNSekU4UTZPWjhYOGhULW1zSEZucnJEYjZLSXMyTTF0SkNLZElra0FEcXhieFk5Y3c5RVFfM2ExYjZPVEpqcEUyMElEXzdCeHVTSFRDMENYR3J2T0ZuWDZaZllWRW9Tb1loVUVVa1UzZG9TNElKd0otdE1YUnlja3VSUTh0NWpsQzNid1JEdWZhaHMtbkI0Z19KOWpHYjNOMmx0RXBxX05QbTlBVkZVSU1YVVRwb2NMRFJwNkdLNzdMV05FSzVNTUVTSUdXaE1qb0tJc1lIYjhmQWg3Uk5NR1E3WnhseXM1YWxYWmQwRldOc0dlekZVUnhyVlp5V0c4Z2dEcHRRS1o5VVBLelM3aWZ3M2RsNGdIcDRyTV9IMko4cmNtYk9sMUdpcGUyWnItQkQ3YWt4VmtsOEprWHdUaElyMnBJdFQtSWZaYzF3OWgycU5PSVVCT0ZlTEF4Rnl3QVEyU3VGOWlmdTNRU0FvbjVrQ3h1S28xTWFqRjRYYVJNLXZpVEl1Zkl4andzSnlWY25KdzNhblhja2I0WkUxTHFpd3N0UmxaWlVzLVpuV3hBdUkyTWtVMkh5NVRDVjktVFBwMVlkOFctN3c3V3RzOGR0R1l3cTNycWJIZk13MnRIcGdqTGlqMVZGb0gzZG9kTnpLSUdJa1ZmN2xQQVE2S0pRTG1NNFVxVUljQnA2YTI1UGNXSkwyemFHTFpzWGVfeUlRcmk0U2dJdHBaOGxvX1VpX05Ta2NLRENES1Q1enJyTUJpVnA5Q1VJLWxyMG9ISXF4a3JrVHBrdFh1S0I2Mi1BeVcxai13b0VOVjZ3M1I5T3QtbTVqSFRocGl0QTQ2THJ6X0NXMjRRY01wSE1jbWRHdXFyMjlCLUhkazhXcWdzYVdrdy1FYzBwdXJyaGo0TGtxbGsyNjNvaWlmOHJMUW40RUZxenJwUGJDbGZfa29Db1VpY0l3dWpuVFU4T1Y0WGNubkQ2YXNTRkZsQlpMbjU2T1V5bjVtdDh6d1hJZ3ZtTVA2elJTRE82d3JPRmxYM3ZyZEtrV0dONVdnZDJfU1RoWFZvT3pZb3cteWhYRmh2cTlGbExXVDhwM1l4eEZvanJwTUZpWFBCVnNvUzJkanlWdEpRT0ZnTXpIX2ltc2d2dDlTMFU5QjlBT3JBLWVzZnIzTlpfRXhqZlQ4Q1BGREhxZ0NJOXl6NExGb2tvbnQxbXlvaTY4clRJU2JZcVRaUUxGNGZOWTVsSnM5RGZ4Wk5Ld0xxYnh1aVc3NU9NQgRjb2RlKhYIjsgSMLS57ZDytCQ6AEIAWLDFzPsF&lang=en-gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login_name_register\"]")).sendKeys("osama19941@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Os123456*");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		String emptyConformPasswordFaild = driver.findElement(By.xpath("//*[@id=\"confirmed_password-description\"]")).getText();
        assertEquals(emptyConformPasswordFaild ,"Please confirm your password");
        System.out.println("Test Paseed");
        driver.quit();
	}

	@Test(priority =4)
	public void PasswordWithNumircValueOnly() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/hanadim/chromedriver");   
 
		 driver = new ChromeDriver();
	
		 driver.get("https://account.booking.com/sign-in?op_token=EgVvYXV0aCLwCAoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qjwhVb2dHb2k5OER5OVMyOE4waDZreFF0dUE1RTAtc0hYcFpDa2Q4OHJKRXZoQWg3UkxjT0xoR1BURkxRZkYxZGk0Vll1UnJvM3N3THBFZ1B5RTAzaTRXdTZScUNSekU4UTZPWjhYOGhULW1zSEZucnJEYjZLSXMyTTF0SkNLZElra0FEcXhieFk5Y3c5RVFfM2ExYjZPVEpqcEUyMElEXzdCeHVTSFRDMENYR3J2T0ZuWDZaZllWRW9Tb1loVUVVa1UzZG9TNElKd0otdE1YUnlja3VSUTh0NWpsQzNid1JEdWZhaHMtbkI0Z19KOWpHYjNOMmx0RXBxX05QbTlBVkZVSU1YVVRwb2NMRFJwNkdLNzdMV05FSzVNTUVTSUdXaE1qb0tJc1lIYjhmQWg3Uk5NR1E3WnhseXM1YWxYWmQwRldOc0dlekZVUnhyVlp5V0c4Z2dEcHRRS1o5VVBLelM3aWZ3M2RsNGdIcDRyTV9IMko4cmNtYk9sMUdpcGUyWnItQkQ3YWt4VmtsOEprWHdUaElyMnBJdFQtSWZaYzF3OWgycU5PSVVCT0ZlTEF4Rnl3QVEyU3VGOWlmdTNRU0FvbjVrQ3h1S28xTWFqRjRYYVJNLXZpVEl1Zkl4andzSnlWY25KdzNhblhja2I0WkUxTHFpd3N0UmxaWlVzLVpuV3hBdUkyTWtVMkh5NVRDVjktVFBwMVlkOFctN3c3V3RzOGR0R1l3cTNycWJIZk13MnRIcGdqTGlqMVZGb0gzZG9kTnpLSUdJa1ZmN2xQQVE2S0pRTG1NNFVxVUljQnA2YTI1UGNXSkwyemFHTFpzWGVfeUlRcmk0U2dJdHBaOGxvX1VpX05Ta2NLRENES1Q1enJyTUJpVnA5Q1VJLWxyMG9ISXF4a3JrVHBrdFh1S0I2Mi1BeVcxai13b0VOVjZ3M1I5T3QtbTVqSFRocGl0QTQ2THJ6X0NXMjRRY01wSE1jbWRHdXFyMjlCLUhkazhXcWdzYVdrdy1FYzBwdXJyaGo0TGtxbGsyNjNvaWlmOHJMUW40RUZxenJwUGJDbGZfa29Db1VpY0l3dWpuVFU4T1Y0WGNubkQ2YXNTRkZsQlpMbjU2T1V5bjVtdDh6d1hJZ3ZtTVA2elJTRE82d3JPRmxYM3ZyZEtrV0dONVdnZDJfU1RoWFZvT3pZb3cteWhYRmh2cTlGbExXVDhwM1l4eEZvanJwTUZpWFBCVnNvUzJkanlWdEpRT0ZnTXpIX2ltc2d2dDlTMFU5QjlBT3JBLWVzZnIzTlpfRXhqZlQ4Q1BGREhxZ0NJOXl6NExGb2tvbnQxbXlvaTY4clRJU2JZcVRaUUxGNGZOWTVsSnM5RGZ4Wk5Ld0xxYnh1aVc3NU9NQgRjb2RlKhYIjsgSMLS57ZDytCQ6AEIAWLDFzPsF&lang=en-gb");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/div[5]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"login_name_register\"]")).sendKeys("osama19941@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div/form/button/span")).click();
			String emptyEmailFaild = driver.findElement(By.xpath("//*[@id=\"login_name_register-description\"]")).getText();
        assertEquals(emptyEmailFaild ,"Password contains a combination of uppercase and lowercase letter and number are required.");
        System.out.println("Test Paseed");
        driver.quit();
	} 
	
	private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

}


