
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Stack<Character> myStack = new Stack<>();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(isValid(s)? "YES" : "NO");
        }
    }
    
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(c == '(')
                myStack.push(')');
            else if(c == '[')
                myStack.push(']');
            else if(c == '{')
                myStack.push('}');
            else if(myStack.isEmpty() || myStack.pop() != c)
                return false;
        }
        return myStack.isEmpty();
    }
}
