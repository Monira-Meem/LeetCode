package strings.easy;

import java.util.List;

public class CountItemMatchs {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count  = 0;
        int keyNum = 0;

        if (ruleKey.equals("type"))
            keyNum = 0;
        else if (ruleKey.equals("color"))
            keyNum = 1;
        else
            keyNum = 2;

        for (int i = 0; i < items.size(); i++){

            if (items.get(i).get(keyNum).equals(ruleValue)){
                count++;
            }
        }
        return count;
    };

    public static void main(String[] args) {

//        type, color, name

//        String[][] items = {{"phone","blue","pixel"}, {"computer","silver","lenovo"}, {"phone","gold","iphone"}};
//        String ruleKey = "color";
//        String ruleValue = "silver";

//        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
//        String ruleKey = "type";
//        String ruleValue = "phone";

        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";

        int count  = 0;
        int keyNum = 0;

        if (ruleKey.equals("type"))
            keyNum = 0;
        else if (ruleKey.equals("color"))
           keyNum = 1;
        else
            keyNum = 2;

        for (int i = 0; i < items.length; i++){
            if (items[i][keyNum] == ruleValue){
                count++;
            }
        }
        System.out.println(count);

    }
}
