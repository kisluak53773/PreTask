package test.company.numbers;

import com.company.numbers.Subtraction;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SubtractionTest {

    @Test
    public void testSubtract() {
        float actual= Subtraction.subtract(10.00f,5.00f);
        float expected=5.00f;
        Assert.assertEquals(actual,expected,0.01);
    }
}