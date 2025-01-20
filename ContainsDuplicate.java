import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,4,8,5}));
    }

    public static boolean containsDuplicate(int[] nums) {
        // 1 2 1 3
        HashSet<Integer> result =  new HashSet<>();
        for(int num: nums){
            if(result.contains(num)){
                return true;
            }
            result.add(num);
        }
        return false;
    }
}
