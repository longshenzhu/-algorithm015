import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length(); i++){
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '('){
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() != '['){
                        return false;
                    }
                    stack.pop();
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{'){
                        return false;
                    }
                    stack.pop();
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}

//思路不错，时间复杂度太高
// class Solution:
//     def isValid(self, s):
//         while '{}' in s or '()' in s or '[]' in s:
//             s = s.replace('{}', '')
//             s = s.replace('[]', '')
//             s = s.replace('()', '')
//         return s == ''

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character>stack = new Stack<Character>();
//         for(char c: s.toCharArray()){
//             if(c=='(')stack.push(')');
//             else if(c=='[')stack.push(']');
//             else if(c=='{')stack.push('}');
//             else if(stack.isEmpty()||c!=stack.pop())return false;
//         }
//         return stack.isEmpty();
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         char[] chars = s.toCharArray();
//         for (char aChar : chars) {
//             if (stack.size() == 0) {
//                 stack.push(aChar);
//             } else if (isSym(stack.peek(), aChar)) {
//                 stack.pop();
//             } else {
//                 stack.push(aChar);
//             }
//         }
//         return stack.size() == 0;
//     }
    
//     private boolean isSym(char c1, char c2) {
//         return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
//     }
// }