class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        Map<Character, Character> parenthesesMapping = new HashMap<>();
        parenthesesMapping.put(']', '[');
        parenthesesMapping.put('}', '{');
        parenthesesMapping.put(')', '(');
    
        for (char currChar : s.toCharArray()) {
            if (parenthesesMapping.containsKey(currChar)) {
                if (!stack.isEmpty() && stack.peek().equals(parenthesesMapping.get(currChar))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(currChar);
            }
        }

       return stack.isEmpty();
    }
}
