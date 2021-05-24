public class Main {

    private static final String INVALID_STRING_MESSAGE = "Invalid number";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_STRING_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hourString = hours + "h ";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hourString + minutesString + secondsString;
    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return INVALID_STRING_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
