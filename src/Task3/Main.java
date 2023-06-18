package Task3;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Taras\\Documents\\GitHub\\JavaAdvens\\JavaAdvensLesson7\\src\\Task3\\XMLParsre.XML");
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
