package Algorithm;
//maximum sum subarray

public class kadaneImpl {
    public static int findMaxSum(int arr[]){
        int curSum = arr[0];
        int maxi = arr[0];

        for(int i=1; i<arr.length; i++){
            curSum = Math.max(arr[i], arr[i]+curSum);
            maxi = Math.max(maxi, curSum);
        }
        return maxi;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSum(arr);
        System.out.println(maxSum);
    }
}
