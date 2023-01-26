import static org.junit.Assert.*;
import org.junit.Test;
// import static org.hamcrest.CoreMatchers.*;
public class YourOrderPleaseTest {
    @Test
    public void test1() {
        assertEquals("Thi1s is2 3a T4est", YourOrderPlease.order("is2 Thi1s T4est 3a"));
        // assertThat(YourOrderPlease.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"));
        // assertThat(YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertEquals("wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor", YourOrderPlease.order("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"));
        // assertThat(YourOrderPlease.order("d4o dru7nken sh2all w5ith s8ailor wha1t 3we a6"),
        //         equalTo("wha1t sh2all 3we d4o w5ith a6 dru7nken s8ailor"));
    }

    @Test
    public void test4() {
        assertEquals("", YourOrderPlease.order(""));
        // assertThat("Empty input should return empty string", YourOrderPlease.order(""), equalTo(""));
    }

    @Test
    public void test5() {
        assertEquals("1 2 3 4 5 6 7 8 9", YourOrderPlease.order("3 6 4 2 8 7 5 1 9"));
        // assertThat(YourOrderPlease.order("3 6 4 2 8 7 5 1 9"), equalTo("1 2 3 4 5 6 7 8 9"));
    }
}
