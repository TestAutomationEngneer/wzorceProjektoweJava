package Singleton;

import lombok.Data;

@Data
public class ConfigurationSingleton {
    //private String path;


    private static ConfigurationSingleton config;

    private ConfigurationSingleton(){}

    public static ConfigurationSingleton getInstance()
    {
        if (config == null) {
            config = new ConfigurationSingleton();
        }
        return config;
    }


}
