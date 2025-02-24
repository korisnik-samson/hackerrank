package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BetweenTwoSets {
    
    public static int getTotalX(@NotNull List<Integer> a, @NotNull List<Integer> b) {
        int count = 0;
        
        for (int i = a.get(a.size() - 1); i <= b.get(0); i++) {
            boolean isFactor = true;

            for (Integer integer : a) {
                if (i % integer != 0) {
                    isFactor = false;
                    break;
                }
            }
            
            if (!isFactor) continue;

            for (Integer integer : b) {
                if (integer % i != 0) {
                    isFactor = false;
                    break;
                }
            }
            
            if (isFactor) count++;
        }
        
        return count;
    }
    
}
