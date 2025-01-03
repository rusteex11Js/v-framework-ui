package practise.singleton;

import java.io.Serializable;

public class Browser implements Serializable, Cloneable {
    private volatile static Browser browser;
    private Browser(){
        if(browser != null){ //handling reflection attack
            throw new IllegalArgumentException("Object already exists");
        }
    }
    public static Browser getInstance(){
        if(browser == null){
            synchronized (Browser.class) {
                if(browser == null) {
                    browser = new Browser();
                }
            }
        }
        return browser;
    }
    public void displayMsg(){
        System.out.println("Message is displayed");
    }


    //AddResolve() ---> which will be called during De-serialization process -- this will return class instance
    //Predefined method which will be called in the de-serialization
    protected Object readResolve(){
        return getInstance();
    }

    //It will prevent the instance should not be cloned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance can not be cloned..");
    }


}
