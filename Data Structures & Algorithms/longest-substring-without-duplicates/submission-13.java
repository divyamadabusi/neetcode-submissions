class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int length = 0;
        int strLen = s.length();

        for(int i = 0; i < strLen; i++) {
            char c = s.charAt(i);

            if(map.containsKey(c)) {
                if((map.get(c) + 1) > l) {
                     l = map.get(c) + 1;
                }
            }
            map.put(c, i);
            length = Math.max(length , i - l + 1);

        }
        //length = Math.max(length, strLen - l + 1);
        return length;
    }
}
