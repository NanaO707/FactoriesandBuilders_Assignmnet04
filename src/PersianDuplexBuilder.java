class PersianDuplexBuilder implements IBuild {

    private Duplex duplex;

    PersianDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement() {duplex.setBasement(new BasementPersian());}
    public void BuildInterior() {duplex.setInterior(new InteriorPersian());}
    public void BuildStructure() {duplex.setStructure(new StructurePersian());}
    public void BuildRoof(){duplex.setRoof(new RoofPersian());}

    public Duplex GetDuplex()
    {
        return duplex;
    }

    @Override
    public House GetHouse() {
        return null;
    }

}

