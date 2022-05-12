package at.campus02.bsd;

import org.junit.jupiter.api.*;

public class addTest {

    Calculator test;

    @BeforeAll
    public void setUp(){
        test = new Calculator();
    }
    @Test
    public void testAdding(){
        Assertions.assertEquals(10, test.add(5,5));
    }
}
