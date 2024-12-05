package d3.p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        // System.out.println("hello");
        String filePath = "d3/p1/input";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int result = 0;
            while((line = reader.readLine()) != null) {
                // System.out.println(line.length());
                // 0 to len -1 
                int[] lkp = new int[123];
                for (int h = 0; h < line.length()/2; h++) {
                    int c1 = (int)line.charAt(h);
                        
                   ++lkp[c1];
                }


                
                for (int i = line.length()/2; i < line.length(); i++)  {
                    int c2 = (int) line.charAt(i);

                    if (lkp[c2] > 0) {
                        if(c2 > 96 && c2 < 123) {
                            int p = (c2 - 96);
                            System.out.println(p);

                            result += p ;
                        }

                        if( c2 > 40 && c2 < 91) {
                            int p = 2 +(c2 - 40);

                            System.out.println(p);

                            result += p ;
                        }
                        
                        System.out.println("Found " + line.charAt(i));
                        break;
                    }
                }
                
            }
            System.out.println(result);
                
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}