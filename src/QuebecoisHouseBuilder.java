class QuebecoisHouseBuilder implements IBuild {
    private House house;

    QuebecoisHouseBuilder() { house = new House();}

    public void BuildBasement () {house.setBasement(new BasementQuebecois());}
    public void BuildInterior () {house.setInterior(new InteriorQuebecois());}
    public void BuildStructure () {house.setStructure(new StructureQuebecois());}

    public void BuildRoof(){house.setRoof(new RoofQuebecois());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
