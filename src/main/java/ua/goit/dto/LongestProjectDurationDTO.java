package ua.goit.dto;

import java.util.Objects;

public class LongestProjectDurationDTO {
    private String name;
    private int monthCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongestProjectDurationDTO that = (LongestProjectDurationDTO) o;
        return monthCount == that.monthCount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, monthCount);
    }

    @Override
    public String toString() {
        return "LongestProjectDurationDTO{" +
                "name='" + name + '\'' +
                ", monthCount=" + monthCount +
                '}';
    }
}
