class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else if (stack.isEmpty()) {
                return false;
            }else if (s.charAt(i) == ')') {
                char c = stack.pop();
                if(c != '(') {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                char c = stack.pop();
                if(c != '{') {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                char c = stack.pop();
                if(c != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return (stack.size() == 0);
    }
}
