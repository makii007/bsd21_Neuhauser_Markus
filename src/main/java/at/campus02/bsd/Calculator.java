package at.campus02.bsd;

import java.util.ArrayList;

public class Calculator {
    double result;

    public Calculator() {
    }

    public double add(double number1, double number2){
        result = number1+number2;
        return result;
    }
    public double minus(double number1, double number2){
        result = number1-number2;
        return result;
    }
    public double divide(double number1, double number2){
        result = number1/number2;
        return result;
    }
    public double multiply(double number1, double number2){
        result = number1*number2;
        return result;
    }
    public int faculty(int number1){
        /*if (number1 >= 0){
            for (int i = number1 - 1; i > 0; i--){
                number1 *= i;
            }
            return number1;
        }
        else*/
            return 0;


    }
}
