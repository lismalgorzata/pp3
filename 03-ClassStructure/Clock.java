public class Clock {

    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock() {
        hour = 0;
        minute = 0;

    }

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        if (hour < 0) {
            this.hour = 0;
        }
        else if (hour > 23){
            this.hour = 23;
        }

        if (minute < 0){
            this.minute = 0;
        }
        else if (minute > 59){
            this.minute = 59;
        }

    }

    public void setClock(int hour, int minute) {
        hour = 0;
        minute = 0;
    }

    public void setClock() {
        hour = 0;
        minute = 0;

    }

    public void displayTime() {
        if (hour<10 && minute<10){
            System.out.print("0"+hour);
            System.out.println(":0"+minute);
        } else if (hour<10 && minute>10) {
            System.out.print("0"+hour);
            System.out.println(":"+minute);
        } else {
            System.out.print(hour);
            System.out.println(":0"+minute);
        }
    }

    public void addOneMinute() {
        minute = minute+1;

        if (minute>59) {
            minute=0;
            hour=hour+1;
            if (hour>23){
                hour=0;
            }
        }
    }

    public void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    public void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }

    public static void main(String[] args){
        Clock c = new Clock(12,47);
        c.displayTime();
        c.setClock(18,14);
        c.displayTime();
        c.setClock(9,3);
        c.displayTime();
        c.setClock(23,58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }
}
