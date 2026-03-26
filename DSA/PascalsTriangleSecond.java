import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleSecond {
    public static void main(String[] args) {

    }

    public static List<Integer> getRow(int row) {
        List<Integer> list = new ArrayList<>();
        long start = 1;
        list.add((int) start); // Add 1 to the list (the first element in any row is always 1)

        for (int i = 0; i < row; i++) {
            start *= (row - i); // Update start by multiplying it with (5 - i)
            start = (start / (i + 1)); // Update start by dividing it by (i + 1) and cast to int
            list.add((int) start); // Add the current value of start to the list
        }
        return list;
    }

    // public static List<List<Integer>> generate(int numRows) {
    // List<List<Integer>> res = new ArrayList<>();
    // List<Integer> prev = new ArrayList<>();
    // List<Integer> row = new ArrayList<>();
    // for (int i = 0; i < numRows; ++i) {
    // row = new ArrayList<>();
    // for (int j = 0; j <= i; ++j) {
    // if (j == 0 || j == i) {
    // row.add(1);
    // } else {
    // row.add(prev.get(j - 1) + prev.get(j));
    // }
    // }

    // prev = row;
    // res.add(row);
    // }
    // return res;
    // }

    // public static List<Integer> getRow(int rowIndex) {
    // List<Integer> res = new ArrayList<>();
    // int rowNumber = rowIndex + 1;
    // for (int i = 0; i < rowNumber; i++) {
    // int numerator = factorial(rowNumber - 1);
    // int denomenator = factorial(rowNumber - 1 - i) * factorial(i);

    // res.add(numerator / denomenator);
    // }
    // return res;
    // }

    // public static int factorial(int number) {
    // int f = 1, j = 1;
    // while (j <= number) {
    // f = f * j;
    // j++;
    // }
    // return f;
    // }
}
