package bridgelabz;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class OpenCSVWriter {
    public static void main(String[] args) {
        String csvFilePath = "E:\\ThirdParty\\src\\main\\java\\bridgelabz\\write1.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath, true))) {
            // Create a string array with the data to be appended to the CSV file

            String[] data = {"bumrah", "bumrah@example.com", "1234567890", "IND"};


            // Append the data to the CSV file
            writer.writeNext(data);

            System.out.println("Data appended to CSV file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

