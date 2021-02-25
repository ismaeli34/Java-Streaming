import javax.security.auth.Subject;
import javax.swing.text.html.Option;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Ronney
 */
public class Main {
    public static void main(String[] args) {

        String path = "src/main/resources/MoviesOnStreamingPlatforms_updated.csv";
        List<Movie> movieList = MoviesUtil.getCsvData(path);


     // Query 1: query to find the movie anme  whose director name starts with Martin.

//       movieList.stream()
//                .filter(movie -> movie.getDirectors().startsWith("Martin"))
//                .map(movie -> "Movie Name :" +movie.getTitle() + " Name :"+ movie.getDirectors())
//               .forEach(System.out::println);


       //Query 2: query to select the movie name,genre and country whose genres are documentary and the country is not united states.


//        movieList.stream()
//                 .filter(movie -> movie.getGenres().equals("Documentary"))
//                 .filter(movie -> !movie.getCountry().equals("United States"))
//                 .map(movie -> "Movie Name :"+movie.getTitle() + " ,Genre :" + movie.getGenres() + " ,Country :"+ movie.getCountry())
//                 .forEach(System.out::println);




        //Query 3: list comedy movies released on the year 2016
//        movieList.stream()
//                .filter(movie -> movie.getGenres().contains("Comedy"))
//                .filter(movie -> movie.getYear()==2016)
//                .forEach(System.out::println);


        //Query 4: write a query to list all movies which released in the country other than United States and country name which is empty.
//         movieList.stream().
//                 filter(movie -> !movie.getCountry().equals("United States") && !movie.getCountry().equals(""))
//                 .forEach(System.out::println);


        // Query 5: to find year,title, country for those movies whose rotten tomatoes reviews are empty.
//         movieList.stream()
//                 .filter(movie -> movie.getRottenTomatoesReviews().equals("")).map(s-> "Year: "+s.getYear() + " Title :"+ s.getTitle() + " Country :"+ s.getCountry() )
//                 .forEach(System.out::println);


        //Query 6: query to find the movie name with minimum imdb ratings

//        Comparator<Movie> comparator = (p1, p2) -> Float.compare(p1.getImdbRatings(), p2.getImdbRatings());
//        Movie movie=    movieList.stream().min(comparator).get();
//        System.out.println("Movie Name : "+movie.getTitle() + " | Movie Rating: "+ movie.getImdbRatings());


        //Query 7: query to find the title of the movie which has no rotten tomatoes review and has a IMDB rating greater than 7.0

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%30s %30s", "Movie Name","Imdb ratings");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        movieList.stream().filter(movie1 -> movie1.getRottenTomatoesReviews().equals("") && movie1.getImdbRatings() >= 7.0f)
          .map(s-> "Movie Name :" + s.getTitle() + "   ,Imdb ratings :" + s.getImdbRatings()).forEach(x->System.out.println(x));



        //Query 8: query to list the movie details whose imdb rating is greater than 8.0 and group it
//        Map<String,Map<String, List<Movie>>> data =movieList.stream().filter(movie -> movie.getImdbRatings()>8.0f).
//          collect(Collectors.groupingBy(Movie::getTitle,Collectors.groupingBy(Movie::getRottenTomatoesReviews)));
//        System.out.println(data);


        //Query 9: query to count the movie title whose imdb ratings is 8.8


//        Map<String,Long> data2 =movieList.stream()
//                .filter(movie -> movie.getImdbRatings()==8.8f).
//          collect(Collectors.groupingBy(Movie::getTitle,Collectors.counting()));
//        System.err.println(data2);







        //Query 10: query to find the movie name and imdbrating whose ratings is greater than 8.8


//         movieList.stream()
//                 .filter(movie -> movie.getImdbRatings()>8.8f).map(s->" Movie Name :"+ s.getTitle() + " |  Imdb Ratings :"+ s.getImdbRatings())
//                 .forEach(System.err::println);




        //Query 11: Query to find all the details of the movie whose movie name is Philadelphia
      //  movieList.stream().filter(movie -> movie.getTitle().equals("Philadelphia")).forEach(System.out::println);































        //Query to find the movie name and runtime  with maximum runtime


//        Comparator<Movie> comparatorMax = (p1, p2) -> Float.compare(p1.getRuntime(), p2.getRuntime());
//        Movie movie1=    movieList.stream().max(comparatorMax).get();
//        System.out.println("Movie Name : "+movie1.getTitle() + " | Movie Runtime: "+ movie1.getRuntime());













    }
}

class MoviesUtil{
    public  static int NO_OF_FIELDS = 17;
    public static List<Movie> getCsvData(String path){
        List<Movie> movieList = new ArrayList<>();

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
                //System.out.println(values.length);
                //To avoid ArrayIndexOutOfBoundException
                if(values.length== NO_OF_FIELDS){
                    //System.out.println(values.length);
                    Movie movie = new Movie(values);
                    movieList.add(movie);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return movieList;
    }



}