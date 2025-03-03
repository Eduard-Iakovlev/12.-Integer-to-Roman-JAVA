import visualization.Visualization;

public class Main {
    public static void main(String[] args) {
        int example = 0;
        int num;
        String expected;

        Visualization visualization = new Visualization();

        example++;
        num = 3749;
        expected = "MMMDCCXLIX";
        visualization.setVizualization(example, num, expected);
        visualization.printVizualization();

        example++;
        num = 58;
        expected = "LVIII";
        visualization.setVizualization(example, num, expected);
        visualization.printVizualization();

        example++;
        num = 1994;
        expected = "MCMXCIV";
        visualization.setVizualization(example, num, expected);
        visualization.printVizualization();

    }
}