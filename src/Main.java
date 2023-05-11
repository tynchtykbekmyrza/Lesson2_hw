import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Printable [] printables = {createObject("Samsung"),createObject("Nokia"),createObject("Iphone")};
        for (Printable printable:printables) {
            printable.print();

        }
    }
    public  static Printable createObject(String className) {
        switch (className) {
            case "Samsung":
                return new Samsung(14, "Серебро");
            case "Nokia":
                return new Nokia(256, 125);
            case "Iphone":
                return new Iphone(2023, 14);

        }
        return null;
    }


}