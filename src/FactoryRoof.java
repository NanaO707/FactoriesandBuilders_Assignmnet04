abstract class FactoryRoof {
    static IRoof Factory(Product_Type type)
    {
        switch (type) {
            case Modern:
                return new RoofModern();
            case Persian:
                return new RoofPersian();
            case Quebecois:
                return new RoofQuebecois();

            default: return null;
        }

    }
}
