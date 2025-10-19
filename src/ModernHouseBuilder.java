class ModernHouseBuilder implements IBuild {

    private House house;

    ModernHouseBuilder() { house = new House();}

    public void BuildBasement () {house.setBasement(new BasementModern());}
    public void BuildInterior () {house.setInterior(new InteriorModern());}
    public void BuildStructure () {house.setStructure(new StructureModern());}

    public void BuildRoof(){house.setRoof(new RoofModern());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
