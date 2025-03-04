package solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class CountingValleys {
    
    @Contract(pure = true)
    public static int countingValleys(int steps, @NotNull String path) {
        int level = 0;
        int valleys = 0;
        
        for (char c : path.toCharArray()) {
            if (c == 'U') level++;
            else level--;
            
            if (level == 0 && c == 'U') valleys++;
        }
        
        return valleys;
    }
    
}
