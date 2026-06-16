class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> out = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            out.putIfAbsent(Arrays.toString(count) , new ArrayList<>());
            out.get(Arrays.toString(count)).add(s);
        }
        return new ArrayList<>(out.values());
    }
}
