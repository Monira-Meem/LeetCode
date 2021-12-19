package strings.medium;

public class StringCompression {

    public static void main(String[] args) {

//        char[] chars = {'a','a','b','b','c','c','c'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};


        int count = 0;
        String s1 = "";
        char pres = chars[0];

        for (int i = 0; i < chars.length; i++){
            char running = chars[i];

            if(pres == running){
                count++;
            } else {
                s1 += (pres + "" +count);
                pres = chars[i];
                count= 1;
            }
        }

        String newString = s1 + (pres + "" + count);

        System.out.println(newString);
    }

    public int compress(char[] chars) {

        return 0;
    }
}
