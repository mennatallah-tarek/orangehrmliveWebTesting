package StepDefinition;

import Utility.AdminTest;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class DeleteUserSteps {
    private final AdminTest adminTest;

    public DeleteUserSteps(AdminTest adminTest) {
        this.adminTest = adminTest;
    }
    @And("I search for the new user")
    public void search_new_user(){
        String Username = adminTest.getAdminPage().SearchUser("menna");
        Assert.assertEquals(Username,"menna","this is not the newly added user");

    }
    @And("I delete the new user")
    public void delete_user(){
        adminTest.getAdminPage().DeleteUser();
    }
    @And("I get the number of records found on the Admin page after deleting user")
    public void i_get_the_number_of_records_found_on_the_admin_page_After_deleteUser() throws InterruptedException {
        int recordCount = adminTest.getAdminPage().getRecordCount();
        //System.out.println("Number of records found on the Admin page after adding user: " + recordCount);
        //}
        if (recordCount == 0) {
            System.out.println("No users in the list");
        } else {
            System.out.println("Number of records found on the Admin page after deleting user: " + recordCount);
        }}
}
