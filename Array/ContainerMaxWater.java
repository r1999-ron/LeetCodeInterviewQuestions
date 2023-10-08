package LeetCodeInterviewQuestions.Array;

public class ContainerMaxWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (left < right) {
            final int minHeight = Math.min(height[left], height[right]);
            res = Math.max(res, minHeight * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--; // moving right pointer towards left
            }

        }
        return res;
    }
}
