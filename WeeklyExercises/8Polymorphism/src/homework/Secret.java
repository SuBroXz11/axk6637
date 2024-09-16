package homework;

class Secret implements Encryptable {
    // Implementing Caesar cipher encryption and decryption
    @Override
    public String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    encrypted.append((char) ('A' + (c - 'A' + 3) % 26));
                } else {
                    encrypted.append((char) ('a' + (c - 'a' + 3) % 26));
                }
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String input) {
        return encrypt(input); // Caesar cipher is symmetric
    }
}
