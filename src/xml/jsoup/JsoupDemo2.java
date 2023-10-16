package xml.jsoup;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //Jsoup：工具类，可以解析xml或者html，返回Document
        //1.parse(File in,String characterSetName)
        //        Document document = Jsoup.parse(new File(path), "utf-8");
        
        //2.parse(String html) ---> 不常用
       /* String str = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<users>\n" +
                "    <user>\n" +
                "        <name>001</name>\n" +
                "        <age>15</age>\n" +
                "        <class>软件221</class>\n" +
                "    </user>\n" +
                "\n" +
                "    <![CDATA[\n" +
                "        if (a>b)\n" +
                "    ]]>\n" +
                "</users>";
        System.out.println(Jsoup.parse(str));*/
        
        //3.parse(URL url,int timeoutMillis)
        URL url = new URL("https://www.baidu.com");
        System.out.println(Jsoup.parse(url,5000));
    }
}
