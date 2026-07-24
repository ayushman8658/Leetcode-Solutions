class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sTotmap=new HashMap<>();
         HashMap<Character,Character> tTosmap=new HashMap<>();
         int n=s.length();
         for(int i=0;i<n;i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);

            if(!sTotmap.containsKey(s1)){
                sTotmap.put(s1,t1);
            }
            if(!tTosmap.containsKey(t1)){
                tTosmap.put(t1,s1);
            }
            if(sTotmap.get(s1)!=t1 || tTosmap.get(t1)!=s1){
                return false;
            }
         }
         return true;
    }
}