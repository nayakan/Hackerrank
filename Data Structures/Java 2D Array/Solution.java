
public class Solution {
    static final int SIZE = 6;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[SIZE][SIZE];
        for(int i=0; i < SIZE; i++){
            for(int j=0; j < SIZE; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int maxHourglassSum = Integer.MIN_VALUE;
        for(int i = 0; i < SIZE - 2; i++) {
            for(int j = 0; j < SIZE - 2; j++) {
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + 
                    arr[i + 2][j] + arr[i + 2][j + 1]+ arr[i + 2][j + 2];
                maxHourglassSum = (int)Math.max(maxHourglassSum, hourglassSum);
            }
        }
        System.out.println(maxHourglassSum);

    }
}
