package runCases;

import org.testng.annotations.Test;
import pages.RequestLoanPage;

public class RequestLoanTest extends BaseTest {
    String LoanAmount = "5443";
    String DownPayment = "5443";
    String FromAccount = "135566";

    @Test
    public void applyForLoan(){
        RequestLoanPage requestLoanPage = new RequestLoanPage(driver);
        requestLoanPage.applyForALoan(LoanAmount,DownPayment,FromAccount);

    }
}
