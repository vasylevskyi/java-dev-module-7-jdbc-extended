package ua.goit.dao;

import ua.goit.DatabaseStorage.ReadCSV;
import ua.goit.model.Client;
import ua.goit.model.ProjectWorker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectWorkerDAO {
    private static final String POPULATE_PROJECT_WORKERS_CSV_FILE_NAME = "sql\\populate_project_workers.csv";
    private static final String PREPARED_STATEMENT_SQL = "INSERT INTO project_worker VALUES (?, ?)";

    public void populateProjectWorkers(Connection connection) {
        List<ProjectWorker> projectWorkers = ReadCSV.readProjectWorkersFile(POPULATE_PROJECT_WORKERS_CSV_FILE_NAME);

        try (PreparedStatement preparedStatement = connection.prepareStatement(PREPARED_STATEMENT_SQL)) {
            for(ProjectWorker projectWorker: projectWorkers) {
                preparedStatement.setInt(1, projectWorker.getProjectId());
                preparedStatement.setInt(2, projectWorker.getWorkerId());
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
