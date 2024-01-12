package ua.goit.dto;

import java.time.LocalDate;

public class YoungestEldestWorkersDTO {
    private String type;
    private String name;
    private LocalDate birhtday;

    public YoungestEldestWorkersDTO() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirhtday(LocalDate birhtday) {
        this.birhtday = birhtday;
    }

    @Override
    public String toString() {
        return "YoungestEldestWorkersDTO{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birhtday=" + birhtday +
                '}';
    }
}
