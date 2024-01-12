package ua.goit.model;

import com.opencsv.bean.CsvBindByName;

//HEADER: Project ID, Worker ID

public class ProjectWorker {
    @CsvBindByName ( column = "Project ID", required = true )
    private int projectId;
    @CsvBindByName ( column = "Worker ID", required = true )
    private int workerId;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public String toString() {
        return "ProjectWorker{" +
                "projectId=" + projectId +
                ", workerId=" + workerId +
                '}';
    }
}
