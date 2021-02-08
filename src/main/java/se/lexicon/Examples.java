package se.lexicon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args){
        List<String> content = Arrays.asList(
                "Hello","World"
        );
        File url = new File("E:\\Programming\\Lexicon\\IdeaProjects\\BufferedWriterExample\\src\\main\\testExample.txt");
        write(url, content);
        for(String string : read(url)){
            System.out.println(string);
        }
    }

    public static List<String> write(File destination, List<String> src){
        try(BufferedWriter writer = new BufferedWriter((new FileWriter(destination)))){
            for (String toWrite : src){
                writer.write(toWrite);
                writer.newLine();
            }
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
        return src;
    }

    public static List<String> read(File source){
        List<String> strings = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(source))){
        String line;
        while((line= reader.readLine()) != null){
            strings.add(line);

        }
            }catch(IOException e){
            e.printStackTrace();
        }
        return strings;
    }







}
