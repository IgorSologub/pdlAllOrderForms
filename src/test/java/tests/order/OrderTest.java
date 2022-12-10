package tests.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.SiteUrls.SITES_URLS;
import static constants.Constant.Urls.ORDER_REF_URL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest extends BaseTest {

    /*@BeforeEach
    public void setUp () {
        startDriver("order");
    } */

    @Test
    public void orderFormTest () {
        for (int i = 0; i <= SITES_URLS.size()-1; i++) {
            startDriver("order");
            basePage.goToUrl(SITES_URLS.get(i));
            basePage.waitOneSeconds();

            basePage.waitFiveSeconds();

            basePage.waitThreeSeconds();
            orderPage.howMuchDoYouNeedButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterEmail();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterPhoneNumber();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterSsn();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterFirstName();
            basePage.waitOneSeconds();
            orderPage.enterSecondName();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterBirthDate();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterStreetAddress();
            basePage.waitOneSeconds();
            orderPage.enterZipCode();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.timeCurrentResidenceButtonClick();

            basePage.waitThreeSeconds();
            orderPage.currentResidenceStatusButtonClick();

            basePage.waitThreeSeconds();
            orderPage.sourceOfIncomeButtonClick();

            basePage.waitThreeSeconds();
            orderPage.timeEmployedButtonClick();

            basePage.waitThreeSeconds();
            orderPage.payFrequencyButtonClick();

            basePage.waitThreeSeconds();
            orderPage.monthlyGrossIncomeButtonClick();

            basePage.waitThreeSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.paycheckReceivedButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterAbaRoutingNumber();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.nextStepButtonClick();

        /*
        basePage.waitThreeSeconds();
        orderPage.bankAccountTypeButtonClick();
         */

            basePage.waitThreeSeconds();
            orderPage.lengthOfBankAccountButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterBankAccountNumber();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterDriverLicenseNumber();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.creditScoreButtonClick();

            basePage.waitThreeSeconds();
            orderPage.enterSocialSecurityNumber();
            basePage.waitOneSeconds();
            orderPage.nextStepButtonClick();

            basePage.waitThreeSeconds();
            orderPage.requestCashButtonClick();

            basePage.waitFiveSeconds();
            basePage.waitFiveSeconds();
            basePage.waitThreeSeconds();
            if (basePage.checkUrl(ORDER_REF_URL)) {
                System.out.println(SITES_URLS.get(i) + " TRUE");
            } else {
                System.out.println(SITES_URLS.get(i) + " !!!!!!! FALSE !!!!!!!");
            }
            assertTrue(basePage.checkUrl(ORDER_REF_URL));
            basePage.waitThreeSeconds();
            basePage.clearCookiesAndLocalStorageAndClose();
        }
    }
}
