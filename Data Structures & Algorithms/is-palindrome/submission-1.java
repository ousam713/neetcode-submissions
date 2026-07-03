public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
    /*
        solution c
        */

        /*
        solution A
        */

        /*
        s = s.trim().toLowerCase();
        char[] ss = s.toCharArray();
        List<Character> sAL = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(0<=(ss[i]-'a') && (ss[i]-'a') <=25 || (ss[i]>='0' && ss[i]<='9')){
                sAL.add(ss[i]);
            }
        }


        int i=0,j=sAL.size()-1;
        while(i<j){
            char ii = sAL.get(i);
            char jj = sAL.get(j);
            
            if(ii!=jj) return false;
            i++;j--;
        }
        */

        /*
        solution B
        */

        /*
        char[] plandrom = new char[sAL.size()];
        
        for (int i = 0; i < sAL.size(); i++) {
            plandrom[i] = sAL.get(i);  // Auto-unboxing from Character to char
        }
        
        char[] reversePlandrom = new char[plandrom.length];

        for(int i=0;i<plandrom.length;i++){
            reversePlandrom[plandrom.length-i-1] = plandrom[i];
        }

        for(int i=0;i<plandrom.length;i++){
            if(plandrom[i] != reversePlandrom[i]) return false;
        }

        */
        // if(plandrom.equals(reversePlandrom)) return true;
        
}