import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ronney
 */

public class IPLCsv {
    public static void main(String[] args) {

        String filePath = "src/main/resources/IPL dataset1.csv";
        List<IPL> list = IPLUtil.getIPLContent(filePath);
        //Query 1: Query to select match played in Delhi,India

           list.stream()
                   .filter(ipl->ipl.getCity().equals("Delhi"))
                   .forEach(x->System.out.println(x));


        //Query 2: Query in which delhi daredevils won the toss and decided to field

//        list.stream()
//                .filter(ipl -> ipl.getToss_winner()
//                .equals("Delhi Daredevils") &&
//               el ipl.getToss_decision().equals("field"))
//                .forEach(System.out::println);


        //Query 3: Query to select the distinct cities

//       list.stream()
//               .map(ipl->ipl.getCity())
//               .distinct().forEach(System.out::println);

        //Query 4: Query in which the toss winner is Team Delhi Daredevils, match winner is Delhi Daredevil and the match played in Delhi
//        list.stream()
//                .filter(ipl->ipl.getToss_winner().equals("Delhi Daredevils") && ipl.getWinner().equals("Delhi Daredevils"))
//                .filter(ipl -> ipl.getCity().equals("Delhi"))
//                .forEach(System.out::println);


//Query 5: Query in which the team won by 0 wickets and the Team name is Mumbai Indians

//        list.stream()
//        .filter(ipl->ipl.win_by_wickets.equals("0") && ipl.getWinner().equals("Mumbai Indians"))
//       .forEach(System.out::println);


        //Query 6: write a query to find the winner of the ipl matches and concatenate the winners with comma

//        String names = list.stream()
//                .map(IPL::getWinner)
//                .collect(Collectors.joining());
//
//        String  delimitedNames = list.stream()
//                .map(IPL::getWinner)
//                .collect(Collectors.joining(", "));
//
//        System.out.println("Joined,  delimited names:  "  + delimitedNames);






    }
}

class IPLUtil {

    public static List<IPL>  getIPLContent(String path){
        //initialize the no of fields to 17
        final int NO_OF_FIELDS =17;
        // Create an empty ArrayList
        List<IPL> iplList = new ArrayList<>();

        try {
            // BufferedReader class is used to read text from a character based input stream.
            // FileReader is used to read data from the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = "";
            //Read the line of the text
            while ((line = bufferedReader.readLine())!=null){
                String [] values = line.split(",",-1);
                //To avoid ArrayIndexOutOfBoundException
                if(values.length== NO_OF_FIELDS){
                    IPL ipl = new IPL(values);
                    iplList.add(ipl);

                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return iplList;
    }
}
