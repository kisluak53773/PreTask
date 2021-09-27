package test.company.numbers;

import com.company.numbers.Multiplication;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplicationTest {

    @Test
    public void testMultiply() {
        float actual= Multiplication.multiply(5.00f,5.00f);
        float expected=25.00f;
        Assert.assertEquals(actual,expected,0.01);
    }
}