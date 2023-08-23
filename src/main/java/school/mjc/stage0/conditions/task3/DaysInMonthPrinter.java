package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            int[] daysInMonth = {
                    31, // January
                    28, // February
                    31, // March
                    30, // April
                    31, // May
                    30, // June
                    31, // July
                    31, // August
                    30, // September
                    31, // October
                    30, // November
                    31  // December
            };

            int days = daysInMonth[month - 1];
            System.out.println(+ month  + days);
        } else {
            System.out.println("wrong number!");
        }
    }
}

