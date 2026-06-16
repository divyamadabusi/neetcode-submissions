class Solution {

    public String encode(List<String> strs) {
        StringBuilder out = new StringBuilder();
        for(String s : strs) {
            out.append(s.length() + "#");
            out.append(s);
        }
        System.out.println(out.toString());
        return out.toString();
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            StringBuilder length = new StringBuilder();
            while(str.charAt(i) != '#') {
                length.append(str.charAt(i));
                i++;
            }
            i++;
            int len = Integer.valueOf(length.toString());
            StringBuilder word = new StringBuilder();
            for(int j = 0; j < len; j++) {
                word.append(str.charAt(i));
                i++;
            }
            i--;
            out.add(word.toString());
        }
        return out;
    }
}
