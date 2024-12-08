package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

        WebDriver driver;

        @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
        private WebElement adminTab;

        public HomePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    public AdminPage clickAdminTab() throws InterruptedException {
        Thread.sleep(1000);
        adminTab.click();
        return new AdminPage(driver);
    }


}
