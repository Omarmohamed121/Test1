package io.javabrains;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MathUtilsTest {
    @Test
    void test(){
        MathUtils math = new MathUtils();
        int expected = 1 ;
        int actual = math.add(1,1);

        assertEquals(expected,actual);
    }
}
