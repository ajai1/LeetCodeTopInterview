
public class ReverseLinkedList {
	
    public static ListNode reverseList(ListNode head) {
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
		ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode rev = reverseList(l);
		while(rev != null) {
			System.out.print(rev.val + " -> ");
			rev = rev.next;
		}
	}

}
