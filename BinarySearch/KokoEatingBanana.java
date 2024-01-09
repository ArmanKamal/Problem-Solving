package BinarySearch;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args){
        int[] piles = new int[]{3,6,7,11};
        KokoEatingBanana kb = new KokoEatingBanana();
        System.out.println(kb.minEatingSpeed(piles,8));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;
        while(true){
            int total = 0;
            for(int pile: piles){
                if(total>h){
                    break;
                }
                total += Math.ceil((double) pile/speed);
            }
            if(total<=h) return speed;
            else speed++;
        }
    }
}
