class PersianDuplexBuilder implements IBuild {

    private Duplex duplex;

    PersianDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement () {duplex.setBasement(basement);}
    public void BuildInterior () {duplex.setInterior(interior);}
    public void BuildStructure () {duplex.setStructure(structure);}

    public void BuildRoof(){Duplex.setRoof(roof);}

    public Duplex GetDuplex()
    {
        return duplex;
    }

}

