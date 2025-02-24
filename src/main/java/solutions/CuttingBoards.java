package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CuttingBoards {
    
    public static int boardCutting(@NotNull List<Integer> cost_y, @NotNull List<Integer> cost_x) {
        int mod = 1000000007;
        
        int m = cost_y.size();
        int n = cost_x.size();
        
        int horizontalCuts = 1;
        int verticalCuts = 1;
        int totalCost = 0;
        
        cost_y.sort((a, b) -> b - a);
        cost_x.sort((a, b) -> b - a);
        
        int i = 0;
        int j = 0;
        
        while (i < m && j < n) {
            if (cost_y.get(i) > cost_x.get(j)) {
                totalCost += cost_y.get(i) * verticalCuts;
                horizontalCuts++;
                
                i++;
                
            } else {
                totalCost += cost_x.get(j) * horizontalCuts;
                verticalCuts++;
                
                j++;
            }
        }
        
        while (i < m) {
            totalCost += cost_y.get(i) * verticalCuts;
            
            i++;
        }
        
        while (j < n) {
            totalCost += cost_x.get(j) * horizontalCuts;
            
            j++;
        }
        
        return totalCost % mod;
    }
    
}
