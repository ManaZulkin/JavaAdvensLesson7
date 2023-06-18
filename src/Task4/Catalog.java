package Task4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {

    @XmlElement(name = "city")
    private List<City> citys = new ArrayList<>();
    public void add(City city) {
        citys.add(city);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(citys.toArray());
    }
}
