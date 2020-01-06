package utill;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceUtils
{
    public enum Resource
    {
        BROWSER("browser.properties");

        private String fileName;

        Resource(String fileName)
        {
            this.fileName = fileName;
        }

        public String getFileName()
        {
            return fileName;
        }

    }

    public static Properties get(Resource resource)
    {
        Properties properties = new Properties();
        try
        {
            properties.load(findResource(ResourceUtils.class, resource.getFileName()));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return properties;
    }


    public static InputStream findResource(Class<?> clazz, String path)
    {
        return clazz.getResourceAsStream(path);
    }
}
