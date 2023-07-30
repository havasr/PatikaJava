import java.math.BigDecimal;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0.0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours >= 40) {
            return (this.workHours-40) * 30.0;
        } else return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        if ((currentYear - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else if ((currentYear - this.hireYear)>9 && (currentYear - this.hireYear)<20) {
            return this.salary * 0.1;
        } else return this.salary * 0.15;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary raise: " + raiseSalary() +
                "\nSalary bonus and tax: " + (this.salary-tax()+bonus()) +
                "\nFinal Salary: " + (this.salary-tax()+bonus()+raiseSalary());
    }
}

