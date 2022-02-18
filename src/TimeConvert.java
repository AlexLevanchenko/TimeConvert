import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] Strings) {

        final int minInHour = 60;
        final int hourInDay = 24;
        final int daysInYear = 365;
        double minutesInYear = minInHour * hourInDay * daysInYear;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        double min = input.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) (min / minInHour / hourInDay) % daysInYear;
        System.out.println((int) min + " минут это примерно " + years + " лет и " + days + " дней");
    }
}
