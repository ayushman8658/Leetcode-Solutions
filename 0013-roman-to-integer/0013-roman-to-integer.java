class Solution {
    public int getValue(char ch){
            switch(ch){
                case 'I': return 1;
                case 'V':return 5;
                case 'X':return 10;
                case 'L':return 50;
                case 'C':return 100;
                case 'D':return 500;
                case 'M':return 1000;
                default :return 0;
            }
        }
    public int romanToInt(String s) {
        // String romanChar="IVXLCDM";
        // int []romanValues={1,5,10,50,100,500,1000};
        // Map<Character,Integer> romanToValues= new HashMap<>();
        // for(int i=0;i<romanValues.length;i++){
        //     romanToValues.put(romanChar.charAt(i),romanValues[i]);    
        // }
        // int length=s.length();
        // int result=romanToValues.get(s.charAt(length-1));
        // for(int i=0;i<length-1;i++){
        // int sign = romanToValues.get(s.charAt(i)) < romanToValues.get(s.charAt(i + 1)) ? -1 : 1;
        //     result += sign * romanToValues.get(s.charAt(i));
        // }
        // return result;
        
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            if((i+1)<n && getValue(ch1) < getValue(s.charAt(i+1))){
                sum=sum-getValue(ch1);

            }
            else{
                sum=sum+getValue(ch1);
            }
        }
        return sum;

    }
    
}