package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        HolidayService service = new HolidayService();
        int income = 100_000;
        int expenses = 60_000;
        int amount = 150_000;
        int months = service.calculate(income, expenses, amount);
        System.out.println("Months " + months);
    }
}
