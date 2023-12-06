package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void bowl(){
        System.out.println("I am supposed to run before each scenario.");
    }

    @After
    public void umpireDecision(){
        System.out.println("I'm expected After every scenario.");
    }

    @Before("@firstScenarioOnly")
    public void field(){System.out.println("I am supposed to run only before first scenario.");}

    @After("@firstScenarioOnly")
    public void fieldAfter(){System.out.println("I am supposed to run only after first scenario.");}
}
