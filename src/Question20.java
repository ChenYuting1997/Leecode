import java.util.Stack;

public class Question20 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {

        /*//方法一
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            //如果为左括号，就加入相应的右括号
            if(c == '('){
                stack.push(')');
            }else if (c == '['){
                stack.push(']');
            }else if (c == '}'){
                stack.push('}');
                //如果为右括号，如果栈已空或弹出栈顶元素与c不相等则返回false
            }else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        //如果栈空则为有效的括号
        return stack.isEmpty();*/

        //方法二

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
         //如果栈空直接加入
            if(stack.isEmpty()){
                stack.push(c);
         //如果栈顶元素与c匹配弹出栈顶元素
            }else if(match(stack.peek(),c)){
                stack.pop();
            //否则c入栈
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();


    }

    public boolean match(char char1,char char2){
        return (char1 == '(' && char2 == ')') || (char1 == '[' && char2 == ']') || (char1 == '{' && char2 == '}');
    }
}
