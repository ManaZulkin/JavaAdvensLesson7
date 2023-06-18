package Task2;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal woolf = new Animal("Woolf", 2, 12);
        File f = new File("C:\\Users\\Taras\\Documents\\GitHub\\JavaAdvens\\JavaAdvensLesson7\\src\\Task2\\Animal.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            oos.writeObject(woolf);
            System.out.println(woolf);
            System.out.println("Serialization compleate!\n");
            woolf = null;
            woolf = (Animal)ois.readObject();
            System.out.println("Deserialized object:");
            System.out.println(woolf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
