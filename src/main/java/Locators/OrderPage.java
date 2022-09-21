package Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {

    private WebDriver driver;
    private By firstNameField = By.xpath("//*[@placeholder='* Имя']");
    private By secondNameField = By.xpath("//*[@placeholder = '* Фамилия']");
    private By addressField = By.xpath("//*[@placeholder = '* Адрес: куда привезти заказ']");
    private By phoneField = By.xpath("//*[@placeholder = '* Телефон: на него позвонит курьер']");
    private By undergroundStationField = By.className("select-search__input");
    private By undergroundStationName = By.xpath("//*[@role='menuitem']");
    private By nextButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By header = By.className("Order_Header__BZXOb");
    private By shipmentDate = By.xpath("//*[@placeholder = '* Когда привезти самокат']");
    private By rentalPeriodField = By.className("Dropdown-placeholder");
    private By oneDayRental = By.xpath("//*[@class='Dropdown-option' and contains(text(), 'сутки')]");
    private By orderButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Заказать')]");
    private By modalHeader = By.className("Order_ModalHeader__3FDaJ");
    // private By statusButton = By.xpath("//button[@class='Button_Button__ra12g.Button_Middle__1CSJM']");
    private By yesButton = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Да')]");
    private By selectedDate = By.xpath("//*[contains(@class, 'react-datepicker__day--selected')]");


    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setSecondName(String secondName){
        driver.findElement(secondNameField).clear();
        driver.findElement(secondNameField).sendKeys(secondName);
    }

    public void setAddress(String address){
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
    }

    public void setPhone(String phone){
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setUndergroundStation(String undergroundStation){
        driver.findElement(undergroundStationField).clear();
        driver.findElement(undergroundStationField).sendKeys(undergroundStation);
        driver.findElement(undergroundStationName).click();
    }

    public void order(String firstName, String secondName, String address, String phone, String undergroundStation){
        setFirstName(firstName);
        setSecondName(secondName);
        setUndergroundStation(undergroundStation);
        setAddress(address);
        setPhone(phone);
        clickNextButton();
    }

    public void waitForChangedHeader(String text) {
        // здесь нужно дождаться, чтобы текст в элементе «Занятие» стал равен значению из параметра
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated((header),
                text));
    }

    public void setShipmentDate(String date){
        driver.findElement(shipmentDate).clear();
        driver.findElement(shipmentDate).sendKeys(date);
        driver.findElement(selectedDate).click();
    }

    public void setRentalPeriodAsOneDay(){
        driver.findElement(rentalPeriodField).click();
        driver.findElement(oneDayRental).click();
    }

    public void clickOrderButton(){
        driver.findElement(orderButton).click();
    }

    public void waitExpectedTextInModalHeader(String text) {
        // здесь нужно дождаться, чтобы текст в элементе «Занятие» стал равен значению из параметра
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated((modalHeader),
                text));
    }

    public void clickYesButton(){
        driver.findElement(yesButton).click();
    }

    public String getTextInStatusButton(){
        return driver.findElement(modalHeader).getText();
    }



}
