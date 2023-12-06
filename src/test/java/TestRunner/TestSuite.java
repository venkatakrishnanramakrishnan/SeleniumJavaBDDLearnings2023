package TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite {



    @RunWith(Suite.class)

    @Suite.SuiteClasses({
            //TestJunit1.class,
            //TestJunit2.class
    })

    public class JunitTestSuite {
    }
}
