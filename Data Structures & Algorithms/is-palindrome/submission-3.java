class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        //StringBuilder sb = new StringBuilder(str);
        int front = 0;
        int end = str.length() - 1;
        while(front < end) {
            if(str.charAt(front) != str.charAt(end)) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }
}
