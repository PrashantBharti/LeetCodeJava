import lc_11_container_with_most_water.Solution;

class Application {
    public static void main(String[] args) {
        final Solution solution = new Solution();

        int[] heights = {1,2,3,4};
        int area = solution.maxArea(heights);
        System.out.println(area);
    }
}
