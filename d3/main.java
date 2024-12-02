package d3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("hello");
        String filePath = "d3/i";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line.length());
                // 0 to len -1 
                for (int h = 0; h < line.length()/2; h++) {
                    for (int i = line.length()/2; i < line.length(); i++) {
                        char c1 = line.charAt(h);
                        char c2 = line.charAt(i);
                        if (c1 == c2) {
                            System.out.println(c1);
                            System.out.println((int)c2);
                            break;
                        }
                    }
                }
                

                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}