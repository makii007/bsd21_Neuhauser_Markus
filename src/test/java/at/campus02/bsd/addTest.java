package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class addTest {

    private static Calculator test = new Calculator();
   @BeforeAll
   public static void setUp(){
       Calculator test = new Calculator();
   }
    @Test
    public void testAdding(){
        Assertions.assertEquals(10, test.add(5,5));
    }
    @Test void testMinus(){
       Assertions.assertEquals(200, test.minus(255, 55));
    }
}
