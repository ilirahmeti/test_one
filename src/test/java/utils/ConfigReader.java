package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String url;
    private String chromePath;
    private String run_test;
    private String platform;
    private String browser;
    private String version;

    public ConfigReader() {

        Properties prop = new Properties();
        InputStream reader = null;

        try {
            reader = new FileInputStream("config.properties");
            prop.load(reader);
            this.url = prop.getProperty("url");
            this.chromePath = prop.getProperty("chromePath");
            this.run_test = prop.getProperty("run_test");
            this.platform = prop.getProperty("platform");
            this.browser = prop.getProperty("browser");
            this.version = prop.getProperty("version");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public String getChromePath() {
        return chromePath;
    }

    public String getRun_test() {
        return run_test;
    }

    public String getPlatform() {
        return platform;
    }

    public String getBrowser() {
        return browser;
    }

    public String getVersion() {
        return version;
    }
}
