package ru.netology.stats;


public class StatsService {

    public long sumSales(long[] sales) {
        long result = 0;

        for (int i =0; i < sales.length; i++) {
            result += sales[i];
        }
        return result;
    }


    public long AVGSales(long[] sales) {
        long result;
        result = sumSales(sales) / sales.length;
        return result;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int belowAVGSales(long[] sales) {
        long midSale = AVGSales(sales);
        int countMonth = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales[i] < midSale) {
                countMonth += 1;
            }
        }
        return countMonth;
    }


    public int aboveAVGSales(long[] sales) {
        long midSale = AVGSales(sales);
        int countMonth = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales[i] > midSale) {
                countMonth += 1;
            }
        }
        return countMonth;
    }
}
