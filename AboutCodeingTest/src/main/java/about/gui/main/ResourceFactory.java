package about.gui.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by wasey on 10/20/16.
 */
public class ResourceFactory

{


    private static ResourceFactory instance = null;
    private Properties appProperties;

    private ResourceFactory(){
        appProperties = new Properties();
        try {
            appProperties.load(new FileInputStream(new File("/Users/wasey/Desktop/TestEnv/AboutCodeingTest/src/main/resources/appconfig.properties")));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static ResourceFactory getInstance(){
        if(instance == null){
            instance = new ResourceFactory();
        }
        return instance;
    }


    public <T> T getProperty(String key){
        Object value = appProperties.getProperty(key);
        return (T) value;
    }
}
