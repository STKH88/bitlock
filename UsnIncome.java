package ru.netology.homework.tax;

public class UsnIncome {
    public static int IncomeCalc (int income) {
        int taxAmount = income * 6 / 100;
        if (taxAmount >= 0) {
            return taxAmount;
        } else {
            return 0;
        }
    }
}
