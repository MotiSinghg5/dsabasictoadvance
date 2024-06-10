package dsa.learn;

import javax.crypto.Cipher;

public class CheckMaxKeyLength {
    public static void main(String[] args) throws Exception {
        int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
        System.out.println("Max AES key length: " + maxKeyLen);
    }
}
