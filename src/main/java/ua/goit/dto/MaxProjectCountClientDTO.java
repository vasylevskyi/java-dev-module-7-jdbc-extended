package ua.goit.dto;


import java.util.Objects;

public class MaxProjectCountClientDTO {
    private String name;
    private int projectCount;

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaxProjectCountClientDTO that = (MaxProjectCountClientDTO) o;
        return projectCount == that.projectCount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, projectCount);
    }
    @Override
    public String toString() {
        return "MaxProjectCountClientDTO{" +
                "name='" + name + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
