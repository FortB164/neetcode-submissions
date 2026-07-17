class MinStack {
    private int[] array;
    private int[] minArray;
    private int top;

    public MinStack() {
        array = new int[256];
        minArray = new int[256]; // Additional array to track the minimum values
        top = 0;
    }

    public void push(int val) {
        array[top] = val;
        if (top == 0) {
            minArray[top] = val; // First element, so it's the minimum
        } else {
            minArray[top] = Math.min(val, minArray[top - 1]); // Track minimum value up to this index
        }
        top++;
    }

    public void pop() {
        if (top > 0) top--; // Remove top element
    }

    public int top() {
        if (top > 0) return array[top - 1]; // Return last inserted element
        return -1; // Invalid case, stack is empty
    }

    public int getMin() {
        if (top > 0) return minArray[top - 1]; // Return the last minimum value
        return -1; // Invalid case, stack is empty
    }
}
