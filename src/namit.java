import java.util.Random;

public class namit {
    static int a = 0;

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 1; i++) {
            int b = r.nextInt(100);
            a = b;
        }
        System.out.println(a);
    }

}
