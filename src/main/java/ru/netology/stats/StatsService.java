package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            sumMonth = sumMonth + sale;
        }
        return sumMonth;
    }

    public double averageSales(int[] sales) {
        double averageSum;
        double sumMonth;

        sumMonth = sumSales(sales);
        averageSum = sumMonth / sales.length;

        return averageSum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessAverageSales(int[] sales) {
        int lessAverageMonth = 0;
        double averageSum = averageSales(sales);
        for (int sale : sales) {
            if (sale <= averageSum) {
                lessAverageMonth++;
            }
        }
        return lessAverageMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = averageSales(sales);
        for (int sale : sales) {
            if (sale >= averageSum) {
                aboveAverageMonth++;
            }
        }
        return aboveAverageMonth;
    }
}
