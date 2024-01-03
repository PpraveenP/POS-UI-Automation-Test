package Utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiger {

    Properties pos;

    public ReadConfiger()  {
        try {
            File f = new File("./Configration/config.properties");
            FileInputStream fi = new FileInputStream(f);

            pos = new Properties();
            pos.load(fi);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public String getURL()
    {
        String url=pos.getProperty("baseURL");
        return url;
    }
    public String getchrome()
    {
        String chrome=pos.getProperty("chrome");
        return chrome;
    }
    public String getfirefox()
    {
        String firefox=pos.getProperty("firefox");
        return firefox;
    }
    public String getUserName()
    {
        String username=pos.getProperty("username");
        return username;
    }
    public String getpassword()
    {
        String password=pos.getProperty("password");
        return password;
    }
}

