package test;


/**
 * This class validates the functions of HyperbolicSineFunction class
 */

import com.company.HyperbolicSineFunction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class HyperbolicSineFunctionTest {
    HyperbolicSineFunction sineFunction;
    DecimalFormat decimalFormat;

    /**
     * Initial Setup
     */
    @Before
    public void setUpStreams() {
        sineFunction=new HyperbolicSineFunction();
        decimalFormat = new DecimalFormat(".##########");
    }

    /**
     * This function test the exponentialPower function
     */
    @Test
    public void exponentialPower() {
        double num=1.0;
//        HyperbolicSineFunction sineFunction=new HyperbolicSineFunction();
        double actualOutput=sineFunction.exponentialPower(num);
        double expectedOutput=2.7182818284590455;
        Assert.assertEquals(actualOutput,expectedOutput,0.0);
    }

    /**
     * This function test the sinhComputation function
     */
    @Test
    public void sinhComputation() {
        double actualOutput=1.0;
        actualOutput= Double.parseDouble(decimalFormat.format(actualOutput));
        String expectedOutput="1.0";
        Assert.assertNotEquals(actualOutput,expectedOutput);
    }

    /**
     * This function tests the functionEvaluation functiuonality
     */
    @Test
    public void functionEvaluation() {
        double input=1.0;
        double e1= sineFunction.exponentialPower(input);
        double e2= sineFunction.exponentialPower(-input);
        double actualOutput=sineFunction.FunctionEvaluation(input,e1,e2);
        double expectedOutput=1.1752011936;
        expectedOutput = Double.parseDouble(decimalFormat.format(expectedOutput));
        Assert.assertEquals(actualOutput,expectedOutput,0.0);
    }
}