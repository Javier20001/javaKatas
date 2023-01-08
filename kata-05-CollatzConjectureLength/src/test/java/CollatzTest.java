import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollatzTest {
    
    @Test
    public void test1(){
        assertEquals("Test failed for: " + 100L, 26L, Collatz.conjecture(100L));
    }
    @Test
    public void test2(){
        assertEquals("Test failed for: " + 10L, 7L, Collatz.conjecture(10L));
    }
    @Test
    public void test3(){
        assertEquals("Test failed for: " + 500L, 111L, Collatz.conjecture(500L));
    }
    @Test
    public void test4(){
        assertEquals("Test failed for: " + 1000000000000000L, 276L, Collatz.conjecture(1000000000000000L));
    }
}
