package strings.easy;

public class _1154_Day_Of_The_Year {

    public static int dayOfYear(String date) {

        String[] dates = date.split("-");

        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        if (month == 1)
            return day;

        int count = day;

        for (int i = 1; i < month; i++) {

            if (i == 4 || i == 6 || i == 9 || i == 11) {
                count += 30;
            } else if (i == 2) {
                count += 28;
            } else
                count += 31;
        }


        if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String date = "1900-05-02";

        System.out.println(dayOfYear(date));

    }
}
