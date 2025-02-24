package solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NumberLineJumps {
    
    @Contract(pure = true)
    public static @NotNull String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) return "NO";
        
        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) > 0) return "YES";
        
        return "NO";
    }
    
}
