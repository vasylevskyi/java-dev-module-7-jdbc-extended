package ua.goit.dao;

import ua.goit.DatabaseStorage.ReadCSV;
import ua.goit.model.Project;
import ua.goit.model.Worker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectDAO {
    private static final String POPULATE_PROJECTS_CSV_FILE_NAME = "sql\\populate_projects.csv";
    private static final String PREPARED_STATEMENT_SQL = "INSERT INTO project VALUES (?, ?, ?, ?)";

    public void populateProjects(Connection connection) {

        List<Project> projects = ReadCSV.readProjectsFile(POPULATE_PROJECTS_CSV_FILE_NAME);

        try (PreparedStatement preparedStatement = connection.prepareStatement(PREPARED_STATEMENT_SQL)) {
            for(Project project: projects) {
                preparedStatement.setInt(1, project.getId());
                preparedStatement.setInt(2, project.getClientId());
                preparedStatement.setString(3, project.getStartDate());
                preparedStatement.setString(4, project.getFinishDate());
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
