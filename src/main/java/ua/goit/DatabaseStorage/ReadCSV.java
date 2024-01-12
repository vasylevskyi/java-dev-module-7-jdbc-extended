package ua.goit.DatabaseStorage;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import ua.goit.model.*;

public class ReadCSV {
    public static List<Client> readClientsFile(String fileName) {
        List<Client> clients = new ArrayList<>();
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName))
                .withSkipLines(1)
                .build()) {
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                Client client = new Client();
                client.setId(Integer.parseInt(nextLine[0]));
                client.setName(nextLine[1]);
                clients.add(client);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return clients;
    }

    public static List<Worker> readWorkersFile(String fileName) {
        List<Worker> workers = new ArrayList<>();
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName))
                .withSkipLines(1)
                .build()) {
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                Worker worker = new Worker();
                worker.setId(Integer.parseInt(nextLine[0]));
                worker.setName(nextLine[1]);
                worker.setBirthday(nextLine[2]);
                worker.setLevel(WorkerLevels.valueOf(nextLine[3]));
                worker.setSalary(Integer.parseInt(nextLine[4]));
                workers.add(worker);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return workers;
    }

    public static List<Project> readProjectsFile(String fileName) {
        List<Project> projects = new ArrayList<>();
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName))
                .withSkipLines(1)
                .build()) {
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                Project project = new Project();
                project.setId(Integer.parseInt(nextLine[0]));
                project.setClientId(Integer.parseInt(nextLine[1]));
                project.setStartDate(nextLine[2]);
                project.setFinishDate(nextLine[3]);
                projects.add(project);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return projects;
    }
    public static List<ProjectWorker> readProjectWorkersFile(String fileName) {
        List<ProjectWorker> projectWorkers = new ArrayList<>();
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileName))
                .withSkipLines(1)
                .build()) {
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null) {
                ProjectWorker projectWorker = new ProjectWorker();
                projectWorker.setProjectId(Integer.parseInt(nextLine[0]));
                projectWorker.setWorkerId(Integer.parseInt(nextLine[1]));
                projectWorkers.add(projectWorker);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return projectWorkers;
    }
}
