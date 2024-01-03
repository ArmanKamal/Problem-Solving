package TwoPointer;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSumWithHashSet(nums);
        List<List<Integer>> result2 = threeSum.threeSumWithTwoPointer(nums);
        System.out.println("Result 1: with HashSet Approach");
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
        System.out.println("Result 2: with Two Pointer Approach");
        for(int i=0;i<result2.size();i++){
            System.out.println(result2.get(i));
        }
    }

    /* Approach 1 - Use HashSet Without sorting the array */
    public List<List<Integer>> threeSumWithHashSet(int[] nums){
        HashSet<List<Integer>> hashResult = new HashSet<>();
        HashSet<Integer> set;
        for(int i=0;i<nums.length;i++){
            set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -nums[i]-nums[j];
                if(set.contains(k)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                    Collections.sort(temp);
                    hashResult.add(temp);
                }
                else{
                    set.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(hashResult);
    }

    /* Approach 2 - Use Two Pointer */
    public List<List<Integer>> threeSumWithTwoPointer(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right]));
                    result.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;
                }
            }
        }
        return result;
    }
}
