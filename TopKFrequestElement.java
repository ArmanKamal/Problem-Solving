import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequestElement {
    public int[] topKFrequent(int[] nums, int k) {
    // 1 1 1 2 2 3
        // [ 0.  1. 2. 3
        // [ [] [3] [2] [1,2]
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

        for(int i=bucket.size()-1;i>=0;i--){
            if(bucket.get(i).isEmpty()) continue;

            for(int j: bucket.get(i)){
                if(idx == k) break;
                result[idx] = j;
                idx++;
            }
        }
        return result;
    }
}
