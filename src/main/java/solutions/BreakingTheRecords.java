package solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BreakingTheRecords {
    
    @Contract("_ -> param1")
    public static @NotNull List<Integer> breakingRecords(@NotNull List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
                
            } else if (scores.get(i) > max) {
                max = scores.get(i);
                maxCount++;
            }
        }
        
        scores.clear();
        scores.add(maxCount);
        scores.add(minCount);
        
        return scores;
    }
    
}
