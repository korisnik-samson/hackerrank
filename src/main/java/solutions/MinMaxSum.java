package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(@NotNull List<Integer> arr) {
        // Write your code here
        long min = 0;
        long max = 0;
        long sum = 0;
        
        for (int i = 0; i < arr.size(); i++) sum += arr.get(i);
        
        min = sum - arr.get(0);
        max = sum - arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            long temp = sum - arr.get(i);
            
            if (temp < min) min = temp;
            
            if (temp > max) max = temp;
        }
        
        System.out.println(min + " " + max);
    }
    
}
