class PersianDuplexBuilder implements IBuild {

    private Duplex duplex;

    PersianDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement (IBasement basement) {duplex.setBasement(basement);}
    public void BuildInterior (IStructure interior) {duplex.setInterior(interior);}
    public void BuildStructure (IInterior structure) {duplex.setStructure(structure);}

    public void BuildRoof(IRoof roof){Duplex.setRoof(roof);}

    public Duplex GetDuplex()
    {
        return duplex;
    }

    @Override
    public House GetHouse() {
        return null;
    }

}

