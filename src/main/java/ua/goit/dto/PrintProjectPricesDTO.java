package ua.goit.dto;

import java.math.BigDecimal;

public class PrintProjectPricesDTO {
    private String name;
    private int monthCount;
    private BigDecimal totalMonthSalary;
    private BigDecimal projectPrice;

    public PrintProjectPricesDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public void setTotalMonthSalary(BigDecimal totalMonthSalary) {
        this.totalMonthSalary = totalMonthSalary;
    }

    public void setProjectPrice(BigDecimal projectPrice) {
        this.projectPrice = projectPrice;
    }

    @Override
    public String toString() {
        return "PrintProjectPricesDTO{" +
                "name='" + name + '\'' +
                ", monthCount=" + monthCount +
                ", totalMonthSalary=" + totalMonthSalary +
                ", projectPrice=" + projectPrice +
                '}';
    }
}
