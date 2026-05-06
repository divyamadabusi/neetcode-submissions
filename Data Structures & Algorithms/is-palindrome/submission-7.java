class Solution {
    public boolean isPalindrome(String s) {
        //String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        //StringBuilder sb = new StringBuilder(str);
        int front = 0;
        int end = s.length() - 1;
        while(front < end) {
            if(!isAlphaNum(s.charAt(front))) {
                front++;
            } else if(!isAlphaNum(s.charAt(end))) {
                end--;
            } else if(Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                front++;
                end--;
            }
            
        }

        if(s.length() % 2 == 0) {
            if(Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphaNum(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') ){
            return true;
        }
        return false;
    }
}
