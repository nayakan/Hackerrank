![screen shot 2017-06-04 at 13 37 10](https://cloud.githubusercontent.com/assets/17459420/26765152/f896a26c-492a-11e7-8e1d-d26a6db97bbd.png)

public class Solution {
    private static boolean isSetFactor(int k, int[] a) {
        for(int num : a) {
            if(k % num != 0)
                return false;
        }
        return true;
    }
    
    private static boolean isFactorOfSet(int k, int[] b) {
        for(int num: b) {
            if(num % k != 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i] > max)
                max = a[a_i];
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < min)
                min = b[b_i];
        }
        
        if(min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        
        int count = 0;
        for(int k = min; k <= max; k++) {
            if(isSetFactor(k, a) && isFactorOfSet(k, b))
                count++;
        }
        System.out.println(count);
    }
}
