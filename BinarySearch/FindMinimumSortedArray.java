package BinarySearch;

public class FindMinimumSortedArray {
    public static void main(String[] args){
        int[] nums = new int[]{4,5,1,2,3};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        // 3 4 5 6 1 2
        // 7 0 1 2 3
        int left = 0;
        int right = nums.length-1;
        int answer = Integer.MAX_VALUE;
        int mid;
        while(left<=right){
            if(nums[left]<nums[right]) {
                return Math.min(answer,nums[left]);
            }
            mid = left+(right-left)/2;
            answer = Math.min(nums[mid],answer);
            if(nums[mid]>=nums[left]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return answer;
    }
}
