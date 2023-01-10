import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyUtilitiesTestScope {

    @Test
    void testIsCorrectExtendedScope() {
        MyUtilities tttMyUtilities = new MyUtilities();
        assertEquals(true, tttMyUtilities.isCorrectExtendedScope("{ int x= (int)(0+1); int[] arr=new arr[10];;; }"));
    }

}
