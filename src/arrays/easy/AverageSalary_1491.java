package arrays.easy;

public class AverageSalary_1491 {

    public static void main(String[] args) {

        int[] salary = {4000,3000,1000,2000};
//        int[] salary = {1000,2000,3000};
//        int[] salary = {6000,5000,4000,3000,2000,1000};
//        int[] salary = {8000,9000,2000,3000,6000,1000};

        double sum = 0;
        int min =salary[0];
        int max = 0;

        for (int i =0; i < salary.length; i++){
            if (max < salary[i]){
                max = salary[i];
            }
            if (min >= salary[i]){
                min = salary[i];
            }
            sum += salary[i];
        }

        double av = (sum - max -min)/(salary.length -2);

        System.out.println(max);
        System.out.println(min);
        System.out.println(av);
    }
}
