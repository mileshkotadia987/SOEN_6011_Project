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
            double output=FunctionEvaluation(input,e1,e2);
        }
        else{
            System.out.println("The user input is not in a range "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
        }
    }

    /**
     * This method computes the overall sinh(x) function.
     * @param input user input
     * @param e1 e power input
     * @param e2 e power -input
     * @return output of the computation
     */
    public double FunctionEvaluation(double input, double e1,double e2){
        double output=0;
        if (Validation.OutputValidation(e1) && Validation.OutputValidation(e2)){
            output = (e1 - e2)/denominator;
            output=Double.parseDouble(decimalFormat.format(output));
            System.out.print("sinh("+input+"): ");
            System.out.printf("%.10f",output);
            System.out.println();
            return output;
        }
        System.out.println("The exponential output is not in a range "+Double.NEGATIVE_INFINITY+" - "+Double.POSITIVE_INFINITY);
        return output;
    }
}
