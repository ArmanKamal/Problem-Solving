package Stack;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed){
        CarNode[] carNodes = new CarNode[position.length];
        for(int i=0;i<position.length;i++){
            carNodes[i].position = position[i];
            carNodes[i].speed = speed[i];
        }
        Arrays.sort(carNodes, (a,b) -> b.position-a.position);
        int fleets = 0;
        int lastTime = target-carNodes[0].position/carNodes[0].speed;
        for(int i=1;i<carNodes.length;i++){
            int newTime = target-carNodes[i].position/carNodes[i].speed;
            if(newTime>lastTime){
                fleets++;
                lastTime = newTime;
            }
        }
        return fleets;
    }

     public class CarNode{
        int position;
        int speed;
        CarNode(int position, int speed){
            this.position = position;
            this.speed = speed;
        }
    }
}
