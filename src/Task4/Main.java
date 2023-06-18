package Task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Catalog catalog = new Catalog();
        catalog.add(new City("Kiev", "Big", "RandomAdress1", 4 ));
        catalog.add(new City("Cherkasy", "Medium", "RandomAdress2", 5 ));
        File file = new File("C:\\Users\\Taras\\Documents\\GitHub\\JavaAdvens\\JavaAdvensLesson7\\src\\Task4\\JAXBFile.xml");

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Catalog.class);

        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(catalog, file);
        marshaller.marshal(catalog, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
