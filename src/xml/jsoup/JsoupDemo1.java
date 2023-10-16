package xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据xml文档获取
        //1.1获取student.xml的路径
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //System.out.println(path);
        
        //2.解析xml文档，加载文档进内存，获取dom树 --->Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //        System.out.println(document);
        
        //3.获取元素对象 Element
        Elements names = document.getElementsByTag("name");
        //System.out.println(names);
        //3.2获取第一个name的Element对象
        Element element = names.get(0);
        //获取数据
        String name = element.text();
        System.out.println(name);
    }
    
}
