package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.order.OrderPage;

public class BaseTest {

    public BasePage basePage;
    public OrderPage orderPage;

    public void startDriver (String browser) {
        WebDriver driver = null;
        switch (browser) {
            case "main" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
            case "contactUs" :
                driver = CommonActions.createDriver("CHROME", 360, 640);
                break;
            case "blogCategory" :
                driver = CommonActions.createDriver("CHROME", 640, 360);
                break;
            case "paydayLoans" :
                driver = CommonActions.createDriver("CHROME", 768, 1024);
                break;
            case "order" :
                driver = CommonActions.createDriver("CHROME", 1024, 1366);
                break;
        }
        basePage = new BasePage(driver);
        orderPage = new OrderPage(driver);
    }
}
