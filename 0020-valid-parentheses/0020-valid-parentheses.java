// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character>st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//              char c =s.charAt(i);
//             if(c=='(' || c=='{'|| c=='['){
               
//                 st.push(c);
//             }
//             else{
//                 if(st.isEmpty()){
//                     return false;
//                 }
//                 char top = st.peek();
//                 if(top=='('&&c==')'||
//                     top=='{'&&c=='}'||
//                     top=='['&&c==']'){
//                     st.pop();
//                 }
//                 else{
//                   return false;
//                 }
                
//             }
//         }
//         return st.isEmpty();
        
//     }
// }
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        char[] chr = s.toCharArray();
        char[] stack = new char[s.length()];
        int top = 0;
        for(int i=0;i<chr.length;i++){
            switch (chr[i]){
                case '(','{','[':
                stack[top++]=chr[i];
                break;
                case ')':
                if (top == 0 || stack[--top] != '(') return false;
                break;
                case '}':
                if (top == 0 || stack[--top] != '{') return false;
                break;
                case ']':
                if (top == 0 || stack[--top] != '[') return false;
                break;
            }
        }
        return top==0;
    }
}