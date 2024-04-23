package runCases;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import pages.BillPagePage;
import pages.LoginPage;

public class BillPayTest extends BaseTest{
    String PayeeName = "Ibrahim";
    String Address = "faisal";
    String City = "Giza";
    String State = "State";
    String ZipCode = "54345";
    String Phone = "01014880895";
    String Account = "493449";
    String VerifyAccount = "493449";
    String Amount = "500";

    @Test
    public void billPay(){
        LoginPage loginPage = new LoginPage(driver);
        BillPagePage billPay = new BillPagePage(driver);
         billPay.billPay(PayeeName,Address,City,State,ZipCode,Phone,Account,VerifyAccount,Amount);
         loginPage.navigateToHomePage("ibrahimragab", "Adam_1010");
    }
}
