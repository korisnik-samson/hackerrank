package solutions;

import utils.CustomTest;

public class Main {

    public static void main(String[] args) {
       /* List<List<Integer>> arr = new ArrayList<>();

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

        List<Integer> diag1 = DiagonalDifference.getPrimaryDiag(arr);
        List<Integer> diag2 = DiagonalDifference.getSecondaryDiag(arr);

        int sum1 = 0;
        int sum2 = 0;

        for (int element : diag1) sum1 += element;

        for (int element : diag2) sum2 += element;

        System.out.println(Math.abs(sum1 - sum2));*/
        
        /*List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        
        PlusMinus.plusMinus(arr);
        
        // 1 2 3 -1 -2 -3 0 0
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(-1);
        arr1.add(-2);
        arr1.add(-3);
        arr1.add(0);
        arr1.add(0);*/

        //PlusMinus.plusMinus(arr1);
        
        PlusMinus.plusMinus(CustomTest.getArray());
    }

}
