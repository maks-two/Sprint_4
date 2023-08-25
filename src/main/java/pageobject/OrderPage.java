package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    // Имя
    private static final By NAME = By.xpath(".//input[@placeholder='* Имя']");

    // Фамилия
    private static final By SURNAME = By.xpath(".//input[@placeholder='* Фамилия']");

    // Адрес
    private static final By ADDRESS = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // Станция метро
    private static final By METRO = By.xpath(".//div[@class='select-search__value']");

    // Станция
    private static final By STATION = By.xpath(".//div[@class='Order_Text__2broi']");

    // Телефон
    private static final By PHONE = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // далее
    private static final By NEXT = By.xpath(".//button[text()='Далее']");

    // Когда привезти самокат
    private static final By WHEN = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // Дата когда привезти самокат
    private static final By DATE = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--029 react-datepicker__day--weekend']");

    // селект срок аренды
    private static final By RENTS = By.xpath(".//div[text()='* Срок аренды']");

    // Выбор срока аренды
    private static final By DAY = By.xpath(".//div[text()='двое суток']");

    // кнопка заказать на странице оформления аренды
    private static final By ORDER3 = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // кнопка да
    private static final By YES = By.xpath(".//button[text()='Да']");

    // модалка подтверждение
    private static final By ORDERED = By.xpath(".//div[text()='Заказ оформлен']");

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputName(String NAME1) {
        WebElement name = driver.findElement(NAME);
        name.clear();
        name.sendKeys(NAME1);
    }

    public void inputSurname(String SURNAME1) {
        WebElement surname = driver.findElement(SURNAME);
        surname.clear();
        surname.sendKeys(SURNAME1);
    }

    public void inputAddress(String ADDRESS1) {
        WebElement surname = driver.findElement(ADDRESS);
        surname.clear();
        surname.sendKeys(ADDRESS1);
    }

    public void clickButtonMetro() {
        driver.findElement(METRO).click();
    }

    public void clickStation() {
        driver.findElement(STATION).click();
    }

    public void inputPhone(String PHONE1) {
        WebElement surname = driver.findElement(PHONE);
        surname.clear();
        surname.sendKeys(PHONE1);
    }

    public void clickNextButton() {
        driver.findElement(NEXT).click();
    }

    public void clickWhen() {
        driver.findElement(WHEN).click();
    }

    public void clickDate() {
        driver.findElement(DATE).click();
    }

    public void clickRents() {
        driver.findElement(RENTS).click();
    }

    public void clickDay() {
        driver.findElement(DAY).click();
    }

    public void clickOrder3() {
        driver.findElement(ORDER3).click();
    }

    public void clickYes() {
        driver.findElement(YES).click();
    }

    public boolean isOrderSuccess() {
        return driver.findElement(ORDERED).isDisplayed();
    }

    public void forWhomFields(String NAME1, String SURNAME1, String ADDRESS1, String PHONE1) {
        inputName(NAME1);
        inputSurname(SURNAME1);
        inputAddress(ADDRESS1);
        clickButtonMetro();
        clickStation();
        inputPhone(PHONE1);

    }

    public void forWhenFields(){
        clickWhen();
        clickDate();
        clickRents();
        clickDay();

    }

}
