//import StepObjects.LoginSteps;
//import Utils.ChromeRunner;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import static DataObjects.LoginData.*;
//import java.time.Duration;

//exampleFirst
//public class Login extends ChromeRunner //{
//    WebDriver driver = new ChromeDriver();
//
//    @Test
//    public void loginWithIncorrectData() throws InterruptedException {
//        LoginSteps step1 = new LoginSteps(driver);
//        step1.emailInput(incorrectEmailData);
//        step1.passwordInput(incorrectPasswordData);
//        step1.loginButton();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Page not found")));
//
//        boolean loginFailed = step1.isLoginFailed();
//        if (loginFailed && errorMessage.isDisplayed()) {
//            System.out.println("არასწორი მონაცემების გამო ავტორიზაცია წარუმატებელია.");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("ავტორიზაცია წარმატებულია.");
//            Assert.fail("ავტორიზაცია წარმატებულია.");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Iteration: " + i);
//        }
//
//        int count = 0;
//        while (count < 5) {
//            System.out.println("Count: " + count);
//            count++;
//        }
//    }
//
//    @Test
//    public void loginWithCorrectData() throws InterruptedException {
//        LoginSteps step2 = new LoginSteps(driver);
//        step2.emailInput(correctEmailData);
//        step2.passwordInput(correctPasswordData);
//        step2.loginButton();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Welcome")));
//
//        boolean loginSuccessful = step2.isLoginSuccessful();
//        if (loginSuccessful && welcomeMessage.isDisplayed()) {
//            System.out.println("ავტორიზაცია წარმატებულია. მომხმარებლის მონაცეცმები სწორია.");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("ავტორიზაცია წარუმატებულია.");
//            Assert.fail("ავტორიზაცია წარუმატებულია.");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Iteration: " + i);
//        }
//
//        int count = 0;
//        while (count < 5) {
//            System.out.println("Count: " + count);
//            count++;
//        }
//    }
//}
//


//exampleSecond
//public class Login extends ChromeRunner //{
//    WebDriver driver = new ChromeDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    @Test
//    public void loginWithIncorrectData() throws InterruptedException {
//        LoginSteps step1 = new LoginSteps(driver);
//        step1.emailInput(incorrectEmailData);
//        step1.passwordInput(incorrectPasswordData);
//        step1.loginButton();
//
//        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Page not found")));
//
//        boolean loginFailed = step1.isLoginFailed();
//        if (loginFailed && errorMessage.isDisplayed()) {
//            System.out.println("არასწორი მონაცემების გამო ავტორიზაცია წარუმატებელია.");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("ავტორიზაცია წარმატებულია.");
//            Assert.fail("ავტორიზაცია წარმატებულია.");
//        }
//
//        iterateAndPrint();
//        countAndPrint();
//    }
//
//    @Test
//    public void loginWithCorrectData() throws InterruptedException {
//        LoginSteps step2 = new LoginSteps(driver);
//        step2.emailInput(correctEmailData);
//        step2.passwordInput(correctPasswordData);
//        step2.loginButton();
//
//        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Welcome")));
//
//        boolean loginSuccessful = step2.isLoginSuccessful();
//        if (loginSuccessful && welcomeMessage.isDisplayed()) {
//            System.out.println("ავტორიზაცია წარმატებულია. მომხმარებლის მონაცეცმები სწორია.");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("ავტორიზაცია წარუმატებულია.");
//            Assert.fail("ავტორიზაცია წარუმატებულია.");
//        }
//
//        iterateAndPrint();
//        countAndPrint();
//    }
//
//    private void iterateAndPrint() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Iteration: " + i);
//        }
//    }
//
//    private void countAndPrint() {
//        int count = 0;
//        while (count < 5) {
//            System.out.println("Count: " + count);
//            count++;
//        }
//    }
//}