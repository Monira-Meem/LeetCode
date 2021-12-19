package arrays.easy;

public class DoingHomeWork_1450 {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for(int i = 0; i < startTime.length; i++) {
            int sub = endTime[i]-startTime[i];

            if(sub <= queryTime || endTime[i] >= 0 )
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] startTime = {4};
        int[] endTime = {4};

    }
}
