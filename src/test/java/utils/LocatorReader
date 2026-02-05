package utils;

import java.io.InputStream;
import java.util.Properties;

public class LocatorReader {

    private static Properties props = new Properties();

    static {
        try {
            String platform = System.getProperty("platform"); // android ou ios

            InputStream is = LocatorReader.class
                    .getClassLoader()
                    .getResourceAsStream("locators/" + platform + ".properties");

            props.load(is);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
