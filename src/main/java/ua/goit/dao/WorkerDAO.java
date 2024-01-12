package ua.goit.dao;

import ua.goit.DatabaseStorage.Database;
import ua.goit.DatabaseStorage.ReadCSV;
import ua.goit.model.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class WorkerDAO {
    private static final String POPULATE_WORKERS_CSV_FILE_NAME = "sql\\populate_workers.csv";
    private static final String PREPARED_STATEMENT_SQL = "INSERT INTO worker VALUES (?, ?, ?, ?, ?)";

    public void populateWorkers(Connection connection) {

        List<Worker> workers = ReadCSV.readWorkersFile(POPULATE_WORKERS_CSV_FILE_NAME);

        try (PreparedStatement preparedStatement = connection.prepareStatement(PREPARED_STATEMENT_SQL)) {
            for(Worker worker: workers) {
                preparedStatement.setInt(1, worker.getId());
                preparedStatement.setString(2, worker.getName());
                preparedStatement.setString(3, worker.getBirthday());
                preparedStatement.setString(4, worker.getLevel().toString());
                preparedStatement.setInt(5, worker.getSalary());
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
