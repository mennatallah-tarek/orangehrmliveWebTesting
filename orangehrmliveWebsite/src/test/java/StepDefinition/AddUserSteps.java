package StepDefinition;

import io.cucumber.java.en.*;
import Utility.AdminTest;
public class AddUserSteps {


        private final AdminTest adminTest;

        public AddUserSteps(AdminTest adminTest) {
            this.adminTest = adminTest;
        }
    @Then ("I click add Button")
    public void go_toAdd_user_page() throws InterruptedException {
        adminTest.getAdminPage().AddUserPageClick();
    }
    @Then("I Add User Role")
    public void iAddUserRole() throws InterruptedException {
        adminTest.getAddUserPage().UserRolechoice();
    }
    @Then("I add Employee Name")
    public void Add_EmployeeName() throws InterruptedException {
        adminTest.getAddUserPage().EmployeeName("F");
    }
    @Then("I add Status")
    public void Add_Status() throws InterruptedException {
        adminTest.getAddUserPage().Statuschoice();
    }
    @Then ("I add Username")
    public void Add_Username() {
        adminTest.getAddUserPage().Useradd("menna");
    }
    @Then ("I add Password")
    public void Add_Password() {
        adminTest.getAddUserPage().Passwordcreate("menna1234");
    }
    @Then("I confirm Password")
    public void Confirm_Password() {
        adminTest.getAddUserPage().Passwordconfirm("menna1234");
    }
    @Then("I click save")
    public void Click_save() {
        adminTest.getAddUserPage().UserADDED();
    }

        @Then("I should see number of records is increased by 1")
        public void i_get_the_number_of_records_found_on_the_admin_page_After_addUser() throws InterruptedException {
            int recordCount = adminTest.getAdminPage().getRecordCount();
            System.out.println("Number of records found on the Admin page after adding user: " + recordCount);
        }


}
