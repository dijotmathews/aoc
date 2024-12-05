package d4.p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        System.out.println(" hi");

        String filePath = "d4/p1/ input";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

        
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
