import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        HolidaysList myList = new HolidaysList();

        System.out.println(myList.checkHoliday("12/10/2023"));
        System.out.println(myList.checkHoliday("14/10/2023"));

        List<Holiday> listOfholidays = myList.getHolidays();

        for (int i = 0 ; i < listOfholidays.size() ; i++) {
            Holiday holiday = listOfholidays.get(i);
            System.out.println(holiday.getDate() + " => " + holiday.getName());
        }
    }
}
