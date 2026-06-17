class Solution {
    public int lengthOfLongestSubstring(String s) {
        int totalLength = s.length();
        if(totalLength == 0 || totalLength == 1) {
            return totalLength;
        }


        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int curr = 0;
        int max = 0;
        while(r < totalLength && l <= r) {
            if(!set.add(s.charAt(r))) {
                if(curr > max){
                    max = curr;
                }
                while(set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                    curr--;
                }
                set.add(s.charAt(r));
            }
            curr++;
            r++;  
        }


        return curr > max ? curr : max ;
    }
}
