import Locators.OrderPage;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import Locators.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.startsWith;


public class TestMakeOrder {
    private WebDriver driver;

    @Test
    public void testMakeOrderSmallButtonChrome() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSmallOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForChangedHeader("Для кого самокат");
        objOrderPage.order("Сергей", "Стешов", "Москва", "89999999999",
                "Митино");
        objOrderPage.waitForChangedHeader("Про аренду");
        objOrderPage.setShipmentDate("30.09.2022");
        objOrderPage.setRentalPeriodAsOneDay();
        objOrderPage.clickOrderButton();
        objOrderPage.waitExpectedTextInModalHeader("Хотите оформить заказ?");
        objOrderPage.clickYesButton();
        String expectedText = "Заказ оформлен";
        String actualText = objOrderPage.getTextInStatusButton();
        MatcherAssert.assertThat(actualText, startsWith(expectedText));

    }

    @Test
    public void testMakeOrderSmallButtonFirefox() {

        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickSmallOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForChangedHeader("Для кого самокат");
        objOrderPage.order("Сергей", "Стешов", "Москва", "89999999999",
                "Митино");
        objOrderPage.waitForChangedHeader("Про аренду");
        objOrderPage.setShipmentDate("30.09.2022");
        objOrderPage.setRentalPeriodAsOneDay();
        objOrderPage.clickOrderButton();
        objOrderPage.waitExpectedTextInModalHeader("Хотите оформить заказ?");
        objOrderPage.clickYesButton();
        String expectedText = "Заказ оформлен";
        String actualText = objOrderPage.getTextInStatusButton();
        MatcherAssert.assertThat(actualText, startsWith(expectedText));

    }

    @Test
    public void testMakeOrderBigButtonChrome() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickBigOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForChangedHeader("Для кого самокат");
        objOrderPage.order("Сергей", "Стешов", "Москва", "89999999999",
                "Митино");
        objOrderPage.waitForChangedHeader("Про аренду");
        objOrderPage.setShipmentDate("30.09.2022");
        objOrderPage.setRentalPeriodAsOneDay();
        objOrderPage.clickOrderButton();
        objOrderPage.waitExpectedTextInModalHeader("Хотите оформить заказ?");
        objOrderPage.clickYesButton();
        String expectedText = "Заказ оформлен";
        String actualText = objOrderPage.getTextInStatusButton();
        MatcherAssert.assertThat(actualText, startsWith(expectedText));

    }

    @Test
    public void testMakeOrderBigButtonFirefox() {

        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickBigOrderButton();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.waitForChangedHeader("Для кого самокат");
        objOrderPage.order("Сергей", "Стешов", "Москва", "89999999999",
                "Митино");
        objOrderPage.waitForChangedHeader("Про аренду");
        objOrderPage.setShipmentDate("30.09.2022");
        objOrderPage.setRentalPeriodAsOneDay();
        objOrderPage.clickOrderButton();
        objOrderPage.waitExpectedTextInModalHeader("Хотите оформить заказ?");
        objOrderPage.clickYesButton();
        String expectedText = "Заказ оформлен";
        String actualText = objOrderPage.getTextInStatusButton();
        MatcherAssert.assertThat(actualText, startsWith(expectedText));

    }

    @After
    public void teardown() {

        driver.quit();
    }

}
