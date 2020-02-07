package DriverFactory.utils;

public class Constant {
    /* config proprties file */
    public final static  String CONFIG_PROPERTIES_DIRECTORY="config.properties";
    public final static String GECKO_DRIVER_DIRECTORY=System.getProperty("user.dir") + "\\src\\test\\java\\recources\\geckodriver.exe";
    public final static String CHROME_DRIVER_DIRECTORY=System.getProperty("user.dir") + "\\src\\test\\java\\recources\\chromedriver.exe";
    public final static String IE_DRIVER_DIRECTORY=System.getProperty("user.dir") + "\\src\\test\\java\\recources\\IEDriverServer.exe";

    // ------------------ System.getProperty("user.dir") : La localisation dynamique (méme si on change la position du file il la change automatiquement ---------
}
