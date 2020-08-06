package runnerTest.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ElementUtil {

  private   By email= By.id("username");
  private   By password= By.id("password");

  private   By loginBtn= By.id("loginBtn");
  private   By signUp = By.linkText("Sign up");
  private   By loginErrorText = By.xpath("//div[@class='private-alert__inner']");
  private WebDriver driver;


    public void getLoginPageTitle(){getPageTitle();}

    public void enterMail(String emailKey){
        sendValue(email, emailKey);
    }

    public void enterPassword(String passwordKey){
        sendValue(password, passwordKey );
    }

    public void clickOnLogInBtn() {
        clickOn(loginBtn);
    }

  public boolean checkLoginErrorText() {
    return isElementDisplayed(loginErrorText);

  }
  public  void clickOnSignUpLink(){
      clickOn(signUp);

  }
}
