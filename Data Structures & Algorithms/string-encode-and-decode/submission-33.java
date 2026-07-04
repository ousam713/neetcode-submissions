class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str:strs){
            int len = str.length();
            res.append(len);
            res.append("#");
            res.append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i=0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            StringBuilder sb = new StringBuilder();
            for (int k = i; k < i + length; k++) {
                sb.append(str.charAt(k));
            }

            strs.add(sb.toString());
            i += length;
        }

        return strs;
    }
}
