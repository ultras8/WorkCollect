import java.time.*;

public class Suntana {
    public static void main(String[] args) {
        int days = 0;
        LocalDate today = LocalDate.now();
        int todayDay    = today.getDayOfMonth(); // 31
        int todayMonth  = today.getMonthValue(); // 8
        int todayYear   = today.getYear(); // 2021
        while(year <= todayYear){
            if(month == 2){
                if(Year.isLeap(year)){
                    days += (29-day);
                    day += (29-day);
                }
                else{
                    days += (28-day);
                    day += (28-day);
                }
            }
            else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
                days += (31-day);
                day += (31-day);
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                days += (30-day);
                day += (30-day);
            }
            else if(month == 12){
                days += (31-day);
                day += (31-day);
                year++;
                month = 0;
            }
            if(todayDay == day && todayMonth == month && todayYear == year) break;
            month++;
            day = 0;
        }
        System.out.println(days+1);
    }
}
