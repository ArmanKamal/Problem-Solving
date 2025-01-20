import java.util.HashMap;
import java.util.Objects;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // SOLUTION - 1
//        if(s.length() != t.length()){
//            return false;
//        }
//        HashMap<Character, Integer> count1 = new HashMap<>();
//        HashMap<Character, Integer> count2 = new HashMap<>();
//
//       for(Character c: s.toCharArray()){
//           count1.put(c, count1.getOrDefault(c,0)+1);
//       }
//       for(Character c: t.toCharArray()){
//            count2.put(c, count2.getOrDefault(c,0)+1);
//       }
//
//       for(Character c: s.toCharArray()){
//           if(!Objects.equals(count1.get(c), count2.get(c))){
//               return false;
//           }
//       }
//       return true;

       //SOLUTION - 2
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c: count){
            if(c>0) return false;
        }
        return true;
    }
}
