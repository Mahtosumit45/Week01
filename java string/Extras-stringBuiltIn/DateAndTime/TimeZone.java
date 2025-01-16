import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args){
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current Time in gmt :"+gmtTime);
        System.out.println("Current Time in ist :"+istTime);
        System.out.println("Current Time in pst :"+pstTime);
    }
}
