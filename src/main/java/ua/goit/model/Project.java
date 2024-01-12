package ua.goit.model;

import com.opencsv.bean.CsvBindByName;

//HEADER: Project ID,Client ID,Start Date,Finish Date
public class Project {
    @CsvBindByName ( column = "Project ID", required = true )
    private int id;
    @CsvBindByName ( column = "Client ID", required = true )
    private int clientId;
    @CsvBindByName ( column = "Start Date", required = true )
    private String startDate;
    @CsvBindByName ( column = "Finish Date" )
    private String finishDate;

    public int getId() {        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", startDate='" + startDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                '}';
    }
}
