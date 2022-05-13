package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class addTest {

    private static Calculator test = new Calculator();
    private int result = 0;
    @BeforeEach
    public void setUp() {
       int result = 0;
    }

    @Test
    public void AdditionTesting1(){
        Assertions.assertEquals(1150, test.add(600,550)); }
    @Test
    public void AdditionTesting2(){
        result = 500+200;
        Assertions.assertEquals(result, test.add(500,200));}
    @Test
    void SubtractionTesting1(){
        Assertions.assertEquals(200, test.minus(255, 55)); }
    @Test
    void SubtractionTesting2(){
        result = 500-200;
        Assertions.assertEquals(result, test.minus(500, 200)); }
    @Test
    void DivisionTesting1(){
        Assertions.assertEquals(80, test.divide(400, 5)); }
    @Test
    void DivisionTesting2(){
        result = 750/15;
        Assertions.assertEquals(result, test.divide(750, 15)); }
    @Test
    void MultiplicationTesting1(){
        Assertions.assertEquals(100, test.multiply(10, 10)); }
    @Test
    void MultiplicationTesting2(){
        result = 15*79;
        Assertions.assertEquals(result, test.multiply(15, 79)); }

    /*
    -------------- FACULTY --------------
    */

    @Test
    void FacultyTesting1(){
        Assertions.assertEquals(120, test.faculty(5));
    }
    @Test
    void FacultyTesting2(){
        result = 9*8*7*6*5*4*3*2*1;
        Assertions.assertEquals(result, test.faculty(9));
    }
    @Test
    void FacultyTesting3(){
        Assertions.assertEquals(0, test.faculty(-9));
    }
}
