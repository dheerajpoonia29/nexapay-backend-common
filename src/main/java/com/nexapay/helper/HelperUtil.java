package com.nexapay.helper;

public class HelperUtil {
    public static long generateTransactionId() {
        long timestamp = System.currentTimeMillis(); // 13-digit
        long randomSuffix = (long)(Math.random() * 9000) + 1000; // 4-digit random
        return (timestamp / 1000) * 10000 + randomSuffix; // trims to 10-11 digits
    }
}
