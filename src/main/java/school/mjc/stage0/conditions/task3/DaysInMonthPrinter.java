package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            int[] daysInMonth =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int days = daysInMonth[month - 1];
            System.out.println( days);
        } else {
            System.out.println("wrong number!");
        }
    }
}

