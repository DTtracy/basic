package reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IoProperties {
    public static void main(String[] args) throws IOException {
        /*String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        FileReader reader = new FileReader(path);*/
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
        Properties pro= new Properties();
        pro.load(reader);
        reader.close();
        String className = pro.getProperty("className");
        System.out.println(className);
    }

}
