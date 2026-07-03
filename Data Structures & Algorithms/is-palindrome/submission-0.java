class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        char[] ss = s.toCharArray();
        List<Character> sAL = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(0<=(ss[i]-'a') && (ss[i]-'a') <=25 || (ss[i]>='0' && ss[i]<='9')){
                sAL.add(ss[i]);
            }
        }

        /*
        solution A
        */
        int i=0,j=sAL.size()-1;
        while(i<j){
            char ii = sAL.get(i);
            char jj = sAL.get(j);
            
            if(ii!=jj) return false;
            i++;j--;
        }

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
        System.out.println(plandrom);
        System.out.println(reversePlandrom);
        for(int i=0;i<plandrom.length;i++){
            if(plandrom[i] != reversePlandrom[i]) return false;
        }

        */
        // if(plandrom.equals(reversePlandrom)) return true;
        return true;
    }
}