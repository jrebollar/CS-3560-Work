package PartFive;

public class Employee {
    private String name;
    protected int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hours * 20;
    }
}

