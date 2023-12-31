package Stack;

import java.util.Stack;

public class DailyTemperatures {
    // 72 73 69
    public static void main(String[] args){
        DailyTemperatures dT = new DailyTemperatures();
        int[] result = dT.dailyTemperatuesWithStack(new int[]{73,74,75,71,69,72,76,73});
        for(int r: result){
            System.out.print(r+" ");
        }

    }

    public int[] dailyTemperatuesWithStack(int[] temperatures){
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int insertIdx = stack.pop();
                result[insertIdx] = i-insertIdx;
            }
            stack.push(i);
        }
        return result;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
}
