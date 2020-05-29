import java.util.ArrayList;

class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class PalindromeSinglyLinkedList {
	
    public static boolean isPalindrome(ListNode head) {
    	
    	if(head == null) {
    		return false;
    	}
    	
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	do {
    		al.add(head.val);
    		head = head.next;
    	}while(head != null);

    	int s = 0;
    	int e = al.size()-1;
    	
    	while(s<e) {
    		int first = al.get(s);
    		int second = al.get(e);
    		if(first != second) {
    			return false;
    		}else {
    			s++;
    			e--;
    		}
    	}
    	return true;
    }
    
    public static ListNode reversed(ListNode head) {
    	ListNode prev = null;
    	while(head != null) {
    		ListNode next = head.next;
    		head.next = prev;
    		prev = head;
    		head = next;
    	}
    	
    	return prev;
    }

	public static void main(String[] args) {
		ListNode n = new ListNode();
		n.val = -1;
		
		n.next = new ListNode(-129, new ListNode(-2));
		
		ListNode rev = reversed(n);
		while(rev != null) {
			System.out.print(rev.val + " -> ");
			rev = rev.next;
		}
		
		
		/**/
		System.out.println(isPalindrome(n));

	}

}
