/**
 * @author Markus Neuhauser
 */
package at.campus02.bsd;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class that implements basic functions of a calculator
 */

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    double result;

    public Calculator() {
    }

    /**
     * Adds number1 to number2 and saves the result in result.
     * @param number1
     * @param number2
     * @return result of addition
     */
    public double add(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1+number2;
        return result;
    }
    /**
     * Subtracts number1 from number2 and saves the result in result.
     * @param number1
     * @param number2
     * @return result of subtraction
     */
    public double minus(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1-number2;
        return result;
    }
    /**
     * Divides number1 by number2 and saves the result in result.
     * @param number1
     * @param number2
     * @return result of division
     * @throws ArithmeticException e if number2 == 0
     */
    public double divide(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        try{
            if (number2 == 0){
                throw new ArithmeticException();
            }
            else
                result=number1/number2;
        }
        catch (ArithmeticException e){
            logger.error("Division by Zero");
            throw e;
        }
        return result;
    }
    /**
     * Multiplies number1 and number2 and saves the result in result.
     * @param number1
     * @param number2
     * @return result of multiplication
     */
    public double multiply(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1*number2;
        return result;
    }
    /**
     * Calculates the factorial of number1
     * @param number1
     * @return result of calculcation
     */
    public int faculty(int number1){
        logger.debug("Parameter1: " + number1);
        if (number1 >= 0){
            for (int i = number1 - 1; i > 0; i--){
                number1 *= i;
            }
            return number1;
        }
        else
            return 0;
    }
}
