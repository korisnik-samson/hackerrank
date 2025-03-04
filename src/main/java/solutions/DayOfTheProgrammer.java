package solutions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DayOfTheProgrammer {
    
    @Contract(pure = true)
    public static @NotNull String dayOfTheProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        
        if (year < 1918) {
            if (year % 4 == 0) return "12.09." + year;
            
            else return "13.09." + year;
        }
        
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return "12.09." + year;
        
        return "13.09." + year;
    }

}
