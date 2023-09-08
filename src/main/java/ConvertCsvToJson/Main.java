package ConvertCsvToJson;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File csvFile = new File("src/main/java/ConvertCsvToJson/people.csv");
        String json = CsvToJson.convertToJson(csvFile);
        System.out.println(json);
        CsvToJson.createJSONFile(csvFile);
    }
}
