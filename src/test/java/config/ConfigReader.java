package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties props = new Properties();

    static {
        try {
            props.load(new FileInputStream(
                "src/test/resources/config/devices.properties"));
        } catch (Exception e) {
            throw new RuntimeException("Unable to load configuration", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
