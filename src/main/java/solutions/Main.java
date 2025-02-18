package solutions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);

        List<Integer> diag1 = Solution.getPrimaryDiag(arr);
        List<Integer> diag2 = Solution.getSecondaryDiag(arr);

        int sum1 = 0;
        int sum2 = 0;

        for (int element : diag1) sum1 += element;

        for (int element : diag2) sum2 += element;

        System.out.println(Math.abs(sum1 - sum2));
    }

}
