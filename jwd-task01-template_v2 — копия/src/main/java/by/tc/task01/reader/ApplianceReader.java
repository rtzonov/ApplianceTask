package by.tc.task01.reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplianceReader {

    public List<String> reader() {
        List<String> list = new ArrayList<>();
        try {
            File FILE = new File("src/main/resources/appliances_db.txt");
            Scanner scanner = new Scanner(FILE);
            while (scanner.hasNext()){
                list.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

/*    public static void main(String[] args) {
        ApplianceReader a = new ApplianceReader();
        System.out.println(a.reader());
    }*/
}

