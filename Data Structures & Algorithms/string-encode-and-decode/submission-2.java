class Solution {

    public String encode(List<String> strs) {
        StringBuilder out = new StringBuilder();
        for(String s : strs) {
            out.append(s.length());
            out.append("#");
            out.append(s);
        }
        return out.toString();
    }

    public List<String> decode(String str) {
        StringBuilder sb = new StringBuilder(str);
        int idx = 0;
        List<String> out = new ArrayList<>();
        while(sb.length() > 0) {
            //System.out.println(sb.charAt(0));
            StringBuilder s = new StringBuilder();
            while(sb.charAt(0) != '#') {
                s.append(sb.charAt(0));
                sb = new StringBuilder(sb.substring(1));
            }
            int size = Integer.parseInt(s.toString());
            out.add(sb.substring(1, size + 1));
            if(sb.length() == size + 1) {
                break;
            }
            sb = new StringBuilder(sb.substring(size + 1));
        }
        return out;
    }
}
