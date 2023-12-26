package com.rizvankarimov.spring.mvc;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private String department;
    private String carBrand;
    private Map<String,String> carBrands;





    public Employee(String name, String surname, String salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = Double.parseDouble(salary);
        this.department = department;
    }

    public Employee() {
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "Mercedes-Benz");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    // getters
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public Map<String, String> getCarBrands() {
        return carBrands;
    }
    public String getCarBrand() {
        return carBrand;
    }




    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }
}
