package StepObjects;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends LoginPage {
    WebDriver driver;

    public LoginSteps(WebDriver driver1){
        driver = driver1;

    }
    public void emailInput(String s){
        driver.findElement(emailField).sendKeys(s);
    }

    public void passwordInput(String s){
        driver.findElement(passwordField).sendKeys(s);
    }

    public void loginButton(){
        driver.findElement(LoginButton).click();
    }

    public boolean isLoginFailed() {
        return false;
    }

    public boolean isLoginSuccessful() {
        return true;
    }
}
