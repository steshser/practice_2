package Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private By smallOrderButton = By.className("Button_Button__ra12g");
    private By bigOrderButton = By.className("Home_FinishButton__1_cWm");
    private By questionOne = By.id("accordion__heading-0");
    private By questionTwo = By.id("accordion__heading-1");
    private By questionThree = By.id("accordion__heading-2");
    private By questionFour = By.id("accordion__heading-3");
    private By questionFive = By.id("accordion__heading-4");
    private By questionSix = By.id("accordion__heading-5");
    private By questionSeven = By.id("accordion__heading-6");
    private By questionEight = By.id("accordion__heading-7");

    private By answerOne = By.id("accordion__panel-0");

    private By answerTwo = By.id("accordion__panel-1");

    private By answerThree = By.id("accordion__panel-2");

    private By answerFour = By.id("accordion__panel-3");

    private By answerFive = By.id("accordion__panel-4");

    private By answerSix = By.id("accordion__panel-5");

    private By answerSeven = By.id("accordion__panel-6");

    private By answerEight = By.id("accordion__panel-7");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSmallOrderButton(){
        driver.findElement(smallOrderButton).click();
    }

    public void clickQuestionOne(){
        driver.findElement(questionOne).click();
    }

    public void clickQuestionTwo(){
        driver.findElement(questionTwo).click();
    }

    public void clickQuestionThree(){
        driver.findElement(questionThree).click();
    }

    public void clickQuestionFour(){
        driver.findElement(questionFour).click();
    }

    public void clickQuestionFive(){
        driver.findElement(questionFive).click();
    }

    public void clickQuestionSix(){
        driver.findElement(questionSix).click();
    }

    public void clickQuestionSeven(){
        driver.findElement(questionSeven).click();
    }

    public void clickQuestionEight(){
        driver.findElement(questionEight).click();
    }

    public String getAnswerOneText(){
        return driver.findElement(answerOne).getText();
    }

    public String getAnswerTwoText(){
        return driver.findElement(answerTwo).getText();
    }

    public String getAnswerThreeText(){
        return driver.findElement(answerThree).getText();
    }

    public String getAnswerFourText(){
        return driver.findElement(answerFour).getText();
    }

    public String getAnswerFiveText(){
        return driver.findElement(answerFive).getText();
    }

    public String getAnswerSixText(){
        return driver.findElement(answerSix).getText();
    }

    public String getAnswerSevenText(){
        return driver.findElement(answerSeven).getText();
    }

    public String getAnswerEightText(){
        return driver.findElement(answerEight).getText();
    }

    public void scrollToQuestions(){
        WebElement element = driver.findElement(questionOne);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToBigOrderButton(){
        WebElement element = driver.findElement(bigOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickBigOrderButton(){
        scrollToBigOrderButton();
        driver.findElement(bigOrderButton).click();
    }


}
