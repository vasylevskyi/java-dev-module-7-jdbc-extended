package ua.goit.model;

import com.opencsv.bean.CsvBindByName;

public class Worker {
    @CsvBindByName( column = "Worker ID", required = true)
    private int id;
    @CsvBindByName ( column = "Name", required = true)
    private String name;
    @CsvBindByName ( column = "Birthday", required = true)
    private String birthday;
    @CsvBindByName ( column = "Level", required = true)
    private WorkerLevels level;
    @CsvBindByName ( column = "Salary", required = true)
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public WorkerLevels getLevel() {
        return level;
    }

    public void setLevel(WorkerLevels level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", level=" + level +
                ", salary=" + salary +
                '}';
    }
}
