
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int d, q, x, y;
        ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            d = scan.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < d;j++) {
                temp.add(scan.nextInt());
            }
            nestedList.add(temp);
        }
        
        q = scan.nextInt();
        for(int k = 0; k < q; k++) {
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                System.out.println(nestedList.get(x - 1).get(y - 1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
