package org.example;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import com.fasterxml.jackson.databind.*;

public class Main{
    public static String csvToJSON(File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String keyLine = bufferedReader.readLine();
            String[] keys = keyLine.split(",");
            String valueLine;
            String[] values;
            ArrayList<HashMap<String,String>> hashMapArrayList = new ArrayList<>();
            HashMap<String,String> hashMap = new HashMap<>();
            while((valueLine = bufferedReader.readLine())!=null){
                values = valueLine.split(",");
                for(int i =0;i< keys.length;i++){
                    hashMap.put(keys[i],values[i]);
                }
                hashMapArrayList.add(new HashMap<>(hashMap));
            }
            return new ObjectMapper().writeValueAsString(hashMapArrayList);

        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException("File not Found");
        }
        catch (IOException e) {
            throw new IOException(e);
        }
    }
    public static void createJSONFile(String jsonObject,File file) throws IOException {
         file = new File(file.getName().replace(".csv","")+".json");
        if(!file.exists()) {
            file.createNewFile();
            try {
                PrintWriter printWriter = new PrintWriter(file.getName());
                printWriter.print(jsonObject);
                printWriter.flush();
                printWriter.close();
                System.out.println("JSON File Created!");
            } catch (FileNotFoundException e) {
                throw new FileNotFoundException(file.getName()+".json not found");
            }
        }
        else{
            throw new FileAlreadyExistsException("JSON file already exists!");
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File("org.csv");
        String jsonObject = csvToJSON(file);
        createJSONFile(jsonObject,file);
    }
}