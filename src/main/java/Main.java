import ru.netology.stats.StatsService;
import java. util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of months for which you want to create a report: ");
        int count = in.nextInt();
        long[] sales = new long[count];

        for (int i = 0; i < count; i++) {
            int month = i + 1;
            System.out.print("Enter sales for the " + month + " month: ");
            sales[i] = in.nextLong();
        }
        in.close();

        StatsService service = new StatsService();
        System.out.print("The sum of all sales: ");
        System.out.println(service.sumSales(sales));

        System.out.print("Average sales per month: ");
        System.out.println(service.AVGSales(sales));

        System.out.print("Number of the month of peak in sales: ");
        System.out.println(service.maxSales(sales));

        System.out.print("Number of the month of minimum in sales: ");
        System.out.println(service.minSales(sales));

        System.out.print("Count of months with below average sales: ");
        System.out.println(service.belowAVGSales(sales));

        System.out.print("Count of months with above average sales: ");
        System.out.println(service.aboveAVGSales(sales));

    }
}
