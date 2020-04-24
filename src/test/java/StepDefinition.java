import io.cucumber.java8.En;

public class StepDefinition implements En {
    public StepDefinition() {

        Given("application is up and running", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        When("user hit application with invalid payload", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        Then("user should receive a response", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        Then("user should receive a response code {int}", (Integer int1) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        Then("user should receive a response message as invalid", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        When("user hit application with valid payload", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });

        Then("user should receive a response message as valid", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("");
        });
    }
}
