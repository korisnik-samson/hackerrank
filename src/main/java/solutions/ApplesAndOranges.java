package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ApplesAndOranges {
    
    public static void print(@NotNull List<Integer> arr) {
        for (Integer integer : arr) System.out.println(integer);
    }
    
    public static @NotNull List<Integer> countApplesAndOranges(int s, int t, int a, int b, @NotNull List<Integer> apples, List<Integer> oranges) {
        List<Integer> result = new ArrayList<>();
        int appleCount = 0, orangeCount = 0;

        for (Integer apple : apples) 
            if (apple + a >= s && apple + a <= t) appleCount++;

        for (Integer orange : oranges) 
            if (orange + b <= t && orange + b >= s) orangeCount++;

        result.add(appleCount);
        result.add(orangeCount);
        
        return result;
    }

}
