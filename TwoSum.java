import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //[2,7,11,15], target = 9
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int y = target-nums[i];
            if(result.containsKey(y)){
                return new int[]{i,result.get(nums[i])};
            }
            else{
                result.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
