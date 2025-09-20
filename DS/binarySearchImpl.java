public class binarySearchImpl {
    public static void main(String[] args) {
        int arr[] = new int[]{7,15,25,31,71,87,91};
        int target = 31;
        binarySearchRes(arr,target);
    }

    public static void binarySearchRes(int arr[],int target){
        int len = arr.length;
        int left = 0;
        int right = len-1;
        int ptr = -1;
        while(left<=right){
            int mid = (right+left)/2;
            if(arr[mid]==target) {
                System.out.println("Found at the index "+mid);
                ptr = 1;
                break;
            }
            else if(arr[mid]>target) right = mid-1;
            else left = mid+1;
        }

        if(ptr == -1) System.out.println("Not Found");
    }
    
}