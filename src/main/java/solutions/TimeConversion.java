package solutions;

import org.jetbrains.annotations.NotNull;

public class TimeConversion {
    
    public static @NotNull String timeConversion(@NotNull String s) {
        String[] time = s.split(":");
        String hour = time[0];
        String minute = time[1];
        String second = time[2].substring(0, 2);
        String period = time[2].substring(2, 4);
        
        if (period.equals("AM")) {
            if (hour.equals("12")) hour = "00";
            
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h += 12;
                
                hour = String.valueOf(h);
            }
        }
        
        return hour + ":" + minute + ":" + second;
    }
    
}
