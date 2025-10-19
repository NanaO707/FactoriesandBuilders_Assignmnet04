abstract class AbstractFactory {

    public static PersianFactory persianFactory;
    public static QuebecoisFactory quebecoisFactory;
    public static ModernFactory modernFactory;

    public static AbstractFactory FactoryMethod(Product_Type type) {

        return null;
    }

    public abstract House MakeHouse();

    public abstract Duplex MakeDuplex();
}