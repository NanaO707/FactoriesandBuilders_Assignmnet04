class QuebecoisDuplexBuilder implements IBuild {

    private Duplex duplex;

    QuebecoisDuplexBuilder() { duplex = new Duplex();}

    public void BuildBasement() {duplex.setBasement(new BasementQuebecois());}
    public void BuildInterior() {duplex.setInterior(new InteriorQuebecois());}
    public void BuildStructure() {duplex.setStructure(new StructureQuebecois());}
    public void BuildRoof(){duplex.setRoof(new RoofQuebecois());}

    public Duplex GetDuplex()
    {
        return duplex;
    }

    @Override
    public House GetHouse() {
        return null;
    }

}

