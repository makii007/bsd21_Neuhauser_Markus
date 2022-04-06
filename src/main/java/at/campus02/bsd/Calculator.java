package at.campus02.bsd;

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
}
