package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
//         Search in array if the current element exist, return true if exist else false -> Time O(n^2) Space O(1)
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;

         // HashSet Solution -> Time O(n) Space O(n)

        HashSet<Integer> result = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(result.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}
