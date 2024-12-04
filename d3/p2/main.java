package d3.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        // System.out.println("hello");
        String filePath = "d3/p2/input";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line1, line2, line3;
            
            int result = 0;
            while((line1 = reader.readLine()) != null && (line2 = reader.readLine()) != null && (line3 = reader.readLine()) != null) {
                Set<Character> common = findCommonCharacter(line1, line2, line3);
                char ch = (char) common.toArray()[0];


                System.out.println("Common "+ ch);

                if(ch > 96 && ch < 123) {
                    int p = (ch - 96);
                    System.out.println(p);

                    result += p ;
                }

                if( ch > 40 && ch < 91) {
                    int p = 2 +(ch - 40);

                    System.out.println(p);

                    result += p ;
                }
            }  
            
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Character> findCommonCharacter(String str1, String str2, String str3) {
        Set<Character> set1 = toCharacterSet(str1);
        Set<Character> set2 = toCharacterSet(str2);
        Set<Character> set3 = toCharacterSet(str3);

        set1.retainAll(set2);
        set1.retainAll(set3);

        return set1;
        
    }
    
    public static Set<Character> toCharacterSet(String str) {
        Set<Character> set = new HashSet<>();

        for (char ch: str.toCharArray()) {
            set.add(ch);
        }

        return set;
    }


}