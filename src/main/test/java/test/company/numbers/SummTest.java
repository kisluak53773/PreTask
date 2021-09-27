package test.company.numbers;

import com.company.numbers.Summ;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SummTest {

    @Test
    public void testSum() {
        float actual= Summ.sum(10.00f,5.00f);
        float expected=15.00f;
        Assert.assertEquals(actual,expected,0.01);
    }
}