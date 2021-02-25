import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HeroesUtil {
    public  static int NO_OF_FIELDS = 11;
    public static List<Heroes> getCsvData(String path){
        List<Heroes> heroesList = new ArrayList<>();

        try {
            // BufferedReader class is used to read text from a character based input stream.
            // FileReader is used to read data from the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            //Read the first line of the csv file to exclude the first row the file such  as "id","name"
            bufferedReader.readLine();
            String line = null;
            //while loop will run from the second line
            while ((line = bufferedReader.readLine())!=null){
                String [] values = line.split(",",-1);

                //To avoid ArrayIndexOutOfBoundException
                if(values.length== NO_OF_FIELDS){
                    //System.out.println(values.length);
                    Heroes heroes = new Heroes(values);
                    heroesList.add(heroes);



                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return heroesList;
    }


}
