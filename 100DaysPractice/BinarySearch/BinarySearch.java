
public class BinarySearch {
    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{-1,0,3,5,9,12},9));
    }
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(target<nums[mid]){
                right=mid-1;
            }
            else if(target> nums[mid]){
                left = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
