package tests.Cross;

import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class CrossTest1 extends TestBaseCross {

    @Test
    public void test1(){
        driver.get("https://www.amazon.com/");
        driver.get("https://www.techproeducation.com");
    }

}
