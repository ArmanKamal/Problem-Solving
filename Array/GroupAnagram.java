package Array;
import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* Time - O(n)logn  Space - O(1) */
        HashMap<String, List<String>> map= new HashMap();
        for(String s : strs){
            char[] sorted_string = s.toCharArray();
            Arrays.sort(sorted_string);
            String newString = new String(sorted_string);
            if(!map.containsKey(newString)){
                map.put(newString, new ArrayList<>());
            }
            map.get(newString).add(s);
        }
        return new ArrayList(map.values());
    }
}
