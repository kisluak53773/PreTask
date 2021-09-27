package test.company.numbers;

import com.company.numbers.Division;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DivisionTest {

    @Test
    public void testDivide() {
        float actual= Division.divide(20.00f,2.00f);
        float expected=10.00f;
        Assert.assertEquals(actual,expected,0.01);
    }
}