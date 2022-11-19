import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {-8, 9, 6, -4, 4, 1, -2, 5, 7};
        Arrays.sort(num);

        for (int num1 : num) {
            System.out.print(num1 + " , ");

        }
    }
}