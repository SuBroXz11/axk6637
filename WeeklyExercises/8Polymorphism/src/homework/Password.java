package homework;

class Password implements Encryptable {
    // Implementing a simple substitution cipher for password encryption and decryption
    private static final String KEY = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
    private static final String REVERSED_KEY = new StringBuilder(KEY).reverse().toString();

    @Override
    public String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = KEY.indexOf(c);
            if (index != -1) {
                encrypted.append(REVERSED_KEY.charAt(index));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = REVERSED_KEY.indexOf(c);
            if (index != -1) {
                decrypted.append(KEY.charAt(index));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}

