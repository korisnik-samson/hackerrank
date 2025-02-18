package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    @NotNull
    public static List<Integer> getPrimaryDiag(@NotNull List<List<Integer>> matrix) {
        List<Integer> primaryDiagonal = new ArrayList<>();

        for (int i = 0; i < matrix.get(0).size(); i++)
            primaryDiagonal.add(i, matrix.get(i).get(i));

        return primaryDiagonal;
    }

    @NotNull public static List<Integer> getSecondaryDiag(@NotNull List<List<Integer>> matrix) {
        List<Integer> secondaryDiagonal = new ArrayList<>();
        int rowLength = matrix.get(0).size();

        for (int i = 0; i < matrix.get(0).size(); i++)
            secondaryDiagonal.add(i, matrix.get(i).get(rowLength - i - 1));

        return secondaryDiagonal;
    }
    
    public static int diagonalDifference(@NotNull List<List<Integer>> matrix) {
        List<Integer> diag1 = getPrimaryDiag(matrix);
        List<Integer> diag2 = getSecondaryDiag(matrix);

        int sum1 = 0;
        int sum2 = 0;

        for (int element : diag1) sum1 += element;
        
        for (int element : diag2) sum2 += element;

        return Math.abs(sum1 - sum2);
    }
}
