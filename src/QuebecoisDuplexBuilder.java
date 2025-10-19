class QuebecoisDuplexBuilder implements IBuild {

    private Duplex duplex;

    QuebecoisDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement () {duplex.setBasement(basement);}
    public void BuildInterior () {duplex.setInterior(interior);}
    public void BuildStructure () {duplex.setStructure(structure);}

    public void BuildRoof(){duplex.setRoof(roof);}

    public Duplex GetDuplex()
    {
        return duplex;
    }

}

