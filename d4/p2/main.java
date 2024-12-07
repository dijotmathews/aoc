package d4.p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        int count = 0;
        String filePath = "d4/p1/input";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Pattern pattern = Pattern.compile("\\d+");

            
            while((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                List<String> numbers = new ArrayList<>();
                while(matcher.find()) {
                    numbers.add(matcher.group());
                }

                boolean result = check_full_overlap(Integer.parseInt(numbers.get(0)), Integer.parseInt(numbers.get(1)) ,Integer.parseInt(numbers.get(2)), Integer.parseInt(numbers.get(3)));
                if(result) count++;
            }

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean check_full_overlap(int as, int ae, int bs, int be) {

        if(as <= bs) {
            // as can be inside b
            if (be <= ae) {
                System.out.println("as : " + as + " less than bs: "+ bs + "and ae" + ae + " less than be: " + be);
                return true;
            }
        } 

        if(as >= bs) {
            // bs can be inside a
            if (be >= ae) {
                System.out.println("bs : " + bs + " less than as " + as + " and be: " + be + " less tha ae: " + ae);

                return true;
            }
        }

        if(as >= bs && as <= be || ae >= bs && ae <= be) {
            return true;
        }

        if(bs >= as && bs <= ae || be >= as && be <= ae) {
            return true;
        }

        return false;
    }
}
