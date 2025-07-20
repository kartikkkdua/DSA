import java.util.*;

public class shortestPath {
    //O(n)
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float distance = shortestPath(path);
        System.out.println("Shortest path distance: " + distance);
    }
}
