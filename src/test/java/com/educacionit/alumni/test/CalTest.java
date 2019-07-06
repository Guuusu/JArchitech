package com.educacionit.alumni.test;

import com.educacionit.alumni.beans.Student;
import com.educacionit.alumni.util.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalTest {

    @Test
    public void testDiv(){
        int result = Calculator.div(8,2);
        int expect = 4;
        assertTrue(result==expect,"Esperaba 4 y devolvio 5");

    }
    @Test
    public void testDivFail(){
        int result = Calculator.div(8,2);
        int expect = 4;
        assertThrows(java.lang.ArithmeticException.class,()->Calculator.div(8,0));
    }

}
