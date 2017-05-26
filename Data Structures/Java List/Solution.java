
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        
        int q = scan.nextInt();
        
        while( q-- > 0) {
            scan.nextLine();
            String st = scan.nextLine();
            if(st.equals("Insert")) {
                int index = scan.nextInt();
                int element = scan.nextInt();
                list.add(index, element);
            } else {
                int element = scan.nextInt();
                list.remove(element);
            }
        }
        
        Iterator i = list.iterator();
        while(i.hasNext()) {
            System.out.print(i.next()+ " ");
        }
    }
}
