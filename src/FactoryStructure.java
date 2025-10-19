abstract class FactoryStructure {
    static IStructure Factory(Product_Type type)
    {
        switch (type) {
            case Modern:
                return new StructureModern();
            case Persian:
                return new StructurePersian();
            case Quebecois:
                return new StructureQuebecois();
            default:
                return null;
        }
    }
}
