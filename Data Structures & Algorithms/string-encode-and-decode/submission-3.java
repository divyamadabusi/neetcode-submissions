class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String s : strs) {
            int length = s.length();
            str.append(length + "*");
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();
        int i = 0;
        
        while(i < str.length()) {
            StringBuilder l = new StringBuilder();
            while(str.charAt(i) != '*'){
                l.append(str.charAt(i));
                i++;
            }
            int len = Integer.parseInt(l.toString());
            i++;
            String word = str.substring(i , (i + len));
            out.add(word);
            i += len;
        }
        return out;

    }
}
