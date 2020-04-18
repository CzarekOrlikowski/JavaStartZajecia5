package cwiczenie5;

public class Days {


    public String dayName(int day) {

        switch (day) {
            case 1:
                return "poniedziałek";
            case 2:
                return "wtorek";
            case 3:
                return "środa";
            case 4:
                return "czwartek";
            case 5:
                return "piątek";
            case 6:
                return "sobota";
            case 7:
                return "niedziela";
            default:
                return "Wybrałeś niepoprawny numer";
        }
    }

    public String dayType(int day) {
        if ((day == 6) || (day == 7)) {
            return "dzień wolny";
        } else return "dzień roboczy";
    }
}