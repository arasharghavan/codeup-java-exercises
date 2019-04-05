package Io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;


public class Nio {

    public static void main(String[] args) {

//        String directory = "data";
//        String filename = "IOtest.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory,filename);

        try{
//            if (Files.notExists(dataDirectory)){
//                Files.createDirectories(dataDirectory);
//            }
//            if (!Files.exists(dataFile)){
//                Files.createFile(dataFile);
//            }
//
//            List<String> fruit = new ArrayList<>();
//
//            fruit.add("banana");
//            fruit.add("kiwi");
//            fruit.add("orange");
//            fruit.add("mango");
//            Files.write(dataFile,fruit);
            Files.write(
                    Paths.get("data","IOtest.txt"),
                    Arrays.asList("banana1"),
                    StandardOpenOption.APPEND
            );

//            List<String> lines = Files.readAllLines(dataFile);
//
//            for (String line : lines){
//                System.out.println(line);
//            }
        } catch (IOException ioe){
            System.out.println(ioe);
        }
        System.out.println("Program finished executing");

//        ------------------------------------------------------------
    }




}