public class Encryption {

    public static String encryptText(String text) {
        String textWithNoSpaces = text.replaceAll("\\s+", "");
        int l = textWithNoSpaces.length();

        int rows = (int) Math.floor(Math.sqrt(l));
        int cols = (int) Math.ceil(Math.sqrt(l));

        if (rows * cols < l) {
            rows++;
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int charIndex = r * cols + c;
                if (charIndex < l) {
                    encryptedText.append(textWithNoSpaces.charAt(charIndex));
                }
            }
            encryptedText.append("\n");
        }

        return encryptedText.toString();
    }
}
