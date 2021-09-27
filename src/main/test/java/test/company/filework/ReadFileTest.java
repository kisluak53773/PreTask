package test.company.filework;

import com.company.filework.ReadFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.*;

public class ReadFileTest {

    @Test
    public void testRead() {
        String actual=ReadFile.read();
        String expected="7.42 7...2 8.4 7.9 ";
        Assert.assertEquals(actual,expected);
    }
}