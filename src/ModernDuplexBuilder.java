class ModernDuplexBuilder implements IBuilder {

    private Duplex Duplex;

    ModernDuplexBuilder() { Duplex = new Duplex();}

    public void buildBasement () {Duplex.setBasement(basement);}
    public void buildInterior () {Duplex.setInterior(interior);}
    public void buildStructure () {Duplex.setStructure(structure);}

    public void buildRoof(){Duplex.setRoof(roof);}

    public Duplex GetDuplex()
    {
        return Duplex;
    }

}