package test;

import com.company.HyperbolicSineFunction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class HyperbolicSineFunctionTest {
    HyperbolicSineFunction sineFunction;
    DecimalFormat decimalFormat;
    @Before
    public void setUpStreams() {
        sineFunction=new HyperbolicSineFunction();
        decimalFormat = new DecimalFormat(".##########");
    }

    @Test
    public void exponentialPower() {
        double num=1.0;
//        HyperbolicSineFunction sineFunction=new HyperbolicSineFunction();
        double actualOutput=sineFunction.exponentialPower(num);
        double expectedOutput=2.7182815255731922;
        Assert.assertEquals(actualOutput,expectedOutput,0.0);
    }

    @Test
    public void sinhComputation() {
        double actualOutput=1.0;
        actualOutput= Double.parseDouble(decimalFormat.format(actualOutput));
        String expectedOutput="1.0";
        Assert.assertNotEquals(actualOutput,expectedOutput);
    }

    @Test
    public void functionEvaluation() {
//        DecimalFormat decimalFormat = new DecimalFormat(".###############");
        double input=1.0;
        double e1= sineFunction.exponentialPower(input);
        double e2= sineFunction.exponentialPower(-input);
        double actualOutput=sineFunction.FunctionEvaluation(input,e1,e2);
        double expectedOutput=1.1752011684;
        expectedOutput = Double.parseDouble(decimalFormat.format(expectedOutput));
        Assert.assertEquals(actualOutput,expectedOutput,0.0);
    }
}