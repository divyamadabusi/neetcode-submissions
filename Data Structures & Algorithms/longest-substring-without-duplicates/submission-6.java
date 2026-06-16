class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        int r = 0;
        int curr = 0;

        Set<Character> seen = new HashSet<>();

        while(r < s.length()) {
            char right = s.charAt(r);
            
            if(!seen.contains(right)) {
                seen.add(right);
                r++;
                curr++;
                if(curr > max) {
                    max = curr;
                }
            } else {
                while(s.charAt(l) != right) {
                    seen.remove(s.charAt(l));
                    l++;
                    curr--;
                }
                l++;
                r++;
                //curr--;
            }
        }
        return max;
    }
}
