
public class AddTwoNumbersLinkedListReverse {
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode();
        ListNode ans = r;
        if(l1 == null && l2 == null) return null;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
        	int f = l1 == null? 0 : l1.val;
        	int s = l2 == null? 0 : l2.val;
        	int value = f + s + carry;
        	carry = value / 10;
        	value = value % 10;
        	r.next = new ListNode(value);
        	l1 = null == l1 ? null : l1.next;
        	l2 = null == l2 ? null : l2.next;
        	r = r.next;
        }        
        return ans.next;    	
    }

	public static void main(String[] args) {
		/*
		ListNode in1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode in2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		
		ListNode in1 = new ListNode(0, new ListNode(1));
		ListNode in2 = new ListNode(5, new ListNode(9, new ListNode(9, new ListNode(1))));
		*/
		
		ListNode in1 = new ListNode();
		ListNode in2 = new ListNode();
		
		ListNode ans = addTwoNumbers(in1, in2);
		System.out.println("ans");

	}

}
