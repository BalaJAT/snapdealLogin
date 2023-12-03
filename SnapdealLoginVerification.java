package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapdealLoginVerification {

	public static void main(String[] args) {
        // Set the path to your Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\Automation directory\\TestAutomation\\drivers\\msedgedriver.exe");

        // Open Edge browser
        WebDriver driver = new EdgeDriver();

        // Navigate to Snapdeal website otpValueCode
        driver.get("https://www.snapdeal.com");
        

        // Locate the Sign In button
    driver.findElement(By.className("accountUserName")).click();
    driver.findElement(By.className("dropdownAccountNonLoggedIn")).click();
    
        // Enter valid email address
        WebElement emailField = driver.findElement(By.id("userName"));
        emailField.sendKeys("manikandan96@gmail.com");

        // Click on the Continue button
        WebElement continueButton = driver.findElement(By.id("checkUser"));
        continueButton.click();

        // Enter valid password
    	WebElement otp= driver.findElement(By.xpath("//*[@id=\"loginOtpUC\"]/div[1]/input"));
		otp.sendKeys("8526");
    
		driver.findElement(By.className("driver.findElement(By.className(\"dropdownAccountNonLoggedIn\")).click();")).click();

        // Verify that the user is logged in successfully
        WebElement verificationElement = driver.findElement(By.className("accountUserName"));
        String verificationMessage = verificationElement.getText();

        if (verificationMessage.contains("bala")) { // Replace "Your Name" with the expected name on the account
            System.out.println("Login successful. User is logged in.");
        } else {
            System.out.println("Login failed. User is not logged in.");
        }

        // Close the browser
        driver.quit();
    }
}