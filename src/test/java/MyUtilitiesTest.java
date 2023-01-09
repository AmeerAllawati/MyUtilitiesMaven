import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author LAP-1
 *
 */
class MyUtilitiesTest {

    /**
     * Test method for {@link MyUtilities#exponentCalculator(java.util.HashMap)}.
     */
    @Test
    void testExponentCalculator() {
        MyUtilities tttMyUtilities = new MyUtilities();
        HashMap<String, Integer> expectedHashMap = new HashMap<String, Integer>();
        expectedHashMap.put("result", 8);
        
        HashMap<String, Integer> inputHashMap = new HashMap<String, Integer>();
        inputHashMap.put("base", 2);
        inputHashMap.put("exponent", 3);
        assertEquals(expectedHashMap, tttMyUtilities.exponentCalculator(inputHashMap));
    }

}
