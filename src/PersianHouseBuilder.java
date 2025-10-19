class PersianHouseBuilder implements IBuild {
    private House house;

    PersianHouseBuilder() { house = new House();}

    public void BuildBasement () {house.setBasement(new BasementPersian());}
    public void BuildInterior () {house.setInterior(new InteriorPersian());}
    public void BuildStructure () {house.setStructure(new StructurePersian());}

    public void BuildRoof(){house.setRoof(new RoofPersian());}

    @Override
    public Duplex GetDuplex() {
        return null;
    }

    public House GetHouse()
    {
        return house;
    }
}
