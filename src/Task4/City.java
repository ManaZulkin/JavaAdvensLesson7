package Task4;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "City")
@XmlRootElement(name = "city")
public class City {

    private String name;

    private String size;

    private String adress;

    private int house;

    public City() {
    }

    public City(String name, String size, String adress, int house) {
        this.name = name;
        this.size = size;
        this.adress = adress;
        this.house = house;
    }

    public String getSize() {
        return size;
    }
    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }
    @XmlElement
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getHouse() {
        return house;
    }
    @XmlElement
    public void setHouse(int house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
