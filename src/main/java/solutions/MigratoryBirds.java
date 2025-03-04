package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
    
    public static int migratoryBirds(@NotNull List<Integer> list) {
        HashMap<Integer, Integer> birdCount = new HashMap<>();
        
        for (Integer bird : list) {
            if (birdCount.containsKey(bird)) birdCount.put(bird, birdCount.get(bird) + 1);
            
            else birdCount.put(bird, 1);
        }
        
        int maxBirdCount = Collections.max(birdCount.values());
        
        for (Integer bird : birdCount.keySet()) 
            if (birdCount.get(bird) == maxBirdCount) return bird;
        
        
        return 0;
    }

}
