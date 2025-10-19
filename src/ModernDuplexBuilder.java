class ModernDuplexBuilder implements IBuild {

    private Duplex duplex;

    ModernDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement() {duplex.setBasement(new BasementModern());}
    public void BuildInterior() {duplex.setInterior(new InteriorModern());}
    public void BuildStructure() {duplex.setStructure(new StructureModern());}
    public void BuildRoof(){duplex.setRoof(new RoofModern());}

    public Duplex GetDuplex()
    {
        return duplex;
    }

    @Override
    public House GetHouse() {
        return null;
    }

}