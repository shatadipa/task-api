package com.example.wallet.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Centralized configuration loader.
 * Reads environment-level values for: Base URL and API paths
 */
public final class TestConfig {
    private static final Properties PROPS = new Properties();

    static {
        try (InputStream is = TestConfig.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (is == null) throw new IllegalStateException("config.properties not found in test resources");
            PROPS.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    private TestConfig() {}

    public static String baseUrl() {
        return required("baseUrl");
    }

    public static String emailChangePath() {
        return required("emailChangePath");
    }

    private static String required(String key) {
        String v = PROPS.getProperty(key);
        if (v == null || v.isBlank()) throw new IllegalStateException("Missing property: " + key);
        return v.trim();
    }
}
