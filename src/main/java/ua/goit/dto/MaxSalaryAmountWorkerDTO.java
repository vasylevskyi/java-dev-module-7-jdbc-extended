package ua.goit.dto;

import java.math.BigDecimal;

public class MaxSalaryAmountWorkerDTO {
    private String name;
    private BigDecimal salary;

    public MaxSalaryAmountWorkerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MaxSalaryAmountWorkerDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
