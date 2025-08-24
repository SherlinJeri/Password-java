package com.example.password;

import java.util.Random;

public class PasswordGenerator {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+-={}[]";

    public static String generate(int length, boolean upper, boolean lower, boolean numbers, boolean symbols) {
        StringBuilder pool = new StringBuilder();
        if (upper) pool.append(UPPER);
        if (lower) pool.append(LOWER);
        if (numbers) pool.append(NUMBERS);
        if (symbols) pool.append(SYMBOLS);

        if (pool.length() == 0) return "Select at least one option";

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(pool.charAt(random.nextInt(pool.length())));
        }

        return password.toString();
    }
}
