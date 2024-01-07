package Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        CarNode[] carNodes = new CarNode[position.length];
        for (int i = 0; i < position.length; i++) {
            carNodes[i] = new CarNode(position[i], speed[i]);
        }
        Arrays.sort(carNodes, (a, b) -> b.position - a.position);
        int fleets = 0;
        double lastTime = 0;
        for (int i = 0; i < carNodes.length; i++) {
            double newTime = (double) (target - carNodes[i].position) / (double) carNodes[i].speed;
            if (newTime > lastTime) {
                fleets++;
                lastTime = newTime;
            }

        }
        return fleets;
    }

    public class CarNode {
        int position;
        int speed;

        CarNode(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }

    }
}
