package strings.easy;

public class _2399_Check_Distances_Between_Same_Letters {

    public static boolean checkDistances(String s, int[] distance) {

        for (char c : s.toCharArray()) {

            int firstIndex = s.indexOf(c);
            int secondIndex = s.lastIndexOf(c);

            if (distance[c - 'a'] != secondIndex - firstIndex - 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "aa";
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        System.out.println(checkDistances(s,distance));

    }
}
