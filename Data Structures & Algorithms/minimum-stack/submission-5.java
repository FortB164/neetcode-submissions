class MinStack {

    LinkedList<Integer> stack;
    public MinStack() {
        stack = new LinkedList<Integer>();
    }
    
    public void push(int val) {
        stack.addLast(val);
    }
    
    public void pop() {
        stack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return Collections.min(stack);
    }
}
