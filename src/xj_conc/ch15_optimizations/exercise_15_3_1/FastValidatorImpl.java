package xj_conc.ch15_optimizations.exercise_15_3_1;

import xj_conc.ch15_optimizations.exercise_15_1_1.*;

/**
 * TODO: Make 6x faster for all data sets
 */
public class FastValidatorImpl implements Validator {
    public boolean checkInteger(String testInteger) {
        /*
        * The function must check that a given string is
        *
        * an integer
        * not the empty string or null
        * an integer greater than 10
        * an integer between 2 and 100000 inclusive
        * That the first digit is 3.
        */
        try {
            // fails if not a number
            Integer theInteger = new Integer(testInteger);
            return (!theInteger.toString().equals("")) && // not empty
                (theInteger > 10) && // greater than ten
                ((theInteger >= 2) && (theInteger <= 100000)) && // 2>=X<=100000
                // first digit is 3
                (theInteger.toString().charAt(0) == '3');
        } catch (NumberFormatException err) {
            return false;
        }
    }
}
