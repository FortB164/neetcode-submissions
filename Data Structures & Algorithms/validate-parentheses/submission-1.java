class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put(')', '(');
        hs.put(']', '[');
        hs.put('}', '{');

        for(char c : s.toCharArray()){
            if (hs.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == hs.get(c)) stack.pop();
                else return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}