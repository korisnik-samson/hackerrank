package solutions;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SalesByMatch {
    
    public static int sockMerchant(@NotNull List<Integer> list) {
        List<Integer> socks = new ArrayList<>(101);
        
        for (Integer sock : list) {
            if (socks.size() < sock + 1) 
                for (int i = socks.size(); i < sock + 1; i++) socks.add(0);
            
            socks.set(sock, socks.get(sock) + 1);
        }
        
        int pairs = 0;
        
        for (int sock : socks) pairs += sock / 2;
        
        return pairs;
    }

}
