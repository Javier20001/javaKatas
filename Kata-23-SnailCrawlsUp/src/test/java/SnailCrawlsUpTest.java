import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SnailCrawlsUpTest {
    @Test
    public void test1(){
        assertEquals(2, SnailCrawlsUp.snail(3,2,1));
    }
    @Test
    public void test2(){
        assertEquals(5, SnailCrawlsUp.snail(10,3,1));
    }
    @Test
    public void test3(){
        assertEquals(8, SnailCrawlsUp.snail(10,3,2));
    }
    @Test
    public void test4(){
        assertEquals(7, SnailCrawlsUp.snail(100,20,5));
    }
}
