"""
  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.
"""
//O(1) time
//o(n) space  





class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minimum = new Stack<>();
    public MinStack() 
    {
       Stack<Integer> stack = new Stack<>();
       Stack<Integer> minimum = new Stack<>();
    }
    
    public void push(int val) 
    {
        if(minimum.isEmpty())
        minimum.push(val);
        else if(val<=minimum.peek())
        minimum.push(val);
        stack.push(val); 
    }
    
    public void pop() 
    {
        
        int t = stack.pop();
        if(minimum.peek()==t)
        minimum.pop();
    }
    
    public int top() 
    {
        return(stack.peek());    
    }
    
    public int getMin() 
    {
        return(minimum.peek());    
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
