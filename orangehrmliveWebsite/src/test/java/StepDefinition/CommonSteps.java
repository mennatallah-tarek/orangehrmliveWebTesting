package StepDefinition;

import Utility.AdminTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps {


        private final AdminTest adminTest;

        public CommonSteps(AdminTest adminTest) {
            this.adminTest = adminTest;
        }

        @Given("I am logged in as {string}")
        public void i_am_logged_in_as(String username) throws InterruptedException {
            adminTest.getLoginPage().navigateToLoginPage("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(2000);
            adminTest.getLoginPage().enterUsername(username);
            adminTest.getLoginPage().enterPassword("admin123");
            adminTest.getLoginPage().clickLogin();
        }

        @When("I navigate to Admin page")
        public void i_navigate_to_AdminPage() throws InterruptedException {
                    adminTest.getHomePage().clickAdminTab();

            }
        }


