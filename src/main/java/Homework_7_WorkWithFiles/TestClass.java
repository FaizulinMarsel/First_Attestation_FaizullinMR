package Homework_7_WorkWithFiles;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;

import java.io.IOException;
import java.nio.file.Path;

public class TestClass {
    public static void main(String[] args) throws IOException {
        PlayerService service = new PlayerServiceJSON();
        Path filePath = Path.of("Players.json");
        ObjectMapper objectMapper = new ObjectMapper();

        service.createPlayer("Jacob");
        service.createPlayer("Alex");
        service.createPlayer("Bob");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), service.getPlayers());
        service.createPlayer("Anna");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), service.getPlayers());
        service.addPoints(2,10);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), service.getPlayers());
        service.deletePlayer(1);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(filePath.toFile(), service.getPlayers());
        service.createPlayer("Anna");
        System.out.println(service.deletePlayer(1));
        service.getPlayers();
    }
}
