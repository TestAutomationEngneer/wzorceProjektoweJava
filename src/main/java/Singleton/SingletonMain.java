package Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        ConfigurationSingleton singleton1 = ConfigurationSingleton.getInstance();
        ConfigurationSingleton singleton2 = ConfigurationSingleton.getInstance();
        ConfigurationSingleton singleton3 = ConfigurationSingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);


        Configuration configuration1 = new Configuration();
        Configuration configuration2 = new Configuration();
        Configuration configuration3 = new Configuration();

        System.out.println(configuration1);
        System.out.println(configuration2);
        System.out.println(configuration3);


    }
}
