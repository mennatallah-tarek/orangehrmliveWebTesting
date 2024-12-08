package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    private WebElement recordsFoundLabel;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement Addbutton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    // Locator for the records label
    private WebElement SearchTextField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    // Locator for the records label
    private WebElement SearchButton;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    private WebElement usernameonlist;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]")
    private WebElement DeleteButton;
    @FindBy(xpath = "/html/body/div/div[3]/div/div/div/div[3]/button[2]")
    private WebElement confirmdeletion;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
    private WebElement ResetButton;
    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getRecordCount() throws InterruptedException {
        Thread.sleep(1000);
        String recordText = recordsFoundLabel.getText();
        if (recordText.matches(".*\\d+.*")) {
            recordText = recordText.replaceAll("[^0-9]", "");
            return Integer.parseInt(recordText);
        } else {
            return 0; // No records found
        }
    }

    public AddUserPage AddUserPageClick() throws InterruptedException {
        Thread.sleep(2000);
        Addbutton.click();
        return new AddUserPage(driver);
    }

    public String SearchUser(String useradded) {
        SearchTextField.click();
        SearchTextField.sendKeys(useradded);
        SearchTextField.sendKeys(Keys.ENTER);
        SearchButton.click();
       return usernameonlist.getText();
    }
    public void DeleteUser() {
        DeleteButton.click();
        confirmdeletion.click();
        ResetButton.click();
    }


}