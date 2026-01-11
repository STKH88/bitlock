package ru.netology.homework.tax;

public class UsnIncomeMinusExpenses {
    public static int IncMinExpCalc(int income, int expenses) {
        int taxAmount = (income - expenses)*15/100;
        if (taxAmount >= 0) {
            return taxAmount;
        } else {
            return 0;
        }
    }
}
