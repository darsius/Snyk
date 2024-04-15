public class Staircase {
    public static void printStaircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\033[3m#\033[0m");
            }
            System.out.println();
        }
    }
}
