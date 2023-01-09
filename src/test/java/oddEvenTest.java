import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class oddEvenTest {

    @Test
    void test() {
        oddEven oEven = new oddEven();
        assertEquals(oddEven.getOddEven(new int[]{1, 2, 3}), null);;
    }

}
