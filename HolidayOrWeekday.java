import java.util.Calendar;

public class HolidayOrWeekday {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        System.out.println("Current day (number): " + (now.get(Calendar.DAY_OF_WEEK)));
        int dayToday = now.get(Calendar.DAY_OF_WEEK);
        switch (dayToday) {
            case 1:
                System.out.println("Today holiday - Saturday.");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Today Week day.");
                break;
            case 7:
                System.out.println("Today Holiday: Sunday.");
                break;
        }

    }
}
