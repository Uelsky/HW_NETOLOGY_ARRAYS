package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void AVGSalesTest() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.AVGSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void belowAVGSalesTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.belowAVGSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void aboveAVGSalesTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.aboveAVGSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
