class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> out = new List<List<>>();
        // List<HashMap<Character, Integer>> charList = new ArrayList<>();
        // List<HashMap<HashMap<Character, Integer> , String>> mapList = new ArrayList<HashMap<HashMap<Character, Integer> , String>>();
        // //make hashmap for each word w each letter and number of times it appears
        // //put them all in a list, and then iterate through each one
        // //every hashmap that is equal, goes in a final list together
        // for(int i = 0; i < strs.length; i++) {
        //     HashMap<Character, Integer> map = new HashMap<>();
        //     for(int j = 0; j < strs[i].length; j++){
        //         char c = strs[i].charAt(j);
        //         if(!map.containsKey(c)) {
        //             map.put(c, 1);
        //         } else {
        //             int count = map.get(c);
        //             map.put(c, count + 1);
        //         }
        //     }
        //     HashMap<HashMap<Character, Integer> , String> mapToWord = new HashMap<HashMap<Character, Integer> , String>;
        //     mapToWord.put(map, strs[i]);
        //     mapList.add(mapToWord);
        //     charList.add(map);
        // }
        // HashMap<Character, Integer> curr = new HashMap<>();


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

