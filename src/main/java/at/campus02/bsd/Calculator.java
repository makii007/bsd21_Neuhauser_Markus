package at.campus02.bsd;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    double result;

    public Calculator() {
    }

    public double add(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1+number2;
        return result;
    }
    public double minus(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1-number2;
        return result;
    }
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
    public double multiply(double number1, double number2){
        logger.debug("Parameter1: " + number1 + " Parameter2: " + number2);
        result = number1*number2;
        return result;
    }
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
