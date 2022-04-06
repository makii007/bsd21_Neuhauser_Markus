package at.campus02.bsd;

public class main {
    public static void main(String[] args) {
        Calculator testCalculator = new Calculator();

        double testNum1 = 39.6;
        double testNum2 = 11.7;

        System.out.println(testCalculator.add(testNum1,testNum2));
        System.out.println(testCalculator.minus(testNum1,testNum2));
        System.out.println(testCalculator.divide(testNum1,testNum2));
        System.out.println(testCalculator.multiply(testNum1,testNum2));

    }
}
