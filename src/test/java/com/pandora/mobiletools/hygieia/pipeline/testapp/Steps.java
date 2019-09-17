package com.pandora.mobiletools.hygieia.pipeline.testapp;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.doSomethingImp();
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.doSomethingImp();
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.doSomethingImp();
    }


}
