class ModernDuplexBuilder implements IBuild {

    private Duplex duplex;

    ModernDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement () {duplex.setBasement(basement);}
    public void BuildInterior () {duplex.setInterior(interior);}
    public void BuildStructure () {duplex.setStructure(structure);}

    public void BuildRoof(){duplex.setRoof(duplex.roof);}

    public Duplex GetDuplex()
    {
        return duplex;
    }

}