package runCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{

    String validUserName = "ibrahimragab371@gmail.com";
    String validPassword = "@77uiWVa6Y9k4";
    String inValidUserName = "hhgfs";
    String inValidPassword = "jhggffs";

    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(validUserName,validPassword);
    }
    @Test
    public void inValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(inValidUserName,inValidPassword);

    }
}

