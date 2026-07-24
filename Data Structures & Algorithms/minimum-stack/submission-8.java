class MinStack {
    // i wanna use linkedlist here. no point using stack i want a bit of a challenge

    // our base stack
    LinkedList<Integer> stack; 
    // we keep this stack to record all minimms at all times, since mins keep changing if we pop
    LinkedList<Integer> minstack;

    public MinStack() {
        // initialise inside and declare outside
        // if done both at once inside, objects disappear once contructor finishes
        stack = new LinkedList<Integer>(); 
        minstack = new LinkedList<Integer>(); 
    }
    
    public void push(int val) {
        // if stack is empty, then whatever value pushed is automatially the minimum
        if (stack.isEmpty()) minstack.addLast(val); 

        // if stack already has values, then we check if val is fit to be our new min, so we check with our current min on minstack
        else if (!stack.isEmpty() && val <= minstack.peekLast()) minstack.addLast(val); 

        // add all vals to stack anyway
        stack.addLast(val); 
    }
    
    public void pop() {
        // if the current top value of stack we are trying to pop is also the current minimum value
        // we pop both, because removing the minimum means we revert our stack minimum to whatever it was before
        // which would be the value right below the top of the minstack stack
        if (minstack.peekLast().equals(stack.peekLast())) minstack.removeLast();
        stack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        // if min stack is not empty, return top of minstack aka current min
        if(!minstack.isEmpty()) return minstack.peekLast();
        else return 0;
    }
}
