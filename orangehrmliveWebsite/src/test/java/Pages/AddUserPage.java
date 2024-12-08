package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
    private By Role= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
    private By RoleChoice= By.xpath("//span[normalize-space()='Admin']");
    private By EmployeeName= By.xpath("//input[@placeholder='Type for hints...']");

    private By Username= By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input");
    private By Status= By.xpath("//div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
    private By StatusChoice= By.xpath("//span[normalize-space()='Enabled']");
    private By NewPassword= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    private By NewPasswordconfirm= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    private By Save= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    private By dropdown= By.className("oxd-autocomplete-text-input--after");


    public WebElement Role(){return driver.findElement(Role);}
    public WebElement RoleChoice(){return driver.findElement(RoleChoice);}
    public WebElement EmployeeName(){return driver.findElement(EmployeeName);}
    public WebElement Dropdownmenu(){return driver.findElement(dropdown);}

    public WebElement Username(){return driver.findElement(Username);}
    public WebElement Status(){return driver.findElement(Status);}
    public WebElement StatusChoice(){return driver.findElement(StatusChoice);}
    public WebElement NewPassword(){return driver.findElement(NewPassword);}
    public WebElement NewPasswordconfirm(){return driver.findElement(NewPasswordconfirm);}
    public WebElement Save(){return driver.findElement(Save);}
    WebDriver driver;
    public AddUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Statuschoice( ) throws InterruptedException {
        Thread.sleep(1000);

        Status().click();
        Thread.sleep(1000);
        Status().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        Status().sendKeys(Keys.ENTER);

    }

    public void UserRolechoice( ) throws InterruptedException {
        Thread.sleep(1000);
        Role().click();
        Thread.sleep(1000);
        Role().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        Role().sendKeys(Keys.ENTER);


    }
    public void EmployeeName(String EmployeeName) throws InterruptedException {
        Thread.sleep(1000);

        EmployeeName().sendKeys(EmployeeName);
        Thread.sleep(2000);
        EmployeeName().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        EmployeeName().sendKeys(Keys.ENTER);



    }
    public void Passwordcreate(String Lesson) {
        NewPassword().sendKeys(Lesson);
        NewPassword().sendKeys(Keys.ENTER);


    }
    public void Passwordconfirm(String Lesson) {
        NewPasswordconfirm().sendKeys(Lesson);
        NewPasswordconfirm().sendKeys(Keys.ENTER);
    }
    public void Useradd(String Lesson) {
        Username().sendKeys(Lesson);
        Username().sendKeys(Keys.ENTER);

    }

    public AdminPage UserADDED( ) {

        Save().click();
        return new AdminPage(driver);
    }

}
