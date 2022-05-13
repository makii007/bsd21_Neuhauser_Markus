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
}
