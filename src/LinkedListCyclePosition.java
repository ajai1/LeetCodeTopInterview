import java.util.HashSet;

public class LinkedListCyclePosition {
	
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        while(head != null) {
        	if(hs.contains(head)) {
        		return true;
        	}else {
        		hs.add(head);
        		head = head.next;
        	}
        }
    	return false;
    }

	public static void main(String[] args) {
		ListNode i = new ListNode(2,new ListNode(0, new ListNode(-4)));
		i.next = i;
		ListNode n = new ListNode(3, i);
		
		System.out.println(hasCycle(n));
		
	}

}
