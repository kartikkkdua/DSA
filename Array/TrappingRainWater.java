public class TrappingRainWater {

    public static int trapRainWater(int height[]) {
        int n = height.length;
        if (n == 0) return 0;

        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trapwater += waterlevel - height[i];
        }

        return trapwater;
    }

    public static void main(String args[]) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Water Trapped: " + trapRainWater(height));
    }
}
