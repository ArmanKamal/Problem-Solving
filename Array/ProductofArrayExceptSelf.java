package Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        int[] result = productOfArray(nums);
        for(int num: result){
            System.out.println(num);
        }
    }

    public static int[] productOfArrayWithExtraSpace(int[] nums){
        int[] prefix = new int[nums.length];
            // create suffix
        int[] suffix = new int[nums.length];
        // create output array
        int[] output = new int[nums.length];

        int product = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i] = product;
            product = nums[i]*product;
        }
         product = 1;
        for(int i=nums.length-1;i>=0;i--){
            suffix[i] = product;
            product = nums[i]*product;
        }
        for(int i=0;i<nums.length;i++){
            output[i] = prefix[i]*suffix[i];
        }
        return output;
    }
    public static int[] productOfArray(int[] nums){

        int[] output = new int[nums.length];
        Arrays.fill(output,1);
        int product = 1;
        for(int i=0;i<nums.length;i++){
            output[i] = output[i] * product;
            product = product * nums[i];
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            output[i] = output[i] * product;
            product = product * nums[i];
        }
        return output;
    }

}
