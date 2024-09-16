package homework;

public class Main {
    public static void main(String[] args) {
        Encryptable secret = new Secret();
        Encryptable password = new Password();

        String original = "Hello World!";
        String encryptedSecret = secret.encrypt(original);
        String decryptedSecret = secret.decrypt(encryptedSecret);

        String encryptedPassword = password.encrypt(original);
        String decryptedPassword = password.decrypt(encryptedPassword);

        System.out.println("Original: " + original);
        System.out.println("Secret Encrypted: " + encryptedSecret);
        System.out.println("Secret Decrypted: " + decryptedSecret);
        System.out.println("Password Encrypted: " + encryptedPassword);
        System.out.println("Password Decrypted: " + decryptedPassword);
    }
}
