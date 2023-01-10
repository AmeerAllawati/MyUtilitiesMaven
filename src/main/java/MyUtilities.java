import java.util.HashMap;

public class MyUtilities {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        

    }
    
    public HashMap<String, Integer> exponentCalculator(HashMap<String, Integer> baseExponent) {
        
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        
        Integer powerResult = baseExponent.get("base");
        
        for(int i = 0; i < Math.abs(baseExponent.get("exponent"))-1; ++i) {
            powerResult = powerResult * baseExponent.get("base"); 
        }
        
        if(baseExponent.get("exponent") < 0) {
            result.put("result", powerResult);
        } else if (baseExponent.get("exponent") == 0) {
            result.put("result", 1);
        } else {
            result.put("result", powerResult);  
        }
        
        
        return result;
    }
    
    

}
