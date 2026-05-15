class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;
        while(front <= back) {
            char f = s.charAt(front);
            char b = s.charAt(back);

            if(!Character.isLetterOrDigit(f)){
                front++;
            } else if (!Character.isLetterOrDigit(b)) {
                back--;
            } else {
                if(Character.toLowerCase(f) != Character.toLowerCase(b)) {
                    return false;
                }
                front++;
                back--;    
            }
        }

        return true;
    }
}
