package com.company;

/**
 * This class helps to validate the user input and output of the computation of the sinh(x).
 * @author MILESH
 */
public class Validation {

    /**
     * This method validate the range of input provided by the user
     * @param input user input
     * @return true, if it is in valid range, otherwise false
     */
    public static boolean UserInputValidation(double input) {
        boolean flag = true;
        if (input > Double.MAX_VALUE || input < -Double.MAX_VALUE) {
            flag = false;
        }
        return flag;
    }

    /**
     * This method validates the output of the sinh(x) computation
     * @param output output of hyperbolic function
     * @return true, if it is in valid range, otherwise false
     */
    public static boolean OutputValidation(double output) {
        boolean flag = true;
        if (output == Double.POSITIVE_INFINITY) {
            flag = false;
        } else if (output == Double.NEGATIVE_INFINITY) {
            flag = false;
        }
        return flag;
    }
}
