public class FactoryBasement {
    static IBasement Factory(Product_Type type)
    {
        switch (type) {
            case Modern:
                return new BasementModern();
            case Persian:
                return new BasementPersian();
            case Quebecois:
                return new BasementQuebecois();
            default:
                return null;
        }

    }
}
