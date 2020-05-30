import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
	
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	HashSet<ListNode> hs = new HashSet<>();
    	ListNode a = headA;
    	ListNode b = headB;
    	while(a != null) {
    		hs.add(a);
    		a = a.next;
    	}
    	while(b != null) {
    		if(hs.contains(b)) {
    			return b;
    		}
    		b = b.next;
    	}
    	
    	
        return null;
    }

	public static void main(String[] args) {
		
		ListNode I = new ListNode(8,new ListNode(4, new ListNode(5)));
		ListNode A = new ListNode(4, new ListNode(1, I));
		ListNode B = new ListNode(5, new ListNode(0, new ListNode(1, I)));
		
		ListNode R = getIntersectionNode(A, B);
		System.out.println(R.val);

	}

}
