package randomPackage.files;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BufferedWriter_Practice {

    public static void main(String[] args) throws IOException {


        BufferedWriter writer = new BufferedWriter(new FileWriter("file1.txt"));

        // creating and writing a file
        writer.write("Hello this is my first line with buffered writer");
        writer.write("\nThis is my second line");
        writer.write("\nThis is the third line");
        writer.close();

        // reading a file
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        System.out.println("-----------------------------------");
        BufferedReader reader1 = new BufferedReader(new FileReader("/Users/zouliga/IdeaProjects/climate_change.txt"));

        String[] words = reader1.readLine().split(" ");

        reader1.close();

        System.out.println(words.length);

        /*
        String result = "";
        for (String each : words) {
            int count =  0;
            for (String word : words) {
                if (each.equals(word)){
                    count++;
                }
            }
            if (!result.contains(each)){
                if (count > 1){
                    result += each + " : " + count + "\n";
                }
            }
        }
        System.out.println(result);

         */

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : words) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each)+1);
            }else{
                map.put(each, 1);
            }
        }
        // System.out.println(map);

        System.out.println("-------------printing duplicates----------------------");

        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println("the occurrence of '" + k + "' is: " + v);
            }
        });

        System.out.println("------------------printing unique words---------------");

        List<String> list = new ArrayList<>();

        map.forEach((k,v) -> {
            if (v == 1){
                list.add(k);
            }
        });
        System.out.println(list);


    }
}
