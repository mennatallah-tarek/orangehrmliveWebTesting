package Utility;

import Pages.AddUserPage;
import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AdminTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private AdminPage adminPage;
    private AddUserPage addUserPage;


    public AdminTest() {
        System.setProperty("webdriver.edge.driver", "src/main/java/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        initializePageObjects();
    }

    private void initializePageObjects() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        adminPage = new AdminPage(driver);
        addUserPage = new AddUserPage(driver);

    }

    public WebDriver getDriver() {
        return driver;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public AdminPage getAdminPage() {
        return adminPage;
    }
    public AddUserPage getAddUserPage() {
        return addUserPage;
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
