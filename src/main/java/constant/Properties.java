package constant;

public class Properties {

    public static String getBrowserType() {
        return System.getProperty("browser");
    }

    public static String getUrl(){
        return System.getProperty("ux");
    }

}
