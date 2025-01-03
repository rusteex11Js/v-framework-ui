package practise.singleton;

public class ReflectionAttack {

/**
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       Browser instance1 =  Browser.getInstance();
       Browser instance2 =  null;


        Constructor<Browser> declaredConstructors = Browser.class.getDeclaredConstructor();
        declaredConstructors.setAccessible(true);
        instance2 = declaredConstructors.newInstance();

        System.out.println("haschode instance 1 : "+instance1.hashCode());
        System.out.println("haschode instance 2 : "+instance2.hashCode());


    }
*/
 }
