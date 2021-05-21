public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(12, 29));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >=0 && seconds <= 59) {
            return "valid number";
        }
        return "invalid value";
    }

    public static String getDurationString(int minutes) {
        if (minutes >= 0) {
            return "valid number";
        }
        return "invalid value";
    }
}
