package school.mjc.stage0.conditions.finalTask;

import java.time.YearMonth;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            YearMonth yearMonth = YearMonth.of(year, month);
            System.out.println(yearMonth.lengthOfMonth());
        }
    }
}
