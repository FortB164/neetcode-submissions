class MinStack {
    // i wanna use linkedlist here. no point using stack i want a bit of a challenge

    LinkedList<Integer> stack; // our base stack
    LinkedList<Integer> minstack; // we keep this stack to record all minimms at all times, since mins keep changing if we pop
    public MinStack() {
        stack = new LinkedList<Integer>(); // initialise inside and declare outside
        minstack = new LinkedList<Integer>(); // if done both at once inside, objects disappear once contructor finishes
    }
    
    public void push(int val) {
        if (stack.isEmpty()) minstack.addLast(val);
        else if (!stack.isEmpty() && val <= minstack.peekLast()) minstack.addLast(val); 
        stack.addLast(val); 
    }
    
    public void pop() {
        if (minstack.peekLast().equals(stack.peekLast())) minstack.removeLast();
        stack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        if(!minstack.isEmpty()) return minstack.peekLast();
        else return 0;
    }
}
