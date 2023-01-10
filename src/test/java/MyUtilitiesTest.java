import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Test two positive integers")
    void testTwoPositiveIntegers() {
        MyUtilities tttMyUtilities = new MyUtilities();
        HashMap<String, Integer> expectedHashMap = new HashMap<String, Integer>();
        expectedHashMap.put("result", 8);
        
        HashMap<String, Integer> inputHashMap = new HashMap<String, Integer>();
        inputHashMap.put("base", 2);
        inputHashMap.put("exponent", 3);
        assertEquals(expectedHashMap, tttMyUtilities.exponentCalculator(inputHashMap));
    }
    
    @Test
    @DisplayName("Test with exponent and base being 0")
    void testZeros() {
        MyUtilities tttMyUtilities = new MyUtilities();
        HashMap<String, Integer> expectedHashMap = new HashMap<String, Integer>();
        expectedHashMap.put("result", 1);
        
        HashMap<String, Integer> inputHashMap = new HashMap<String, Integer>();
        inputHashMap.put("base", 0);
        inputHashMap.put("exponent", 0);
        assertEquals(expectedHashMap, tttMyUtilities.exponentCalculator(inputHashMap));
    }


}
