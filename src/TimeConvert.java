import java.util.Scanner;
public class TimeConvert {

    public static void main(String[] Strings) {


        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество минут: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " минут это примерно " + years + " лет и " + days + " дней");
    }
}
