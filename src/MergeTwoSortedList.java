
public class MergeTwoSortedList {
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode t = new ListNode();
    	ListNode head = t;
    	while(l1 != null && l2 != null) {    		
    		if(l1.val < l2.val) {
    			t.next = l1;
    			l1 = l1.next;
    		}
    		else{
    			t.next = l2;
    			l2 = l2.next;
    		}
    		t = t.next;
    	}
    	if(l1 != null) {
    		t.next = l1;
    	}else {
    		t.next = l2;
    	}
    	        
    	return head.next;
    }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode l3 = mergeTwoLists(l1,l2);
		while(l3 != null) {
			System.out.print(l3.val + " -> ");
			l3 = l3.next;
		}
	}

}
