package PracticeWork;

import java.util.ArrayList;

class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double calculateEarnings() {
        return 0.0;  // Базовая реализация, переопределится в производных классах
    }

    public void printInfo() {
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName);
    }
}

class Boss extends Employee {
    private double weeklySalary;

    public Boss(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculateEarnings() {
        return weeklySalary;
    }
}

class HourlyWorker extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyWorker(String firstName, String lastName, double hourlyRate, int hoursWorked) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateEarnings() {
        return hourlyRate * hoursWorked;
    }
}

class PieceWorker extends Employee {
    private int piecesProduced;
    private double pieceRate;

    public PieceWorker(String firstName, String lastName, int piecesProduced, double pieceRate) {
        super(firstName, lastName);
        this.piecesProduced = piecesProduced;
        this.pieceRate = pieceRate;
    }

    @Override
    public double calculateEarnings() {
        return piecesProduced * pieceRate;
    }
}

class CommissionWorker extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double sales;

    public CommissionWorker(String firstName, String lastName, double baseSalary, double commissionRate, double sales) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    @Override
    public double calculateEarnings() {
        return baseSalary + (commissionRate * sales);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Boss("Иван", "Иванов", 1000.0));
        employees.add(new HourlyWorker("Петр", "Петров", 15.0, 160));
        employees.add(new PieceWorker("Анна", "Андреева", 300, 2.5));
        employees.add(new CommissionWorker("Мария", "Сидорова", 800.0, 0.1, 10000.0));

        double totalEarnings = 0.0;

        for (Employee employee : employees) {
            employee.printInfo();
            double earnings = employee.calculateEarnings();
            System.out.println("Заработная плата: $" + earnings);
            totalEarnings += earnings;
        }

        System.out.println("Общая сумма для выплаты: $" + totalEarnings);
    }
}