package test;

/**
 * This class implementss the unit test cases for Validaion class
 */

import com.company.Validation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTest {

    /**
     * This function tests the userInputValidation function
     */
    @Test
    public void userInputValidation() {
        double lowerLimit = Double.MIN_VALUE;
        double upperLimit = Double.MAX_VALUE * 5;
        Assert.assertTrue(Validation.UserInputValidation(lowerLimit));
        Assert.assertFalse(Validation.UserInputValidation(upperLimit));
    }

    /**
     * This function tests the outputValidation function
     */
    @Test
    public void outputValidation() {
        double lowerLimit = Double.NEGATIVE_INFINITY;
        double upperLimit = Double.POSITIVE_INFINITY;
        boolean actualOutput=Validation.OutputValidation(lowerLimit);
        Assert.assertFalse(actualOutput);
        actualOutput=Validation.OutputValidation(upperLimit);
        Assert.assertFalse(actualOutput);

    }
}