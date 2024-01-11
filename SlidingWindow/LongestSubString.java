package SlidingWindow;

import java.util.HashSet;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        //abcabcba
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(),max);
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}