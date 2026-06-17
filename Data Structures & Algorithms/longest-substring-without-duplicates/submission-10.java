class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int length = 0;

        while(r < s.length() && l <= r) {
            if(map.containsKey(s.charAt(r))) {
                
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(s.charAt(r), r);
            length = Math.max(length , r - l + 1);
            //length++;
            r++;
        }
        return length;
    }
}
