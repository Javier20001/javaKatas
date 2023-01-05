import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CyclopsNumbersTest {
    Cyclopsnumbers cyclopsnumbers = new Cyclopsnumbers();

    @Test
    public void test1(){
        assertFalse("Esto va dar False", cyclopsnumbers.cyclops(1));
    }

    @Test
    public void test2(){
        assertTrue("Esto va dar True", cyclopsnumbers.cyclops(5));
    }

    @Test
    public void test3(){
        assertTrue("Esto va dar True", cyclopsnumbers.cyclops(2015));
    }

    @Test
    public void test4(){
        assertFalse("Esto va dar False", cyclopsnumbers.cyclops(666));
    }
}
