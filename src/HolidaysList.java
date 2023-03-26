import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HolidaysList {
    private ArrayList<Holiday> holidays = new ArrayList<>();

    public HolidaysList() {
        this.holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
        this.holidays.add(new Holiday("21/02/2023", "Carnaval"));
        this.holidays.add(new Holiday("17/04/2023", "Páscoa"));
        this.holidays.add(new Holiday("21/04/2023", "Tiradentes"));
        this.holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
        this.holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        this.holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
        this.holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        this.holidays.add(new Holiday("02/11/2023", "Finados"));
        this.holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
        this.holidays.add(new Holiday("25/12/2023", "Natal"));
    }

    public String checkHoliday(String date) {
        for (int i = 0 ; i < holidays.size() ; i++) {
            Holiday holiday = holidays.get(i);
            if (Objects.equals(holiday.getDate(), date)) {
                return "O feriado do dia " + date + " é " + holiday.getName();
            }
        }

        return date + " não é um feriado listado.";
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }
}
