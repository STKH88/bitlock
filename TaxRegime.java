import java.util.Scanner;

import ru.netology.homework.tax.UsnIncomeMinusExpenses;
import ru.netology.homework.tax.*;

public class TaxRegime {
    public static String selectOptions =
            "Выберите операцию и введите её номер:\n" +
            "1. Добавить новый доход\n" +
            "2. Добавить новый расход\n" +
            "3. Выбрать систему налогообложения";
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalIncome = 0;
        int totalExpenses = 0;
        String inputData;
        while (true) {
            System.out.println(selectOptions);
            inputData = scanner.nextLine();
            if (inputData.equals("end")) {
                break;
            }
            int inputNum = Integer.parseInt(inputData);
            switch (inputNum) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    int income = Integer.parseInt(scanner.nextLine());
                    /*Некорректная обработка ввода чисел после nextLine() После scanner.nextLine() вы вызываете
                    scanner.nextInt(), но nextInt() не считывает символ перевода строки. Это
                    может привести к «пропуску» следующего ввода.*/
                    totalIncome = totalIncome + income;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    int expenses = Integer.parseInt(scanner.nextLine());
                    totalExpenses = totalExpenses + expenses;
                    break;
                case 3:
                    int taxNetIncomeAmount = UsnIncomeMinusExpenses.IncMinExpCalc(totalIncome, totalExpenses);
                    int taxGrossIncomeAmount = UsnIncome.IncomeCalc(totalIncome);
                    if (taxGrossIncomeAmount == taxNetIncomeAmount) {
                        System.out.println("Можете выбрать любую систему налогообложения");
                    } else if (taxGrossIncomeAmount > taxNetIncomeAmount) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы - налог 15% от разницы доходов и расходов");
                        System.out.println("Ваш налог составит: " + taxNetIncomeAmount + " рублей");
                        System.out.println("Налог на другой системе: " + taxGrossIncomeAmount + " рублей");
                        System.out.println("Экономия: " + Math.abs(taxGrossIncomeAmount - taxNetIncomeAmount) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы - налог 6% от доходов");
                        System.out.println("Ваш налог составит: " + taxGrossIncomeAmount + " рублей");
                        System.out.println("Налог на другой системе: " + taxNetIncomeAmount + " рублей");
                        System.out.println("Экономия: " + Math.abs(taxGrossIncomeAmount - taxNetIncomeAmount) + " рублей");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
