package practise.singleton;

public class BrowserReadResolve {


/**

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Browser instance1 = Browser.getInstance();

        //serialize the browser instance
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("browser.json"));
        out.writeObject(instance1);
        out.close();

        //De-serialize the browser instance
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("browser.json"));
        Browser instance2 = (Browser)in.readObject();
        in.close();

        System.out.println("haschode instance 1 : "+instance1.hashCode());
        System.out.println("haschode instance 2 : "+instance2.hashCode());
    }
 */
}



//Serialization
//POJO (java class) ---> JSON/XML/ByteStream

//De-serialization
//JSON/XML/ByteStream ----> POJO (java class) ---> Browser ---> creating a new Browser instance