import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.After;
import Locators.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.is;


public class TestExpectedAnswer {
    private WebDriver driver;

    @Test
    public void testIsExpectedAnswerOne() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionOne();
        String actualAnswerText = objMainPage.getAnswerOneText();
        String expectedAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerTwo() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionTwo();
        String actualAnswerText = objMainPage.getAnswerTwoText();
        String expectedAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
                "можете просто сделать несколько заказов — один за другим.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerThree() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionThree();
        String actualAnswerText = objMainPage.getAnswerThreeText();
        String expectedAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerFour() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionFour();
        String actualAnswerText = objMainPage.getAnswerFourText();
        String expectedAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerFive() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionFive();
        String actualAnswerText = objMainPage.getAnswerFiveText();
        String expectedAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в " +
                "поддержку по красивому номеру 1010.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerSix() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionSix();
        String actualAnswerText = objMainPage.getAnswerSixText();
        String expectedAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже " +
                "если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerSeven() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionSeven();
        String actualAnswerText = objMainPage.getAnswerSevenText();
        String expectedAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки " +
                "тоже не попросим. Все же свои.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @Test
    public void testIsExpectedAnswerEight() {

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.scrollToQuestions();
        objMainPage.clickQuestionEight();
        String actualAnswerText = objMainPage.getAnswerEightText();
        String expectedAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MatcherAssert.assertThat(actualAnswerText, is(expectedAnswerText));

    }

    @After
    public void teardown() {

        driver.quit();
    }

}
