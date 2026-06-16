class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> out = new HashMap<>();

        
        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            out.putIfAbsent(key, new ArrayList<>());
            out.get(key).add(s);

        }

        return new ArrayList<>(out.values());
        

    }
}
