package Playing_Cat;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 46));
    }

    public static boolean isCatPlaying(boolean summer, int tem) {
        if (summer && tem >= 25 && tem <= 45) {
            return true;
        } else if((!summer) && (tem >= 25 && tem <= 35)) {
            return true;
        }
        return false;
    }

}
