package Array;

import java.util.*;

public class TopFrequentElement {

    public static void main(String[] args){
        int[] input = new int[]{2,2,3,4,4,4,5,6};
        int k = 2;
        int[] result  = topKFrequent(input , k);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    // first store the count in hashmap
    // store index as freq and key in the [[]]

    public static int[] topKFrequentOptimal(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        int[] result = new int[k];

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            bucket.add(i, new ArrayList<>());
        }
        for(int key: map.keySet()){
            int freq = map.get(key);
            bucket.get(freq).add(key);
        }
        int idx = 0;
        for(int i=nums.length;i>=0;i--){
            if(bucket.get(i).isEmpty()){
                continue;
            }
            for(int n: bucket.get(i)){
                if(idx == k){
                    break;
                }
                result[idx] = n;
                idx++;
            }
        }
        return result;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        // Count of elements
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // Sort the hashmap by value
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (o1,o2) -> o2.getValue()-o1.getValue());

        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }

        return result;

    }
}
