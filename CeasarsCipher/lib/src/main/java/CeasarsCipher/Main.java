package CeasarsCipher;

public class Main {
    public static void main(String[] args) {

        String message = "how are you doing today";
        int offset = 12;

        ceasarsCipher caesarsCipher = new ceasarsCipher();
        String cipheredMessage = caesarsCipher.cipher(message, offset);

        System.out.println("Message: " + message);
        System.out.println("Offset: " + offset);
        System.out.println("Ciphered message: " + cipheredMessage);
    }
}