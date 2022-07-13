package com.company;

import java.text.DecimalFormat;

/**
 * This class implements the hyperbolic Sine function.
 * @author MILESH
 */
public class HyperbolicSineFunction {
    int decimalCount = 10;
    private static final double denominator = 2d;
    DecimalFormat decimalFormat = new DecimalFormat(".##########");

    /**
     * This method evaluates the e power num
     * @param num user input
     * @return the computation of exponential power of num
     */
    public double exponentialPower(double num) {
        double exponentComputation = 0;
        for (int fact = decimalCount; fact > 0; --fact) {
            exponentComputation = 1 + num * exponentComputation / fact;
        }
        return exponentComputation;
    }

    /**
     * This method computes all the components of the hyperbolic sine function
     * @param input user input
     */
    public void SinhComputation(double input){
        boolean checkInput = Validation.UserInputValidation(input);
        if (checkInput){

            input = Double.parseDouble(decimalFormat.format(input));
            double e1 = exponentialPower(input);
            double e2 = exponentialPower(-input);
        }
        else{
            System.out.println("The user input is not in a range "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
        }
    }
}
