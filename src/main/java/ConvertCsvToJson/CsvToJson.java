package ConvertCsvToJson;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

import com.fasterxml.jackson.databind.*;

public class CsvToJson {
    public static String convertToJson(File file) throws IOException {
        BufferedReader rowReader = new BufferedReader(new FileReader(file));
        String keyLine = rowReader.readLine();
        String[] keys = keyLine.split(",");
        String valueLine;
        String[] values;
        ArrayList<HashMap<String, String>> keyValueArrayList = new ArrayList<>();
        HashMap<String, String> keyValueMap = new HashMap<>();
        while ((valueLine = rowReader.readLine()) != null) {
            values = valueLine.split(",");
            for (int i = 0; i < keys.length; i++) {
                keyValueMap.put(keys[i], values[i]);
            }
            keyValueArrayList.add(new HashMap<>(keyValueMap));
        }
        return new ObjectMapper().writeValueAsString(keyValueArrayList);
    }

    public static void createJSONFile(File file) throws IOException {
        String jsonObject = convertToJson(file);
        File jsonfile = new File(file.getPath().replace(".csv", ".json"));
        if (!jsonfile.exists()) {
            jsonfile.createNewFile();
            PrintWriter printWriter = new PrintWriter(jsonfile.getPath());
            printWriter.print(jsonObject);
            printWriter.flush();
            printWriter.close();
            System.out.println("JSON File Created!");
        } else {
            throw new FileAlreadyExistsException("JSON File Already Exists!");
        }
    }
}

