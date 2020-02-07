package DriverFactory.utils;

import java.io.IOException;
import java.io.InputStream;
import java.time.Clock;
import java.util.Properties;

public class ReadConfigFile {
    protected InputStream input = null;
    protected Properties prop =null;

    public ReadConfigFile() {
        try {
            input = ReadConfigFile.class.getClassLoader().getResourceAsStream("config.properties");
                prop=new Properties();
                prop.load(input);
               // System.out.println(prop.getProperty("browserName"));
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
            public String getBrowser () {
               /* if (prop.getProperty("browserName") == null)
                    return "";*/
                System.out.println(prop.getProperty("browserName"));
                return prop.getProperty("browserName");

            }
}
