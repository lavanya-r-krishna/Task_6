package com.task6;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to get the annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Method to raise salary by a specified percentage
    public int raiseSalary(int percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        }
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee(1, "lavanya", "r", 50000);
        System.out.println(emp); // Before raise
        emp.raiseSalary(10); // Raise salary by 10%
        System.out.println(emp); // After raise
    }
}


