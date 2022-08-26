public class IFOT {
    public static void main(String[] args) {
        int x = 0;
        boolean a = false;

        while (!a) {
            System.out.println(x);
            x++;
            if (x == 10) {
                a = true;
            }
        }
    }
}
