package does;

public class Alarm {
    public String alarmTime;
    public String alarmMode;

    public Alarm() {

    }

    public void setAlarmTime() {
        System.out.println("Please set an alarm time: " + alarmTime);
    }
    public void getAlarmTime() {
        System.out.println("Your alarm will go off at: " + alarmTime);
    }
    public void isAlarmSet() {
        if (alarmMode.equals("Alarm")) {
            System.out.println("Your alarm is set to go off");
        } else {
            System.out.println("You do not have an alarm set");
        }
    }
    public void snooze() {
        System.out.println("Alarm will go off in 5 minutes");
    }
}
