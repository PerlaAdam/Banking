package runCases;

import org.testng.annotations.Test;
import pages.TransferPage;

public class TransferTest extends BaseTest{
    String amount = "7655";
    String fromAccount = "8766";
    String toAccount = "8765";

    @Test
    public void transferMoney(){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.transferAmount(amount,fromAccount,toAccount);
    }
}
