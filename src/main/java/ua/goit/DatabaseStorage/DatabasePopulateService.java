package ua.goit.DatabaseStorage;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    private static final String POPULATE_DB_FILE_NAME = "sql\\populate_db.sql";
    public static void main(String[] args) throws SQLException {
        new DatabasePopulateService().executeUpdate(ReadSQL.readFile(POPULATE_DB_FILE_NAME));
    }

    public void executeUpdate(String sql) throws SQLException {
        Database database = Database.getInstance();
        Connection connection = database.getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        database.close();
    }
}

