package ua.goit.dao;

import ua.goit.DatabaseStorage.Database;
import ua.goit.DatabaseStorage.DatabaseInitService;
import ua.goit.DatabaseStorage.ReadCSV;
import ua.goit.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientDAO {
    private static final String POPULATE_CLIENTS_CSV_FILE_NAME = "sql\\populate_clients.csv";
    private static final String PREPARED_STATEMENT_SQL = "INSERT INTO client VALUES (?, ?)";

    public void populateClients(Connection connection) {
        List<Client> clients = ReadCSV.readClientsFile(POPULATE_CLIENTS_CSV_FILE_NAME);

        try (PreparedStatement preparedStatement = connection.prepareStatement(PREPARED_STATEMENT_SQL)) {
            for(Client client: clients) {
                preparedStatement.setInt(1, client.getId());
                preparedStatement.setString(2, client.getName());
                preparedStatement.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
