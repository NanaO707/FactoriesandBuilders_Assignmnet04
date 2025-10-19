class ModernDuplexBuilder implements IBuild {

    private Duplex duplex;

    ModernDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement (IBasement basement) {duplex.setBasement(basement);}
    public void BuildInterior (IStructure interior) {duplex.setInterior(interior);}
    public void BuildStructure (IInterior structure) {duplex.setStructure(structure);}

    public void BuildRoof(IRoof roof){duplex.setRoof(duplex.roof);}

    public Duplex GetDuplex()
    {
        return duplex;
    }

    @Override
    public House GetHouse() {
        return null;
    }

}