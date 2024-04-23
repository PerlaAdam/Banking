package runCases;

import org.testng.annotations.Test;
import pages.UpdateContactInfoPage;

public class UpdateContactTest extends BaseTest{
    String firstName = "alif";
    String lastName = "bah";
    String address = "fails";
    String city = "hhgffa";
    String state = "azans";
    String zipCode ="765";
    String phone = "0123466434";

    @Test
    public void updateInfo(){
        UpdateContactInfoPage updateContactInfoPage = new UpdateContactInfoPage(driver);
        updateContactInfoPage.updateFirstname(firstName,lastName,address,city,state, zipCode,phone);
    }

}
