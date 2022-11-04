public class Clock {

    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock() {}  //wartości domyślne to 0

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
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    public void displayTime() {
        if (hour<10 && minute<10){
            System.out.print("0"+hour);
            System.out.println(":0"+minute);
        } else if (hour<10 && minute>10) {
            System.out.print("0"+hour);
            System.out.println(":"+minute);
        } else if (hour>10 && minute>10) {
            System.out.print(hour);
            System.out.println(":"+minute);
        } else {
            System.out.print(hour);
            System.out.println(":0"+minute);
        }
    }

    public void addOneMinute() {
        this.minute = this.minute+1;

        if (this.minute>59) {
            this.minute=0;
            this.hour=this.hour+1;
            if (this.hour>23){
                this.hour=0;
            }
        }

        if (this.hour == this.alarmHour && this.minute == this.alarmMinute) {
            runAlarm();
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
        c.setAlarm(0, 3);
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
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }
}
