abstract class FactoryInterior {
    static IInterior Factory(Product_Type type)
    {
        switch (type) {
            case Modern:
                return new InteriorModern();
            case Persian:
                return new InteriorPersian();
            case Quebecois:
                return new InteriorQuebecois();

            default: return null;
        }
    }
}
