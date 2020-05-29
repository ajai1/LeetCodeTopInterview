import java.util.HashMap;

public class RomanToInt {
/*
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	
	*/
	
	public static int romanToInt(String s) {

		if (s.isEmpty() || s.length() <= 0) {
			return 0;
		}

		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		int val = 0;

		int prev = hm.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 1; i >= 0; i--) {
			int cur = hm.get(s.charAt(i));
			if (cur < prev) {
				val -= cur;
			} else {
				val += cur;
			}
			prev = cur;
		}

		return val;
	}
    
	public static void rahul(String s) {

        // TODO Auto-generated method stub
        HashMap<Character, Integer> romanReferMap = new HashMap<Character, Integer>();
        romanReferMap.put('I', 1);
        romanReferMap.put('V', 5);
        romanReferMap.put('X', 10);
        romanReferMap.put('L', 50);
        romanReferMap.put('C', 100);
        romanReferMap.put('D', 500);
        romanReferMap.put('M', 1000);

        String romanValue = s;
        int integerValue = 0;
        char[] romanArray = romanValue.toCharArray();
        int[] integerArray = new int[1000];
        for (int i = 0; i < romanArray.length; i++) {
               integerArray[i] = (int) romanReferMap.get(romanArray[i]);
        }
        for (int i = 0; i < integerArray.length - 1; i++) {
               if (integerArray[i] < integerArray[i + 1]) {
                     integerValue -= integerArray[i];
               } else {
                     integerValue += integerArray[i];
               }
        }

        System.out.println(integerValue);
 

	}
	
	public static void main(String[] args) {
		String s = "MLVIII";
		
		System.out.println(romanToInt(s));
		rahul(s);

	}

}
