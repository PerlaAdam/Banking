package runCases;

import pages.NewAccountPage;

public class NewAccountTest extends BaseTest{

    public void createNewAccount(){
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.createNewAccount();

    }


}
