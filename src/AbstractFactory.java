abstract class AbstractFactory {
    static PersianFactory persianFactory;
    static QuebecoisFactory quebecoisFactory;
    static ModernFactory modernFactory;

    static AbstractFactory FactoryMethod(Product_Type type) {
        return null;
    }

    abstract House makeHouse();

    abstract Duplex makeDuplex();
}