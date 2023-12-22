package Array;
import java.util.*;
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        /* Time - O(n)logn  Space - O(1) */
//        HashMap<String, List<String>> map= new HashMap();
//        for(String s : strs){
//            char[] sorted_string = s.toCharArray();
//            Arrays.sort(sorted_string);
//            String newString = new String(sorted_string);
//            if(!map.containsKey(newString)){
//                map.put(newString, new ArrayList<>());
//            }
//            map.get(newString).add(s);
//        }
//        return new ArrayList(map.values());

        HashMap<String, List<String>> mappedResult = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];
            for(Character c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]);
                sb.append("#");
            }
            String finalString = sb.toString();
            if(!mappedResult.containsKey(finalString)){
                mappedResult.put(finalString, new ArrayList<>());
            }
            mappedResult.get(finalString).add(s);
        }
        return new ArrayList<>(mappedResult.values());


    }
}
