package Array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        // x+y = target
        // y = target-x; store x

        // Time O(n) Space O(n)
        HashMap<Integer,Integer> result = new HashMap();
        for(int i=0;i<nums.length;i++){
            int y = target-nums[i];
            if(!result.containsKey(y)){
                result.put(nums[i],i);
            }
            else{
                return new int[]{i,result.get(y)};
            }
        }
        return new int[]{};
    }
}
