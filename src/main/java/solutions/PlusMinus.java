package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(@NotNull List<Integer> arr) {
        // Write your code here
        int zeroCount;
        List<Integer> positive, negative, zero = null;
        float positiveRatio, negativeRatio;
        
        //sort the array
        Collections.sort(arr);
        
        int size = arr.size();
        
        // get the position of zero
        int zeroPos = getZero(arr);
        
        // obtain the zero count in cases of multiple zeros
        zeroCount = getZeroCount(arr);
        
        // check if all numbers are negative or positive
        if (isAllNegativeOrNegative(arr)) {
            System.out.println(String.format("%.6f", 0.0) + "\n" + String.format("%.6f", 1.0) + "\n" + String.format("%.6f", 0.0));

        } else if (isAllPositiveOrNegative(arr)) {
            System.out.println(String.format("%.6f", 1.0) + "\n" + String.format("%.6f", 0.0) + "\n" + String.format("%.6f", 0.0));
            
        } else {
            if (getZeroCount(arr) == 0) {
                negative = arr.subList(0, getPosMarker(arr));
                positive = arr.subList(getPosMarker(arr), size);

            } else {
                negative = arr.subList(0, zeroPos);
                zero = arr.subList(zeroPos, (zeroCount + zeroPos));
                positive = arr.subList((zeroCount + zeroPos), size);
            }
            
            positiveRatio = (float) positive.size() / size;
            negativeRatio = (float) negative.size() / size;

            float zeroRatio = 0;
            
            if (zero != null) zeroRatio = (float) zero.size() / size;

            System.out.println(String.format("%.6f", positiveRatio) + "\n" + String.format("%.6f", negativeRatio) + "\n" + String.format("%.6f", zeroRatio));
        }
    }

    private static int getZeroCount(@NotNull List<Integer> arr) {
        int zeroCount = 0;

        for (Integer integer : arr) if (integer == 0) zeroCount++;
        
        return zeroCount;
    }

    private static int getZero(@NotNull List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) if (arr.get(i) == 0) return i;

        return -1;
    }
    
    private static int getPosMarker(@NotNull List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) if (arr.get(i) > 0) return i;
        
        return -1;
    }
    
    // check for all positive numbers
    private static boolean isAllPositiveOrNegative(@NotNull List<Integer> arr) {
        int positiveCount = 0;

        for (Integer integer : arr) if (integer > 0) positiveCount++;
        
        return positiveCount == arr.size();
    }
    
    private static boolean isAllNegativeOrNegative(@NotNull List<Integer> arr) {
        int negativeCount = 0;

        for (Integer integer : arr) if (integer < 0) negativeCount++;
        
        return negativeCount == arr.size();
    }
}
