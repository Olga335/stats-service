package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    private final long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMaxMonth() {
        StatsService service = new StatsService();
        int expected = 8; // последний месяц с максимумом 20
        int actual = service.maxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindLastMinMonth() {
        StatsService service = new StatsService();
        int expected = 9; // месяц с минимумом 7
        int actual = service.minMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}