
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> currStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        while(n > 0) {
            int choice = scan.nextInt();
            if(choice == 1) {
                int ele = scan.nextInt();
                currStack.push(ele);
                if(currStack.peek() >= maxStack.peek()) {
                    maxStack.push(currStack.peek());
                }
            }
            if(choice == 2) {
                if(maxStack.peek() == currStack.peek()) {
                    maxStack.pop();
                }
                currStack.pop();
            }
            if(choice == 3) {
                System.out.println(maxStack.peek());
            }
            n--;
        }
    }
}
