import java.util.HashMap;
import java.util.Stack;

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
    
    public boolean isCorrectExtendedScope(String inputString) {
        Stack<Character> charactersStack = new Stack<Character>();
        
        for(int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == '{' || inputString.charAt(i) == '[' || inputString.charAt(i) == '(') {
                charactersStack.add(inputString.charAt(i));
            } else if (inputString.charAt(i) == '}' || inputString.charAt(i) == ']' || inputString.charAt(i) == ')') {
                if((inputString.charAt(i) == '}' && charactersStack.peek() == '{') ||
                        (inputString.charAt(i) == ']' && charactersStack.peek() == '[') ||
                        (inputString.charAt(i) == ')' && charactersStack.peek() == '(')) {
                    charactersStack.pop();
                }
            }
        }
        
        return (charactersStack.empty());
    }
    
    

}
