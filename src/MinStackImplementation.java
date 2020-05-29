class MinStack {

    /** initialize your data structure here. */
    int min = 0;
    int val = 0;
    int count = 0;
    MinStack top;
    MinStack prev;
    public MinStack() {
        
    }
    
    public void push(int x) {
    	if(top == null) {
    		this.val = x;
    		this.min = x;
    		top = this;
    		top.count ++;
    		prev = null;
    	}else {
    		MinStack node = new MinStack();
    		node.prev = top;
    		node.val = x;
    		if(node.val < top.min) {
    			node.min = node.val;
    		}else {
    			node.min = top.min;
    		}
    		top = node;
    		top.count ++;
    		
    	}
    }
    
    public void pop() {
    	if (top.count > 0) {
        	top = top.prev;
        }
    }
    
    public int top() {
		return top.val;   
    }
    
    public int getMin() {
		return top.min;
    }
}


public class MinStackImplementation {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin()); // -3
		minStack.pop();
		System.out.println(minStack.top());    // return 0
		System.out.println(minStack.getMin()); // return -2
	}

}
