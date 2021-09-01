import java.util.Calendar;

public class mainOffer {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(calendar.getTimeInMillis());
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println(calendar.getTimeInMillis());
        calendar.add(Calendar.DAY_OF_YEAR, -2);
        System.out.println(calendar.getTimeInMillis());
    }
}
