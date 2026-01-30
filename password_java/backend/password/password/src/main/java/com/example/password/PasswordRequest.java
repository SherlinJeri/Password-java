package com.example.password;

public class PasswordRequest {
    private int length;
    private boolean upper;
    private boolean lower;
    private boolean numbers;
    private boolean symbols;

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public boolean isUpper() { return upper; }
    public void setUpper(boolean upper) { this.upper = upper; }

    public boolean isLower() { return lower; }
    public void setLower(boolean lower) { this.lower = lower; }

    public boolean isNumbers() { return numbers; }
    public void setNumbers(boolean numbers) { this.numbers = numbers; }

    public boolean isSymbols() { return symbols; }
    public void setSymbols(boolean symbols) { this.symbols = symbols; }
}
