import lc_6_zigzag_conversion.Solution;

class Application {
    public static void main(String[] args) {
        final String input = "PAYPALISHIRING";
        final Integer numRows = 3;

        final Solution solution = new Solution();

        final String output = solution.convert(input, numRows);
        System.out.println(output);
    }
}
