package Lesson5;

import java.io.*;

public class ReadWriteCsv {
    public static void main(String[] args) {
        try {
            File createdFile = CreateFile();
            WriteFile(createdFile);
            ReadFile(createdFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File CreateFile() throws IOException {
        File file = new File("./file.csv");


//        if (file.createNewFile())
//            System.out.println("File is created");
//        else
//           System.out.println("File exists");

        return file;
    }

    public static void ReadFile(File cf) throws IOException {
        FileReader fr = new FileReader(cf);
        BufferedReader br = new BufferedReader(fr);

        String row = new String();
        row = br.readLine();

        while (row != null) {
            System.out.println(row);
            row = br.readLine();
        }

//        System.out.println(br.readLine()); // Value 1;Value 2;Value 3
//        System.out.println(br.readLine()); // 100;200;123
//        System.out.println(br.readLine()); // 300;400;500
//        System.out.println(br.readLine()); // null
    }
    public static void WriteFile(File cf) throws IOException {
        FileWriter fw = new FileWriter(cf);

        fw.append("Value 1;Value 2;Value3");
        fw.append("\n");
        fw.append("100;200;123");
        fw.append("\n");
        fw.append("300;400;500");

        fw.flush();
        fw.close();
    }
}
