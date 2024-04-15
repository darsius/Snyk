public class Main {
    public static void main(String[] args) {

        int n = 4;
        Staircase.printStaircase(n);

        System.out.println();
        
        String text = "if man was meant to stay on the ground god would have given us roots";
        String encrypted = Encryption.encryptText(text);
        System.out.println(encrypted);
    }
}