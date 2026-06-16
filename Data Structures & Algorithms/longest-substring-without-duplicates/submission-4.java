class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        int curr = 0;

        Set<Character> seen = new HashSet<>();

        while(r < s.length()){
            if(!seen.contains(s.charAt(r))) {
                seen.add(s.charAt(r));
                curr++;
                r++;
            } else {
                if (curr > max) {
                    max = curr;
                }
                // if(s.charAt(r - 1) != s.charAt(r)) {
                //     while(s.charAt(l) != s.charAt(r)) {
                //         r--;
                //     }
                //     r++;
                // }
                while(s.charAt(l) != s.charAt(r)) {
                    seen.remove(s.charAt(l));
                    l++;
                    
                }
                l++;
                curr = r - l + 1;
                r++;
                
                //l = r;
                //curr = 0;
                //seen.clear();
            }
            
        }
        if(curr > max) {
            return curr;
        }
        return max;
    }
}
