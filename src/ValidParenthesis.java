import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    
	public static boolean isValid(String s) {
        if(s.isEmpty() || s.length()<=1) {
        	return false;
        }
        Stack aStack = new Stack<Character>();
        HashMap<Character, Character> brackets = new HashMap<Character,Character>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
        for(int i = 0 ; i< s.length(); i++) {
        	if(aStack.isEmpty())
        		aStack.push(s.charAt(i));
        	else if((char)aStack.peek() != s.charAt(i)) {
        		if(brackets.containsKey(aStack.peek())) {
            		if(s.charAt(i) == brackets.get(aStack.peek())) {
            			aStack.pop();
            			continue;
            		}
            	aStack.push(s.charAt(i));            		
        		}
        	}else {
        		aStack.push(s.charAt(i));
        	}
        }
        if(aStack.isEmpty())
        	return true;
        return false;
    }

	public static void main(String[] args) {
		String s = "()[]()[{{{}}}]";
		System.out.println(isValid(s));

	}

}
