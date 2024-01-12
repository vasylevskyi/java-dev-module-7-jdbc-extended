package ua.goit.DatabaseStorage;

import ua.goit.dto.*;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    private static final String FIND_LONGEST_PROJECT_FILE_NAME = "sql\\find_longest_project.sql";
    private static final String FIND_MAX_PROJECTS_CLIENT_FILE_NAME = "sql\\find_max_projects_client.sql";
    private static final String FIND_MAX_SALARY_WORKER_FILE_NAME = "sql\\find_max_salary_worker.sql";
    private static final String FIND_YOUNGEST_ELDEST_WORKERS_FILE_NAME = "sql\\find_youngest_eldest_workers.sql";
    private static final String PRINT_PROJECT_PRICES_FILE_NAME = "sql\\print_project_prices.sql";

    public static List<LongestProjectDurationDTO> findLongestProject() throws SQLException {
        List<LongestProjectDurationDTO> longestProjectDurations = new ArrayList<>();
        Database database = Database.getInstance();

        try (Connection connection = database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReadSQL.readFile(FIND_LONGEST_PROJECT_FILE_NAME));

            while (resultSet.next()) {
                LongestProjectDurationDTO longestProjectDuration = new LongestProjectDurationDTO();

                String name = resultSet.getString("name");
                int monthCount = resultSet.getInt("month_count");

                longestProjectDuration.setName(name);
                longestProjectDuration.setMonthCount(monthCount);

                longestProjectDurations.add(longestProjectDuration);
            }
        }
        return longestProjectDurations;
    }

    public static List<MaxProjectCountClientDTO> findMaxProjectsClient() throws SQLException {
        List<MaxProjectCountClientDTO> maxProjectCountClients = new ArrayList<>();
        Database database = Database.getInstance();

        try (Connection connection = database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReadSQL.readFile(FIND_MAX_PROJECTS_CLIENT_FILE_NAME));

            while (resultSet.next()) {
                MaxProjectCountClientDTO maxProjectCountClient = new MaxProjectCountClientDTO();

                String name = resultSet.getString("name");
                int projectCount = resultSet.getInt("project_count");

                maxProjectCountClient.setName(name);
                maxProjectCountClient.setProjectCount(projectCount);

                maxProjectCountClients.add(maxProjectCountClient);
            }
        }
        return maxProjectCountClients;
    }

    public static List<MaxSalaryAmountWorkerDTO> findMaxSalaryAmountWorker() throws SQLException {
        List<MaxSalaryAmountWorkerDTO> maxSalaryAmountWorkers = new ArrayList<>();
        Database database = Database.getInstance();

        try (Connection connection = database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReadSQL.readFile(FIND_MAX_SALARY_WORKER_FILE_NAME));

            while (resultSet.next()) {
                MaxSalaryAmountWorkerDTO maxSalaryAmountWorker = new MaxSalaryAmountWorkerDTO();

                String name = resultSet.getString("name");
                BigDecimal salary = resultSet.getBigDecimal("salary");

                maxSalaryAmountWorker.setName(name);
                maxSalaryAmountWorker.setSalary(salary);

                maxSalaryAmountWorkers.add(maxSalaryAmountWorker);
            }
        }
        return maxSalaryAmountWorkers;
    }
    public static List<YoungestEldestWorkersDTO> findYoungestEldestWorkers() throws SQLException {
        List<YoungestEldestWorkersDTO> youngestEldestWorkers = new ArrayList<>();
        Database database = Database.getInstance();

        try (Connection connection = database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReadSQL.readFile(FIND_YOUNGEST_ELDEST_WORKERS_FILE_NAME));

            while (resultSet.next()) {
                YoungestEldestWorkersDTO youngestEldestWorker = new YoungestEldestWorkersDTO();

                String type = resultSet.getString("type");
                String name = resultSet.getString("name");
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();

                youngestEldestWorker.setType(type);
                youngestEldestWorker.setName(name);
                youngestEldestWorker.setBirhtday(birthday);

                youngestEldestWorkers.add(youngestEldestWorker);
            }
        }
        return youngestEldestWorkers;
    }
    public static List<PrintProjectPricesDTO> printProjectPrices() throws SQLException {
        List<PrintProjectPricesDTO> printProjectPricesDTO = new ArrayList<>();
        Database database = Database.getInstance();

        try (Connection connection = database.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReadSQL.readFile(PRINT_PROJECT_PRICES_FILE_NAME));

            while (resultSet.next()) {
                PrintProjectPricesDTO projectPriceDTO = new PrintProjectPricesDTO();

                String name = resultSet.getString("name");
                int monthCount = resultSet.getInt("month_count");
                BigDecimal totalMonthSalary = resultSet.getBigDecimal("total_month_salary");
                BigDecimal projectPrice = resultSet.getBigDecimal("project_price");

                projectPriceDTO.setName(name);
                projectPriceDTO.setMonthCount(monthCount);
                projectPriceDTO.setTotalMonthSalary(totalMonthSalary);
                projectPriceDTO.setProjectPrice(projectPrice);

                printProjectPricesDTO.add(projectPriceDTO);
            }
        }
        return printProjectPricesDTO;
    }


}
