class MinStack {
    private int[] array;
    private int[] minArray;
    private int top;

    public MinStack() {
        array = new int[256];
        minArray = new int[256];
        top = 0;
    }

    public void push(int val) {
        array[top] = val;
        if (top == 0) {
            minArray[top] = val;
        } else {
            minArray[top] = Math.min(val, minArray[top - 1]);
        }
        top++;
    }

    public void pop() {
        if (top > 0) top--;
    }

    public int top() {
        if (top > 0) return array[top - 1];
        return -1; 
    }

    public int getMin() {
        if (top > 0) return minArray[top - 1]; 
        return -1; 
    }
}
