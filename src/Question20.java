import java.util.Stack;

public class Question20 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
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
        return stack.isEmpty();
    }
}
