import java.time.*;
public class Time {
    public static void main(String[] args) {
        int hour = 22 ;
        int minute = 5 ;
        int second = 30 ;

        ZonedDateTime nowZoned = ZonedDateTime.now();
        Instant midnight = nowZoned.toLocalDate().atStartOfDay(nowZoned.getZone()).toInstant();
        ZonedDateTime nextMidnight = nowZoned.toLocalDate().plusDays(1).atStartOfDay(nowZoned.getZone());
        Duration duration = Duration.between(midnight, Instant.now());
        long seconds = duration.getSeconds();
        Duration remaining = Duration.between(Instant.now(), nextMidnight);
        long remainingSeconds = remaining.getSeconds();

        LocalTime now = LocalTime.now();
        LocalTime startTime = LocalTime.of(22,05,30);
        Duration elapsed = Duration.between(startTime, now);
        long elapsedSeconds = elapsed.getSeconds();


        System.out.print("Seconds since midnight: ");
        System.out.print(hour*3600 + minute*60 + second + " // Taking current time: ");
        System.out.println(seconds);

        System.out.print("Seconds remaining in the day: ");
        System.out.print((24-hour)*3600-minute*60-second + " // Taking current time: ");
        System.out.println(remainingSeconds);

        System.out.print("Percentage of the day that has passed: ");
        System.out.print((hour*3600 + minute*60 + second)*100 / 86400.0 + " // Taking current time: ");
        System.out.println(seconds*100/86400.0);

        System.out.print("The elapsed seconds since I started working on this exercise: ");
        System.out.println(elapsedSeconds);
    }

}
