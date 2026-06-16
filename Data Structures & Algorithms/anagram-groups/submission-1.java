class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char [] array = strs[i].toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            if(!groups.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                groups.put(key, list);
            } else {
                List<String> newList = groups.get(key);
                newList.add(strs[i]);
                groups.put(key, newList);
            }
        }
        List<List<String>> out = new ArrayList<>();
        for(String s : groups.keySet()) {
            List<String> words = new ArrayList<>();
            for(int i = 0; i < groups.get(s).size(); i++) {
                words.add(groups.get(s).get(i));
            }
            out.add(words);
        }
        return out;

    }
}

