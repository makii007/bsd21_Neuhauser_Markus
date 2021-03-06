package at.campus02.bsd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class addTest {

    private static Calculator testCalculator = new Calculator();
    private int result = 0;

    @Test
    public void AdditionTesting1(){
        Assertions.assertEquals(1150, testCalculator.add(600,550)); }
    @Test
    public void AdditionTesting2(){
        result = 500+200;
        Assertions.assertEquals(result, testCalculator.add(500,200));}
    @Test
    void SubtractionTesting1(){
        Assertions.assertEquals(200, testCalculator.minus(255, 55)); }
    @Test
    void SubtractionTesting2(){
        result = 500-200;
        Assertions.assertEquals(result, testCalculator.minus(500, 200)); }
    @Test
    void DivisionTesting1(){
        Assertions.assertEquals(80, testCalculator.divide(400, 5)); }
    @Test
    void DivisionTesting2(){
        result = 750/15;
        Assertions.assertEquals(result, testCalculator.divide(750, 15)); }
    @Test
    void DivisionTesting3(){
        assertThrows(ArithmeticException.class, () -> {testCalculator.divide(5, 0);});
    }
    @Test
    void MultiplicationTesting1(){
        Assertions.assertEquals(100, testCalculator.multiply(10, 10)); }
    @Test
    void MultiplicationTesting2(){
        result = 15*79;
        Assertions.assertEquals(result, testCalculator.multiply(15, 79)); }

    /*
    -------------- FACULTY --------------
    */

    @Test
    void FacultyTesting1(){
        Assertions.assertEquals(120, testCalculator.faculty(5));
    }
    @Test
    void FacultyTesting2(){
        result = 9*8*7*6*5*4*3*2*1;
        Assertions.assertEquals(result, testCalculator.faculty(9));
    }
    @Test
    void FacultyTesting3(){
        Assertions.assertEquals(0, testCalculator.faculty(-9));
    }
    @Test
    void FacultyTesting4(){
        Assertions.assertEquals(1, testCalculator.faculty(1));
    }
    @Test
    void FacultyTesting5(){
        Assertions.assertEquals(0, testCalculator.faculty(0));
    }
}
