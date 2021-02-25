import javax.security.auth.Subject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by Ronney
 */

public class Main {
    public static void main(String[] args) {

        String path = "src/main/resources/heroes_information.csv";

        List<Heroes> list = HeroesUtil.getCsvData(path);

        //Query 1: query to list all super heroes whose race is human and weight  is greater than 90
         list.stream().filter(hero->hero.checkRaceAndWeight("Human",90)).forEach(System.out::println);


        //Query 2: Terminal Operation foreach without lamda expression

//        list.stream().filter(hero -> hero.getWeight() > 50)
//                .forEach(new Consumer<Heroes>() {
//                    @Override
//                    public void accept(Heroes heroes) {
//                        System.out.println(heroes);
//                    }
//                });




        //Query 3: list the superhero details whose name is Wolverine

        // list.stream().filter(hero->hero.getName().equals("Wolverine")).forEach(x->System.out.println(x));



        //Query 4: to get maximum value in each group

//   Map<String,Heroes> h=    list.stream().collect(
//                Collectors.groupingBy(Heroes::getName,
//                        Collectors.collectingAndThen(
//                                Collectors.reducing((Heroes h1, Heroes h2)->h1.getWeight() > h2.getWeight() ? h1:h2),
//                                Optional::get
//                                )));
//   System.out.println(h);


        //Query 5: to get minimum height of the superhero

//        Optional<Heroes> min = list.stream().min((Heroes h1, Heroes h2)-> Float.compare(h1.height,h2.height));
//        if(min.isPresent()){
//            System.out.println(min);
//        }


        //Query 6: Group Heroes by their weight
//
//        Map<Object, List<Heroes>> heroesByWeight = list
//                .stream()
//                .collect(Collectors.groupingBy(p -> p.weight));
//
//        heroesByWeight
//                .forEach((weight, p) -> System.out.format("weight %s: %s\n", weight, p));


        // Query 7:

//         Optional<Heroes> max = list.stream().max((Heroes h1, Heroes h2)-> Float.compare(h1.weight,h2.weight));
//
//        if(max.isPresent()){
//            System.out.println(max);
//
//        }

        //Query 8 : reduce to get the max

//            Heroes h=
//                    list.stream().collect(
//                            Collectors.reducing((d1, d2) -> d1.getHeight() > d2.getHeight() ? d1 : d2)).get();
//            System.out.println(h);


        //Query 10: query to list all details whose heroes name end with Man.


//        Optional<Heroes> firstS = list.stream()
//                .filter(heroes -> heroes.getName()
//                        .endsWith("man")).findFirst();
//        System.out.println(firstS);


        // Query 11: list all the superheroes whose name starts with W

        //   list.stream().filter(heroes -> heroes.getName().startsWith("W")).forEach(System.out::println);



        //Query 12  Group the names by its Super hero Race that is whether the super hero is human,demigod,mutant,metahuman

//    Map<String,List<String>> heroByRace = list.stream().collect(Collectors.groupingBy(
//            Heroes::getRace,
//            Collectors.mapping(
//                    Heroes::getName,
//                    Collectors.toList())));
//        List<Map.Entry<String, List<String>>>
//                nameByRaceList =
//                new ArrayList<>(heroByRace.entrySet());
//        nameByRaceList
//                .stream()
//                .forEach(e -> {
//                    System.out.println("Race: " + e.getKey());
//                    e.getValue()
//                            .stream()
//                            .forEach(f -> System.out.println(f)); });




//           Query 13



//        String names = list.stream()
//                .map(Heroes::getName)
//                .collect(Collectors.joining());
//
//        String  delimitedNames = list.stream()
//                .map(Heroes::getName)
//                .collect(Collectors.joining(", "));
//
//        System.out.println("Joined,  delimited names:  "  + delimitedNames);

















    }






}

