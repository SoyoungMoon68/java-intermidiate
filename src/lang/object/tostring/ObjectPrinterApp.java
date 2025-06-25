package lang.object.tostring;

public class ObjectPrinterApp {
    public static void main(String[] args) {
        ObjectPrinter.print("Hello World");
        ObjectPrinter.print(new Dog("milky", 13));
        ObjectPrinter.print(new Car("myCar"));
    }
}
