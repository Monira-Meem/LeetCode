package strings.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity_1436 {

    public String destCity(List<List<String>> paths) {

        String destCity =paths.get(0).get(0);
        Map<String,String> map = new HashMap<>();

        for (List<String> list : paths){
            map.put(list.get(0),list.get(1));
        }

        while (map.containsKey(destCity)){
           destCity = map.get(destCity);
        }
        return destCity;
    }

    public static void main(String[] args) {

       // String[][] paths = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};

       //String[][] paths = {{"B","C"},{"D","B"},{"C","A"}};

        String[][] paths = {{"A","Z"}};

        String destCity =paths[0][0];
        Map<String,String> map = new HashMap<>();

        for (String[] path : paths){
            map.put(path[0],path[1]);
        }

        while (map.containsKey(destCity)){
            destCity = map.get(destCity);
        }

        System.out.println(destCity);

    }
}
