package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args){
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(2));
    }
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList();
        backTrack(output_arr,"",n, 0,0);
        return output_arr;
    }
    void backTrack(List<String> output_arr,String current_input, int max,int open, int close){
        // base case
        if(current_input.length() == max*2){
            output_arr.add(current_input);
            return;
        }
        if(open<max){
            backTrack(output_arr, current_input+"(", max, open+1, close);
        }
        if(close<open){
            backTrack(output_arr, current_input+")", max, open, close+1);
        }
    }
}
