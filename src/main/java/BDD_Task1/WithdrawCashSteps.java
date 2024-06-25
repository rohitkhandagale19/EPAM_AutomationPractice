package BDD_Task1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.testng.AssertJUnit.assertEquals;

public class WithdrawCashSteps {
    private Account account;
    private ATM atm;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_of_$_in_my_account(Integer balance) {
        account = new Account(balance);
        atm = new ATM();
    }

    @When("I request ${int}")
    public void i_request_$(Integer amount) {
        account.withdraw(amount);
        atm.dispense(amount);
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer amount) {

        System.out.println("Total balance-"+account.getBalance());
        System.out.println("Cash dispensed--->"+atm.getCashDispensed());
        assertEquals((int) amount, atm.getCashDispensed());
    }
}

