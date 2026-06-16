class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {

            char[] key = new char[26];
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                key[c - 'a']++;
                
            }
            String k = new String(key);
            //String key = Arrays.toString(arr);
            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
